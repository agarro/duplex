package org.gedraa;

public class USNOB1 {
	

String usno_b1  ="";
// ___ Designation of the object
String  tycho2  =""; 
// ___ Designation in the Tycho-2 Catalog
String  ra   ="";//(deg) 
// ___ Right ascension (J2000)
String  dec   ="";// (deg) 
// ___ Declination (J2000)
String  clon   ="";// 
// ___ Right ascention in Sexagesimal format.
String  clat   ="";// 
// ___ Declination in Sexagesimal format.
String  e_ra   ="";// (mas) 
// ___ Mean error on ra*cos(dec) at epoch
String  e_dec   ="";// (mas) 
// ___ Mean error on dec at epoch
String  epoch   ="";// (yr) 
// ___ Mean epoch of observation
String  pm_ra   ="";// (mas/yr) 
// ___ Proper motion in ra (relative to YS4.0)
String  pm_dec   ="";// (mas/yr) 
// ___ Proper motion in dec (relative to YS4.0)
String  e_pm_ra   ="";// (mas/yr) 
// ___ Mean error on pm_ra
String  e_pm_dec   ="";// (mas/yr) 
// ___ Mean error on pm_dec
String  e_fit_ra   ="";// (100mas) 
// ___ Mean error on ra fit
String  e_fit_dec   ="";// (100mas) 
// ___ Mean error on dec fit
String  b1_mag   ="";// (mag) 
// ___ First blue photometry: magnitude
String  b1_cal   ="";// 
// ___ First blue photometry: source of photometric calibration
String  b1_xi   ="";// (arcsec) 
// ___ First blue photometry: distance of photo-center from mean object position (X)
String  b1_eta   ="";// (arcsec) 
// ___ First blue photometry: distance of photo-center from mean object position (Y)
String  r1_mag   ="";// (mag) 
// ___ First red photometry: magnitude
String  r1_cal   ="";// 
// ___ First red photometry: source of photometric calibration
String  r1_xi   ="";// (arcsec) 
// ___ First red photometry: distance of photo-center from mean object position (X)
String  r1_eta   ="";// (arcsec) 
// ___ First red photometry: distance of photo-center from mean object position (Y)
String  b2_mag   ="";// (mag) 
// ___ Second blue photometry: magnitude
String b2_cal   ="";// 
// ___ Second blue photometry: source of photometric calibration
String  b2_xi   ="";// (arcsec) 
// ___ Second blue photometry: distance of photo-center from mean object position (X)
String  b2_eta   ="";// (arcsec) 
// ___ Second blue photometry: distance of photo-center from mean object position (Y)
String  r2_mag   ="";// (mag) 
// ___ Second red photometry: magnitude
String  r2_cal   ="";// 
// ___ Second red photometry: source of photometric calibration
String  r2_xi   ="";// (arcsec) 
// ___ Second red photometry: distance of photo-center from mean object position (X)
String  r2_eta   ="";// (arcsec) 
// ___ Second red photometry: distance of photo-center from mean object position (Y)
String  i_mag   ="";// (mag) 
// ___ Near-IR photometry: magnitude
String  i_cal   ="";// 
// ___ Near-IR photometry: source of photometric calibration
String  i_xi   ="";// (arcsec) 
// ___ Near-IR photometry: distance of photo-center from mean object position (X)
String  i_eta   ="";// (arcsec) 
// ___ Near-IR photometry: distance of photo-center from mean object position (Y)
String  angle   ="";// (deg) 
// ___ Position Angle in degree.
String  dist   ="";// (arcsec) 
// ___ Distance between the target position and each source in arcsec.


	
	
	public USNOB1(String rawString)
	{
		parseRawString(rawString);
		
		
		System.out.println(toString());
	}


