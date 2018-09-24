package org.gedraa;

public class UCAC3 {
	
	String ra ="";// (degree) 
	// ___ RA_J2000 (J2000 R.A. of source)
	String dec ="";// (degree) 
	// ___ DEC_J2000 (J2000 Dec. of source)
	String clon ="";// 
	// ___ Right ascention in Sexagesimal format.
	String clat ="";// 
	// ___ Declination in Sexagesimal format.
	String ran ="";// (mas) 
	// ___ right ascension at epoch J2000.0 (ICRS)
	String spdn ="";// (mas) 
	// ___ south pole distance epoch J2000.0 (ICRS)
	String sigra ="";// (mas) 
	// ___ error at central epoch in RA (*cos Dec)
	String sigdc ="";// (mas) 
	// ___ error at central epoch in Dec
	String im1 ="";// (mag) 
	// ___ UCAC fit model magnitude
	String im2 ="";// (mag) 
	// ___ UCAC aperture  magnitude
	String sigmag ="";// (mag) 
	// ___ UCAC error on magnitude
	String objt ="";// 
	// ___ object type
	String dsf ="";// 
	// ___ double star flag
	String cepra ="";// (0.01 yr) 
	// ___ central epoch for mean RA, minus 1900
	String cepdc ="";// (0.01 yr) 
	// ___ central epoch for mean Dec,minus 1900
	String na1 ="";// 
	// ___ total # of CCD images of this star
	String nu1  ="";//
	// ___ # of CCD images used for this star
	String us1  ="";//
	// ___ # catalogs (epochs) used for proper motions
	String cn1 ="";// 
	// ___ total # catalogs (epochs) initial match
	String pmrac ="";// (0.1 mas/yr) 
	// ___ proper motion in RA*cos(Dec)
	String sigpmr ="";// (0.1 mas/yr) 
	// ___ error of pmRA * cos Dec
	String pmdc ="";// (0.1 mas/yr) 
	// ___ proper motion in Dec
	String sigpmd ="";// (0.1 mas/yr) 
	// ___ error of pmDec
	String id2m ="";// 
	// ___ 2MASS pts_key star identifier
	String jmag ="";// (mag) 
	// ___ 2MASS J  magnitude
	String e2mphoj ="";// (1/100 mag) 
	// ___ 2MASS error photom.
	String hmag ="";// (mag) 
	// ___ 2MASS H  magnitude
	String e2mphoh ="";// (1/100 mag) 
	// ___ 2MASS error photom.
	String kmag ="";// (mag) 
	// ___ 2MASS K_s magnitude
	String e2mphok ="";// (1/100 mag) 
	// ___ 2MASS error photom.
	String icqflg ="";// 
	// ___ 2MASS cc_flg*10 + phot.qual.flag
	String smb ="";// (mag) 
	// ___ SuperCosmos B magnitude
	String smr2 ="";// (mag) 
	// ___ SuperCosmos R2 magnitude
	String smi ="";// (mag) 
	// ___ SuperCosmos I magnitude
	String clbl ="";// 
	// ___ SC star/galaxy classif./quality flag
	String qfb  ="";//
	// ___ SuperCosmos quality flag B magnitude
	String qfr2  ="";//
	// ___ SuperCosmos quality flag R2 magnitude
	String qfi  ="";//
	// ___ SuperCosmos quality flag I magnitude
	String catflg  ="";//
	// ___ Multiple catalog match flag
	String g1  ="";//
	// ___ Yale SPM objt type(g-flag)
	String c1  ="";//
	// ___ Yale SPM input cat(c-flag)
	String leda ="";// (arcsec) 
	// ___ LEDA galaxy match flag
	String x2m ="";// (arcsec) 
	// ___ 2MASS extend.source flag
	String rn ="";// 
	// ___ Star identification (MPOS) number
	String angle ="";// (deg) 
	// ___ Position Angle in degree.
	String dist ="";// (arcsec) 
	// ___ Distance between the target position and each source in arcsec.

	
	
