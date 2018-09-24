package org.gedraa;

import java.io.*;
import java.net.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class InterstellarReddening {
	private double colorExcessB_V = 0.00;
	
	   public static void main(String[] args) throws Exception {
		   InterstellarReddening i = new InterstellarReddening("06h+06m+24.41s+-45d+04m+55.4s");  
	  }

	public InterstellarReddening(String coords) {

		// Ejemplo de Coordenadas pasadas como
		// parámetro="06h+06m+24.41s+-45d+04m+55.4s"
		//setSYSPRoxy();
		String addr = "http://irsa.ipac.caltech.edu/cgi-bin/DUST/nph-dust?locstr=" + coords;
		try {
			URL url = new URL(addr);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");

			conn.connect();
			InputStream in = conn.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			String sCurrentLine;
			StringBuffer xml = new StringBuffer();

			int count = 0;
			while ((sCurrentLine = reader.readLine()) != null) {
				if (count > 0) {
					xml.append("\n" + sCurrentLine);
				} else {
					xml.append(sCurrentLine);
				}

				count++;
			}
			// System.out.println(xml);
			parseXML(xml.toString());

			conn.disconnect();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	private static void setSYSPRoxy() {
		System.setProperty("http.proxyHost", "www-eds-proxy.sabre.com");
		System.setProperty("http.proxyPort", "80");
		System.setProperty("https.proxyHost", "www-eds-proxy.sabre.com");
		System.setProperty("https.proxyPort", "80");
		final String authUser = "ed0856859";
		final String authPassword = "winter99";
		Authenticator.setDefault(new Authenticator() {
			public PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(authUser, authPassword.toCharArray());
			}
		});

		System.setProperty("http.proxyUser", authUser);
		System.setProperty("http.proxyPassword", authPassword);
	}

	private void parseXML(String xml) {
		try {
			Document doc = loadXMLFromString(xml);
			doc.getDocumentElement().normalize();
			NodeList nodes = doc.getElementsByTagName("result");


				Node node = nodes.item(0);

				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element element = (Element) node;
					String valor = getValue("refPixelValue", element);
					//System.out.println(getValue("desc", element) + " = " + valor);
					double e_B_V = Double.parseDouble(valor.substring(14,20));
					System.out.println("Exceso de Color B-V (E(B-V)) :  " +  e_B_V);
					colorExcessB_V = e_B_V;
				}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private String getValue(String tag, Element element) {
		NodeList nodes = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = (Node) nodes.item(0);
		return node.getNodeValue();
	}

	private Document loadXMLFromString(String xml) throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		InputSource is = new InputSource(new StringReader(xml));
		return builder.parse(is);
	}

	/**
	 * @return the colorExcessB_V
	 */
	public synchronized double getColorExcessB_V() {
		return colorExcessB_V;
	}
}