	private void parseRawString(String rawString) {
	    // TODO Auto-generated method stub
		
		String [] array = rawString.split("\\s+");  
		
        for (String s : array) {
            System.out.println(s);  
        }
        

        usno_b1  = array[1];
       // ___ Designation of the object
         tycho2  = array[2]; 
       // ___ Designation in the Tycho-2 Catalog
         ra   = array[3];//(deg) 
       // ___ Right ascension (J2000)
         dec   = array[4];// (deg) 
       // ___ Declination (J2000)
         clon   = array[5];// 
       // ___ Right ascention in Sexagesimal format.
         clat   = array[6];// 
       // ___ Declination in Sexagesimal format.
         e_ra   = array[7];// (mas) 
       // ___ Mean error on ra*cos(dec) at epoch
         e_dec   = array[8];// (mas) 
       // ___ Mean error on dec at epoch
         epoch   = array[9];// (yr) 
       // ___ Mean epoch of observation
         pm_ra   = array[10];// (mas/yr) 
       // ___ Proper motion in ra (relative to YS4.0)
         pm_dec   = array[11];// (mas/yr) 
       // ___ Proper motion in dec (relative to YS4.0)
         e_pm_ra   = array[12];// (mas/yr) 
       // ___ Mean error on pm_ra
         e_pm_dec   = array[13];// (mas/yr) 
       // ___ Mean error on pm_dec
         e_fit_ra   = array[14];// (100mas) 
       // ___ Mean error on ra fit
         e_fit_dec   = array[15];// (100mas) 
       // ___ Mean error on dec fit
         b1_mag   = array[16];// (mag) 
       // ___ First blue photometry: magnitude
         b1_cal   = array[17];// 
       // ___ First blue photometry: source of photometric calibration
         b1_xi   = array[18];// (arcsec) 
       // ___ First blue photometry: distance of photo-center from mean object position (X)
         b1_eta   = array[19];// (arcsec) 
       // ___ First blue photometry: distance of photo-center from mean object position (Y)
         r1_mag   = array[20];// (mag) 
       // ___ First red photometry: magnitude
         r1_cal   = array[21];// 
       // ___ First red photometry: source of photometric calibration
         r1_xi   = array[22];// (arcsec) 
       // ___ First red photometry: distance of photo-center from mean object position (X)
         r1_eta   = array[23];// (arcsec) 
       // ___ First red photometry: distance of photo-center from mean object position (Y)
         b2_mag   = array[24];// (mag) 
       // ___ Second blue photometry: magnitude
        b2_cal   = array[25];// 
       // ___ Second blue photometry: source of photometric calibration
         b2_xi   = array[26];// (arcsec) 
       // ___ Second blue photometry: distance of photo-center from mean object position (X)
         b2_eta   = array[27];// (arcsec) 
       // ___ Second blue photometry: distance of photo-center from mean object position (Y)
         r2_mag   = array[28];// (mag) 
       // ___ Second red photometry: magnitude
         r2_cal   = array[29];// 
       // ___ Second red photometry: source of photometric calibration
         r2_xi   = array[30];// (arcsec) 
       // ___ Second red photometry: distance of photo-center from mean object position (X)
         r2_eta   = array[31];// (arcsec) 
       // ___ Second red photometry: distance of photo-center from mean object position (Y)
         i_mag   = array[32];// (mag) 
       // ___ Near-IR photometry: magnitude
         i_cal   = array[33];// 
       // ___ Near-IR photometry: source of photometric calibration
         i_xi   = array[34];// (arcsec) 
       // ___ Near-IR photometry: distance of photo-center from mean object position (X)
         i_eta   = array[35];// (arcsec) 
       // ___ Near-IR photometry: distance of photo-center from mean object position (Y)
         dist   = array[36];// (deg) 
       // ___ Position Angle in degree.
         angle   = array[37];// (arcsec) 
       // ___ Distance between the target position and each source in arcsec.
	}


	/**
     * @return the usno_b1
     */
    public synchronized final String getUsno_b1() {
    	return usno_b1;
    }