	public UCAC3(String rawString)
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
        
        ra =array[0];// (degree) 
        // ___ RA_J2000 (J2000 R.A. of source)
        dec =array[1];// (degree) 
        // ___ DEC_J2000 (J2000 Dec. of source)
        clon =array[2];// 
        // ___ Right ascention in Sexagesimal format.
        clat =array[3];// 
        // ___ Declination in Sexagesimal format.
        ran =array[4];// (mas) 
        // ___ right ascension at epoch J2000.0 (ICRS)
        spdn =array[5];// (mas) 
        // ___ south pole distance epoch J2000.0 (ICRS)
        sigra =array[6];// (mas) 
        // ___ error at central epoch in RA (*cos Dec)
        sigdc =array[7];// (mas) 
        // ___ error at central epoch in Dec
        im1 =array[8];// (mag) 
        // ___ UCAC fit model magnitude
        im2 =array[9];// (mag) 
        // ___ UCAC aperture  magnitude
        sigmag =array[10];// (mag) 
        // ___ UCAC error on magnitude
        objt =array[11];// 
        // ___ object type
        dsf =array[12];// 
        // ___ double star flag
        cepra =array[13];// (0.01 yr) 
        // ___ central epoch for mean RA, minus 1900
        cepdc =array[14];// (0.01 yr) 
        // ___ central epoch for mean Dec,minus 1900
        na1 =array[15];// 
        // ___ total # of CCD images of this star
        nu1  =array[16];//
        // ___ # of CCD images used for this star
        us1  =array[17];//
        // ___ # catalogs (epochs) used for proper motions
        cn1 =array[18];// 
        // ___ total # catalogs (epochs) initial match
        pmrac =array[19];// (0.1 mas/yr) 
        // ___ proper motion in RA*cos(Dec)
        sigpmr =array[20];// (0.1 mas/yr) 
        // ___ error of pmRA * cos Dec
        pmdc =array[21];// (0.1 mas/yr) 
        // ___ proper motion in Dec
        sigpmd =array[22];// (0.1 mas/yr) 
        // ___ error of pmDec
        id2m =array[23];// 
        // ___ 2MASS pts_key star identifier
        jmag =array[24];// (mag) 
        // ___ 2MASS J  magnitude
        e2mphoj =array[25];// (1/100 mag) 
        // ___ 2MASS error photom.
        hmag =array[26];// (mag) 
        // ___ 2MASS H  magnitude
        e2mphoh =array[27];// (1/100 mag) 
        // ___ 2MASS error photom.
        kmag =array[28];// (mag) 
        // ___ 2MASS K_s magnitude
        e2mphok =array[29];// (1/100 mag) 
        // ___ 2MASS error photom.
        icqflg =array[30];// 
        // ___ 2MASS cc_flg*10 + phot.qual.flag
        smb =array[31];// (mag) 
        // ___ SuperCosmos B magnitude
        smr2 =array[32];// (mag) 
        // ___ SuperCosmos R2 magnitude
        smi =array[33];// (mag) 
        // ___ SuperCosmos I magnitude
        clbl =array[34];// 
        // ___ SC star/galaxy classif./quality flag
        qfb  =array[35];//
        // ___ SuperCosmos quality flag B magnitude
        qfr2  =array[36];//
        // ___ SuperCosmos quality flag R2 magnitude
        qfi  =array[37];//
        // ___ SuperCosmos quality flag I magnitude
        catflg  =array[38];//
        // ___ Multiple catalog match flag
        g1  =array[39];//
        // ___ Yale SPM objt type(g-flag)
        c1  =array[40];//
        // ___ Yale SPM input cat(c-flag)
        leda =array[41];// (arcsec) 
        // ___ LEDA galaxy match flag
        x2m =array[42];// (arcsec) 
        // ___ 2MASS extend.source flag
        rn =array[43];// 
        // ___ Star identification (MPOS) number
        angle =array[44];// (deg) 
        // ___ Position Angle in degree.
        dist =array[45];// (arcsec) 
        // ___ Distance between the target position and each source in arcsec.
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
     * @return the ran
     */
    public synchronized final String getRan() {
    	return ran;
    }


