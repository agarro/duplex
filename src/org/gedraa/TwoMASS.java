package org.gedraa;

public class TwoMASS {
	
	String  ra =""; //(deg) 
	// ___ right ascension (J2000 decimal deg)
	String dec =""; //(deg) 
	// ___ declination (J2000 decimal deg)
	String clon =""; // 
	// ___ Right ascention in Sexagesimal format.
	String clat  =""; //
	// ___ Declination in Sexagesimal format.
	String err_maj =""; // (arcsec) 
	// ___ major axis of 1-sigma error ellipse
	String err_min =""; // (arcsec) 
	// ___ minor axis of 1-sigma error ellipse
	String err_ang =""; // (deg) 
	// ___ angle of error ellipse major axis (E of N)
	String designation =""; // 
	// ___ source designation formed from sexigesimal coordinates
	String j_m =""; // (mag) 
	// ___ J band selected "default" magnitude
	String j_cmsig =""; // (mag) 
	// ___ corrected J band photometric uncertainty
	String j_msigcom =""; // (mag) 
	// ___ combined (total) J band photometric uncertainty
	String j_snr =""; // 
	// ___ J band "scan" signal-to-noise ratio
	String h_m =""; // (mag) 
	// ___ H band selected "default" magnitude
	String h_cmsig =""; // (mag) 
	// ___ corrected H band photometric uncertainty
	String h_msigcom =""; // (mag) 
	// ___ combined (total) H band photometric uncertainty
	String h_snr =""; // 
	// ___ H band "scan" signal-to-noise ratio
	String k_m  =""; // (mag)
	// ___ K band selected "default" magnitude
	String k_cmsig =""; // (mag) 
	// ___ corrected K band photometric uncertainty
	String k_msigcom =""; // (mag) 
	// ___ combined (total) K band photometric uncertainty
	String k_snr  =""; //
	// ___ K band "scan" signal-to-noise ratio
	String ph_qual =""; // 
	// ___ flag indicating photometric quality of source
	String rd_flg =""; // 
	// ___ source of JHK "default" mags (AKA "read flag")
	String bl_flg  =""; //
	// ___ indicates # JHK components fit simultaneously to source
	String cc_flg =""; // 
	// ___ indicates JHK artifact contamination and/or confusion
	String ndet =""; // 
	// ___ number of >3-sig. ap. mag measurements, # possible (jjhhkk)
	String gal_contam =""; // 
	// ___ flag indicating if src is contaminated by extended source
	String mp_flg =""; // 
	// ___ src is positionally associated with an asteroid, comet, etc
	String hemis =""; // 
	// ___ hemisphere (N/S) of facility from which src was observed
	String xdate =""; // 
	// ___ observation reference date
	String scan =""; // 
	// ___ scan number (unique within date)
	String glon =""; // (deg) 
	// ___ galactic longitude (decimal deg)
	String glat =""; // (deg) 
	// ___ galactic latitude (decimal deg)
	String a =""; // 
	// ___ optical source catalog identifier of closest match within 5"
	String dist_opt =""; // (arcsec) 
	// ___ distance in arcsec relative to associated optical source
	String phi_opt =""; // (deg) 
	// ___ position angle relative to optical source (E of N)
	String b_m_opt =""; // (mag) 
	// ___ catalog blue mag of associated optical source
	String vr_m_opt =""; // (mag) 
	// ___ catalog visual or red mag of associated optical source
	String nopt_mchs =""; // 
	// ___ number of optical sources matched to this 2MASS source
	String ext_key =""; // 
	// ___ key to extended source data DB record
	String angle =""; // (deg) 
	// ___ Position Angle in degree.
	String dist =""; // (arcsec) 
	// ___ Distance between the target position and each source in arcsec.
	
	
	public TwoMASS(String rawString)
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
        ra =array[0]; //(deg) 
    	// ___ right ascension (J2000 decimal deg)
    	dec =array[1]; //(deg) 
    	// ___ declination (J2000 decimal deg)
    	clon =array[2]; // 
    	// ___ Right ascention in Sexagesimal format.
    	clat  =array[3]; //
    	// ___ Declination in Sexagesimal format.
    	err_maj =array[4]; // (arcsec) 
    	// ___ major axis of 1-sigma error ellipse
    	err_min =array[5]; // (arcsec) 
    	// ___ minor axis of 1-sigma error ellipse
    	err_ang =array[6]; // (deg) 
    	// ___ angle of error ellipse major axis (E of N)
    	designation =array[7]; // 
    	// ___ source designation formed from sexigesimal coordinates
    	j_m =array[8]; // (mag) 
    	// ___ J band selected "default" magnitude
    	j_cmsig =array[9]; // (mag) 
    	// ___ corrected J band photometric uncertainty
    	j_msigcom =array[10]; // (mag) 
    	// ___ combined (total) J band photometric uncertainty
    	j_snr =array[11]; // 
    	// ___ J band "scan" signal-to-noise ratio
    	h_m =array[12]; // (mag) 
    	// ___ H band selected "default" magnitude
    	h_cmsig =array[13]; // (mag) 
    	// ___ corrected H band photometric uncertainty
    	h_msigcom =array[14]; // (mag) 
    	// ___ combined (total) H band photometric uncertainty
    	h_snr =array[15]; // 
    	// ___ H band "scan" signal-to-noise ratio
    	k_m  =array[16]; // (mag)
    	// ___ K band selected "default" magnitude
    	k_cmsig =array[17]; // (mag) 
    	// ___ corrected K band photometric uncertainty
    	k_msigcom =array[18]; // (mag) 
    	// ___ combined (total) K band photometric uncertainty
    	k_snr  =array[19]; //
    	// ___ K band "scan" signal-to-noise ratio
    	ph_qual =array[20]; // 
    	// ___ flag indicating photometric quality of source
    	rd_flg =array[21]; // 
    	// ___ source of JHK "default" mags (AKA "read flag")
    	bl_flg  =array[22]; //
    	// ___ indicates # JHK components fit simultaneously to source
    	cc_flg =array[23]; // 
    	// ___ indicates JHK artifact contamination and/or confusion
    	ndet =array[24]; // 
    	// ___ number of >3-sig. ap. mag measurements, # possible (jjhhkk)
    	gal_contam =array[25]; // 
    	// ___ flag indicating if src is contaminated by extended source
    	mp_flg =array[26]; // 
    	// ___ src is positionally associated with an asteroid, comet, etc
    	hemis =array[27]; // 
    	// ___ hemisphere (N/S) of facility from which src was observed
    	xdate =array[28]; // 
    	// ___ observation reference date
    	scan =array[29]; // 
    	// ___ scan number (unique within date)
    	glon =array[30]; // (deg) 
    	// ___ galactic longitude (decimal deg)
    	glat =array[31]; // (deg) 
    	// ___ galactic latitude (decimal deg)
    	a =array[32]; // 
    	// ___ optical source catalog identifier of closest match within 5"
    	dist_opt =array[33]; // (arcsec) 
    	// ___ distance in arcsec relative to associated optical source
    	phi_opt =array[34]; // (deg) 
    	// ___ position angle relative to optical source (E of N)
    	b_m_opt =array[35]; // (mag) 
    	// ___ catalog blue mag of associated optical source
    	vr_m_opt =array[36]; // (mag) 
    	// ___ catalog visual or red mag of associated optical source
    	nopt_mchs =array[37]; // 
    	// ___ number of optical sources matched to this 2MASS source
    	ext_key =array[38]; // 
    	// ___ key to extended source data DB record
    	angle =array[39]; // (deg) 
    	// ___ Position Angle in degree.
    	dist =array[40]; // (arcsec) 
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
     * @return the err_maj
     */
    public synchronized final String getErr_maj() {
    	return err_maj;
    }


