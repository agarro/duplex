package org.gedraa;

public class CMC14 {
	
	String _r ;//(arcmin)      (F6.4)  Distance from center (321.231402+17.519558)[FK5/J2000] [ucd=pos.angDistance]
	String CMC14 ;//           (a15)   CMC14-Identifier, based on ICRS position (1) [ucd=meta.id;meta.main]
	String f_CMC14 ;//         (A1)    [*R] when 2 stars share the same name \ifnum\Vphase<4\br{\fg{green4} Type {\bf R} to select stars from the rejected sample}\fi (1) [ucd=meta.code]
	String RAJ2000 ;//(deg)    (F10.6) Right Ascension ICRS (in mas = 0.01arcsec) (2) [ucd=pos.eq.ra;meta.main]
	String DEJ2000;// (deg)    (F10.6) Declination ICRS (in mas = 0.01arcsec) (2) [ucd=pos.eq.dec;meta.main]
	String MJD_51263;// (d)    (I4)    Mean epoch of astrometry, as days since 26-3-1999 (=MJD-51263, or JD-2451263.5) [ucd=time.epoch]
	String rmag;// (mag)      (F6.3)  CMC magnitude (AB{nu} scale) (3) [ucd=phot.mag;em.opt.R]
	String u_rmag ;//         (A1)    Flag (:) on r'mag when non-photometric [ucd=meta.code.error;phot.mag;em.opt.R]
	String Nt;//               (I2)    Total number of observations [ucd=meta.number]
	String Na;//               (I2)    Number of astrometric observations [ucd=meta.number]
	String Np;//               (I2)    Number of photometric observations [ucd=meta.number]
	String e_RAdeg;// (arcsec) (F6.3)  ? Standard deviation of RAmas [ucd=stat.error]
	String e_DEdeg;// (arcsec) (F6.3)  ? Standard deviation of DEmas [ucd=stat.error]
	String e_r_mag;// (mag)    (F6.3)  ? Standard deviation of r'mag [ucd=stat.error;phot.mag;em.opt.R]
	String Jmag;// (mag)       (F6.3)  ? 2MASS J magnitude, Vega scale (4) [ucd=phot.mag;em.IR.J]
	String Hmag;// (mag)       (F6.3)  ? 2MASS H magnitude, Vega scale (4) [ucd=phot.mag;em.IR.H]
	String Ksmag;// (mag)      (F6.3)  ? 2MASS Ks magnitude, Vega scale (4) [ucd=phot.mag;em.IR.K]
	String twoMASS;//            (a5)    Display the 2MASS data (stars closer than 5arcsec) [ucd=meta.ref.url]	
	
	public CMC14(String rawString)
	{
		parseRawString(rawString);
		
		
		System.out.println(toString());
	}


