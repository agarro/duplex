package org.gedraa;

import java.io.*;
import java.net.*;
import java.security.Principal;
import java.util.*;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;

public class TWOMASScatalog {

	private double Jmag = 0.00;
	private double Hmag = 0.00;
	private double Kmag = 0.00;
	private double gLatitud = 0.00;
	private String ra_dec = "";
	private String dec_dec= "";
	private static final String prefix = "http://irsa.ipac.caltech.edu/cgi-bin/Gator/nph-query?outfmt=1&objstr=";
	private static final String suffix = "&spatial=Cone&radius=1&catalog=fp_psc";
	ArrayList<TwoMASS> _twoMASSList = new 	ArrayList<TwoMASS>() ;

	public TWOMASScatalog(String id) {
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

		//String query = prefix + id + suffix;
		
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
					TwoMASS t = new TwoMASS(sCurrentLine);
					_twoMASSList.add(t);
					System.out.println("\n\n****************************** JHK *****************************");					
					Jmag = Double.valueOf(sCurrentLine.substring(96, 103));
					System.out.println(Jmag);
					Hmag = Double.valueOf(sCurrentLine.substring(132, 138));
					System.out.println(Hmag);
					Kmag = Double.valueOf(sCurrentLine.substring(168, 174));
					System.out.println(Kmag);
					gLatitud = Double.valueOf(sCurrentLine.substring(288, 296));
					System.out.println(gLatitud);
					ra_dec =sCurrentLine.substring(2, 12);
					System.out.println(ra_dec);
					dec_dec =sCurrentLine.substring(13, 24);
					System.out.println(dec_dec);
					System.out.println("\n\n****************************************************************");			
				}
			}

			conn.disconnect();
		} catch (IOException ex) {
			ex.printStackTrace();
			System.out.println("made it here");
		}

	}

	public static void main(String[] args) {
		// setSYSPRoxy();
		TWOMASScatalog t = new TWOMASScatalog("21245216-5731334");
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

	/**
     * @return the jmag
     */
    public synchronized double getJmag() {
    	return Jmag;
    }

	/**
     * @return the hmag
     */
    public synchronized double getHmag() {
    	return Hmag;
    }

	/**
     * @return the kmag
     */
    public synchronized double getKmag() {
    	return Kmag;
    }

	/**
     * @return the gLatitud
     */
    public synchronized double getgLatitud() {
    	return gLatitud;
    }

	/**
     * @param jmag the jmag to set
     */
    public synchronized void setJmag(double jmag) {
    	Jmag = jmag;
    }

	/**
     * @param hmag the hmag to set
     */
    public synchronized void setHmag(double hmag) {
    	Hmag = hmag;
    }

	/**
     * @param kmag the kmag to set
     */
    public synchronized void setKmag(double kmag) {
    	Kmag = kmag;
    }

	/**
     * @param gLatitud the gLatitud to set
     */
    public synchronized void setgLatitud(double gLatitud) {
    	this.gLatitud = gLatitud;
    }

	/**
     * @return the ra_dec
     */
    public synchronized String getRa_dec() {
    	return ra_dec;
    }

	/**
     * @return the dec_dec
     */
    public synchronized String getDec_dec() {
    	return dec_dec;
    }

	/**
     * @param ra_dec the ra_dec to set
     */
    public synchronized void setRa_dec(String ra_dec) {
    	this.ra_dec = ra_dec;
    }

	/**
     * @param dec_dec the dec_dec to set
     */
    public synchronized void setDec_dec(String dec_dec) {
    	this.dec_dec = dec_dec;
    }

}
