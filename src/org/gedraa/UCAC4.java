package org.gedraa;

public class UCAC4 {
	

    String _r ="";//(arcmin)      (F6.4)  Distance from center (182.8702556-15.5269825)[FK5/J2000], at Epoch=J2000.0 [ucd=pos.angDistance]
    String UCAC4  ="";//           (a10)   UCAC4 recommended identifier (ZZZ-NNNNNN) (1) [ucd=meta.id;meta.main]
    String RAJ2000 ="";// (deg)    (F11.7) Mean right ascension (ICRS), Ep=J2000 (2) [ucd=pos.eq.ra;meta.main]
    String e_RAJ2000 ="";// (mas)  (I3)    Mean error of RAdeg at mean epoch [ucd=stat.error;pos.eq.ra]
    String DEJ2000 ="";// (deg)    (F11.7) Mean declination (ICRS), Ep=J2000 (2) [ucd=pos.eq.dec;meta.main]
    String e_DEJ2000 ="";// (mas)  (I3)    Mean error of DEdeg at mean epoch [ucd=stat.error;pos.eq.dec]
    String ePos ="";// (mas)       (I4)    Total mean error on position at Ep=J2000 (3) [ucd=stat.error;pos]
    String EpRA ="";// (yr)        (F7.2)  Central epoch for mean RA [ucd=time.epoch]
    String EpDE ="";// (yr)        (F7.2)  Central epoch for mean Declination [ucd=time.epoch]
    String f_mag ="";// (mag)      (F6.3)  ? UCAC fit model magnitude (579-642nm) (4) [ucd=phot.mag;em.opt]
    String a_mag ="";// (mag)      (F6.3)  ? UCAC aperture magnitude (579-642nm) (4) [ucd=phot.mag;em.opt]
    String e_a_mag ="";// (mag)    (F5.2)  ? Mean error on f.mag and a.mag (5) [ucd=stat.error]
    String _of ="";//               (I1)    [0/9] UCAC4 object classification flag (6) [ucd=meta.code]
    String _db ="";//               (I2)    [0/36] UCAC4 double star flag (7) [ucd=meta.code]
    String _Na ="";//               (I3)    [0/71] Number of UCAC observations for the star [ucd=meta.number]
    String _Nu ="";//               (I3)    [0/70] Number of used UCAC observations (8) [ucd=meta.number]
    String _Nc ="";//               (I3)    [1/38] Number of catalog positions used for pm [ucd=meta.number]
    String pmRA ="";// (mas/yr)    (F8.1)  ? Proper motion in RA(*cos(Dec)) (9) [ucd=pos.pm;pos.eq.ra]
    String e_pmRA ="";// (mas/yr)  (F4.1)  ? Mean error on pmRA (9) [ucd=stat.error;pos.pm;pos.eq.ra]
    String pmDE ="";// (mas/yr)    (F8.1)  ? Proper motion in Dec (9) [ucd=pos.pm;pos.eq.dec]
    String e_pmDE ="";// (mas/yr)  (F4.1)  ? Mean error on pmDE (9) [ucd=stat.error;pos.pm;pos.eq.dec]
    String MPOS1 ="";//            (I9)    [1/182895114] Unique star ID number (10) [ucd=meta.id]
    String UCAC2 ="";//            (a10)   UCAC2 (Cat. I/289) designation (ZZZ-NNNNNN) [ucd=meta.id]
    String Tycho_2 ="";//          (a12)   Tycho-2 (Cat. I/259) designation (FFFF-NNNNN-N) [ucd=meta.id]
    String _2Mkey ="";//            (I10)   ? 2MASS (Cat. II/246) Unique source identifier [ucd=meta.id.cross]
    String Jmag ="";// (mag)       (F6.3)  ? 2MASS J magnitude \ifnum\Vphase>3{\fg{gray40}(in gray if upper limit)}\fi (1.2um) [ucd=phot.mag;em.IR.J]
    String e_Jmag ="";// (mag)     (F5.2)  ? Mean error (rounded to 0.01mag) [ucd=stat.error;phot.mag;em.IR.J]
    String q_Jmag ="";//           (I2)    [0,58]? J-band quality-confusion flag (11) [ucd=meta.code.qual]
    String Hmag ="";// (mag)       (F6.3)  ? 2MASS H magnitude \ifnum\Vphase>3{\fg{gray40}(in gray if upper limit)}\fi (1.6um) [ucd=phot.mag;em.IR.H]
    String e_Hmag ="";// (mag)     (F5.2)  ? Mean error (rounded to 0.01mag) [ucd=stat.error;phot.mag;em.IR.H]
    String q_Hmag ="";//           (I2)    [0,58]? H-band quality-confusion flag (11) [ucd=meta.code.qual]
    String Kmag ="";// (mag)       (F6.3)  ? 2MASS Ks magnitude \ifnum\Vphase>3{\fg{gray40}(in gray if upper limit)}\fi (2.2um) [ucd=phot.mag;em.IR.K]
    String e_Kmag ="";// (mag)     (F5.2)  ? Mean error (rounded to 0.01mag) [ucd=stat.error;phot.mag;em.IR.K]
    String q_Kmag ="";//           (I2)    [0,58]? K-band quality-confusion flag (11) [ucd=meta.code.qual]
    String Bmag ="";// (mag)       (F6.3)  ? B magnitude from APASS (12) [ucd=phot.mag;em.opt.B]
    String e_Bmag ="";// (cmag)    (I2)    ? Estimated error on Bmag (12) [ucd=stat.error;phot.mag;em.opt.B]
    String f_Bmag ="";//           (A1)    [.-] Actual or S/N estimated error (12) [ucd=meta.code]
    String Vmag ="";// (mag)       (F6.3)  ? V magnitude from APASS (12) [ucd=phot.mag;em.opt.V]
    String e_Vmag ="";// (cmag)    (I2)    ? Estimated error on Vmag (12) [ucd=stat.error;phot.mag;em.opt.V]
    String f_Vmag ="";//           (A1)    [.-] Actual or S/N estimated error (12) [ucd=meta.code]
    String gmag ="";// (mag)       (F6.3)  ? g magnitude from APASS (12) [ucd=phot.mag;em.opt.R]
    String e_gmag ="";// (cmag)    (I2)    ? Estimated error on gmag (12) [ucd=stat.error;phot.mag;em.opt.B]
    String f_gmag ="";//           (A1)    [.-] Actual or S/N estimated error (12) [ucd=meta.code]
    String rmag ="";// (mag)       (F6.3)  ? r magnitude from APASS (12) [ucd=phot.mag;em.opt.R]
    String e_rmag ="";// (cmag)    (I2)    ? Estimated error on rmag (12) [ucd=stat.error;phot.mag;em.opt.R]
    String f_rmag ="";//           (A1)    [.-] Actual or S/N estimated error (12) [ucd=meta.code]
    String imag ="";// (mag)       (F6.3)  ? i magnitude from APASS (12) [ucd=phot.mag;em.opt.I]
    String e_imag ="";// (cmag)    (I2)    ? Estimated error on imag (12) [ucd=stat.error;phot.mag;em.opt.I]
    String f_imag ="";//           (A1)    [.-] Actual or S/N estimated error (12) [ucd=meta.code]
    String _g ="";//                (I1)    [0,3] g-flag from SPM (13) [ucd=meta.code]
    String _c ="";//                (I1)    [0,7] c-flag from SPM (14) [ucd=meta.code]
    String _H ="";//                (I1)    [0/9] Hipparcos/Tycho flag (15) [ucd=meta.code]
    String _A ="";//                (I1)    [0/8] AC2000 flag (16) [ucd=meta.code]
    String _b  ="";//               (I1)    [0/8] AGK2 Bonn match flag (16) [ucd=meta.code]
    String _h ="";//                (I1)    [0/8] AGK2 Hamburg match flag (16) [ucd=meta.code]
    String _Z  ="";//               (I1)    [0/8] Zone astrographic match flag (16) [ucd=meta.code]
    String _B  ="";//               (I1)    [0/8] Black Birch match flag (16) [ucd=meta.code]
    String _L  ="";//               (I1)    [0/8] Lick Astrographic match flag (16) [ucd=meta.code]
    String _N ="";//                (I1)    [0/8] NPM Lick match flag (16) [ucd=meta.code]
    String _S  ="";//               (I1)    [0/8] SPM Lick match flag (16) [ucd=meta.code]
    String LEDA ="";// ([6arcsec]) (I2)    LEDA I-band galaxy match (17) [ucd=phys.angSize]
	String _2MX ="";// (arcsec)     (I2)    2MASX K-band match (18) [ucd=phys.angSize;src]


	
	public UCAC4(String rawString)
	{
		parseRawString(rawString);
		
		
		System.out.println(toString());
	}


