package org.gedraa;

import java.io.*;
import java.net.*;
import java.security.Principal;
import java.util.*;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;

public class UCAC3catalog {

	private double pmRA = 0.00;
	private double pmDEC = 0.00;

	private static final String prefix = "http://irsa.ipac.caltech.edu/cgi-bin/Gator/nph-query?outfmt=1&objstr=";
	private static final String suffix = "&spatial=Cone&radius=1&catalog=ucac3_sources";
	ArrayList<UCAC3> _ucac3List = new ArrayList<UCAC3>();

	public UCAC3catalog(String id) {
		//setSYSPRoxy();
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

				if (sCurrentLine.startsWith("  ")) {
					UCAC3 u = new UCAC3(sCurrentLine);
					 _ucac3List.add(u);
					pmRA = Double.valueOf(sCurrentLine.substring(236, 241));
					System.out.println(pmRA);
					pmDEC = Double.valueOf(sCurrentLine.substring(258, 264));
					System.out.println(pmDEC);					
				}
			}

			conn.disconnect();
		} catch (IOException ex) {
			ex.printStackTrace();
			System.out.println("made it here");
		}

	}

	public static void main(String[] args) {
		//setSYSPRoxy();
		UCAC3catalog t = new UCAC3catalog("21245216-5731334");
	}

	/**
     * @return the pmRA
     */
    public synchronized final double getPmRA() {
    	return pmRA;
    }

	/**
     * @return the pmDEC
     */
    public synchronized final double getPmDEC() {
    	return pmDEC;
    }

	/**
     * @param pmRA the pmRA to set
     */
    public synchronized final void setPmRA(double pmRA) {
    	this.pmRA = pmRA;
    }

	/**
     * @param pmDEC the pmDEC to set
     */
    public synchronized final void setPmDEC(double pmDEC) {
    	this.pmDEC = pmDEC;
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
