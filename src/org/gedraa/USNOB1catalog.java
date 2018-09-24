package org.gedraa;

import java.io.*;
import java.net.*;
import java.security.Principal;
import java.util.*;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;

public class USNOB1catalog {


	private static final String prefix = "http://irsa.ipac.caltech.edu/cgi-bin/Gator/nph-query?outfmt=1&objstr=";
	private static final String suffix = "&spatial=Cone&radius=10&catalog=usno_b1";
	ArrayList<USNOB1> _usnob1List = new ArrayList<USNOB1>();

	public USNOB1catalog(String id) {
		
		String query ="";	
		if (id.equals("NP"))
		{
			return;
		}
		else if (id.substring(8, 9).equals("-"))
		{
			query = prefix + id + suffix;			
		}
		else if (id.substring(8, 9).equals("+")) {
			String s = id;
			s  = s.substring(0,2) +"h+" + s.substring(2,4)+"m+" + s.substring(4,6) 
				+ "." + s.substring(6,7) + "s+" + s.substring(9,11) + "d+" +s.substring(11,13)
				+ "m+" + s.substring(13,15) + "." + s.substring(15);;
			query = prefix + s + suffix;			
		}
		try {
			URL url = new URL(query);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();
			InputStream in = conn.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			String sCurrentLine;

			while ((sCurrentLine = reader.readLine()) != null) {

				if (sCurrentLine.startsWith(" ")) {
					USNOB1 u = new USNOB1(sCurrentLine);
					 _usnob1List.add(u);				
				}
			}

			conn.disconnect();
			
			for (int a= 0;a<_usnob1List.size();a++ )
			{
				USNOB1 u = (USNOB1) _usnob1List.get(a);
				System.out.println(u.toString());  
			}
				
				
		} catch (IOException ex) {
			ex.printStackTrace();
			System.out.println("made it here");
		}

	}

	public static void main(String[] args) {
		//setSYSPRoxy();
		USNOB1catalog t = new USNOB1catalog("21245216-5731334");
		
		//System.out.println(t.toString());
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