	private void parseRawString(String rawString) {
	    // TODO Auto-generated method stub
		


        System.out.println("Leyendo estrella de UCAC4 . . . ." ); 

/*		String [] array = rawString.split("\\s+");    
		
        for (String s : array) {
            System.out.println(s);  
        }
        if (array.length == 61)
        {
        	array = add(array, 23, " ");
        }

        _r =array[0];//(arcmin)      (F6.4)  Distance from center (182.8702556-15.5269825)[FK5/J2000], at Epoch=J2000.0 [ucd=pos.angDistance]
        UCAC4  =array[1];//           (a10)   UCAC4 recommended identifier (ZZZ-NNNNNN) (1) [ucd=meta.id;meta.main]
        RAJ2000 =array[2];// (deg)    (F11.7) Mean right ascension (ICRS), Ep=J2000 (2) [ucd=pos.eq.ra;meta.main]
        e_RAJ2000 =array[3];// (mas)  (I3)    Mean error of RAdeg at mean epoch [ucd=stat.error;pos.eq.ra]
        DEJ2000 =array[4];// (deg)    (F11.7) Mean declination (ICRS), Ep=J2000 (2) [ucd=pos.eq.dec;meta.main]
        e_DEJ2000 =array[5];// (mas)  (I3)    Mean error of DEdeg at mean epoch [ucd=stat.error;pos.eq.dec]
        ePos =array[6];// (mas)       (I4)    Total mean error on position at Ep=J2000 (3) [ucd=stat.error;pos]
        EpRA =array[7];// (yr)        (F7.2)  Central epoch for mean RA [ucd=time.epoch]
        EpDE =array[8];// (yr)        (F7.2)  Central epoch for mean Declination [ucd=time.epoch]
        f_mag =array[9];// (mag)      (F6.3)  ? UCAC fit model magnitude (579-642nm) (4) [ucd=phot.mag;em.opt]
        a_mag =array[10];// (mag)      (F6.3)  ? UCAC aperture magnitude (579-642nm) (4) [ucd=phot.mag;em.opt]
        e_a_mag =array[11];// (mag)    (F5.2)  ? Mean error on f.mag and a.mag (5) [ucd=stat.error]
        _of =array[12];//               (I1)    [0/9] UCAC4 object classification flag (6) [ucd=meta.code]
        _db =array[13];//               (I2)    [0/36] UCAC4 double star flag (7) [ucd=meta.code]
        _Na =array[14];//               (I3)    [0/71] Number of UCAC observations for the star [ucd=meta.number]
        _Nu =array[15];//               (I3)    [0/70] Number of used UCAC observations (8) [ucd=meta.number]
        _Nc =array[16];//               (I3)    [1/38] Number of catalog positions used for pm [ucd=meta.number]
        pmRA =array[17];// (mas/yr)    (F8.1)  ? Proper motion in RA(*cos(Dec)) (9) [ucd=pos.pm;pos.eq.ra]
        e_pmRA =array[18];// (mas/yr)  (F4.1)  ? Mean error on pmRA (9) [ucd=stat.error;pos.pm;pos.eq.ra]
        pmDE =array[19];// (mas/yr)    (F8.1)  ? Proper motion in Dec (9) [ucd=pos.pm;pos.eq.dec]
        e_pmDE =array[20];// (mas/yr)  (F4.1)  ? Mean error on pmDE (9) [ucd=stat.error;pos.pm;pos.eq.dec]
        MPOS1 =array[21];//            (I9)    [1/182895114] Unique star ID number (10) [ucd=meta.id]
        UCAC2 =array[22];//            (a10)   UCAC2 (Cat. I/289) designation (ZZZ-NNNNNN) [ucd=meta.id]
        Tycho_2 =array[23];//          (a12)   Tycho-2 (Cat. I/259) designation (FFFF-NNNNN-N) [ucd=meta.id]
        _2Mkey =array[24];//            (I10)   ? 2MASS (Cat. II/246) Unique source identifier [ucd=meta.id.cross]
        Jmag =array[25];// (mag)       (F6.3)  ? 2MASS J magnitude \ifnum\Vphase>3{\fg{gray40}(in gray if upper limit)}\fi (1.2um) [ucd=phot.mag;em.IR.J]
        e_Jmag =array[26];// (mag)     (F5.2)  ? Mean error (rounded to 0.01mag) [ucd=stat.error;phot.mag;em.IR.J]
        q_Jmag =array[27];//           (I2)    [0,58]? J-band quality-confusion flag (11) [ucd=meta.code.qual]
        Hmag =array[28];// (mag)       (F6.3)  ? 2MASS H magnitude \ifnum\Vphase>3{\fg{gray40}(in gray if upper limit)}\fi (1.6um) [ucd=phot.mag;em.IR.H]
        e_Hmag =array[29];// (mag)     (F5.2)  ? Mean error (rounded to 0.01mag) [ucd=stat.error;phot.mag;em.IR.H]
        q_Hmag =array[30];//           (I2)    [0,58]? H-band quality-confusion flag (11) [ucd=meta.code.qual]
        Kmag =array[31];// (mag)       (F6.3)  ? 2MASS Ks magnitude \ifnum\Vphase>3{\fg{gray40}(in gray if upper limit)}\fi (2.2um) [ucd=phot.mag;em.IR.K]
        e_Kmag =array[32];// (mag)     (F5.2)  ? Mean error (rounded to 0.01mag) [ucd=stat.error;phot.mag;em.IR.K]
        q_Kmag =array[33];//           (I2)    [0,58]? K-band quality-confusion flag (11) [ucd=meta.code.qual]
        Bmag =array[34];// (mag)       (F6.3)  ? B magnitude from APASS (12) [ucd=phot.mag;em.opt.B]
        e_Bmag =array[35];// (cmag)    (I2)    ? Estimated error on Bmag (12) [ucd=stat.error;phot.mag;em.opt.B]
        f_Bmag =array[36];//           (A1)    [.-] Actual or S/N estimated error (12) [ucd=meta.code]
        Vmag =array[37];// (mag)       (F6.3)  ? V magnitude from APASS (12) [ucd=phot.mag;em.opt.V]
        e_Vmag =array[38];// (cmag)    (I2)    ? Estimated error on Vmag (12) [ucd=stat.error;phot.mag;em.opt.V]
        f_Vmag =array[39];//           (A1)    [.-] Actual or S/N estimated error (12) [ucd=meta.code]
        gmag =array[40];// (mag)       (F6.3)  ? g magnitude from APASS (12) [ucd=phot.mag;em.opt.R]
        e_gmag =array[41];// (cmag)    (I2)    ? Estimated error on gmag (12) [ucd=stat.error;phot.mag;em.opt.B]
        f_gmag =array[42];//           (A1)    [.-] Actual or S/N estimated error (12) [ucd=meta.code]
        rmag =array[43];// (mag)       (F6.3)  ? r magnitude from APASS (12) [ucd=phot.mag;em.opt.R]
        e_rmag =array[44];// (cmag)    (I2)    ? Estimated error on rmag (12) [ucd=stat.error;phot.mag;em.opt.R]
        f_rmag =array[45];//           (A1)    [.-] Actual or S/N estimated error (12) [ucd=meta.code]
        imag =array[46];// (mag)       (F6.3)  ? i magnitude from APASS (12) [ucd=phot.mag;em.opt.I]
        e_imag =array[47];// (cmag)    (I2)    ? Estimated error on imag (12) [ucd=stat.error;phot.mag;em.opt.I]
        f_imag =array[48];//           (A1)    [.-] Actual or S/N estimated error (12) [ucd=meta.code]
/*        _g =array[49];//                (I1)    [0,3] g-flag from SPM (13) [ucd=meta.code]
        _c =array[50];//                (I1)    [0,7] c-flag from SPM (14) [ucd=meta.code]
        _H =array[51];//                (I1)    [0/9] Hipparcos/Tycho flag (15) [ucd=meta.code]
        _A =array[52];//                (I1)    [0/8] AC2000 flag (16) [ucd=meta.code]
        _b  =array[53];//               (I1)    [0/8] AGK2 Bonn match flag (16) [ucd=meta.code]
        _h =array[54];//                (I1)    [0/8] AGK2 Hamburg match flag (16) [ucd=meta.code]
        _Z  =array[55];//               (I1)    [0/8] Zone astrographic match flag (16) [ucd=meta.code]
        _B  =array[56];//               (I1)    [0/8] Black Birch match flag (16) [ucd=meta.code]
        _L  =array[57];//               (I1)    [0/8] Lick Astrographic match flag (16) [ucd=meta.code]
        _N =array[58];//                (I1)    [0/8] NPM Lick match flag (16) [ucd=meta.code]
        _S  =array[59];//               (I1)    [0/8] SPM Lick match flag (16) [ucd=meta.code]
        LEDA =array[60];// ([6arcsec]) (I2)    LEDA I-band galaxy match (17) [ucd=phys.angSize]
        _2MX =array[61];// (arcsec)     (I2)    2MASX K-band match (18) [ucd=phys.angSize;src]
*/ 
        _r = rawString.substring(0,7);//(arcmin)      (F6.4)  Distance from center (182.8702556-15.5269825)[FK5/J2000 , at Epoch=J2000.0 [ucd=pos.angDistance 
        UCAC4  = rawString.substring(8,18) ;//           (a10)   UCAC4 recommended identifier (ZZZ-NNNNNN) (1) [ucd=meta.id;meta.main 
//        RAJ2000 = rawString.substring(,)  ;// (deg)    (F11.7) Mean right ascension (ICRS), Ep=J2000 (2) [ucd=pos.eq.ra;meta.main 
//        e_RAJ2000 = rawString.substring(,)  ;// (mas)  (I3)    Mean error of RAdeg at mean epoch [ucd=stat.error;pos.eq.ra 
//        DEJ2000 = rawString.substring(,)  ;// (deg)    (F11.7) Mean declination (ICRS), Ep=J2000 (2) [ucd=pos.eq.dec;meta.main 
//        e_DEJ2000 = rawString.substring(,)  ;// (mas)  (I3)    Mean error of DEdeg at mean epoch [ucd=stat.error;pos.eq.dec 
//        ePos = rawString.substring(,)  ;// (mas)       (I4)    Total mean error on position at Ep=J2000 (3) [ucd=stat.error;pos 
//        EpRA = rawString.substring(,)  ;// (yr)        (F7.2)  Central epoch for mean RA [ucd=time.epoch 
//        EpDE = rawString.substring(,)  ;// (yr)        (F7.2)  Central epoch for mean Declination [ucd=time.epoch 
//        f_mag = rawString.substring(,)  ;// (mag)      (F6.3)  ? UCAC fit model magnitude (579-642nm) (4) [ucd=phot.mag;em.opt 
//        a_mag = rawString.substring(,)  ;// (mag)      (F6.3)  ? UCAC aperture magnitude (579-642nm) (4) [ucd=phot.mag;em.opt 
//        e_a_mag = rawString.substring(,)  ;// (mag)    (F5.2)  ? Mean error on f.mag and a.mag (5) [ucd=stat.error 
//        _of = rawString.substring(,)  ;//               (I1)    [0/9  UCAC4 object classification flag (6) [ucd=meta.code 
//        _db = rawString.substring(,)  ;//               (I2)    [0/36  UCAC4 double star flag (7) [ucd=meta.code 
//        _Na = rawString.substring(,)  ;//               (I3)    [0/71  Number of UCAC observations for the star [ucd=meta.number 
//        _Nu = rawString.substring(,)  ;//               (I3)    [0/70  Number of used UCAC observations (8) [ucd=meta.number 
//        _Nc = rawString.substring(,)  ;//               (I3)    [1/38  Number of catalog positions used for pm [ucd=meta.number 
        pmRA = rawString.substring(110, 117)  ;// (mas/yr)    (F8.1)  ? Proper motion in RA(*cos(Dec)) (9) [ucd=pos.pm;pos.eq.ra 
        e_pmRA = rawString.substring(118,122)  ;// (mas/yr)  (F4.1)  ? Mean error on pmRA (9) [ucd=stat.error;pos.pm;pos.eq.ra 
        pmDE = rawString.substring(124, 131)  ;// (mas/yr)    (F8.1)  ? Proper motion in Dec (9) [ucd=pos.pm;pos.eq.dec 
        e_pmDE = rawString.substring(132,136)  ;// (mas/yr)  (F4.1)  ? Mean error on pmDE (9) [ucd=stat.error;pos.pm;pos.eq.dec 
//        MPOS1 = rawString.substring(,)  ;//            (I9)    [1/182895114  Unique star ID number (10) [ucd=meta.id 
//        UCAC2 = rawString.substring(,)  ;//            (a10)   UCAC2 (Cat. I/289) designation (ZZZ-NNNNNN) [ucd=meta.id 
        Tycho_2 = rawString.substring(158,170)  ;//          (a12)   Tycho-2 (Cat. I/259) designation (FFFF-NNNNN-N) [ucd=meta.id 
        _2Mkey = rawString.substring(171,181)  ;//            (I10)   ? 2MASS (Cat. II/246) Unique source identifier [ucd=meta.id.cross 
        Jmag = rawString.substring(182,188)  ;// (mag)       (F6.3)  ? 2MASS J magnitude \ifnum\Vphase>3{\fg{gray40}(in gray if upper limit)}\fi (1.2um) [ucd=phot.mag;em.IR.J 
//        e_Jmag = rawString.substring(,)  ;// (mag)     (F5.2)  ? Mean error (rounded to 0.01mag) [ucd=stat.error;phot.mag;em.IR.J 
//        q_Jmag = rawString.substring(,)  ;//           (I2)    [0,58 ? J-band quality-confusion flag (11) [ucd=meta.code.qual 
        Hmag = rawString.substring(198,202)  ;// (mag)       (F6.3)  ? 2MASS H magnitude \ifnum\Vphase>3{\fg{gray40}(in gray if upper limit)}\fi (1.6um) [ucd=phot.mag;em.IR.H 
//        e_Hmag = rawString.substring(,)  ;// (mag)     (F5.2)  ? Mean error (rounded to 0.01mag) [ucd=stat.error;phot.mag;em.IR.H 
//        q_Hmag = rawString.substring(,)  ;//           (I2)    [0,58 ? H-band quality-confusion flag (11) [ucd=meta.code.qual 
        Kmag = rawString.substring(214,220)  ;// (mag)       (F6.3)  ? 2MASS Ks magnitude \ifnum\Vphase>3{\fg{gray40}(in gray if upper limit)}\fi (2.2um) [ucd=phot.mag;em.IR.K 
//        e_Kmag = rawString.substring(,)  ;// (mag)     (F5.2)  ? Mean error (rounded to 0.01mag) [ucd=stat.error;phot.mag;em.IR.K 
//        q_Kmag = rawString.substring(,)  ;//           (I2)    [0,58 ? K-band quality-confusion flag (11) [ucd=meta.code.qual 
        Bmag = rawString.substring(230,236)  ;// (mag)       (F6.3)  ? B magnitude from APASS (12) [ucd=phot.mag;em.opt.B 
//        e_Bmag = rawString.substring(,)  ;// (cmag)    (I2)    ? Estimated error on Bmag (12) [ucd=stat.error;phot.mag;em.opt.B 
//        f_Bmag = rawString.substring(,)  ;//           (A1)    [.-  Actual or S/N estimated error (12) [ucd=meta.code 
        Vmag = rawString.substring(241,248)  ;// (mag)       (F6.3)  ? V magnitude from APASS (12) [ucd=phot.mag;em.opt.V 
//        e_Vmag = rawString.substring(,)  ;// (cmag)    (I2)    ? Estimated error on Vmag (12) [ucd=stat.error;phot.mag;em.opt.V 
//        f_Vmag = rawString.substring(,)  ;//           (A1)    [.-  Actual or S/N estimated error (12) [ucd=meta.code 
        gmag = rawString.substring(254,260)  ;// (mag)       (F6.3)  ? g magnitude from APASS (12) [ucd=phot.mag;em.opt.R 
//        e_gmag = rawString.substring(,)  ;// (cmag)    (I2)    ? Estimated error on gmag (12) [ucd=stat.error;phot.mag;em.opt.B 
//        f_gmag = rawString.substring(,)  ;//           (A1)    [.-  Actual or S/N estimated error (12) [ucd=meta.code 
        rmag = rawString.substring(266,272)  ;// (mag)       (F6.3)  ? r magnitude from APASS (12) [ucd=phot.mag;em.opt.R 
//        e_rmag = rawString.substring(,)  ;// (cmag)    (I2)    ? Estimated error on rmag (12) [ucd=stat.error;phot.mag;em.opt.R 
//        f_rmag = rawString.substring(,)  ;//           (A1)    [.-  Actual or S/N estimated error (12) [ucd=meta.code 
        imag = rawString.substring(278,284)  ;// (mag)       (F6.3)  ? i magnitude from APASS (12) [ucd=phot.mag;em.opt.I 
//        e_imag = rawString.substring(,)  ;// (cmag)    (I2)    ? Estimated error on imag (12) [ucd=stat.error;phot.mag;em.opt.I 
//        f_imag = rawString.substring(,)  ;//           (A1)    [.-  Actual or S/N estimated error (12) [ucd=meta.code 
//        _g = rawString.substring(,)  ;//                (I1)    [0,3  g-flag from SPM (13) [ucd=meta.code 
//        _c = rawString.substring(,)  ;//                (I1)    [0,7  c-flag from SPM (14) [ucd=meta.code 
//        _H = rawString.substring(,)  ;//                (I1)    [0/9  Hipparcos/Tycho flag (15) [ucd=meta.code 
//        _A = rawString.substring(,)  ;//                (I1)    [0/8  AC2000 flag (16) [ucd=meta.code 
//        _b  = rawString.substring(,)  ;//               (I1)    [0/8  AGK2 Bonn match flag (16) [ucd=meta.code 
//        _h = rawString.substring(,)  ;//                (I1)    [0/8  AGK2 Hamburg match flag (16) [ucd=meta.code 
//        _Z  = rawString.substring(,)  ;//               (I1)    [0/8  Zone astrographic match flag (16) [ucd=meta.code 
//        _B  = rawString.substring(,)  ;//               (I1)    [0/8  Black Birch match flag (16) [ucd=meta.code 
//        _L  = rawString.substring(,)  ;//               (I1)    [0/8  Lick Astrographic match flag (16) [ucd=meta.code 
//        _N = rawString.substring(,)  ;//                (I1)    [0/8  NPM Lick match flag (16) [ucd=meta.code 
//        _S  = rawString.substring(,)  ;//               (I1)    [0/8  SPM Lick match flag (16) [ucd=meta.code 
//        LEDA = rawString.substring(,)  ;// ([6arcsec ) (I2)    LEDA I-band galaxy match (17) [ucd=phys.angSize 
//        _2MX = rawString.substring(,)  ;// (arcsec)     (I2)    2MASX K-band match (18) [ucd=phys.angSize;src 
	}