	/**
     * @return the spdn
     */
    public synchronized final String getSpdn() {
    	return spdn;
    }


	/**
     * @return the sigra
     */
    public synchronized final String getSigra() {
    	return sigra;
    }


	/**
     * @return the sigdc
     */
    public synchronized final String getSigdc() {
    	return sigdc;
    }


	/**
     * @return the im1
     */
    public synchronized final String getIm1() {
    	return im1;
    }


	/**
     * @return the im2
     */
    public synchronized final String getIm2() {
    	return im2;
    }


	/**
     * @return the sigmag
     */
    public synchronized final String getSigmag() {
    	return sigmag;
    }


	/**
     * @return the objt
     */
    public synchronized final String getObjt() {
    	return objt;
    }


	/**
     * @return the dsf
     */
    public synchronized final String getDsf() {
    	return dsf;
    }


	/**
     * @return the cepra
     */
    public synchronized final String getCepra() {
    	return cepra;
    }


	/**
     * @return the cepdc
     */
    public synchronized final String getCepdc() {
    	return cepdc;
    }


	/**
     * @return the na1
     */
    public synchronized final String getNa1() {
    	return na1;
    }


	/**
     * @return the nu1
     */
    public synchronized final String getNu1() {
    	return nu1;
    }


	/**
     * @return the us1
     */
    public synchronized final String getUs1() {
    	return us1;
    }


	/**
     * @return the cn1
     */
    public synchronized final String getCn1() {
    	return cn1;
    }


	/**
     * @return the pmrac
     */
    public synchronized final String getPmrac() {
    	return pmrac;
    }


	/**
     * @return the sigpmr
     */
    public synchronized final String getSigpmr() {
    	return sigpmr;
    }


	/**
     * @return the pmdc
     */
    public synchronized final String getPmdc() {
    	return pmdc;
    }


	/**
     * @return the sigpmd
     */
    public synchronized final String getSigpmd() {
    	return sigpmd;
    }


	/**
     * @return the id2m
     */
    public synchronized final String getId2m() {
    	return id2m;
    }


	/**
     * @return the jmag
     */
    public synchronized final String getJmag() {
    	return jmag;
    }


	/**
     * @return the e2mphoj
     */
    public synchronized final String getE2mphoj() {
    	return e2mphoj;
    }


	/**
     * @return the hmag
     */
    public synchronized final String getHmag() {
    	return hmag;
    }


	/**
     * @return the e2mphoh
     */
    public synchronized final String getE2mphoh() {
    	return e2mphoh;
    }


	/**
     * @return the kmag
     */
    public synchronized final String getKmag() {
    	return kmag;
    }


	/**
     * @return the e2mphok
     */
    public synchronized final String getE2mphok() {
    	return e2mphok;
    }


	/**
     * @return the icqflg
     */
    public synchronized final String getIcqflg() {
    	return icqflg;
    }


	/**
     * @return the smb
     */
    public synchronized final String getSmb() {
    	return smb;
    }


	/**
     * @return the smr2
     */
    public synchronized final String getSmr2() {
    	return smr2;
    }


	/**
     * @return the smi
     */
    public synchronized final String getSmi() {
    	return smi;
    }


	/**
     * @return the clbl
     */
    public synchronized final String getClbl() {
    	return clbl;
    }


	/**
     * @return the qfb
     */
    public synchronized final String getQfb() {
    	return qfb;
    }


	/**
     * @return the qfr2
     */
    public synchronized final String getQfr2() {
    	return qfr2;
    }


	/**
     * @return the qfi
     */
    public synchronized final String getQfi() {
    	return qfi;
    }