	/**
     * @return the tycho2
     */
    public synchronized final String getTycho2() {
    	return tycho2;
    }


	/**
     * @return the ra
     */
    public synchronized final String getRa() {
    	return ra;
    }


	/**
     * @return the dec
     */
    public synchronized final String getDec() {
    	return dec;
    }


	/**
     * @return the clon
     */
    public synchronized final String getClon() {
    	return clon;
    }


	/**
     * @return the clat
     */
    public synchronized final String getClat() {
    	return clat;
    }


	/**
     * @return the e_ra
     */
    public synchronized final String getE_ra() {
    	return e_ra;
    }


	/**
     * @return the e_dec
     */
    public synchronized final String getE_dec() {
    	return e_dec;
    }


	/**
     * @return the epoch
     */
    public synchronized final String getEpoch() {
    	return epoch;
    }


	/**
     * @return the pm_ra
     */
    public synchronized final String getPm_ra() {
    	return pm_ra;
    }


	/**
     * @return the pm_dec
     */
    public synchronized final String getPm_dec() {
    	return pm_dec;
    }


	/**
     * @return the e_pm_ra
     */
    public synchronized final String getE_pm_ra() {
    	return e_pm_ra;
    }


	/**
     * @return the e_pm_dec
     */
    public synchronized final String getE_pm_dec() {
    	return e_pm_dec;
    }


	/**
     * @return the e_fit_ra
     */
    public synchronized final String getE_fit_ra() {
    	return e_fit_ra;
    }


	/**
     * @return the e_fit_dec
     */
    public synchronized final String getE_fit_dec() {
    	return e_fit_dec;
    }


	/**
     * @return the b1_mag
     */
    public synchronized final String getB1_mag() {
    	return b1_mag;
    }


	/**
     * @return the b1_cal
     */
    public synchronized final String getB1_cal() {
    	return b1_cal;
    }


	/**
     * @return the b1_xi
     */
    public synchronized final String getB1_xi() {
    	return b1_xi;
    }


	/**
     * @return the b1_eta
     */
    public synchronized final String getB1_eta() {
    	return b1_eta;
    }


	/**
     * @return the r1_mag
     */
    public synchronized final String getR1_mag() {
    	return r1_mag;
    }


	/**
     * @return the r1_cal
     */
    public synchronized final String getR1_cal() {
    	return r1_cal;
    }


	/**
     * @return the r1_xi
     */
    public synchronized final String getR1_xi() {
    	return r1_xi;
    }


	/**
     * @return the r1_eta
     */
    public synchronized final String getR1_eta() {
    	return r1_eta;
    }


	/**
     * @return the b2_mag
     */
    public synchronized final String getB2_mag() {
    	return b2_mag;
    }


	/**
     * @return the b2_cal
     */
    public synchronized final String getB2_cal() {
    	return b2_cal;
    }


	/**
     * @return the b2_xi
     */
    public synchronized final String getB2_xi() {
    	return b2_xi;
    }


	/**
     * @return the b2_eta
     */
    public synchronized final String getB2_eta() {
    	return b2_eta;
    }


	/**
     * @return the r2_mag
     */
    public synchronized final String getR2_mag() {
    	return r2_mag;
    }


	/**
     * @return the r2_cal
     */
    public synchronized final String getR2_cal() {
    	return r2_cal;
    }


	/**
     * @return the r2_xi
     */
    public synchronized final String getR2_xi() {
    	return r2_xi;
    }


	/**
     * @return the r2_eta
     */
    public synchronized final String getR2_eta() {
    	return r2_eta;
    }


	/**
     * @return the i_mag
     */
    public synchronized final String getI_mag() {
    	return i_mag;
    }


	/**
     * @return the i_cal
     */
    public synchronized final String getI_cal() {
    	return i_cal;
    }


	/**
     * @return the i_xi
     */
    public synchronized final String getI_xi() {
    	return i_xi;
    }