	/**
     * @return the _r
     */
    public synchronized final String get_r() {
    	return _r;
    }


	/**
     * @return the uCAC4
     */
    public synchronized final String getUCAC4() {
    	return UCAC4;
    }


	/**
     * @return the rAJ2000
     */
    public synchronized final String getRAJ2000() {
    	return RAJ2000;
    }


	/**
     * @return the e_RAJ2000
     */
    public synchronized final String getE_RAJ2000() {
    	return e_RAJ2000;
    }


	/**
     * @return the dEJ2000
     */
    public synchronized final String getDEJ2000() {
    	return DEJ2000;
    }


	/**
     * @return the e_DEJ2000
     */
    public synchronized final String getE_DEJ2000() {
    	return e_DEJ2000;
    }


	/**
     * @return the ePos
     */
    public synchronized final String getePos() {
    	return ePos;
    }


	/**
     * @return the epRA
     */
    public synchronized final String getEpRA() {
    	return EpRA;
    }


	/**
     * @return the epDE
     */
    public synchronized final String getEpDE() {
    	return EpDE;
    }


	/**
     * @return the f_mag
     */
    public synchronized final String getF_mag() {
    	return f_mag;
    }


	/**
     * @return the a_mag
     */
    public synchronized final String getA_mag() {
    	return a_mag;
    }