	/**
     * @return the catflg
     */
    public synchronized final String getCatflg() {
    	return catflg;
    }


	/**
     * @return the g1
     */
    public synchronized final String getG1() {
    	return g1;
    }


	/**
     * @return the c1
     */
    public synchronized final String getC1() {
    	return c1;
    }


	/**
     * @return the leda
     */
    public synchronized final String getLeda() {
    	return leda;
    }


	/**
     * @return the x2m
     */
    public synchronized final String getX2m() {
    	return x2m;
    }


	/**
     * @return the rn
     */
    public synchronized final String getRn() {
    	return rn;
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
     * @param ran the ran to set
     */
    public synchronized final void setRan(String ran) {
    	this.ran = ran;
    }


	/**
     * @param spdn the spdn to set
     */
    public synchronized final void setSpdn(String spdn) {
    	this.spdn = spdn;
    }


	/**
     * @param sigra the sigra to set
     */
    public synchronized final void setSigra(String sigra) {
    	this.sigra = sigra;
    }


	/**
     * @param sigdc the sigdc to set
     */
    public synchronized final void setSigdc(String sigdc) {
    	this.sigdc = sigdc;
    }


	/**
     * @param im1 the im1 to set
     */
    public synchronized final void setIm1(String im1) {
    	this.im1 = im1;
    }


	/**
     * @param im2 the im2 to set
     */
    public synchronized final void setIm2(String im2) {
    	this.im2 = im2;
    }


	/**
     * @param sigmag the sigmag to set
     */
    public synchronized final void setSigmag(String sigmag) {
    	this.sigmag = sigmag;
    }


	/**
     * @param objt the objt to set
     */
    public synchronized final void setObjt(String objt) {
    	this.objt = objt;
    }


	/**
     * @param dsf the dsf to set
     */
    public synchronized final void setDsf(String dsf) {
    	this.dsf = dsf;
    }


	/**
     * @param cepra the cepra to set
     */
    public synchronized final void setCepra(String cepra) {
    	this.cepra = cepra;
    }


	/**
     * @param cepdc the cepdc to set
     */
    public synchronized final void setCepdc(String cepdc) {
    	this.cepdc = cepdc;
    }


	/**
     * @param na1 the na1 to set
     */
    public synchronized final void setNa1(String na1) {
    	this.na1 = na1;
    }


	/**
     * @param nu1 the nu1 to set
     */
    public synchronized final void setNu1(String nu1) {
    	this.nu1 = nu1;
    }


	/**
     * @param us1 the us1 to set
     */
    public synchronized final void setUs1(String us1) {
    	this.us1 = us1;
    }


	/**
     * @param cn1 the cn1 to set
     */
    public synchronized final void setCn1(String cn1) {
    	this.cn1 = cn1;
    }


	/**
     * @param pmrac the pmrac to set
     */
    public synchronized final void setPmrac(String pmrac) {
    	this.pmrac = pmrac;
    }


	/**
     * @param sigpmr the sigpmr to set
     */
    public synchronized final void setSigpmr(String sigpmr) {
    	this.sigpmr = sigpmr;
    }


	/**
     * @param pmdc the pmdc to set
     */
    public synchronized final void setPmdc(String pmdc) {
    	this.pmdc = pmdc;
    }


	/**
     * @param sigpmd the sigpmd to set
     */
    public synchronized final void setSigpmd(String sigpmd) {
    	this.sigpmd = sigpmd;
    }


	/**
     * @param id2m the id2m to set
     */
    public synchronized final void setId2m(String id2m) {
    	this.id2m = id2m;
    }


	/**
     * @param jmag the jmag to set
     */
    public synchronized final void setJmag(String jmag) {
    	this.jmag = jmag;
    }


	/**
     * @param e2mphoj the e2mphoj to set
     */
    public synchronized final void setE2mphoj(String e2mphoj) {
    	this.e2mphoj = e2mphoj;
    }


	/**
     * @param hmag the hmag to set
     */
    public synchronized final void setHmag(String hmag) {
    	this.hmag = hmag;
    }


	/**
     * @param e2mphoh the e2mphoh to set
     */
    public synchronized final void setE2mphoh(String e2mphoh) {
    	this.e2mphoh = e2mphoh;
    }


	/**
     * @param kmag the kmag to set
     */
    public synchronized final void setKmag(String kmag) {
    	this.kmag = kmag;
    }


	/**
     * @param e2mphok the e2mphok to set
     */
    public synchronized final void setE2mphok(String e2mphok) {
    	this.e2mphok = e2mphok;
    }


	/**
     * @param icqflg the icqflg to set
     */
    public synchronized final void setIcqflg(String icqflg) {
    	this.icqflg = icqflg;
    }


	/**
     * @param smb the smb to set
     */
    public synchronized final void setSmb(String smb) {
    	this.smb = smb;
    }


	/**
     * @param smr2 the smr2 to set
     */
    public synchronized final void setSmr2(String smr2) {
    	this.smr2 = smr2;
    }


	/**
     * @param smi the smi to set
     */
    public synchronized final void setSmi(String smi) {
    	this.smi = smi;
    }


	/**
     * @param clbl the clbl to set
     */
    public synchronized final void setClbl(String clbl) {
    	this.clbl = clbl;
    }


	/**
     * @param qfb the qfb to set
     */
    public synchronized final void setQfb(String qfb) {
    	this.qfb = qfb;
    }


	/**
     * @param qfr2 the qfr2 to set
     */
    public synchronized final void setQfr2(String qfr2) {
    	this.qfr2 = qfr2;
    }


	/**
     * @param qfi the qfi to set
     */
    public synchronized final void setQfi(String qfi) {
    	this.qfi = qfi;
    }


	/**
     * @param catflg the catflg to set
     */
    public synchronized final void setCatflg(String catflg) {
    	this.catflg = catflg;
    }


	/**
     * @param g1 the g1 to set
     */
    public synchronized final void setG1(String g1) {
    	this.g1 = g1;
    }


	/**
     * @param c1 the c1 to set
     */
    public synchronized final void setC1(String c1) {
    	this.c1 = c1;
    }


	/**
     * @param leda the leda to set
     */
    public synchronized final void setLeda(String leda) {
    	this.leda = leda;
    }


	/**
     * @param x2m the x2m to set
     */
    public synchronized final void setX2m(String x2m) {
    	this.x2m = x2m;
    }


	/**
     * @param rn the rn to set
     */
    public synchronized final void setRn(String rn) {
    	this.rn = rn;
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
	    return String.format("UCAC3 [ra=%s, dec=%s, clon=%s, clat=%s, ran=%s, spdn=%s, sigra=%s, sigdc=%s, im1=%s, im2=%s, sigmag=%s, objt=%s, dsf=%s, cepra=%s, cepdc=%s, na1=%s, nu1=%s, us1=%s, cn1=%s, pmrac=%s, sigpmr=%s, pmdc=%s, sigpmd=%s, id2m=%s, jmag=%s, e2mphoj=%s, hmag=%s, e2mphoh=%s, kmag=%s, e2mphok=%s, icqflg=%s, smb=%s, smr2=%s, smi=%s, clbl=%s, qfb=%s, qfr2=%s, qfi=%s, catflg=%s, g1=%s, c1=%s, leda=%s, x2m=%s, rn=%s, angle=%s, dist=%s]", ra, dec, clon, clat, ran, spdn, sigra, sigdc, im1, im2, sigmag, objt, dsf, cepra, cepdc, na1, nu1, us1, cn1, pmrac, sigpmr, pmdc, sigpmd, id2m, jmag, e2mphoj, hmag, e2mphoh, kmag, e2mphok, icqflg, smb, smr2, smi, clbl, qfb, qfr2, qfi, catflg, g1, c1, leda, x2m, rn, angle, dist);
    }



    
}