	private void parseRawString(String rawString) {
	    // TODO Auto-generated method stub
		
		String [] array = rawString.split("\\s+");  

        System.out.println("Leyendo estrella de CMC14 . . . ." ); 
        for (String s : array) {
            System.out.println(s);  
        }
/*        _r  =  rawString.substring(0,6).trim();//(arcmin)      (F6.4)  Distance from center (321.231402+17.519558)[FK5/J2000] [ucd=pos.angDistance]
        CMC14  =  rawString.substring(7,23).trim();//           (a15)   CMC14-Identifier, based on ICRS position (1) [ucd=meta.id =  array[];meta.main]
        f_CMC14  =  rawString.substring(24,25).trim();//         (A1)    [*R] when 2 stars share the same name \ifnum\Vphase<4\br{\fg{green4} Type {\bf R} to select stars from the rejected sample}\fi (1) [ucd=meta.code]
        RAJ2000  =  rawString.substring(25,36).trim();//(deg)    (F10.6) Right Ascension ICRS (in mas = 0.01arcsec) (2) [ucd=pos.eq.ra =  array[];meta.main]
        DEJ2000 =  rawString.substring(36,47).trim();// (deg)    (F10.6) Declination ICRS (in mas = 0.01arcsec) (2) [ucd=pos.eq.dec =  array[];meta.main]
        MJD_51263 =  rawString.substring(47,52).trim();// (d)    (I4)    Mean epoch of astrometry, as days since 26-3-1999 (=MJD-51263, or JD-2451263.5) [ucd=time.epoch]
        rmag =  rawString.substring(52,59).trim();// (mag)      (F6.3)  CMC magnitude (AB{nu} scale) (3) [ucd=phot.mag =  array[];em.opt.R]
        u_rmag  =  rawString.substring(59,60).trim();//         (A1)    Flag (:) on r'mag when non-photometric [ucd=meta.code.error =  array[];phot.mag =  array[];em.opt.R]
        Nt =  rawString.substring(61,64).trim();//               (I2)    Total number of observations [ucd=meta.number]
        Na =  rawString.substring(64,67).trim();//               (I2)    Number of astrometric observations [ucd=meta.number]
        Np =  rawString.substring(67,70).trim();//               (I2)    Number of photometric observations [ucd=meta.number]
        e_RAdeg =  rawString.substring(70,77).trim();// (arcsec) (F6.3)  ? Standard deviation of RAmas [ucd=stat.error]
        e_DEdeg = rawString.substring(77,84).trim();// (arcsec) (F6.3)  ? Standard deviation of DEmas [ucd=stat.error]
        e_r_mag =  rawString.substring(84,91).trim();// (mag)    (F6.3)  ? Standard deviation of r'mag [ucd=stat.error =  array[];phot.mag =  array[];em.opt.R]
        Jmag =  rawString.substring(91,98).trim();// (mag)       (F6.3)  ? 2MASS J magnitude, Vega scale (4) [ucd=phot.mag =  array[];em.IR.J]
        Hmag =  rawString.substring(98,105).trim();// (mag)       (F6.3)  ? 2MASS H magnitude, Vega scale (4) [ucd=phot.mag =  array[];em.IR.H]
        Ksmag =  rawString.substring(105,112).trim();// (mag)      (F6.3)  ? 2MASS Ks magnitude, Vega scale (4) [ucd=phot.mag =  array[];em.IR.K]
        twoMASS =  rawString.substring(112).trim();//            (a5)    Display the 2MASS data (stars closer than 5arcsec) [ucd=meta.ref.url]
        
*/	
        rmag =  rawString.substring(40,46).trim();// (mag)      (F6.3)  CMC magnitude (AB{nu} scale) (3) [ucd=phot.mag =  array[];em.opt.R]

        }


	/**
     * @return the _r
     */
    public synchronized final String get_r() {
    	return _r;
    }


	/**
     * @return the cMC14
     */
    public synchronized final String getCMC14() {
    	return CMC14;
    }


	/**
     * @return the f_CMC14
     */
    public synchronized final String getF_CMC14() {
    	return f_CMC14;
    }


	/**
     * @return the rAJ2000
     */
    public synchronized final String getRAJ2000() {
    	return RAJ2000;
    }


	/**
     * @return the dEJ2000
     */
    public synchronized final String getDEJ2000() {
    	return DEJ2000;
    }


	/**
     * @return the mJD_51263
     */
    public synchronized final String getMJD_51263() {
    	return MJD_51263;
    }


	/**
     * @return the rmag
     */
    public synchronized final String getRmag() {
    	return rmag;
    }


	/**
     * @return the u_rmag
     */
    public synchronized final String getU_rmag() {
    	return u_rmag;
    }


	/**
     * @return the nt
     */
    public synchronized final String getNt() {
    	return Nt;
    }


	/**
     * @return the na
     */
    public synchronized final String getNa() {
    	return Na;
    }


	/**
     * @return the np
     */
    public synchronized final String getNp() {
    	return Np;
    }


	/**
     * @return the e_RAdeg
     */
    public synchronized final String getE_RAdeg() {
    	return e_RAdeg;
    }


	/**
     * @return the e_DEdeg
     */
    public synchronized final String getE_DEdeg() {
    	return e_DEdeg;
    }


	/**
     * @return the e_r_mag
     */
    public synchronized final String getE_r_mag() {
    	return e_r_mag;
    }