	/**
     * @return the e_a_mag
     */
    public synchronized final String getE_a_mag() {
    	return e_a_mag;
    }


	/**
     * @return the _of
     */
    public synchronized final String get_of() {
    	return _of;
    }


	/**
     * @return the _db
     */
    public synchronized final String get_db() {
    	return _db;
    }


	/**
     * @return the _Na
     */
    public synchronized final String get_Na() {
    	return _Na;
    }


	/**
     * @return the _Nu
     */
    public synchronized final String get_Nu() {
    	return _Nu;
    }


	/**
     * @return the _Nc
     */
    public synchronized final String get_Nc() {
    	return _Nc;
    }


	/**
     * @return the pmRA
     */
    public synchronized final String getPmRA() {
    	return pmRA;
    }


	/**
     * @return the e_pmRA
     */
    public synchronized final String getE_pmRA() {
    	return e_pmRA;
    }


	/**
     * @return the pmDE
     */
    public synchronized final String getPmDE() {
    	return pmDE;
    }


	/**
     * @return the e_pmDE
     */
    public synchronized final String getE_pmDE() {
    	return e_pmDE;
    }


	/**
     * @return the mPOS1
     */
    public synchronized final String getMPOS1() {
    	return MPOS1;
    }


	/**
     * @return the uCAC2
     */
    public synchronized final String getUCAC2() {
    	return UCAC2;
    }