	/**
     * @return the err_min
     */
    public synchronized final String getErr_min() {
    	return err_min;
    }


	/**
     * @return the err_ang
     */
    public synchronized final String getErr_ang() {
    	return err_ang;
    }


	/**
     * @return the designation
     */
    public synchronized final String getDesignation() {
    	return designation;
    }


	/**
     * @return the j_m
     */
    public synchronized final String getJ_m() {
    	return j_m;
    }


	/**
     * @return the j_cmsig
     */
    public synchronized final String getJ_cmsig() {
    	return j_cmsig;
    }


	/**
     * @return the j_msigcom
     */
    public synchronized final String getJ_msigcom() {
    	return j_msigcom;
    }


	/**
     * @return the j_snr
     */
    public synchronized final String getJ_snr() {
    	return j_snr;
    }


	/**
     * @return the h_m
     */
    public synchronized final String getH_m() {
    	return h_m;
    }


	/**
     * @return the h_cmsig
     */
    public synchronized final String getH_cmsig() {
    	return h_cmsig;
    }


	/**
     * @return the h_msigcom
     */
    public synchronized final String getH_msigcom() {
    	return h_msigcom;
    }


	/**
     * @return the h_snr
     */
    public synchronized final String getH_snr() {
    	return h_snr;
    }


	/**
     * @return the k_m
     */
    public synchronized final String getK_m() {
    	return k_m;
    }


	/**
     * @return the k_cmsig
     */
    public synchronized final String getK_cmsig() {
    	return k_cmsig;
    }


	/**
     * @return the k_msigcom
     */
    public synchronized final String getK_msigcom() {
    	return k_msigcom;
    }