	/**
     * @return the i_eta
     */
    public synchronized final String getI_eta() {
    	return i_eta;
    }


	/**
     * @return the angle
     */
    public synchronized final String getAngle() {
    	return angle;
    }


	/**
     * @return the dist
     */
    public synchronized final String getDist() {
    	return dist;
    }


	/**
     * @param usno_b1 the usno_b1 to set
     */
    public synchronized final void setUsno_b1(String usno_b1) {
    	this.usno_b1 = usno_b1;
    }


	/**
     * @param tycho2 the tycho2 to set
     */
    public synchronized final void setTycho2(String tycho2) {
    	this.tycho2 = tycho2;
    }


	/**
     * @param ra the ra to set
     */
    public synchronized final void setRa(String ra) {
    	this.ra = ra;
    }


	/**
     * @param dec the dec to set
     */
    public synchronized final void setDec(String dec) {
    	this.dec = dec;
    }


	/**
     * @param clon the clon to set
     */
    public synchronized final void setClon(String clon) {
    	this.clon = clon;
    }


	/**
     * @param clat the clat to set
     */
    public synchronized final void setClat(String clat) {
    	this.clat = clat;
    }


	/**
     * @param e_ra the e_ra to set
     */
    public synchronized final void setE_ra(String e_ra) {
    	this.e_ra = e_ra;
    }


	/**
     * @param e_dec the e_dec to set
     */
    public synchronized final void setE_dec(String e_dec) {
    	this.e_dec = e_dec;
    }


	/**
     * @param epoch the epoch to set
     */
    public synchronized final void setEpoch(String epoch) {
    	this.epoch = epoch;
    }


	/**
     * @param pm_ra the pm_ra to set
     */
    public synchronized final void setPm_ra(String pm_ra) {
    	this.pm_ra = pm_ra;
    }


	/**
     * @param pm_dec the pm_dec to set
     */
    public synchronized final void setPm_dec(String pm_dec) {
    	this.pm_dec = pm_dec;
    }


	/**
     * @param e_pm_ra the e_pm_ra to set
     */
    public synchronized final void setE_pm_ra(String e_pm_ra) {
    	this.e_pm_ra = e_pm_ra;
    }


	/**
     * @param e_pm_dec the e_pm_dec to set
     */
    public synchronized final void setE_pm_dec(String e_pm_dec) {
    	this.e_pm_dec = e_pm_dec;
    }


	/**
     * @param e_fit_ra the e_fit_ra to set
     */
    public synchronized final void setE_fit_ra(String e_fit_ra) {
    	this.e_fit_ra = e_fit_ra;
    }


	/**
     * @param e_fit_dec the e_fit_dec to set
     */
    public synchronized final void setE_fit_dec(String e_fit_dec) {
    	this.e_fit_dec = e_fit_dec;
    }


	/**
     * @param b1_mag the b1_mag to set
     */
    public synchronized final void setB1_mag(String b1_mag) {
    	this.b1_mag = b1_mag;
    }


	/**
     * @param b1_cal the b1_cal to set
     */
    public synchronized final void setB1_cal(String b1_cal) {
    	this.b1_cal = b1_cal;
    }


	/**
     * @param b1_xi the b1_xi to set
     */
    public synchronized final void setB1_xi(String b1_xi) {
    	this.b1_xi = b1_xi;
    }


	/**
     * @param b1_eta the b1_eta to set
     */
    public synchronized final void setB1_eta(String b1_eta) {
    	this.b1_eta = b1_eta;
    }


	/**
     * @param r1_mag the r1_mag to set
     */
    public synchronized final void setR1_mag(String r1_mag) {
    	this.r1_mag = r1_mag;
    }


	/**
     * @param r1_cal the r1_cal to set
     */
    public synchronized final void setR1_cal(String r1_cal) {
    	this.r1_cal = r1_cal;
    }


	/**
     * @param r1_xi the r1_xi to set
     */
    public synchronized final void setR1_xi(String r1_xi) {
    	this.r1_xi = r1_xi;
    }