	/**
     * @return the tycho_2
     */
    public synchronized final String getTycho_2() {
    	return Tycho_2;
    }


	/**
     * @return the _2Mkey
     */
    public synchronized final String get_2Mkey() {
    	return _2Mkey;
    }


	/**
     * @return the jmag
     */
    public synchronized final String getJmag() {
    	return Jmag;
    }


	/**
     * @return the e_Jmag
     */
    public synchronized final String getE_Jmag() {
    	return e_Jmag;
    }


	/**
     * @return the q_Jmag
     */
    public synchronized final String getQ_Jmag() {
    	return q_Jmag;
    }


	/**
     * @return the hmag
     */
    public synchronized final String getHmag() {
    	return Hmag;
    }


	/**
     * @return the e_Hmag
     */
    public synchronized final String getE_Hmag() {
    	return e_Hmag;
    }


	/**
     * @return the q_Hmag
     */
    public synchronized final String getQ_Hmag() {
    	return q_Hmag;
    }


	/**
     * @return the kmag
     */
    public synchronized final String getKmag() {
    	return Kmag;
    }


	/**
     * @return the e_Kmag
     */
    public synchronized final String getE_Kmag() {
    	return e_Kmag;
    }


	/**
     * @return the q_Kmag
     */
    public synchronized final String getQ_Kmag() {
    	return q_Kmag;
    }


