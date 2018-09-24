package org.gedraa;

import java.io.*;
import java.net.*;
import java.security.Principal;
import java.util.*;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;

public class UCAC4catalog {

	private double pmRA = 0.00;
	private double pmDEC = 0.00;
	private double Vmag = 0.00;

	private static final String prefix = "http://vizier.u-strasbg.fr/cgi-bin/asu-txt?-source=UCAC4&-c=";
	private static final String suffix = "&-c.rm=1&-out.all&-out.max=unlimited&-out.form=tsv";
	ArrayList<UCAC4> _ucac4List = new ArrayList<UCAC4>();

	public UCAC4catalog(String id) {
		//setSYSPRoxy();
		String query ="";
		if (id.equals("NP"))
		{
			return;
		}
		query = prefix + id + suffix;					
/*		if (id.substring(8, 9).equals("-"))
		{
			query = prefix + id + suffix;			
		}
		else if (id.substring(8, 9).equals("+")) {
			String s = id;
			s  = s.substring(0,2) +"h+" + s.substring(2,4)+"m+" + s.substring(4,6) 
				+ "." + s.substring(6,7) + "s+" + s.substring(9,11) + "d+" +s.substring(11,13)
				+ "m+" + s.substring(13,15) + "." + s.substring(15);;
			query = prefix + s + suffix;			
		}*/
		try {
			if(query.contains("%20"))
			{
				query = query.replace("%20", "+").toLowerCase();				
			}
			if(query.contains(" "))
			{
				query = query.replace(" ", "+").toLowerCase();				
			}			
			URL url = new URL(query);
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();
			InputStream in = conn.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			String sCurrentLine;

			while ((sCurrentLine = reader.readLine()) != null) {

				//System.out.println(sCurrentLine);
				if (sCurrentLine.startsWith("0")) {
					UCAC4 u = new UCAC4(sCurrentLine);
					 _ucac4List.add(u);
					 if(u.getVmag()!=null && !u.getVmag().startsWith("  "))
					 {
						 Vmag = Double.valueOf(u.getVmag());
						 if(u.getPmRA()!=null && !u.getPmRA().startsWith("  "))
						 {
							 pmRA = Double.valueOf(u.getPmRA());
						 }
						 if(u.getPmDE()!=null && !u.getPmDE().startsWith("  "))
						 {
							 pmDEC = Double.valueOf(u.getPmDE());
						 }						 
					 }
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
		UCAC4catalog t = new UCAC4catalog("51.208445%2025.058050");
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

	/**
     * @return the vmag
     */
    public synchronized final double getVmag() {
    	return Vmag;
    }

	/**
     * @param vmag the vmag to set
     */
    public synchronized final void setVmag(double vmag) {
    	Vmag = vmag;
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
