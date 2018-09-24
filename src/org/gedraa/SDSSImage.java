package org.gedraa;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URL;

public class SDSSImage {
	
	public static final String baseUrl ="http://casjobs.sdss.org/ImgCutoutDR4/getjpeg.aspx?";
	public static final String scale ="&scale=0.39612";
	public static final String tail = "&opt=G&query=";
	
//	public static void main(String[] args) throws Exception {
//		setSYSPRoxy(); // comment it
//		String coords = "ra=195.50238391&dec=-2.30383808";
//		String width ="&width=512";
//		String height ="&height=512";
//		String tail = "&opt=&query=";
//		String imageUrl = baseUrl+coords+scale+width+height+tail;
//		String destinationFile = "imagen.jpg";
//		saveImage(imageUrl, destinationFile);
//	}
	
	public SDSSImage(String coords, String width, String height)
	{
		//setSYSPRoxy();
		String imageUrl = baseUrl+coords.trim()+scale+width+height+tail;		
		String destinationFile = "imagen.jpg";
		try {
	        saveImage(imageUrl, destinationFile);
        } catch (IOException e) {
	        e.printStackTrace();
        }
	}

	public static void saveImage(String imageUrl, String destinationFile) throws IOException {
		URL url = new URL(imageUrl);
		InputStream is = url.openStream();
		OutputStream os = new FileOutputStream(destinationFile);
		byte[] b = new byte[2048];
		int length;
		while ((length = is.read(b)) != -1) {
			os.write(b, 0, length);
		}
		is.close();
		os.close();
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