	/**
     * @return the bmag
     */
    public synchronized final String getBmag() {
    	return Bmag;
    }


	/**
     * @return the e_Bmag
     */
    public synchronized final String getE_Bmag() {
    	return e_Bmag;
    }


	/**
     * @return the f_Bmag
     */
    public synchronized final String getF_Bmag() {
    	return f_Bmag;
    }


	/**
     * @return the vmag
     */
    public synchronized final String getVmag() {
    	return Vmag;
    }


	/**
     * @return the e_Vmag
     */
    public synchronized final String getE_Vmag() {
    	return e_Vmag;
    }


	/**
     * @return the f_Vmag
     */
    public synchronized final String getF_Vmag() {
    	return f_Vmag;
    }


	/**
     * @return the gmag
     */
    public synchronized final String getGmag() {
    	return gmag;
    }


	/**
     * @return the e_gmag
     */
    public synchronized final String getE_gmag() {
    	return e_gmag;
    }


	/**
     * @return the f_gmag
     */
    public synchronized final String getF_gmag() {
    	return f_gmag;
    }


	/**
     * @return the rmag
     */
    public synchronized final String getRmag() {
    	return rmag;
    }


	/**
     * @return the e_rmag
     */
    public synchronized final String getE_rmag() {
    	return e_rmag;
    }


	/**
     * @return the f_rmag
     */
    public synchronized final String getF_rmag() {
    	return f_rmag;
    }


	/**
     * @return the imag
     */
    public synchronized final String getImag() {
    	return imag;
    }


	/**
     * @return the e_imag
     */
    public synchronized final String getE_imag() {
    	return e_imag;
    }


	/**
     * @return the f_imag
     */
    public synchronized final String getF_imag() {
    	return f_imag;
    }


	/**
     * @return the _g
     */
    public synchronized final String get_g() {
    	return _g;
    }


	/**
     * @return the _c
     */
    public synchronized final String get_c() {
    	return _c;
    }


	/**
     * @return the _H
     */
    public synchronized final String get_H() {
    	return _H;
    }


	/**
     * @return the _A
     */
    public synchronized final String get_A() {
    	return _A;
    }


	/**
     * @return the _b
     */
    public synchronized final String get_b() {
    	return _b;
    }


	/**
     * @return the _h
     */
    public synchronized final String get_h() {
    	return _h;
    }


	/**
     * @return the _Z
     */
    public synchronized final String get_Z() {
    	return _Z;
    }


	/**
     * @return the _B
     */
    public synchronized final String get_B() {
    	return _B;
    }


	/**
     * @return the _L
     */
    public synchronized final String get_L() {
    	return _L;
    }


	/**
     * @return the _N
     */
    public synchronized final String get_N() {
    	return _N;
    }


	/**
     * @return the _S
     */
    public synchronized final String get_S() {
    	return _S;
    }


	/**
     * @return the lEDA
     */
    public synchronized final String getLEDA() {
    	return LEDA;
    }


	/**
     * @return the _2MX
     */
    public synchronized final String get_2MX() {
    	return _2MX;
    }


	/**
     * @param _r the _r to set
     */
    public synchronized final void set_r(String _r) {
    	this._r = _r;
    }


	/**
     * @param uCAC4 the uCAC4 to set
     */
    public synchronized final void setUCAC4(String uCAC4) {
    	UCAC4 = uCAC4;
    }


	/**
     * @param rAJ2000 the rAJ2000 to set
     */
    public synchronized final void setRAJ2000(String rAJ2000) {
    	RAJ2000 = rAJ2000;
    }