	/**
     * @return the k_snr
     */
    public synchronized final String getK_snr() {
    	return k_snr;
    }


	/**
     * @return the ph_qual
     */
    public synchronized final String getPh_qual() {
    	return ph_qual;
    }


	/**
     * @return the rd_flg
     */
    public synchronized final String getRd_flg() {
    	return rd_flg;
    }


	/**
     * @return the bl_flg
     */
    public synchronized final String getBl_flg() {
    	return bl_flg;
    }


	/**
     * @return the cc_flg
     */
    public synchronized final String getCc_flg() {
    	return cc_flg;
    }


	/**
     * @return the ndet
     */
    public synchronized final String getNdet() {
    	return ndet;
    }


	/**
     * @return the gal_contam
     */
    public synchronized final String getGal_contam() {
    	return gal_contam;
    }


	/**
     * @return the mp_flg
     */
    public synchronized final String getMp_flg() {
    	return mp_flg;
    }


	/**
     * @return the hemis
     */
    public synchronized final String getHemis() {
    	return hemis;
    }


	/**
     * @return the xdate
     */
    public synchronized final String getXdate() {
    	return xdate;
    }


	/**
     * @return the scan
     */
    public synchronized final String getScan() {
    	return scan;
    }


	/**
     * @return the glon
     */
    public synchronized final String getGlon() {
    	return glon;
    }


	/**
     * @return the glat
     */
    public synchronized final String getGlat() {
    	return glat;
    }


	/**
     * @return the a
     */
    public synchronized final String getA() {
    	return a;
    }


	/**
     * @return the dist_opt
     */
    public synchronized final String getDist_opt() {
    	return dist_opt;
    }


	/**
     * @return the phi_opt
     */
    public synchronized final String getPhi_opt() {
    	return phi_opt;
    }


	/**
     * @return the b_m_opt
     */
    public synchronized final String getB_m_opt() {
    	return b_m_opt;
    }


	/**
     * @return the vr_m_opt
     */
    public synchronized final String getVr_m_opt() {
    	return vr_m_opt;
    }


	/**
     * @return the nopt_mchs
     */
    public synchronized final String getNopt_mchs() {
    	return nopt_mchs;
    }


