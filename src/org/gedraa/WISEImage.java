package org.gedraa;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URL;

public class WISEImage {
	
	public static final String _baseUrl ="http://skyview.gsfc.nasa.gov/cgi-bin/images?position=";
	public static final String _coords ="91.60658333333333%2C-45.082055555555556";
	public static final String _tail = "&survey=wisew4&pixels=1024%2C1024&sampler=Clip&size=1.6666666666666666%2C1.6666666666666666&projection=Tan&coordinates=J2000.0&return=JPEG";
	
	
	public static void main(String[] args) throws Exception {
		setSYSPRoxy(); // comment it
		WISEImage w = new WISEImage("");

	}
	
	public WISEImage(String coords)
	{
		//setSYSPRoxy();
		String imageUrl = _baseUrl+_coords.trim()+_tail;		
		String destinationFile = "imagenWISE.jpg";
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