	/**
     * @param e_RAJ2000 the e_RAJ2000 to set
     */
    public synchronized final void setE_RAJ2000(String e_RAJ2000) {
    	this.e_RAJ2000 = e_RAJ2000;
    }


	/**
     * @param dEJ2000 the dEJ2000 to set
     */
    public synchronized final void setDEJ2000(String dEJ2000) {
    	DEJ2000 = dEJ2000;
    }


	/**
     * @param e_DEJ2000 the e_DEJ2000 to set
     */
    public synchronized final void setE_DEJ2000(String e_DEJ2000) {
    	this.e_DEJ2000 = e_DEJ2000;
    }


	/**
     * @param ePos the ePos to set
     */
    public synchronized final void setePos(String ePos) {
    	this.ePos = ePos;
    }


	/**
     * @param epRA the epRA to set
     */
    public synchronized final void setEpRA(String epRA) {
    	EpRA = epRA;
    }


	/**
     * @param epDE the epDE to set
     */
    public synchronized final void setEpDE(String epDE) {
    	EpDE = epDE;
    }


	/**
     * @param f_mag the f_mag to set
     */
    public synchronized final void setF_mag(String f_mag) {
    	this.f_mag = f_mag;
    }


	/**
     * @param a_mag the a_mag to set
     */
    public synchronized final void setA_mag(String a_mag) {
    	this.a_mag = a_mag;
    }


	/**
     * @param e_a_mag the e_a_mag to set
     */
    public synchronized final void setE_a_mag(String e_a_mag) {
    	this.e_a_mag = e_a_mag;
    }


	/**
     * @param _of the _of to set
     */
    public synchronized final void set_of(String _of) {
    	this._of = _of;
    }


	/**
     * @param _db the _db to set
     */
    public synchronized final void set_db(String _db) {
    	this._db = _db;
    }


	/**
     * @param _Na the _Na to set
     */
    public synchronized final void set_Na(String _Na) {
    	this._Na = _Na;
    }


	/**
     * @param _Nu the _Nu to set
     */
    public synchronized final void set_Nu(String _Nu) {
    	this._Nu = _Nu;
    }


	/**
     * @param _Nc the _Nc to set
     */
    public synchronized final void set_Nc(String _Nc) {
    	this._Nc = _Nc;
    }


	/**
     * @param pmRA the pmRA to set
     */
    public synchronized final void setPmRA(String pmRA) {
    	this.pmRA = pmRA;
    }


	/**
     * @param e_pmRA the e_pmRA to set
     */
    public synchronized final void setE_pmRA(String e_pmRA) {
    	this.e_pmRA = e_pmRA;
    }


	/**
     * @param pmDE the pmDE to set
     */
    public synchronized final void setPmDE(String pmDE) {
    	this.pmDE = pmDE;
    }


	/**
     * @param e_pmDE the e_pmDE to set
     */
    public synchronized final void setE_pmDE(String e_pmDE) {
    	this.e_pmDE = e_pmDE;
    }


	/**
     * @param mPOS1 the mPOS1 to set
     */
    public synchronized final void setMPOS1(String mPOS1) {
    	MPOS1 = mPOS1;
    }


	/**
     * @param uCAC2 the uCAC2 to set
     */
    public synchronized final void setUCAC2(String uCAC2) {
    	UCAC2 = uCAC2;
    }


	/**
     * @param tycho_2 the tycho_2 to set
     */
    public synchronized final void setTycho_2(String tycho_2) {
    	Tycho_2 = tycho_2;
    }


	/**
     * @param _2Mkey the _2Mkey to set
     */
    public synchronized final void set_2Mkey(String _2Mkey) {
    	this._2Mkey = _2Mkey;
    }


	/**
     * @param jmag the jmag to set
     */
    public synchronized final void setJmag(String jmag) {
    	Jmag = jmag;
    }


	/**
     * @param e_Jmag the e_Jmag to set
     */
    public synchronized final void setE_Jmag(String e_Jmag) {
    	this.e_Jmag = e_Jmag;
    }


	/**
     * @param q_Jmag the q_Jmag to set
     */
    public synchronized final void setQ_Jmag(String q_Jmag) {
    	this.q_Jmag = q_Jmag;
    }


	/**
     * @param hmag the hmag to set
     */
    public synchronized final void setHmag(String hmag) {
    	Hmag = hmag;
    }


	/**
     * @param e_Hmag the e_Hmag to set
     */
    public synchronized final void setE_Hmag(String e_Hmag) {
    	this.e_Hmag = e_Hmag;
    }


	/**
     * @param q_Hmag the q_Hmag to set
     */
    public synchronized final void setQ_Hmag(String q_Hmag) {
    	this.q_Hmag = q_Hmag;
    }


	/**
     * @param kmag the kmag to set
     */
    public synchronized final void setKmag(String kmag) {
    	Kmag = kmag;
    }


	/**
     * @param e_Kmag the e_Kmag to set
     */
    public synchronized final void setE_Kmag(String e_Kmag) {
    	this.e_Kmag = e_Kmag;
    }


	/**
     * @param q_Kmag the q_Kmag to set
     */
    public synchronized final void setQ_Kmag(String q_Kmag) {
    	this.q_Kmag = q_Kmag;
    }


	/**
     * @param bmag the bmag to set
     */
    public synchronized final void setBmag(String bmag) {
    	Bmag = bmag;
    }


	/**
     * @param e_Bmag the e_Bmag to set
     */
    public synchronized final void setE_Bmag(String e_Bmag) {
    	this.e_Bmag = e_Bmag;
    }


	/**
     * @param f_Bmag the f_Bmag to set
     */
    public synchronized final void setF_Bmag(String f_Bmag) {
    	this.f_Bmag = f_Bmag;
    }


	/**
     * @param vmag the vmag to set
     */
    public synchronized final void setVmag(String vmag) {
    	Vmag = vmag;
    }