	/**
     * @return the jmag
     */
    public synchronized final String getJmag() {
    	return Jmag;
    }


	/**
     * @return the hmag
     */
    public synchronized final String getHmag() {
    	return Hmag;
    }


	/**
     * @return the ksmag
     */
    public synchronized final String getKsmag() {
    	return Ksmag;
    }


	/**
     * @return the twoMASS
     */
    public synchronized final String getTwoMASS() {
    	return twoMASS;
    }


	/**
     * @param _r the _r to set
     */
    public synchronized final void set_r(String _r) {
    	this._r = _r;
    }


	/**
     * @param cMC14 the cMC14 to set
     */
    public synchronized final void setCMC14(String cMC14) {
    	CMC14 = cMC14;
    }


	/**
     * @param f_CMC14 the f_CMC14 to set
     */
    public synchronized final void setF_CMC14(String f_CMC14) {
    	this.f_CMC14 = f_CMC14;
    }


	/**
     * @param rAJ2000 the rAJ2000 to set
     */
    public synchronized final void setRAJ2000(String rAJ2000) {
    	RAJ2000 = rAJ2000;
    }


	/**
     * @param dEJ2000 the dEJ2000 to set
     */
    public synchronized final void setDEJ2000(String dEJ2000) {
    	DEJ2000 = dEJ2000;
    }


	/**
     * @param mJD_51263 the mJD_51263 to set
     */
    public synchronized final void setMJD_51263(String mJD_51263) {
    	MJD_51263 = mJD_51263;
    }


	/**
     * @param rmag the rmag to set
     */
    public synchronized final void setRmag(String rmag) {
    	this.rmag = rmag;
    }


	/**
     * @param u_rmag the u_rmag to set
     */
    public synchronized final void setU_rmag(String u_rmag) {
    	this.u_rmag = u_rmag;
    }


	/**
     * @param nt the nt to set
     */
    public synchronized final void setNt(String nt) {
    	Nt = nt;
    }


	/**
     * @param na the na to set
     */
    public synchronized final void setNa(String na) {
    	Na = na;
    }


	/**
     * @param np the np to set
     */
    public synchronized final void setNp(String np) {
    	Np = np;
    }


	/**
     * @param e_RAdeg the e_RAdeg to set
     */
    public synchronized final void setE_RAdeg(String e_RAdeg) {
    	this.e_RAdeg = e_RAdeg;
    }


	/**
     * @param e_DEdeg the e_DEdeg to set
     */
    public synchronized final void setE_DEdeg(String e_DEdeg) {
    	this.e_DEdeg = e_DEdeg;
    }


	/**
     * @param e_r_mag the e_r_mag to set
     */
    public synchronized final void setE_r_mag(String e_r_mag) {
    	this.e_r_mag = e_r_mag;
    }


	/**
     * @param jmag the jmag to set
     */
    public synchronized final void setJmag(String jmag) {
    	Jmag = jmag;
    }


	/**
     * @param hmag the hmag to set
     */
    public synchronized final void setHmag(String hmag) {
    	Hmag = hmag;
    }


	/**
     * @param ksmag the ksmag to set
     */
    public synchronized final void setKsmag(String ksmag) {
    	Ksmag = ksmag;
    }


	/**
     * @param twoMASS the twoMASS to set
     */
    public synchronized final void setTwoMASS(String twoMASS) {
    	this.twoMASS = twoMASS;
    }


	/* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	    return String.format("CMC14 [_r=%s, CMC14=%s, f_CMC14=%s, RAJ2000=%s, DEJ2000=%s, MJD_51263=%s, rmag=%s, u_rmag=%s, Nt=%s, Na=%s, Np=%s, e_RAdeg=%s, e_DEdeg=%s, e_r_mag=%s, Jmag=%s, Hmag=%s, Ksmag=%s, twoMASS=%s]", _r, CMC14, f_CMC14, RAJ2000, DEJ2000, MJD_51263, rmag, u_rmag, Nt, Na, Np, e_RAdeg, e_DEdeg, e_r_mag, Jmag, Hmag, Ksmag, twoMASS);
    }

    
}
