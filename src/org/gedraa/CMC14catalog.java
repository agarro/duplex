package org.gedraa;

import java.io.*;
import java.net.*;
import java.security.Principal;
import java.util.*;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;

public class CMC14catalog {

	private static final String prefix = "http://vizier.u-strasbg.fr/cgi-bin/asu-txt?-source=CMC14&-c=";
	private static final String suffix = "&-c.rm=1&-out.all&-out.max=unlimited&-out.form=tsv";
	ArrayList<CMC14> _cmc14List = new ArrayList<CMC14>();

	public CMC14catalog(String id) {
		//setSYSPRoxy();
		String query ="";	
		if (id.equals("NP"))
		{
			return;
		}
//		else if (id.substring(8, 9).equals("-"))
//		{
			query = prefix + id + suffix;			
//		}
/*		else if (id.substring(8, 9).equals("+")) {
			String s = id;
			s  = s.substring(0,2) +"h+" + s.substring(2,4)+"m+" + s.substring(4,6) 
				+ "." + s.substring(6,7) + "s+" + s.substring(9,11) + "d+" +s.substring(11,13)
				+ "m+" + s.substring(13,15) + "." + s.substring(15);;
			query = prefix + s + suffix;			
		}*/
		try {
			URL url = new URL(query);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();
			InputStream in = conn.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			String sCurrentLine;

			int c = 1;
			while ((sCurrentLine = reader.readLine()) != null) {

				if (sCurrentLine.startsWith("0")) 
				{
					CMC14 u = new CMC14(sCurrentLine);
					 _cmc14List.add(u);				
				}
				c++;
			}

			conn.disconnect();
		} catch (IOException ex) {
			ex.printStackTrace();
			System.out.println("made it here");
		}

	}

	public static void main(String[] args) {
		//setSYSPRoxy();
		CMC14catalog t = new CMC14catalog("321.231402+17.519558");
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

}