	/**
     * @return the ext_key
     */
    public synchronized final String getExt_key() {
    	return ext_key;
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
     * @param err_maj the err_maj to set
     */
    public synchronized final void setErr_maj(String err_maj) {
    	this.err_maj = err_maj;
    }


	/**
     * @param err_min the err_min to set
     */
    public synchronized final void setErr_min(String err_min) {
    	this.err_min = err_min;
    }


	/**
     * @param err_ang the err_ang to set
     */
    public synchronized final void setErr_ang(String err_ang) {
    	this.err_ang = err_ang;
    }


	/**
     * @param designation the designation to set
     */
    public synchronized final void setDesignation(String designation) {
    	this.designation = designation;
    }


	/**
     * @param j_m the j_m to set
     */
    public synchronized final void setJ_m(String j_m) {
    	this.j_m = j_m;
    }


	/**
     * @param j_cmsig the j_cmsig to set
     */
    public synchronized final void setJ_cmsig(String j_cmsig) {
    	this.j_cmsig = j_cmsig;
    }


	/**
     * @param j_msigcom the j_msigcom to set
     */
    public synchronized final void setJ_msigcom(String j_msigcom) {
    	this.j_msigcom = j_msigcom;
    }


	/**
     * @param j_snr the j_snr to set
     */
    public synchronized final void setJ_snr(String j_snr) {
    	this.j_snr = j_snr;
    }


	/**
     * @param h_m the h_m to set
     */
    public synchronized final void setH_m(String h_m) {
    	this.h_m = h_m;
    }


	/**
     * @param h_cmsig the h_cmsig to set
     */
    public synchronized final void setH_cmsig(String h_cmsig) {
    	this.h_cmsig = h_cmsig;
    }


	/**
     * @param h_msigcom the h_msigcom to set
     */
    public synchronized final void setH_msigcom(String h_msigcom) {
    	this.h_msigcom = h_msigcom;
    }


	/**
     * @param h_snr the h_snr to set
     */
    public synchronized final void setH_snr(String h_snr) {
    	this.h_snr = h_snr;
    }


	/**
     * @param k_m the k_m to set
     */
    public synchronized final void setK_m(String k_m) {
    	this.k_m = k_m;
    }


	/**
     * @param k_cmsig the k_cmsig to set
     */
    public synchronized final void setK_cmsig(String k_cmsig) {
    	this.k_cmsig = k_cmsig;
    }


	/**
     * @param k_msigcom the k_msigcom to set
     */
    public synchronized final void setK_msigcom(String k_msigcom) {
    	this.k_msigcom = k_msigcom;
    }


	/**
     * @param k_snr the k_snr to set
     */
    public synchronized final void setK_snr(String k_snr) {
    	this.k_snr = k_snr;
    }


	/**
     * @param ph_qual the ph_qual to set
     */
    public synchronized final void setPh_qual(String ph_qual) {
    	this.ph_qual = ph_qual;
    }


	/**
     * @param rd_flg the rd_flg to set
     */
    public synchronized final void setRd_flg(String rd_flg) {
    	this.rd_flg = rd_flg;
    }


	/**
     * @param bl_flg the bl_flg to set
     */
    public synchronized final void setBl_flg(String bl_flg) {
    	this.bl_flg = bl_flg;
    }


	/**
     * @param cc_flg the cc_flg to set
     */
    public synchronized final void setCc_flg(String cc_flg) {
    	this.cc_flg = cc_flg;
    }


	/**
     * @param ndet the ndet to set
     */
    public synchronized final void setNdet(String ndet) {
    	this.ndet = ndet;
    }


	/**
     * @param gal_contam the gal_contam to set
     */
    public synchronized final void setGal_contam(String gal_contam) {
    	this.gal_contam = gal_contam;
    }


	/**
     * @param mp_flg the mp_flg to set
     */
    public synchronized final void setMp_flg(String mp_flg) {
    	this.mp_flg = mp_flg;
    }


	/**
     * @param hemis the hemis to set
     */
    public synchronized final void setHemis(String hemis) {
    	this.hemis = hemis;
    }


	/**
     * @param xdate the xdate to set
     */
    public synchronized final void setXdate(String xdate) {
    	this.xdate = xdate;
    }


	/**
     * @param scan the scan to set
     */
    public synchronized final void setScan(String scan) {
    	this.scan = scan;
    }


	/**
     * @param glon the glon to set
     */
    public synchronized final void setGlon(String glon) {
    	this.glon = glon;
    }


	/**
     * @param glat the glat to set
     */
    public synchronized final void setGlat(String glat) {
    	this.glat = glat;
    }


	/**
     * @param a the a to set
     */
    public synchronized final void setA(String a) {
    	this.a = a;
    }


	/**
     * @param dist_opt the dist_opt to set
     */
    public synchronized final void setDist_opt(String dist_opt) {
    	this.dist_opt = dist_opt;
    }


	/**
     * @param phi_opt the phi_opt to set
     */
    public synchronized final void setPhi_opt(String phi_opt) {
    	this.phi_opt = phi_opt;
    }


	/**
     * @param b_m_opt the b_m_opt to set
     */
    public synchronized final void setB_m_opt(String b_m_opt) {
    	this.b_m_opt = b_m_opt;
    }


	/**
     * @param vr_m_opt the vr_m_opt to set
     */
    public synchronized final void setVr_m_opt(String vr_m_opt) {
    	this.vr_m_opt = vr_m_opt;
    }


	/**
     * @param nopt_mchs the nopt_mchs to set
     */
    public synchronized final void setNopt_mchs(String nopt_mchs) {
    	this.nopt_mchs = nopt_mchs;
    }


	/**
     * @param ext_key the ext_key to set
     */
    public synchronized final void setExt_key(String ext_key) {
    	this.ext_key = ext_key;
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
	    return String.format("TwoMASS [ra=%s, dec=%s, clon=%s, clat=%s, err_maj=%s, err_min=%s, err_ang=%s, designation=%s, j_m=%s, j_cmsig=%s, j_msigcom=%s, j_snr=%s, h_m=%s, h_cmsig=%s, h_msigcom=%s, h_snr=%s, k_m=%s, k_cmsig=%s, k_msigcom=%s, k_snr=%s, ph_qual=%s, rd_flg=%s, bl_flg=%s, cc_flg=%s, ndet=%s, gal_contam=%s, mp_flg=%s, hemis=%s, xdate=%s, scan=%s, glon=%s, glat=%s, a=%s, dist_opt=%s, phi_opt=%s, b_m_opt=%s, vr_m_opt=%s, nopt_mchs=%s, ext_key=%s, angle=%s, dist=%s]", ra, dec, clon, clat, err_maj, err_min, err_ang, designation, j_m, j_cmsig, j_msigcom, j_snr, h_m, h_cmsig, h_msigcom, h_snr, k_m, k_cmsig, k_msigcom, k_snr, ph_qual, rd_flg, bl_flg, cc_flg, ndet, gal_contam, mp_flg, hemis, xdate, scan, glon, glat, a, dist_opt, phi_opt, b_m_opt, vr_m_opt, nopt_mchs, ext_key, angle, dist);
    }    
    
}