	/**
     * @param r1_eta the r1_eta to set
     */
    public synchronized final void setR1_eta(String r1_eta) {
    	this.r1_eta = r1_eta;
    }


	/**
     * @param b2_mag the b2_mag to set
     */
    public synchronized final void setB2_mag(String b2_mag) {
    	this.b2_mag = b2_mag;
    }


	/**
     * @param b2_cal the b2_cal to set
     */
    public synchronized final void setB2_cal(String b2_cal) {
    	this.b2_cal = b2_cal;
    }


	/**
     * @param b2_xi the b2_xi to set
     */
    public synchronized final void setB2_xi(String b2_xi) {
    	this.b2_xi = b2_xi;
    }


	/**
     * @param b2_eta the b2_eta to set
     */
    public synchronized final void setB2_eta(String b2_eta) {
    	this.b2_eta = b2_eta;
    }


	/**
     * @param r2_mag the r2_mag to set
     */
    public synchronized final void setR2_mag(String r2_mag) {
    	this.r2_mag = r2_mag;
    }


	/**
     * @param r2_cal the r2_cal to set
     */
    public synchronized final void setR2_cal(String r2_cal) {
    	this.r2_cal = r2_cal;
    }


	/**
     * @param r2_xi the r2_xi to set
     */
    public synchronized final void setR2_xi(String r2_xi) {
    	this.r2_xi = r2_xi;
    }


	/**
     * @param r2_eta the r2_eta to set
     */
    public synchronized final void setR2_eta(String r2_eta) {
    	this.r2_eta = r2_eta;
    }


	/**
     * @param i_mag the i_mag to set
     */
    public synchronized final void setI_mag(String i_mag) {
    	this.i_mag = i_mag;
    }


	/**
     * @param i_cal the i_cal to set
     */
    public synchronized final void setI_cal(String i_cal) {
    	this.i_cal = i_cal;
    }


	/**
     * @param i_xi the i_xi to set
     */
    public synchronized final void setI_xi(String i_xi) {
    	this.i_xi = i_xi;
    }


	/**
     * @param i_eta the i_eta to set
     */
    public synchronized final void setI_eta(String i_eta) {
    	this.i_eta = i_eta;
    }


	/**
     * @param angle the angle to set
     */
    public synchronized final void setAngle(String angle) {
    	this.angle = angle;
    }


	/**
     * @param dist the dist to set
     */
    public synchronized final void setDist(String dist) {
    	this.dist = dist;
    }


	/* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	    return String.format("USNOB1 [usno_b1=%s, tycho2=%s, ra=%s, dec=%s, clon=%s, clat=%s, e_ra=%s, e_dec=%s, epoch=%s, pm_ra=%s, pm_dec=%s, e_pm_ra=%s, e_pm_dec=%s, e_fit_ra=%s, e_fit_dec=%s, b1_mag=%s, b1_cal=%s, b1_xi=%s, b1_eta=%s, r1_mag=%s, r1_cal=%s, r1_xi=%s, r1_eta=%s, b2_mag=%s, b2_cal=%s, b2_xi=%s, b2_eta=%s, r2_mag=%s, r2_cal=%s, r2_xi=%s, r2_eta=%s, i_mag=%s, i_cal=%s, i_xi=%s, i_eta=%s, angle=%s, dist=%s]", usno_b1, tycho2, ra, dec, clon, clat, e_ra, e_dec, epoch, pm_ra, pm_dec, e_pm_ra, e_pm_dec, e_fit_ra, e_fit_dec, b1_mag, b1_cal, b1_xi, b1_eta, r1_mag, r1_cal, r1_xi, r1_eta, b2_mag, b2_cal, b2_xi, b2_eta, r2_mag, r2_cal, r2_xi, r2_eta, i_mag, i_cal, i_xi, i_eta, angle, dist);
    }




    
}