	/**
     * @param e_Vmag the e_Vmag to set
     */
    public synchronized final void setE_Vmag(String e_Vmag) {
    	this.e_Vmag = e_Vmag;
    }


	/**
     * @param f_Vmag the f_Vmag to set
     */
    public synchronized final void setF_Vmag(String f_Vmag) {
    	this.f_Vmag = f_Vmag;
    }


	/**
     * @param gmag the gmag to set
     */
    public synchronized final void setGmag(String gmag) {
    	this.gmag = gmag;
    }


	/**
     * @param e_gmag the e_gmag to set
     */
    public synchronized final void setE_gmag(String e_gmag) {
    	this.e_gmag = e_gmag;
    }


	/**
     * @param f_gmag the f_gmag to set
     */
    public synchronized final void setF_gmag(String f_gmag) {
    	this.f_gmag = f_gmag;
    }


	/**
     * @param rmag the rmag to set
     */
    public synchronized final void setRmag(String rmag) {
    	this.rmag = rmag;
    }


	/**
     * @param e_rmag the e_rmag to set
     */
    public synchronized final void setE_rmag(String e_rmag) {
    	this.e_rmag = e_rmag;
    }


	/**
     * @param f_rmag the f_rmag to set
     */
    public synchronized final void setF_rmag(String f_rmag) {
    	this.f_rmag = f_rmag;
    }


	/**
     * @param imag the imag to set
     */
    public synchronized final void setImag(String imag) {
    	this.imag = imag;
    }


	/**
     * @param e_imag the e_imag to set
     */
    public synchronized final void setE_imag(String e_imag) {
    	this.e_imag = e_imag;
    }


	/**
     * @param f_imag the f_imag to set
     */
    public synchronized final void setF_imag(String f_imag) {
    	this.f_imag = f_imag;
    }


	/**
     * @param _g the _g to set
     */
    public synchronized final void set_g(String _g) {
    	this._g = _g;
    }


	/**
     * @param _c the _c to set
     */
    public synchronized final void set_c(String _c) {
    	this._c = _c;
    }


	/**
     * @param _H the _H to set
     */
    public synchronized final void set_H(String _H) {
    	this._H = _H;
    }


	/**
     * @param _A the _A to set
     */
    public synchronized final void set_A(String _A) {
    	this._A = _A;
    }


	/**
     * @param _b the _b to set
     */
    public synchronized final void set_b(String _b) {
    	this._b = _b;
    }


	/**
     * @param _h the _h to set
     */
    public synchronized final void set_h(String _h) {
    	this._h = _h;
    }


	/**
     * @param _Z the _Z to set
     */
    public synchronized final void set_Z(String _Z) {
    	this._Z = _Z;
    }


	/**
     * @param _B the _B to set
     */
    public synchronized final void set_B(String _B) {
    	this._B = _B;
    }


	/**
     * @param _L the _L to set
     */
    public synchronized final void set_L(String _L) {
    	this._L = _L;
    }


	/**
     * @param _N the _N to set
     */
    public synchronized final void set_N(String _N) {
    	this._N = _N;
    }


	/**
     * @param _S the _S to set
     */
    public synchronized final void set_S(String _S) {
    	this._S = _S;
    }


	/**
     * @param lEDA the lEDA to set
     */
    public synchronized final void setLEDA(String lEDA) {
    	LEDA = lEDA;
    }


	/**
     * @param _2mx the _2MX to set
     */
    public synchronized final void set_2MX(String _2mx) {
    	_2MX = _2mx;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	    return String.format("UCAC4 [_r=%s, UCAC4=%s, RAJ2000=%s, e_RAJ2000=%s, DEJ2000=%s, e_DEJ2000=%s, ePos=%s, EpRA=%s, EpDE=%s, f_mag=%s, a_mag=%s, e_a_mag=%s, _of=%s, _db=%s, _Na=%s, _Nu=%s, _Nc=%s, pmRA=%s, e_pmRA=%s, pmDE=%s, e_pmDE=%s, MPOS1=%s, UCAC2=%s, Tycho_2=%s, _2Mkey=%s, Jmag=%s, e_Jmag=%s, q_Jmag=%s, Hmag=%s, e_Hmag=%s, q_Hmag=%s, Kmag=%s, e_Kmag=%s, q_Kmag=%s, Bmag=%s, e_Bmag=%s, f_Bmag=%s, Vmag=%s, e_Vmag=%s, f_Vmag=%s, gmag=%s, e_gmag=%s, f_gmag=%s, rmag=%s, e_rmag=%s, f_rmag=%s, imag=%s, e_imag=%s, f_imag=%s, _g=%s, _c=%s, _H=%s, _A=%s, _b=%s, _h=%s, _Z=%s, _B=%s, _L=%s, _N=%s, _S=%s, LEDA=%s, _2MX=%s]", _r, UCAC4, RAJ2000, e_RAJ2000, DEJ2000, e_DEJ2000, ePos, EpRA, EpDE, f_mag, a_mag, e_a_mag, _of, _db, _Na, _Nu, _Nc, pmRA, e_pmRA, pmDE, e_pmDE, MPOS1, UCAC2, Tycho_2, _2Mkey, Jmag, e_Jmag, q_Jmag, Hmag, e_Hmag, q_Hmag, Kmag, e_Kmag, q_Kmag, Bmag, e_Bmag, f_Bmag, Vmag, e_Vmag, f_Vmag, gmag, e_gmag, f_gmag, rmag, e_rmag, f_rmag, imag, e_imag, f_imag, _g, _c, _H, _A, _b, _h, _Z, _B, _L, _N, _S, LEDA, _2MX);
    }
    
    
    public  String[] add(String[] arr, int pos, String name){
        String[] copy = new String[arr.length+1];
        System.arraycopy(arr, 0, copy, 0, pos);
        copy[pos] = name;
        System.arraycopy(arr, pos, copy, pos + 1, arr.length - pos);
        return copy;
    }  
	    
}
