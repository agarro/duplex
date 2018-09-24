package org.gedraa;


import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;

import org.jfree.ui.RefineryUtilities;


/**
 * 
 * @author garroale
 * 
 * 
 *         V = V_J+J B_V Bilir = 1.622 * J_H + 0.912 * H_K + 0.044
 * 
 *         V_I = 1.0770 * J_K ^3 + -1.6902 * (J_K ^2) + (2.1652 * J_K) + 0.0856
 *         V_J = 1.4688 * J_K ^3 + -2.3250 * (J_K ^2) + (3.5143 * J_K) + 0.1496
 */

public class TWOMASSStar {


	private double V;
	private double J;
	private double H;
	private double K;
	private double B_V;
	private double V_I;
	private double V_J;
	private double M;
	private double galacticLatitude;
	private double bolCorrection;
	private double dModulus;
	private boolean mainSequence;
	private String spectralType;
	private double pmRA;
	private double pmDEC;
	private double totalPM;
	private double reducedPM;
	private String longhexaCoords ="";
	private double temperature = 0.00;
	private double solarMasses = 0.00;
	private double radius = 0.00;
	private double bolometricAbsoluteMagnitud = 0.00;
	private double Av = 0.00;
	private int _Voption;
	private VoptionParameters _params;
	private boolean processCalcV = true;
	
	// Secuencia ENANAS.
	//					Espectro,	B-V,	V-I,	V-K,	J-H,	H-K
	private static double[] B8V = {-0.0900,-0.1500,-0.3500,-0.0500,-0.0350};
	private static double[] B9V = {-0.0600,-0.0750,-0.1750,-0.0250,-0.0180};
	private static double[] A0V = {0.0000,0.0000,0.0000,0.0000,0.0000};
	private static double[] A1V = {0.0300,0.0300,0.0700,0.0100,0.0025};
	private static double[] A2V = {0.0600,0.0600,0.1400,0.0200,0.0050};
	private static double[] A3V = {0.0867,0.1300,0.2200,0.0333,0.0083};
	private static double[] A4V = {0.1133,0.2000,0.3000,0.0467,0.0117};
	private static double[] A5V = {0.1400,0.2700,0.3800,0.0600,0.0150};
	private static double[] A6V = {0.1650,0.2850,0.4400,0.0750,0.0200};
	private static double[] A7V = {0.1900,0.3000,0.5000,0.0900,0.0250};
	private static double[] A8V = {0.2300,0.3100,0.5667,0.1033,0.0267};
	private static double[] A9V = {0.2700,0.3200,0.6333,0.1167,0.0283};
	private static double[] F0V = {0.3100,0.3300,0.7000,0.1300,0.0300};
	private static double[] F1V = {0.3350,0.3650,0.7600,0.1475,0.0325};
	private static double[] F2V = {0.3600,0.4000,0.8200,0.1650,0.0350};
	private static double[] F3V = {0.3833,0.4433,0.9133,0.1867,0.0367};
	private static double[] F4V = {0.4067,0.4867,1.0067,0.2083,0.0383};
	private static double[] F5V = {0.4300,0.5300,1.1000,0.2300,0.0400};
	private static double[] F6V = {0.4650,0.5750,1.2100,0.2575,0.0425};
	private static double[] F7V = {0.5000,0.6200,1.3200,0.2850,0.0450};
	private static double[] F8V = {0.5400,0.6300,1.3500,0.2930,0.0420};
	private static double[] F9V = {0.5650,0.6450,1.3800,0.2990,0.0460};
	private static double[] G0V = {0.5900,0.6600,1.4100,0.3050,0.0500};
	private static double[] G1V = {0.6100,0.6700,1.4350,0.3125,0.0510};
	private static double[] G2V = {0.6300,0.6800,1.4600,0.3200,0.0520};
	private static double[] G3V = {0.6400,0.6950,1.4950,0.3250,0.0535};
	private static double[] G4V = {0.6500,0.7100,1.5300,0.3300,0.0550};
	private static double[] G5V = {0.6600,0.7300,1.5800,0.3500,0.0580};
	private static double[] G6V = {0.6900,0.7500,1.6400,0.3700,0.0600};
	private static double[] G7V = {0.7150,0.7850,1.7200,0.3900,0.0640};
	private static double[] G8V = {0.7400,0.8200,1.8000,0.4100,0.0680};
	private static double[] G9V = {0.7800,0.8500,1.8800,0.4300,0.0715};
	private static double[] K0V = {0.8200,0.8800,1.9600,0.4500,0.0750};
	private static double[] K1V = {0.8700,0.9300,2.0900,0.4750,0.0825};
	private static double[] K2V = {0.9200,0.9800,2.2200,0.5000,0.0900};
	private static double[] K3V = {0.9950,1.0650,2.4250,0.5400,0.0975};
	private static double[] K4V = {1.0700,1.1500,2.6300,0.5800,0.1050};
	private static double[] K5V = {1.1500,1.2200,2.8500,0.6100,0.1100};
	private static double[] K6V = {1.2250,1.3350,3.0050,0.6350,0.1200};
	private static double[] K7V = {1.3000,1.4500,3.1600,0.6600,0.1300};
	private static double[] K8V = {1.3367,1.5667,3.3233,0.6717,0.1417};
	private static double[] K9V = {1.3733,1.6833,3.4867,0.6833,0.1533};
	private static double[] M0V = {1.4100,1.8000,3.6500,0.6950,0.1650};
	private static double[] M0_5V = {1.4450,1.8800,3.7600,0.6875,0.1825};
	private static double[] M1V = {1.4800,1.9600,3.8700,0.6800,0.2000};
	private static double[] M1_5V = {1.5000,2.0500,3.9900,0.6725,0.2050};
	private static double[] M2V = {1.5200,2.1400,4.1100,0.6650,0.2100};
	private static double[] M2_5V = {1.5350,2.3050,4.3800,0.6425,0.2300};
	private static double[] M3V = {1.5500,2.4700,4.6500,0.6200,0.2500};
	private static double[] M3_5V = {1.5550,2.6650,4.9550,0.6100,0.2625};
	private static double[] M4V = {1.5600,2.8600,5.2600,0.6000,0.2750};
	private static double[] M4_5V = {1.5850,3.1250,5.6900,0.6100,0.2975};
	private static double[] M5V = {1.6100,3.3900,6.1200,0.6200,0.3200};
	private static double[] M5_5V = {1.6650,3.7850,6.7100,0.6400,0.3450};
	private static double[] M6V = {1.7200,4.1800,7.3000,0.6600,0.3700};
	
	// SECUENCIA Gigantes. ACTUALIZARRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR !!!!!
	//					  Espectro, 	B-V,	V-I,	V-K,	J-H,	H-K
	private static double[] B8III = {-0.0800,-0.1500,-0.3500,-0.0500,-0.0350};
	private static double[] B9III = {-0.0800,-0.0750,-0.1750,-0.0250,-0.0180};
	private static double[] A0III = {-0.0300,0.0000,0.0000,0.0000,0.0000};
	private static double[] A1III = {0.0100,0.0300,0.0700,0.0100,0.0030};
	private static double[] A2III = {0.0500,0.0600,0.1400,0.0200,0.0050};
	private static double[] A3III = {0.0900,0.1300,0.2200,0.0300,0.0080};
	private static double[] A4III = {0.1200,0.2000,0.3000,0.0500,0.0120};
	private static double[] A5III = {0.1500,0.2700,0.3800,0.0600,0.0150};
	private static double[] A6III = {0.2900,0.2900,0.4400,0.0800,0.0200};
	private static double[] A7III = {0.2400,0.3000,0.5000,0.0900,0.0250};
	private static double[] A8III = {0.2600,0.3100,0.5700,0.1000,0.0270};
	private static double[] A9III = {0.2800,0.3200,0.6300,0.1200,0.0280};
	private static double[] F0III = {0.3200,0.3300,0.7000,0.1300,0.0300};
	
	private static double[] F1III = {0.34,0.365,0.76,0.1475,0.0325};
	private static double[] F2III = {0.36,0.4,0.82,0.165,0.035};
	private static double[] F3III = {0.39,0.44,0.91,0.19,0.037};
	private static double[] F4III = {0.42,0.49,1.01,0.21,0.038};
	private static double[] F5III = {0.43,0.53,1.10,0.23,0.040};
	private static double[] F6III = {0.46,0.58,1.21,0.26,0.043};
	private static double[] F7III = {0.48,0.62,1.32,0.29,0.045};
	private static double[] F8III = {0.52,0.63,1.35,0.29,0.042};
	private static double[] F9III = {0.60,0.72,1.55,0.33,0.0535};
	private static double[] G0III = {0.64,0.81,1.75,0.37,0.065};
	private static double[] G1III = {0.69,0.84,1.83,0.40,0.069};
	private static double[] G2III = {0.77,0.86,1.90,0.42,0.073};
	private static double[] G3III = {0.85,0.89,1.98,0.45,0.08};
	private static double[] G4III = {0.88,0.91,2.05,0.470,0.08};
	private static double[] G5III = {0.92,0.93,2.09,0.485,0.083};
	private static double[] G6III = {0.93,0.94,2.15,0.500,0.085};
	private static double[] G7III = {0.94,0.94,2.16,0.50,0.085};
	private static double[] G8III = {0.95,0.94,2.16,0.50,0.085};
	private static double[] G9III = {1.00,0.97,2.24,0.52,0.090};
	private static double[] K0III = {1.04,1.00,2.31,0.54,0.095};
	private static double[] K1III = {1.1,1.08,2.5,0.58,0.100};
	private static double[] K2III = {1.16,1.17,2.7,0.63,0.115};
	private static double[] K3III = {1.30,1.36,3.00,0.68,0.140};
	private static double[] K4III = {1.41,1.5,3.26,0.73,0.15};
	private static double[] K5III = {1.54,1.63,3.60,0.79,0.17};
	private static double[] K6III = {1.54,1.66,3.65,0.80,0.17};
	private static double[] K7III = {1.54,1.69,3.70,0.81,0.18};
	private static double[] K8III = {1.55,1.72,3.75,0.81,0.18};
	private static double[] K9III = {01.55,1.75,3.80,0.82,0.19};
	private static double[] M0III = {1.55,1.78,3.85,0.83,0.19};
	private static double[] M1III = {1.56,1.9,4.05,0.85,0.21};
	private static double[] M2III = {1.59,2.05,4.3,0.87,0.215};
	private static double[] M3III = {1.6,2.25,4.64,0.9,0.235};
	private static double[] M4III = {1.59,2.55,5.1,0.93,0.25};
	private static double[] M5III = {1.55,3.05,5.96,0.95,0.285};
	private static double[] M6III = {1.54,3.25,6.84,0.96,0.300};
	
	// Secuencia SUB-ENANAS    ACTUALIZARRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR !!!!!
	//								V-I		V-K		J-H		H-K
	private static double[] K7VI = {0.92,3.02,0.52,0.20};
	private static double[] K8VI = {1.06,3.18,0.52,0.20};
	private static double[] K9VI = {1.23,3.34,0.51,0.21};
	private static double[] M0VI = {1.43,3.51,0.51,0.22};
	private static double[] M1VI = {1.66,3.70,0.51,0.22};
	private static double[] M2VI = {1.92,3.89,0.50,0.23};
	private static double[] M3VI = {2.23,4.09,0.50,0.23};
	private static double[] M4VI = {2.59,4.30,0.50,0.24};
	private static double[] M5VI = {3.00,4.52,0.49,0.25};

	
	private static double[] curva ;
	

	
	/**
     * @return the av
     */
    public synchronized double getAv() {
    	return Av;
    }

	/**
     * @param av the av to set
     */
    public synchronized void setAv(double av) {
    	Av = av;
    }

	//					Espectro,	B-V,	V-I,	V-K,	J-H,	H-K
	private void makeCurva()
	{
		curva = new double[]{B_V,V_I,(V-K),(J-H),(H-K)};
	}
	
	/**
	 * 
	 * @return
	 */
	public String determineSpectralType()
	{
		String st ="";
		if (B_V <= -0.32)
		{    
		  st ="O7V";
		  temperature = 39810.7;
		  solarMasses = 26.00;
		  radius = 9.85;
		  bolometricAbsoluteMagnitud = -8.54;
		}
		if (B_V >= -0.31 && B_V < -0.30)
		{    
		  st ="O9V";
		  temperature = 35481.4;
		  solarMasses = 15.90;
		  radius = 6.20;
		  bolometricAbsoluteMagnitud = -6.86;
		}		
		
		if (B_V ==  B8V[0] || (B_V < (B8V[0] + 0.05) && B_V > (B8V[0] + 0.05)))
		{ 
		  st ="B8V";
		  M = -0.02;
		  bolCorrection = 0.549;
		  temperature = 11749.0;
		  solarMasses = 2.78;
		  radius = 2.13;
		  bolometricAbsoluteMagnitud = -0.01;

		}
		if (B_V ==  B9V[0] || (B_V < (B9V[0] + 0.05) && B_V > (B9V[0] + 0.05)))
		{    
		  st ="B9V";
		  M = 0.34;
		  bolCorrection = 0.381;
		  temperature = 11000.0;
		  solarMasses = 2.41;
		  radius = 2.06;
		  bolometricAbsoluteMagnitud = 0.67;

		}
		if (B_V >= 0.00 && B_V < 0.03)
		{    
		  st ="AOV";
		  M = 0.70;
		  bolCorrection = 0.155;
		  temperature = 9549.93;
		  solarMasses = 2.44;
		  radius = 2.16;
		  bolometricAbsoluteMagnitud = 0.82;
		}
		if (B_V >= 0.03 && B_V < 0.06)
		{    
		  st ="A1V";
		  M = 0.95;
		  bolCorrection = 0.085;
		  temperature = 9100.50;
		  solarMasses = 2.18;
		  radius = 2.06;
		  bolometricAbsoluteMagnitud = 1.09;

		}
		if (B_V >= 0.06 && B_V < 0.0867)
		{    
		  st ="A2V";
		  M = 1.21;
		  temperature = 8912.51;
		  bolCorrection = 0.036;
		  solarMasses = 2.11;
		  radius = 2.02;
		  bolometricAbsoluteMagnitud = 1.40;

		}		
		if (B_V >= 0.0867 && B_V < 0.1133)
		{    
		  st ="A3V";
		  M = 1.47;
		  bolCorrection = 0.004;
		  temperature = 8790.23;
		  solarMasses = 1.98;
		  radius = 1.92;
		  bolometricAbsoluteMagnitud = 1.57 ;
		}
		if (B_V >= 0.1133 && B_V < 0.1400)
		{    
		  st ="A4V";
		  M = 1.75;
		  bolCorrection = 0.01;
		  temperature = 8558.0;
		  solarMasses = 1.92;
		  radius = 1.88;
		  bolometricAbsoluteMagnitud = 1.72 ;
		}
		if (B_V >= 0.1400 && B_V < 0.1650)
		{    
		  st ="A5V";
		  M = 2.00;
		  bolCorrection = 0.022;
		  temperature = 8491.80;
		  solarMasses = 1.86;
		  radius = 1.84;
		  bolometricAbsoluteMagnitud = 1.88 ;
		}
		if (B_V >= 0.1650 && B_V < 0.1900)
		{    
		  st ="A6V";
		  M = 2.12;
		  bolCorrection = 0.028;
		  temperature = 8300.0;
		  solarMasses = 1.73;
		  radius = 1.79;
		  bolometricAbsoluteMagnitud = 2.04;
		}
		if (B_V >= 0.1900 && B_V < 0.2300)
		{    
		  st ="A7V";
		  M = 2.24;
		  bolCorrection = 0.031;
		  temperature = 8200.0;
		  solarMasses = 1.74;
		  radius = 1.75;
		  bolometricAbsoluteMagnitud = 2.19;
		}
		if (B_V >= 0.2300 && B_V < 0.2700)
		{    
		  st ="A8V";
		  M = 2.36;
		  bolCorrection = 0.034;
		  temperature = 8100.0;
		  solarMasses = 1-66;
		  radius = 1.69;
		  bolometricAbsoluteMagnitud = 2.42 ;
		}
		if (B_V >= 0.2700 && B_V < 0.3100)
		{    
		  st ="A9V";
		  M = 2.48;
		  bolCorrection = 0.035;
		  temperature = 7800.0;
		  solarMasses =1.57 ;
		  radius = 1.62;
		  bolometricAbsoluteMagnitud = 2.67;
		}
		if (B_V >= 0.3100 && B_V < 0.3350)
		{    
		  st ="F0V";
		  M = 2.60;
		  bolCorrection = 0.034;
		  temperature = 7211.08;
		  solarMasses = 1.50;
		  radius = 1.56;
		  bolometricAbsoluteMagnitud = 2.90;
	}
		if (B_V >= 0.3350 && B_V < 0.3600)
		{    
		  st ="F1V";
		  M = 2.76;
		  bolCorrection = 0.032;
		  temperature = 7000.0;
		  solarMasses = 1.46;
		  radius = 1.52;
		  bolometricAbsoluteMagnitud = 3.05;
		}
		if (B_V >= 0.3600 && B_V < 0.3833)
		{    
		  st ="F2V";
		  M = 2.92;
		  bolCorrection = 0.028;
		  temperature = 6776.42;
		  solarMasses = 1.41;
		  radius = 1.48;
		  bolometricAbsoluteMagnitud = 3.19;
		}
		if (B_V >= 0.3833 && B_V < 0.4067)
		{    
		  st ="F3V";
		  M = 3.08;
		  bolCorrection = 0.025;
		  temperature = 6600.0;
		  solarMasses = 1.39;
		  radius = 1.46;
		  bolometricAbsoluteMagnitud =3.28 ;
		}
		if (B_V >= 0.4067 && B_V < 0.4300)
		{    
		  st ="F4V";
		  M = 3.24;
		  bolCorrection = 0.018;
		  temperature = 65580.0;
		  solarMasses = 1.36;
		  radius = 1.44;
		  bolometricAbsoluteMagnitud = 3.37;
		}
		if (B_V >= 0.4300 && B_V < 0.4650)
		{    
		  st ="F5V";
		  M = 3.40;
		  bolCorrection = 0.012;
		  temperature = 6531.31;
		  solarMasses = 1.33;
		  radius = 1.42;
		  bolometricAbsoluteMagnitud = 3.46;
		}
		if (B_V >= 0.4650 && B_V < 0.5000)
		{    
		  st ="F6V";
		  M = 3.60;
		  bolCorrection = 0.001;
		  temperature = 6300.0;
		  solarMasses = 1.30;
		  radius = 1.38;
		  bolometricAbsoluteMagnitud = 3.59;
		}
		if (B_V >= 0.5000 && B_V < 0.5400)
		{    
		  st ="F7V";
		  M = 3.80;
		  bolCorrection = 0.012;
		  temperature = 6200.0;
		  solarMasses = 1.25;
		  radius = 1.34;
		  bolometricAbsoluteMagnitud = 3.74;
		}
		if (B_V >= 0.5400 && B_V < 0.5650)
		{    
		  st ="F8V";
		  M = 4.00;
		  bolCorrection = 0.030;
		  temperature = 6039.48;
		  solarMasses = 1.22;
		  radius = 1.31;
		  bolometricAbsoluteMagnitud = 3.88;
		}
		if (B_V >= 0.5650 && B_V < 0.5900)
		{    
		  st ="F9V";
		  M = 4.2;
		  bolCorrection = 0.045;
		  temperature = 5900.0;
		  solarMasses = 1.19;
		  radius = 1.28;
		  bolometricAbsoluteMagnitud = 3.98 ;
		}
		if (B_V >= 0.5900 && B_V < 0.6100)
		{    
		  st ="G0V";
		  M = 4.4;
		  bolCorrection = 0.055;
		  temperature = 5807.67;
		  solarMasses =1.16 ;
		  radius = 1.25;
		  bolometricAbsoluteMagnitud = 4.10;
		}
		if (B_V >= 0.6100 && B_V < 0.6300)
		{    
		  st ="G1V";
		  M = 4.54;
		  bolCorrection = 0.067;
		  temperature = 5700.0;
		  solarMasses = 1.15;
		  radius = 1.24;
		  bolometricAbsoluteMagnitud = 4.14;
		}
		if (B_V >= 0.6300 && B_V < 0.6400)
		{    
		  st ="G2V";
		  M = 4.68;
		  bolCorrection = 0.079;
		  temperature = 5636.38;
		  solarMasses = 1.14;
		  radius = 1.20;
		  bolometricAbsoluteMagnitud = 4.17;
		}
		if (B_V >= 0.6400 && B_V < 0.6500)
		{    
		  st ="G3V";
		  M = 4.82;
		  bolCorrection = 0.085;
		  temperature = 5610.0;
		  solarMasses = 1.13;
		  radius = 1.23;
		  bolometricAbsoluteMagnitud = 4.21;
		}
		if (B_V >= 0.6500 && B_V < 0.6600)
		{    
		  st ="G4V";
		  M = 4.96;
		  bolCorrection = 0.091;
		  temperature = 5590.98;
		  solarMasses = 1.12;
		  radius = 1.22;
		  bolometricAbsoluteMagnitud = 4.25;
		}
		if (B_V >= 0.6600 && B_V < 0.6900)
		{    
		  st ="G5V";
		  M = 5.10;
		  bolCorrection = 0.098;
		  temperature = 5584.70;
		  solarMasses = 1.11;
		  radius = 1.21;
		  bolometricAbsoluteMagnitud = 4.28 ;
		}
		if (B_V >= 0.6900 && B_V < 0.7150)
		{    
		  st ="G6V";
		  M = 5.26;
		  bolCorrection = 0.117;
		  temperature = 5450.90;
		  solarMasses = 1.08;
		  radius = 1.17;
		  bolometricAbsoluteMagnitud = 4.42;
		}
		if (B_V >= 0.7150 && B_V < 0.7400)
		{    
		  st ="G7V";
		  M = 5.43;
		  bolCorrection = 0.139;
		  temperature = 5400.31;
		  solarMasses = 1.04;
		  radius = 1.11;
		  bolometricAbsoluteMagnitud = 4.57;
		}
		if (B_V >= 0.7400 && B_V < 0.7800)
		{    
		  st ="G8V";
		  M = 5.58;
		  bolCorrection = 0.153;
		  temperature = 5333.35;
		  solarMasses = 0.99;
		  radius = 1.08;
		  bolometricAbsoluteMagnitud = 4.72;
		}
		if (B_V >= 0.7800 && B_V < 0.8200)
		{    
		  st ="G9V";
		  M = 5.74;
		  bolCorrection = 0.184;
		  temperature = 5250.0;
		  solarMasses = 0.95;
		  radius = 1.06;
		  bolometricAbsoluteMagnitud = 4.92;
		}
		if (B_V >= 0.8200 && B_V < 0.8700)
		{    
		  st ="K0V";
		  M = 5.90;
		  bolCorrection = 0.216;
		  temperature = 5188.0;
		  solarMasses = 0.91;
		  radius = 1.01;
		  bolometricAbsoluteMagnitud = 5.15;
		}
		if (B_V >= 0.8700 && B_V < 0.9200)
		{    
		  st ="K1V";
		  M = 6.18;
		  bolCorrection = 0.259;
		  temperature = 4930.0;
		  solarMasses = 0.86;
		  radius = 0.96;
		  bolometricAbsoluteMagnitud = 5.38;
		}
		if (B_V >= 0.9200 && B_V < 0.9950)
		{    
		  st ="K2V";
		  M = 6.46;
		  bolCorrection = 0.304;
		  temperature = 4886.52;
		  solarMasses = 0.81;
		  radius = 0.90;
		  bolometricAbsoluteMagnitud = 5.64;
		}
		if (B_V >= 0.9950 && B_V < 1.0700)
		{    
		  st ="K3V";
		  M = 6.74;
		  bolCorrection = 0.382;
		  temperature = 4520.40;
		  solarMasses = 0.73;
		  radius = 0.82;
		  bolometricAbsoluteMagnitud =6.02 ;
		}
		if (B_V >= 1.0700 && B_V < 1.1500)
		{    
		  st ="K4V";
		  M = 7.02;
		  bolCorrection = 0.459;
		  temperature = 4280.0;
		  solarMasses = 0.66;
		  radius = 0.73;
		  bolometricAbsoluteMagnitud = 6.42 ;
		}
		if (B_V >= 1.1500 && B_V < 1.2250)
		{    
		  st ="K5V";
		  M = 7.3;
		  bolCorrection = 0.552;
		  temperature = 4187.94;
		  solarMasses = 0.59;
		  radius = 0.68;
		  bolometricAbsoluteMagnitud = 6.83 ;
		}
		if (B_V >= 1.2250 && B_V < 1.3000)
		{    
		  st ="K6V";
		  M = 7.64;
		  bolCorrection = 0.652;
		  temperature = 4070.50;
		  solarMasses = 0.55;
		  radius = 0.62;
		  bolometricAbsoluteMagnitud = 7.14;
		}
		if (B_V >= 1.0300 && B_V < 1.3367)
		{    
		  st ="K7V";
		  M = 7.98;
		  bolCorrection = 0.752;
		  temperature = 3999.45;
		  solarMasses = 0.50;
		  radius = 0.57;
		  bolometricAbsoluteMagnitud = 7.49;
		}
		if (B_V >= 1.3367 && B_V < 1.3733)
		{    
		  st ="K8V";
		  M = 8.32;
		  bolCorrection = 0.814;
		  temperature = 3900.0;
		  solarMasses = 0.48;
		  radius = 0.55;
		  bolometricAbsoluteMagnitud = 7.61;
		}
		if (B_V >= 1.3733 && B_V < 1.4100)
		{    
		  st ="K9V";
		  M = 8.66;
		  bolCorrection = 0.865;
		  temperature = 3850.0;
		  solarMasses = 0.47;
		  radius = 0.54;
		  bolometricAbsoluteMagnitud = 7.72 ;
		}
		if (B_V >= 1.4100 && B_V < 1.4450)
		{    
		  st ="M0V";
		  M = 9.00;
		  bolCorrection = 0.939;
		  temperature = 3801.89;
		  solarMasses = 0.45;
		  radius = 0.52;
		  bolometricAbsoluteMagnitud = 7.84 ;
		}
		if (B_V >= 1.4450 && B_V < 1.4800)
		{    
		  st ="M0.5V";
		  M = 9.25;
		  bolCorrection = 1.024;
		  temperature = 3750.0;
		  solarMasses = 0.43;
		  radius = 0.50;
		  bolometricAbsoluteMagnitud = 7.58;
		}
		if (B_V >= 1.4800 && B_V < 1.5000)
		{    
		  st ="M1V";
		  M = 9.50;
		  bolCorrection = 1.096;
		  temperature = 3700.0;
		  solarMasses = 0.40;
		  radius = 0.44;
		  bolometricAbsoluteMagnitud = 8.00;
		}
		if (B_V >= 1.5000 && B_V < 1.5200)
		{    
		  st ="M1.5V";
		  M = 9.75;
		  bolCorrection = 1.15;
		  temperature = 3600.0;
		  solarMasses = 0.38;
		  radius = 0.44;
		  bolometricAbsoluteMagnitud = 8.28 ;
		}
		if (B_V >= 1.5200 && B_V < 1.5350)
		{    
		  st ="M2V";
		  M = 10.00;
		  bolCorrection = 1.209;
		  temperature =  3548.13;
		  solarMasses = 0.36;
		  radius = 0.42;
		  bolometricAbsoluteMagnitud = 8.66;
		}
		if (B_V >= 1.5350 && B_V < 1.5500)
		{    
		  st ="M2.5V";
		  M = 11.10;
		  bolCorrection = 1.280;
		  temperature = 3300.0;
		  solarMasses = 0.34;
		  radius = 0.40;
		  bolometricAbsoluteMagnitud = 8.86;
		}
		if (B_V >= 1.5500 && B_V < 1.5550)
		{    
		  st ="M3V";
		  M = 11.50;
		  bolCorrection = 1.312;
		  temperature = 3200.0;
		  solarMasses = 0.32;
		  radius = 0.38;
		  bolometricAbsoluteMagnitud = 9.02;
		}
		if (B_V >= 1.5550 && B_V < 1.5600)
		{    
		  st ="M3.5V";
		  M = 12.20;
		  bolCorrection = 1.350;
		  solarMasses = 0.30;
		  radius = 0.36;
		  bolometricAbsoluteMagnitud = 9.20 ;
		}
		if (B_V >= 1.5600 && B_V < 1.5850)
		{    
		  st ="M4V";
		  M = 13.20;
		  bolCorrection = 1.420;
		  temperature = 3111.72;
		  solarMasses = 0.29;
		  radius = 0.34;
		  bolometricAbsoluteMagnitud = 9.39;
		}
		if (B_V >= 1.5850 && B_V < 1.6100)
		{    
		  st ="M4.5V";
		  M = 13.90;
		  bolCorrection = 1.486;
		  temperature = 3004.85;
		  solarMasses =0.27 ;
		  radius = 0.32;
		  bolometricAbsoluteMagnitud = 9.62;
		}
		if (B_V >= 1.6100 && B_V < 1.6650)
		{    
		  st ="M5V";
		  M = 14.50;
		  bolCorrection = 1.595;
		  temperature = 2951.21;
		  solarMasses = 0.25;
		  radius = 0.30;
		  bolometricAbsoluteMagnitud = 9.80;
		}
		if (B_V >= 1.6650 && B_V < 1.7200)
		{    
		  st ="M5.5V";
		  M = 15.65;
		  bolCorrection = 2.078;
		  temperature = 2850.0;
		  solarMasses = 0.24;
		  radius = 0.28;
		  bolometricAbsoluteMagnitud = 10.02;
		}
		if (B_V >= 1.7200)
		{    
		  st ="M6V";
		  M = 16.20;
		  bolCorrection = 2.200;
		  temperature = 2800.95;
		  solarMasses = 0.22;
		  radius = 0.26;
		  bolometricAbsoluteMagnitud = 10.25;
		}
		
		spectralType = st;
		return st;
	}
	
	/**
	 * Intrinsic Colors of Supergiant Stars
Spectral Type  (V-R)
		0
		(V-I)
		0
		(V-J)
		0
		(V-H)
		0
		(V-K)
		0
		(V-L)
		0
		(V-M)
		0
		(V-N)
		0
		O9...  -0.19  -0.41  -0.57  -0.75  -0.84  -0.78  -0.99  -0.65
		O9.5...  -0.18  -0.39  -0.55  -0.73  -0.82  -0.75  -0.95  -0.63
		B0...  -0.17  -0.37  -0.53  -0.70  -0.78  -0.71  -0.90  -0.59
		B0.5...  -0.16  -0.35  -0.50  -0.66  -0.75  -0.67  -0.84  -0.55
		B1...  -0.15  -0.32  -0.47  -0.62  -0.70  -0.61  -0.77  -0.50
		B1.5...  -0.14  -0.30  -0.45  -0.59  -0.67  -0.58  -0.73  -0.47
		B2...  -0.14  -0.29  -0.43  -0.56  -0.63  -0.55  -0.68  -0.44
		B3...  -0.11  -0.25  -0.37  -0.49  -0.54  -0.45  -0.57  -0.35
		B4...  -0.09  -0.22  -0.33  -0.42  -0.48  -0.38  -0.48  -0.28
		B5...  -0.07  -0.19  -0.28  -0.34  -0.39  -0.30  -0.38  -0.19
		B6...  -0.06  -0.17  -0.24  -0.30  -0.34  -0.25  -0.32  -0.14
		B7...  -0.04  -0.14  -0.20  -0.24  -0.27  -0.18  -0.24  -0.06
		B7.5...  -0.03  -0.13  -0.17  -0.20  -0.22  -0.14  -0.19  -0.02
		B8...  -0.01  -0.10  -0.12  -0.14  -0.15  -0.07  -0.11  0.05
		B9...  0.02  -0.03  -0.04  -0.03  -0.02  0.06  0.03  0.19
		B9.5...  0.04  0.00  -0.01  0.01  0.03  0.11  0.08  0.23
		A0...  0.05  0.03  0.02  0.06  0.08  0.15  0.13  0.29
		A1...  0.08  0.08  0.09  0.14  0.18  0.25  0.23  0.39
		A2...  0.09  0.10  0.11  0.17  0.21  0.28  0.27  0.43
		A5...  0.13  0.18  0.20  0.29  0.35  0.41  0.41  0.57
		F0...  0.20  0.31  0.36  0.51  0.60  0.64  0.65  0.82
		F2...  0.24  0.37  0.44  0.62  0.73  0.77  0.77  0.95
		F5...  0.29  0.47  0.57  0.79  0.91  0.95  0.96  1.15
		F8...  0.43  0.70  0.87  1.17  1.34  1.35  1.36  1.58
		G0...  0.55  0.90  1.14  1.52  1.71  1.72  1.72  1.98
		G2...  0.65  1.06  1.35  1.80  1.99  2.01  1.99  2.28
		G3...  0.68  1.12  1.43  1.90  2.09  2.11  2.09  2.38
		G3.5...  0.70  1.16  1.47  1.95  2.15  2.17  2.14  2.44
		G4...  0.72  1.19  1.52  2.01  2.20  2.23  2.20  2.50
		G5...  0.77  1.26  1.61  2.13  2.32  2.35  2.31  2.63
		G8...  0.87  1.43  1.83  2.41  2.59  2.64  2.58  2.91
		K0...  0.95  1.59  2.01  2.64  2.80  2.87  2.79  3.14
		K1...  0.99  1.68  2.11  2.76  2.91  3.00  2.90  3.26
		K2...  1.03  1.76  2.20  2.87  3.01  3.12  3.01  3.38
		K3...  1.13  1.96  2.41  3.14  3.25  3.39  3.25  3.63
		K3.5...  1.16  2.04  2.50  3.25  3.34  3.50  3.35  3.74
		K4...  1.20  2.13  2.59  3.37  3.44  3.62  3.46  3.84
		K5...  1.27  2.27  2.74  3.55  3.59  3.80  3.62  4.01
		M0...  1.42  2.59  3.07  3.97  3.92  4.22  3.99  4.38
		M0.5...  1.46  2.68  3.16  4.08  4.01  4.33  4.09  4.48
		M1...  1.50  2.77  3.25  4.20  4.10  4.45  4.19  4.58
		M1.5...  1.54  2.87  3.35  4.32  4.19  4.57  4.29  4.69 
		M2...  1.58  2.97  3.45  4.45  4.28  4.70  4.40  4.80
		M2.5...  1.70  3.24  3.73  4.79  4.53  5.04  4.69  5.07
		M3...  1.83  3.55  4.03  5.16  4.79  5.41  5.01  5.37
		M3.5...  1.95  3.86  4.32  5.53  5.03  5.77  5.31  5.65
		M4...  2.09  4.20  4.65  5.93  5.29  6.17  5.64  5.95
		M5...  2.34  4.85  5.26  6.68  5.73  6.90  6.25  6.47
	 * 
	 * @return
	 */
	public String determineSuperGiantSpectralType()
	{
		String st ="";

		
		if (V_J < -0.08 && V_I < -0.075)
		{ 
		  st ="B8III";
		  M = 1.0;
		  bolCorrection = 0.488;
		  solarMasses = 5.00;
		  radius = 6.00;

		}
		if (B_V < -0.03 && B_V >= -0.075 )
		{    
		  st ="B9III";
		  M = 1.00;
		  bolCorrection = 0.488;
		  solarMasses = 4.5;
		  radius = 5.5;
		}
		
		return st;
	}

	/**
	 * 
	 * 
	 * @return
	 */
	public String determineLowMassStarSpectralType()
	{
		String st ="";
		double H_K = getH() - getK();
		double J_H = getJ() - getH();
		
		MamajekTables m = new MamajekTables();

		
		if (H_K >= 0.352 && H_K <= 0.386)
		{ 
		  st ="M6V";
		  M = 16.20;
		  bolCorrection = 2.200;
		  temperature = 2800.95;
		  solarMasses = 0.22;
		  radius = 0.26;
		  bolometricAbsoluteMagnitud = 10.25;

		}
		if (H_K >= 0.386 && H_K <= 0.446)
		{    
		  st ="M7V";
		  M =  Double.valueOf(m.M7V[3]);
		  bolCorrection = Double.valueOf(m.M7V[2]);
		  solarMasses = Double.valueOf(m.M7V[12]);
		  radius = 0.15;
		}
		if (H_K >= 0.446 && H_K <= 0.481)
		{    
		  st ="M8V";
		  M =  Double.valueOf(m.M8V[3]);
		  bolCorrection = Double.valueOf(m.M8V[2]);
		  solarMasses = Double.valueOf(m.M8V[12]);
		  radius = 0.11;
		}
		if (H_K >= 0.481 && H_K <= 0.5)
		{    
		  st ="M9V";
		  M =  Double.valueOf(m.M9V[3]);
		  bolCorrection = Double.valueOf(m.M9V[2]);
		  solarMasses = Double.valueOf(m.M9V[12]);
		  radius = 0.10;
		}
		if (H_K >= 0.5 && H_K <= 0.54)
		{    
		  st ="L0V";
		  M =  Double.valueOf(m.L0V[3]);
		  bolCorrection = Double.valueOf(m.L0V[2]);
		  solarMasses = Double.valueOf(m.L0V[12]);
		  radius = 0.098;
		}

		if (H_K >= 0.54 && H_K <= 0.57)
		{    
		  st ="L1V";
		  M =  Double.valueOf(m.L1V[3]);
		  bolCorrection = Double.valueOf(m.L1V[2]);
		  solarMasses = Double.valueOf(m.L1V[12]);
		  radius = 0.096;
		}

		if (H_K >= 0.57 && H_K <= 0.63)
		{    
		  st ="L2V";
		  M =  Double.valueOf(m.L2V[3]);
		  bolCorrection = Double.valueOf(m.L2V[2]);
		  solarMasses = Double.valueOf(m.L2V[12]);
		  radius = 0.095;
		}
		
		if (H_K >= 0.63 && H_K <= 0.64)
		{    
		  st ="L3V";
		  M =  Double.valueOf(m.L3V[3]);
		  bolCorrection = Double.valueOf(m.L3V[2]);
		  solarMasses = Double.valueOf(m.L3V[12]);
		  radius = 0.093;
		}

		if (H_K >= 0.64 && H_K <= 0.65)
		{    
		  st ="L4V";
		  M =  Double.valueOf(m.L4V[3]);
		  bolCorrection = Double.valueOf(m.L4V[2]);
		  solarMasses = Double.valueOf(m.L4V[12]);
		  radius = 0.091;
		}
		

		if (J_H >= 1.08 && H_K <= 0.65)
		{    
		  st ="L5V";
		  M =  Double.valueOf(m.L5V[3]);
		  bolCorrection = Double.valueOf(m.L5V[2]);
		  solarMasses = Double.valueOf(m.L5V[12]);
		  radius = 0.089;
		}

		if (J_H >= 1.04 && H_K <= 0.64)
		{    
		  st ="L6V";
		  M =  Double.valueOf(m.L6V[3]);
		  bolCorrection = Double.valueOf(m.L6V[2]);
		  solarMasses = Double.valueOf(m.L6V[12]);
		  radius =0.087 ;
		}
		

		if (J_H >= 1.02 && H_K <= 0.62)
		{    
		  st ="L7V";
		  M =  Double.valueOf(m.L7V[3]);
		  bolCorrection = Double.valueOf(m.L7V[2]);
		  solarMasses = Double.valueOf(m.L7V[12]);
		  radius =0.084 ;
		}
		

		if (J_H >= 1.1 && H_K <= 0.63)
		{    
		  st ="L8V";
		  M =  Double.valueOf(m.L8V[3]);
		  bolCorrection = Double.valueOf(m.L8V[2]);
		  solarMasses = Double.valueOf(m.L8V[12]);
		  radius =0.082 ;
		}
		

		if (J_H >= 1.07 && H_K <= 0.63)
		{    
		  st ="L9V";
		  M =  Double.valueOf(m.L9V[3]);
		  bolCorrection = Double.valueOf(m.L9V[2]);
		  solarMasses = Double.valueOf(m.L9V[12]);
		  radius =0.081 ;
		}
		

		if (J_H >= 0.9 && H_K <= 0.54)
		{    
		  st ="T0V";
		  M =  Double.valueOf(m.T0V[3]);
		  bolCorrection = Double.valueOf(m.T0V[2]);
		  solarMasses = Double.valueOf(m.T0V[12]);
		  radius =0.08 ;
		}
		

		if (J_H >= 0.89 && H_K <= 0.45)
		{    
		  st ="T1V";
		  M =  Double.valueOf(m.T1V[3]);
		  bolCorrection = Double.valueOf(m.T1V[2]);
		  solarMasses = Double.valueOf(m.T1V[12]);
		  radius = 0.76;
		}
		

		if (J_H >= 0.66 && H_K <= 0.27)
		{    
		  st ="T2V";
		  M =  Double.valueOf(m.T2V[3]);
		  bolCorrection = Double.valueOf(m.T2V[2]);
		  solarMasses = Double.valueOf(m.T2V[12]);
		  radius = 0.76;
		}

		if (J_H >= 0.37 && H_K <= 0.08)
		{    
		  st ="T3V";
		  M =  Double.valueOf(m.T3V[3]);
		  bolCorrection = Double.valueOf(m.T3V[2]);
		  solarMasses = Double.valueOf(m.T3V[12]);
		  radius = 0.70;
		}

		if (J_H >= 0.00 && H_K <= -0.19)
		{    
		  st ="T4V";
		  M =  Double.valueOf(m.T4V[3]);
		  bolCorrection = Double.valueOf(m.T4V[2]);
		  solarMasses = Double.valueOf(m.T4V[12]);
		  radius = 0.65;
		}
		

		if (J_H >= -0.14 && H_K <= -0.08)
		{    
		  st ="T5V";
		  M =  Double.valueOf(m.T5V[3]);
		  bolCorrection = Double.valueOf(m.T5V[2]);
		  solarMasses = Double.valueOf(m.T5V[12]);
		  radius = 0.6;
		}
		

		if (J_H >= -0.31 && H_K <= -0.03)
		{    
		  st ="T6V";
		  M =  Double.valueOf(m.T6V[3]);
		  bolCorrection = Double.valueOf(m.T6V[2]);
		  solarMasses = Double.valueOf(m.T6V[12]);
		  radius = 0.6;
		}
		

		if (J_H >= -0.45 && H_K <= 0.00)
		{    
		  st ="T7V";
		  M =  Double.valueOf(m.T7V[3]);
		  bolCorrection = Double.valueOf(m.T7V[2]);
		  solarMasses = Double.valueOf(m.T7V[12]);
		  radius = 0.6;
		}		
		

		if (J_H >= -0.49 && H_K <= -0.05)
		{    
		  st ="T8V";
		  M =  Double.valueOf(m.T8V[3]);
		  bolCorrection = Double.valueOf(m.T8V[2]);
		  solarMasses = Double.valueOf(m.T8V[12]);
		  radius = 0.6;
		}		

		if (J_H >= -0.28 && H_K <= -0.20)
		{    
		  st ="T9V";
		  M =  Double.valueOf(m.T9V[3]);
		  bolCorrection = Double.valueOf(m.T9V[2]);
		  solarMasses = Double.valueOf(m.T9V[12]);
		  radius = 0.5;
		}		
				

		if (J_H >= -0.25 && H_K <= -0.30)
		{    
		  st ="Y0V";
		  M =  Double.valueOf(m.Y0V[3]);
		  bolCorrection = Double.valueOf(m.Y0V[2]);
		  solarMasses = Double.valueOf(m.Y0V[12]);
		  radius = 0.4;
		}							
		return st;
	}
	
	
	
	/**
	 * 
	 * @return
	 */
	public String determineGIANTSSpectralType()
	{
		String st ="";

		
		if (B_V < -0.08 && V_I < -0.075)
		{ 
		  st ="B8III";
		  M = 1.0;
		  bolCorrection = 0.488;
		  solarMasses = 5.00;
		  radius = 6.00;

		}
		if (B_V < -0.03 && B_V >= -0.075 )
		{    
		  st ="B9III";
		  M = 1.00;
		  bolCorrection = 0.488;
		  solarMasses = 4.5;
		  radius = 5.5;
		}
		if (B_V >= -0.03 && B_V < 0.01)
		{    
		  st ="AOIII";
		  M = 1.00;
		  bolCorrection = 0.252;
		  solarMasses = 4.00;
		  radius = 5.90;
		}
		if (B_V >= 1.00 && B_V < 0.05)
		{    
		  st ="A1III";
		  M = 1.00;
		  bolCorrection = 0.129;
		  solarMasses = 3.8;
		  radius = 5.05;
		}
		if (B_V >= 0.05 && B_V < 0.09)
		{    
		  st ="A2III";
		  M = 1.00;
		  bolCorrection = 0.050;
		  solarMasses = 3.6;
		  radius = 5.10;
		}		
		if (B_V >= 0.09 && B_V < 0.12)
		{    
		  st ="A3III";
		  M = 1.00;
		  bolCorrection = 0.004;
		  solarMasses =3.4 ;
		  radius = 5.15;
		}
		if (B_V >= 0.12 && B_V < 0.15)
		{    
		  st ="A4III";
		  M = 1.00;
		  bolCorrection = 0.015;
		  solarMasses = 3.2;
		  radius = 5.2;
		}
		if (B_V >= 0.15 && B_V < 0.20)
		{    
		  st ="A5III";
		  M = 1.00;
		  bolCorrection = 0.024;
		  solarMasses = 3.0;
		  radius = 5.25;
		}
		if (B_V >= 0.20 && B_V < 0.24)
		{    
		  st ="A6III";
		  M = 1.00;
		  bolCorrection = 0.032;
		  solarMasses = 2.8;
		  radius = 5.3;
		}
		if (B_V >= 0.24 && B_V < 0.26)
		{    
		  st ="A7III";
		  M = 1.25;
		  bolCorrection = 0.034;
		  solarMasses = 2.6;
		  radius = 5.35;
		}
		if (B_V >= 0.26 && B_V < 0.28)
		{    
		  st ="A8III";
		  M = 1.2;
		  bolCorrection = 0.035;
		  solarMasses = 2.4;
		  radius = 5.4;
		}
		if (B_V >= 0.28 && B_V < 0.3200)
		{    
		  st ="A9III";
		  M = 1.2;
		  bolCorrection = 0.035;
		  solarMasses = 2.2;
		  radius = 5.45;
		}
		if (B_V >= 0.3200 && B_V < 0.34)
		{    
		  st ="F0III";
		  M = 1.20;
		  bolCorrection = 0.033;
		  solarMasses = 2.0;
		  radius = 5.5;
		}
		if (B_V >= 0.34 && B_V < 0.3600)
		{    
		  st ="F1III";
		  M = 1.24;
		  bolCorrection = 0.031;
		  solarMasses = 1.9;
		  radius = 5.55;
		}
		if (B_V >= 0.3600 && B_V < 0.39)
		{    
		  st ="F2III";
		  M = 1.24;
		  bolCorrection = 0.028;
		  solarMasses = 1.8;
		  radius = 5.6;
		}
		if (B_V >= 0.39 && B_V < 0.42)
		{    
		  st ="F3III";
		  M = 1.32;
		  bolCorrection = 0.022;
		  solarMasses = 1.7;
		  radius = 5.65;
		}
		if (B_V >= 0.42 && B_V < 0.4300)
		{    
		  st ="F4III";
		  M = 1.36;
		  bolCorrection = 0.015;
		  solarMasses = 1.6;
		  radius = 5.7;
		}
		if (B_V >= 0.4300 && B_V < 0.460)
		{    
		  st ="F5III";
		  M = 1.4;
		  bolCorrection = 0.012;
		  solarMasses = 1.5;
		  radius = 5.75;
		}
		if (B_V >= 0.460 && B_V < 0.4800)
		{    
		  st ="F6III";
		  M = 1.34;
		  bolCorrection = 0.003;
		  solarMasses = 1.4;
		  radius = 5.8;
		}
		if (B_V >= 0.4800 && B_V < 0.5200)
		{    
		  st ="F7III";
		  M = 1.28;
		  bolCorrection = 0.004;
		  solarMasses = 1.3;
		  radius = 5.85;
		}
		if (B_V >= 0.5200 && B_V < 0.600)
		{    
		  st ="F8III";
		  M = 1.22;
		  bolCorrection = 0.021;
		  solarMasses = 1.2;
		  radius = 5.9;
		}
		if (B_V >= 0.60 && B_V < 0.6400)
		{    
		  st ="F9III";
		  M = 1.16;
		  bolCorrection = 0.061;
		  solarMasses = 1.1;
		  radius = 5.95;
		}
		if (B_V >= 0.6400 && B_V < 0.6900)
		{    
		  st ="G0III";
		  M = 1.1;
		  bolCorrection = 0.085;
		  solarMasses = 1.0;
		  radius = 6.0;
		}
		if (B_V >= 0.6900 && B_V < 0.7700)
		{    
		  st ="G1III";
		  M = 1.02;
		  bolCorrection = 0.117;
		  solarMasses = 1.02;
		  radius = 7.0;
		}
		if (B_V >= 0.7700 && B_V < 0.8500)
		{    
		  st ="G2III";
		  M = 0.94;
		  bolCorrection = 0.176;
		  solarMasses = 1.04;
		  radius = 8.0;
		}
		if (B_V >= 0.8500 && B_V < 0.8800)
		{    
		  st ="G3III";
		  M = 0.86;
		  bolCorrection = 0.242;
		  solarMasses = 1.06;
		  radius = 9.0;
		}
		if (B_V >= 0.8800 && B_V < 0.9200)
		{    
		  st ="G4III";
		  M = 0.78;
		  bolCorrection = 0.262;
		  solarMasses = 9.5 ;
		  radius = 1.08;
		}
		if (B_V >= 0.9200 && B_V < 0.9300)
		{    
		  st ="G5III";
		  M = 0.7;
		  bolCorrection = 0.304;
		  solarMasses = 1.1 ;
		  radius = 10.0;
		}
		if (B_V >= 0.9300 && B_V < 0.940)
		{    
		  st ="G6III";
		  M = 0.66;
		  bolCorrection = 0.313;
		  solarMasses = 1.1;
		  radius = 10.8;
		}
		if (B_V >= 0.940 && B_V < 0.9500)
		{    
		  st ="G7III";
		  M = 0.62;
		  bolCorrection = 0.322;
		  solarMasses = 1.1;
		  radius = 11.6;
		}
		if (B_V >= 0.9500 && B_V < 1.00)
		{    
		  st ="G8III";
		  M = 0.58;
		  bolCorrection = 0.322;
		  solarMasses = 1.1;
		  radius = 13.0;
		}
		if (B_V >= 1.00 && B_V < 1.04)
		{    
		  st ="G9III";
		  M = 0.54;
		  bolCorrection = 0.382;
		  solarMasses = 1.1;
		  radius = 14.0;
		}
		if (B_V >= 1.0400 && B_V < 1.100)
		{    
		  st ="K0III";
		  M = 0.50;
		  bolCorrection = 0.426;
		  solarMasses = 1.1;
		  radius = 15.0;
		}
		if (B_V >= 1.100 && B_V < 1.1600)
		{    
		  st ="K1III";
		  M = 0.36;
		  bolCorrection = 0.494;
		  solarMasses = 1.12;
		  radius = 17.0;
		}
		if (B_V >= 1.1600 && B_V < 1.30)
		{    
		  st ="K2III";
		  M = 0.22;
		  bolCorrection = 0.564;
		  solarMasses = 1.14;
		  radius = 19.0;
		}
		if (B_V >= 1.30 && B_V < 1.4100)
		{    
		  st ="K3III";
		  M = 0.08;
		  bolCorrection = 0.752;
		  solarMasses = 1.16;
		  radius = 21.0;
		}
		if (B_V >= 1.4100 && B_V < 1.5400)
		{    
		  st ="K4III";
		  M = -0.06;
		  bolCorrection = 0.939;
		  solarMasses = 1.18;
		  radius = 23.0;
		}
		if (B_V >= 1.5400 && V_I < 1.66)
		{    
		  st ="K5III";
		  M = -0.20;
		  bolCorrection = 1.276;
		  solarMasses = 1.2;
		  radius = 25.0;
		}
		if (B_V >= 1.540 && V_I < 1.69)
		{    
		  st ="K6III";
		  M = -0.24;
		  bolCorrection = 1.276;
		  solarMasses = 1.2;
		  radius = 28.0;
		}
		if (B_V >= 1.5400 && V_I < 1.72)
		{    
		  st ="K7III";
		  M = -0.28;
		  bolCorrection = 1.2276;
		  solarMasses = 1.2;
		  radius = 32.0;
		}
		if (B_V >= 1.55 && V_I < 1.75)
		{    
		  st ="K8III";
		  M = -0.32;
		  bolCorrection = 1.312;
		  solarMasses = 1.2;
		  radius = 35.0;
		}
		if (B_V >= 1.55 && V_I < 1.78)
		{    
		  st ="K9III";
		  M = -0.36;
		  bolCorrection = 1.312;
		  solarMasses = 1.2;
		  radius = 38.0;
		}
		if (B_V >= 1.55 && V_I < 1.9)
		{    
		  st ="M0III";
		  M = -0.40;
		  bolCorrection = 1.312;
		  solarMasses = 1.2;
		  radius = 40.0;
		}

		if (B_V >= 1.56 && V_I < 2.05)
		{    
		  st ="M1III";
		  M = -0.50;
		  bolCorrection = 1.312;
		  solarMasses = 1.2;
		  radius = 50.0;
		}

		if (B_V >= 1.56 && V_I < 2.25)
		{    
		  st ="M2III";
		  M = -0.60;
		  bolCorrection = 1.486;
		  solarMasses = 1.2;
		  radius = 60.0;
		}


		if (B_V >= 1.60 && V_I < 2.55)
		{    
		  st ="M3III";
		  M = -0.67;
		  bolCorrection = 1.539;
		  solarMasses = 1.2;
		  radius = 70.0;
		}
		
		if (B_V >= 1.59 && (V_I > 2.25 && V_I <3.05))
		{    
		  st ="M4III";
		  M = -0.71;
		  bolCorrection = 0.00;
		  solarMasses = 1.2;
		  radius = 80.0;
		}
		
		if (B_V == 1.550 && V_I > 2.55)
		{    
		  st ="M5III";
		  M = -0.80;
		  bolCorrection = 0.00;
		  solarMasses = 1.2;
		  radius = 90.0;
		}
		
		if (B_V == 1.540 && V_I > 3.05)
		{    
		  st ="M6III";
		  M = -0.85;
		  bolCorrection = 0.00;
		  solarMasses = 1.2;
		  radius = 110.0;
		}
		
		spectralType = st;
		return st;
	}
	
/*	*//**
	 * 
	 * @return
	 *//*
	public String determineSUB_DWARFSpectralType()
	{
		String st ="";
		if (V_I < 1.06)
		{    
		  st ="K7VI";
		  M = ;
		  bolCorrection = 0.752;
		}
		if (V_I >= 1.06 && V_I < 1.23)
		{    
		  st ="K8VI";
		  M = ;
		  bolCorrection = 0.814;
		}
		if (V_I >= 1.23 && V_I < 1.43)
		{    
		  st ="K9VI";
		  M = ;
		  bolCorrection = 0.865;
		}
		if (V_I >= 1.43 && V_I < 1.66)
		{    
		  st ="M0VI";
		  M = ;
		  bolCorrection = 0.939;
		}

		if (V_I >= 1.66 && V_I < 1.92)
		{    
		  st ="M1VI";
		  M = ;
		  bolCorrection = 1.096;
		}

		if (V_I >= 1.92 && V_I < 2.23)
		{    
		  st ="M2VI";
		  M = ;
		  bolCorrection = 1.209;
		}

		if (V_I >= 2.23 && V_I < 2.59)
		{    
		  st ="M3VI";
		  M = ;
		  bolCorrection = 1.312;
		}

		if (V_I >= 2.59 && V_I < 3.00)
		{    
		  st ="M4VI";
		  M = 13.20;
		  bolCorrection = 1.420;
		}

		if (V_I >= 3.00)
		{    
		  st ="M5VI";
		  M = ;
		  bolCorrection = 1.595;
		}
		
		spectralType = st;
		return st;
	}*/
	
	/**
	 * Constructor 
	 * @param j
	 * @param h
	 * @param k
	 * @param galaclat
	 * @param pmra
	 * @param pmdec
	 */
	
	public TWOMASSStar(double j, double h, double k, double galaclat, 
		double pmra, double pmdec, int Voption, VoptionParameters par) {
		_params = par;
		_Voption=Voption;
		J = j;
		H = h;
		K = k;
		galacticLatitude = galaclat;
		pmRA = pmra;
		pmDEC = pmdec;
		
		if(_Voption==0)
		{
			// UCAC 4 mag value
			calculateVoption0();
		}
		
		if(_Voption==1)
		{
			// Bilir
			calculateVoption1();
		}
		else if(_Voption==2)
		{
			// Bilir + Warner
			calculateV();			
		}
		else if(_Voption==3)
		{
			// Warner
			calculateVoption3();			
		}
		else if(_Voption==4)
		{
			// Greeves
			calculateVoption4();			
		}
		else if(_Voption==5)
		{
			// Dymock
			calculateVoption5();			
		}
		else if(_Voption==6)
		{
			// USNOB1
			calculateVoption6();			
		}
		else if(_Voption==7)
		{
			// UCAC3
			calculateVoption7();			
		}
		else if(_Voption==8)
		{
			// CATALOG
			calculateVoption8();			
		}
		

		calculateV_I();
		calculateV_J();
		calculateB_V_Bilir();
		calculateB_V_Warner();
		calculateB_V();
		makeCurva();
		determineSpectralType();
		determineReducedProperMotion();
		dModulus = distanceInParsecs(V,M);
		toString();
		System.out.println("Tipo Espectral: " + spectralType );
		
	}
	

	public void recalculateBecauseIsGIANT()
	{
		determineGIANTSSpectralType();
		calculateV();
		calculateV_I();
		calculateV_J();
		calculateB_V_Bilir();
		calculateB_V_Warner();
		calculateB_V();
		makeCurva();
		determineReducedProperMotion();
		dModulus = distanceInParsecs(V,M);
		toString();
		System.out.println("Tipo Espectral REESTIMADO: " + spectralType );
	}
	
	/**
	 * Calcula el Movimiento Propio Reducido. 
	 */
	public void determineReducedProperMotion()
	{
		totalPM = Math.sqrt(Math.pow(pmRA, 2) + Math.pow(pmDEC, 2));
		double loga = Math.log(totalPM);
		loga = loga + 5 ;
		reducedPM = ((-1.00) * (V + 5 * loga));
		reducedPM = reducedPM +10; 
		System.out.println("Total MP: " + totalPM );
		System.out.println("Movimiento Propio Reducido (Hv): " + reducedPM );
		
		
	}

	/*
	 * Calcula B-V
	 */
	public double calculateB_V() {
		B_V = 0.00;
		B_V = (this.calculateB_V_Bilir() + this.calculateB_V_Warner()) / 2;
		System.out.println("B-V promedio : " + B_V);
		return B_V;

	}

	/**
	 * Calcula  B-V por la fórmula de Brian Warner
	 * @return
	 */
	public double calculateB_V_Warner() {
		double b_v = 0.00;
		b_v = 0.2807 * Math.pow((J - K), 3) + -0.4535 * Math.pow((J - K), 2) + 1.7006 * (J - K) + 0.0484;
		System.out.println("B-V Brian Warner : " + b_v);
		return b_v;
	}

	/**
	 * Calcula B-V por la fórmula de Bilir et al.
	 * @return
	 */
	public double calculateB_V_Bilir() {
		double b_v = 0.00;
		b_v = 1.622 * (J - H) + 0.912 * (H - K) + 0.044;
		System.out.println("B-V Bilir et al. : " + b_v);
		return b_v;
	}

	public double calculateV_I() {
		double v_i = 0.00;
		v_i = 1.0770 * Math.pow(J - K, 3) + -1.6902 * Math.pow(J - K, 2) + (2.1652 * (J - K)) + 0.0856;
		System.out.println("V-I : " + v_i);
		this.setV_I(v_i);
		return v_i;
	}

	public double calculateV_J() {
		double v_j = 0.00;
		v_j = 1.4688 * Math.pow(J - K, 3) + -2.325 * Math.pow(J - K, 2) + (3.5143 * (J - K)) + 0.1496;
		System.out.println("V-J : " + v_j);
		this.setV_J(v_j);
		return v_j;

	}

	public double calculateV() {
		V = 0.00;
		V = this.calculateV_J() + J;
		System.out.println("V : " + V);
		System.out.println("******************************************************************************************************************************");
		System.out.println("V mag estimated converting JHK to UBVR (average of Bilir et Al. and B.Warner methods)");
		System.out.println("******************************************************************************************************************************");
		return V;
	}
	
	/**
	 * Valor de mag V de UCAC4
	 */
	private double calculateVoption0() {
		// TODO Auto-generated method stub
		if (_params.get_ucac4List() != null) 
		{
			ArrayList<UCAC4> estrellasUCAC4 = _params.get_ucac4List();
			if (estrellasUCAC4 != null) 
			{
				if(estrellasUCAC4.size()>0)
				{
					UCAC4 u = estrellasUCAC4.get(0);
					if(u.getVmag()!=null &&! u.getVmag().startsWith(" "))
					{
						V = Double.valueOf(u.getVmag());
						System.out.println("*****************************************************");
						System.out.println("Magnitud V obtenida de UCAC4 (APASS).");
						System.out.println("*****************************************************");
					}
					else
					{
						System.out.println("*****************************************************************************************************************");
						System.out.println("Estrella UCAC4 sin valor de Magnitud V.  Se aplicará ");
						System.out.println("el valor de mag V de la transformación JHK UVRI (promedio de los métodos Bilir et Al. y B.Warner)");
						
						System.out.println("*****************************************************************************************************************");
						V=calculateV();	
					}

				}
				else
				{
					System.out.println("*****************************************************");
					System.out.println("No se encontró estrellas UCAC4.");
					System.out.println("*****************************************************");
					V=calculateV();					
				}
			}
			else{
				System.out.println("*****************************************************");
				System.out.println("No se encontró estrellas UCAC4.");
				System.out.println("*****************************************************");
				V=calculateV();	
			}
		}
		else{
			System.out.println("*****************************************************");
			System.out.println("No se pudo acceder al catálogo UCAC4.");
			System.out.println("*****************************************************");
			V=calculateV();	
		}
		return V;
	}
	
	/**
	 * Valor mag V transformado . Bilir et Al.
	 * @return
	 */
	public double calculateVoption1() {
		V = 0.00;
		V = this.calculateV_J() + J;
		System.out.println("V : " + V);
		return V;
	}
	
	/**
	 * Valor mag V transformado B. Warner
	 * @return
	 */
	public double calculateVoption3() {
		V = 0.00;
		V = this.calculateV_J() + J;
		System.out.println("V : " + V);
		return V;
	}
	
	/**
	 * Valor mag V transformado Greeves
	 * V = 0,641*(J-K)+ mg_CMC14      [precisión +-0,05]				
	 *	0.00 < (J-K) <1.0; 9.9 < mag_CMC14 < 14.8				
	 * @return
	 */
	public double calculateVoption4() {
		
		if(_params.get_cmc14List().size()<=0)
		{
			System.out.println("*****************************************************");
			System.out.println("No CMC14 stars found.");
			System.out.println("*****************************************************");			
			V = 0.00;
			V = this.calculateV_J() + J;
			System.out.println("V : " + V);
		}
		else
		{
			CMC14 cmc14 =_params.get_cmc14List().get(0);
			double cmc = Double.valueOf(cmc14.getRmag());
			V = 0.641 * ((J-K) + cmc);
			System.out.println("*****************************************************");
			System.out.println("Magnitud estimada mediante CMC14 (John Greaves) :");
			System.out.println("*****************************************************");	
			System.out.println("V : " + V);
		}

		return V;
	}
	
	/**
	 * Valor mag V transformado Dymock
	 * 
	 *	V = 0,6278*(J-K) + 0,9947*mg_CMC14      [precisión +-0,043 para mag < 14]						
	 *	0.00 < (J-K) <1.0; 9.9 < mag_CMC14 < 14.8						
	 *			
	 * @return
	 */
	public double calculateVoption5() {
		if(_params.get_cmc14List().size()<=0)
		{
			System.out.println("*****************************************************");
			System.out.println("No CMC14 stars found.");
			System.out.println("*****************************************************");			
			V = 0.00;
			V = this.calculateV_J() + J;
			System.out.println("V : " + V);
		}
		else
		{
			CMC14 cmc14 =_params.get_cmc14List().get(0);
			double cmc = Double.valueOf(cmc14.getRmag());
			V = 0.6278 * ((J-K) + 0.9947 * cmc);
			System.out.println("***************************************************************************************************");
			System.out.println("Magnitud estimada mediante CMC14  (Roger Dymock & Richard Miles) :");
			System.out.println("***************************************************************************************************");	
			System.out.println("V : " + V);
		}
		return V;
	}
	
	/**
	 * Valor mag V transformado desde USNOB1
	 * 
	 * 
	 * V = Bj -0,46*(Bj - Rf))      [precisión +-0,3]			
	 * 
	 * 			2005, ApJ, 633, 121			
	 * @return
	 */
	public double calculateVoption6() {
		
		if(_params.get_usnob1List().size()<=0)
		{
			System.out.println("*****************************************************");
			System.out.println("No USNOB1 stars found.");
			System.out.println("*****************************************************");			
			V = 0.00;
			V = this.calculateV_J() + J;
			System.out.println("V : " + V);
		}
		else
		{
			USNOB1 usnob1 = _params.get_usnob1List().get(0);
			if(usnob1.getB2_mag().startsWith("null") && usnob1.getR2_mag().startsWith("null"))
			{
				double usBmag = Double.parseDouble(usnob1.getB2_mag());			
				double usRmag = Double.parseDouble(usnob1.getR2_mag());
				V = usBmag - 0.46 * (usBmag - usRmag);
				System.out.println("******************************************************************************************************************");
				System.out.println("Determinación de magnitud V usando USNO-B1.0 (2005, ApJ, 633, 121) :");
				System.out.println("******************************************************************************************************************");	
				System.out.println("V : " + V);						
			}
			else if ( _params.get_usnob1List().size()>1)
			{
				USNOB1 usnob2 = _params.get_usnob1List().get(1);
				if(usnob1.getB2_mag().startsWith("null") && usnob2.getR2_mag().startsWith("null"))
				{
					double usBmag = Double.parseDouble(usnob2.getB2_mag());			
					double usRmag = Double.parseDouble(usnob2.getR2_mag());
					V = usBmag - 0.46 * (usBmag - usRmag);
					System.out.println("******************************************************************************************************************");
					System.out.println("Determinación de magnitud V usando USNO-B1.0 (2005, ApJ, 633, 121) :");
					System.out.println("******************************************************************************************************************");	
					System.out.println("V : " + V);						
				}
				else
				{

					USNOB1 usnob3 = _params.get_usnob1List().get(1);
					if(usnob1.getB2_mag().startsWith("null") && usnob3.getR2_mag().startsWith("null"))
					{
						double usBmag = Double.parseDouble(usnob3.getB2_mag());			
						double usRmag = Double.parseDouble(usnob3.getR2_mag());
						V = usBmag - 0.46 * (usBmag - usRmag);
						System.out.println("******************************************************************************************************************");
						System.out.println("Determinación de magnitud V usando USNO-B1.0 (2005, ApJ, 633, 121) :");
						System.out.println("******************************************************************************************************************");	
						System.out.println("V : " + V);						
					}
					else
					{
						System.out.println("******************************************************************************************************************");
						System.out.println("Estrellas USNOB1 sin magnitudes B2 ni R2 disponibles, entonces se procede a la");						
						System.out.println("Determinación de la mag V convirtendo JHK to UBVR (promedio de los  métodos Bilir et Al. y B.Warner)");
						System.out.println("******************************************************************************************************************");	
						V = 0.00;
						V = this.calculateV_J() + J;
						System.out.println("V : " + V);	
					}
				}

			}
			else
			{
				System.out.println("******************************************************************************************************************");
				System.out.println("Estrellas USNOB1 sin magnitudes B2 ni R2 disponibles, entonces se procede a la");						
				System.out.println("Determinación de la mag V convirtendo JHK to UBVR (promedio de los  métodos Bilir et Al. y B.Warner)");
				System.out.println("******************************************************************************************************************");	
				V = 0.00;
				V = this.calculateV_J() + J;
				System.out.println("V : " + V);					
			}
			
				
		}
		return V;
	}
	
	
	/**
	 * Valor mag V transformado de UCAC3
	 * @return
	 * 
	 * V = 0,531 *(J-K)+0,9060*mg_f + 0,95    (+-0,08)			
	 *	V = 0,529 *(J-K)+0,9166*mg_a + 0,83    (+-0,08)
	 *			
	 */
	public double calculateVoption7() {
		
		
		double V1 = 0.00;
		double V2 = 0.00;

		double fMag = 0.00;
		double aMag = 0.00;
		
		if (_params.get_ucac3List() != null) 
		{
			ArrayList<UCAC3> estrellasUCAC3 = _params.get_ucac3List();
			if (estrellasUCAC3 != null ) 
			{
				if (estrellasUCAC3.size()>0)
				{
					UCAC3 u = estrellasUCAC3.get(0);
					V1 = Double.valueOf(u.getIm1());
					V2 = Double.valueOf(u.getIm2());
					double temp  =  0.531 *(J-K);
					double temp2  = 0.9060 * V1 + 0.95;
					V1 = temp + temp2;
					temp = 0.529 *(J-K);
					temp2 = 0.9166 * V2 + 0.83;
					V2 = temp + temp2;
					V = (V1 + V2) / 2;
					System.out.println("V caclculated using UCAC3 Hristo Pavlov : " + V);					
				}
				else
				{	
					System.out.println("*****************************************************");
					System.out.println("No UCAC3 fit or aperture mag found.");
					System.out.println("*****************************************************");
					V=calculateV();					
				}
				
			}
			else{
				System.out.println("*****************************************************");
				System.out.println("No UCAC3 fit or aperture mag found.");
				System.out.println("*****************************************************");
				V=calculateV();
			}
		}
		else{
			System.out.println("*****************************************************");
			System.out.println("No UCAC3S star found.");
			System.out.println("*****************************************************");
			V=calculateV();
		}
		return V;
	}

		/**
	 * Ingresar V manualmente
	 * @return
	 */
	public double calculateVoption8() {
		
		if (_params.getManualV()!=null || _params.getManualV().equals(""))
		{
			V = Double.valueOf(_params.getManualV());
			V = this.calculateV_J() + J;
			System.out.println("V : " + V);	
			System.out.println("*****************************************************");
			System.out.println("Magnitud V ingresada MANUALMENTE : " + V);
			System.out.println("*****************************************************");
		}
		else
		{
			V=0.0;
			System.out.println("*****************************************************");
			System.out.println("Magnitud V ingresada MANUALMENTE : " + V);
			System.out.println("*****************************************************");
		}

		return V;
	}

	

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TWOMASSStar sp = new TWOMASSStar(12.00, 12.00, 10.50, 34.00,-0.789,-0.0929, 2, null);
		// M = m - 5 log(d/10)
		// d = 10 (m - M + 5)/5
		sp.setLonghexaCoords("21245216-5731334");
		double M = -0.60;
		double m = 1.63;
		double d = Math.pow(10.00, (m - M + 5) / 5);
		d = Math.round(d);
		
/*        MovimientoPropioReducido frame;
        try {
	        frame = new MovimientoPropioReducido("Movimiento Propio Reducido",
	        	sp.getB_V(),sp.getReducedPM() ,sp.getB_V(),sp.getReducedPM(), "a","b");
	        frame.pack();
	        frame.setResizable(false);
	        frame.resize(500, 450);
	        RefineryUtilities.centerFrameOnScreen(frame);
	        frame.setVisible(true);
        } catch (MalformedURLException e) {

	        e.printStackTrace();
        } catch (IOException e) {

	        e.printStackTrace();
        }*/
		System.out.println("Modulo de Distancia: " + d + "  parsecs.");
		System.out.println("Distance = " + sp.distanceInParsecs(m, M));

	}

	public double distanceInParsecs(double m, double M) {
		// M = m - 5 log(d/10)
		// d = 10 elevado a la ((m - M + 5)/5)
		double d = Math.pow(10.00, (m - M + 5) / 5);
		System.out.println("Modulo de Distancia: " + d + "  parsecs.");
		//d = Math.round(d);
		d= Math.rint(d*100)/100;
		System.out.println("Modulo de Distancia: " + d + "  parsecs.");
		return d;
	}
	
	public double distanceCorrectedByGalacticExtinction(double colorExcess) {
		// M = m - 5 log(d/10)
		// d = 10 (m - M + 5)/5
		Av= 3.2 * colorExcess;
		
		double d = Math.pow(10.00, (0.2 * (this.V - this.M + 5-Av)));
		d= Math.rint(d*100)/100;
		System.out.println("Distancia Corregida: " + d + "  parsecs.");
		//d = Math.round(d);
		return d;
	}

	/**
	 * @return the v
	 */
	public synchronized double getV() {
		return V;
	}

	/**
	 * @return the j
	 */
	public synchronized double getJ() {
		return J;
	}

	/**
	 * @return the h
	 */
	public synchronized double getH() {
		return H;
	}

	/**
	 * @return the k
	 */
	public synchronized double getK() {
		return K;
	}

	/**
	 * @return the b_V
	 */
	public synchronized double getB_V() {
		return B_V;
	}

	/**
	 * @return the v_I
	 */
	public synchronized double getV_I() {
		return V_I;
	}

	/**
	 * @return the m
	 */
	public synchronized double getM() {
		return M;
	}

	/**
	 * @return the bolCorrection
	 */
	public synchronized double getBolCorrection() {
		return bolCorrection;
	}

	/**
	 * @return the dModulus
	 */
	public synchronized double getdModulus() {
		return dModulus;
	}

	/**
	 * @param v
	 *            the v to set
	 */
	public synchronized void setV(double v) {
		V = v;
	}

	/**
	 * @param j
	 *            the j to set
	 */
	public synchronized void setJ(double j) {
		J = j;
	}

	/**
	 * @param h
	 *            the h to set
	 */
	public synchronized void setH(double h) {
		H = h;
	}

	/**
	 * @param k
	 *            the k to set
	 */
	public synchronized void setK(double k) {
		K = k;
	}

	/**
	 * @param b_V
	 *            the b_V to set
	 */
	public synchronized void setB_V(double b_V) {
		B_V = b_V;
	}

	/**
	 * @param v_I
	 *            the v_I to set
	 */
	public synchronized void setV_I(double v_I) {
		V_I = v_I;
	}

	/**
	 * @return the v_J
	 */
	public synchronized double getV_J() {
		return V_J;
	}

	/**
	 * @param v_J
	 *            the v_J to set
	 */
	public synchronized void setV_J(double v_J) {
		V_J = v_J;
	}

	/**
	 * @param m
	 *            the m to set
	 */
	public synchronized void setM(double m) {
		M = m;
	}

	/**
	 * @param bolCorrection
	 *            the bolCorrection to set
	 */
	public synchronized void setBolCorrection(double bolCorrection) {
		this.bolCorrection = bolCorrection;
	}

	/**
	 * @param dModulus
	 *            the dModulus to set
	 */
	public synchronized void setdModulus(double dModulus) {
		this.dModulus = dModulus;
	}

	/**
	 * @return the galacticLatitude
	 */
	public synchronized double getGalacticLatitude() {
		return galacticLatitude;
	}

	/**
	 * @param galacticLatitude the galacticLatitude to set
	 */
	public synchronized void setGalacticLatitude(double galacticLatitude) {
		this.galacticLatitude = galacticLatitude;
	}

	/**
     * @return the spectralType
     */
    public synchronized String getSpectralType() {
    	return spectralType;
    }

	/**
     * @return the pmRA
     */
    public synchronized double getPmRA() {
    	return pmRA;
    }

	/**
     * @return the pmDEC
     */
    public synchronized double getPmDEC() {
    	return pmDEC;
    }

	/**
     * @return the totalPM
     */
    public synchronized double getTotalPM() {
    	return totalPM;
    }

	/**
     * @return the reducedPM
     */
    public synchronized double getReducedPM() {
    	return reducedPM;
    }

	/**
     * @param spectralType the spectralType to set
     */
    public synchronized void setSpectralType(String spectralType) {
    	this.spectralType = spectralType;
    }

	/**
     * @param pmRA the pmRA to set
     */
    public synchronized void setPmRA(double pmRA) {
    	this.pmRA = pmRA;
    }

	/**
     * @param pmDEC the pmDEC to set
     */
    public synchronized void setPmDEC(double pmDEC) {
    	this.pmDEC = pmDEC;
    }

	/**
     * @param totalPM the totalPM to set
     */
    public synchronized void setTotalPM(double totalPM) {
    	this.totalPM = totalPM;
    }

	/**
     * @param reducedPM the reducedPM to set
     */
    public synchronized void setReducedPM(double reducedPM) {
    	this.reducedPM = reducedPM;
    }
    
	/**
     * @return the longhexaCoords
     */
    public synchronized String getLonghexaCoords() {
    	return longhexaCoords;
    }
    

	/**
     * @param longhexaCoords the longhexaCoords to set
     */
    public synchronized void setLonghexaCoords(String c) {
    	
    	String ra_h = c.substring(0, 2);
    	String ra_m = c.substring(2, 4);
    	String ra_s = c.substring(4, 6);
    	String ra_s_decim = c.substring(6,8);
    	String signo = c.substring(8,9);
    	String dec_d = c.substring(9,11);
    	String dec_m = c.substring(11,13);
    	String dec_s = c.substring(13,15);
    	String dec_s_decim = c.substring(15);
    	
    	String temp ="";
    	if (signo.trim().equals("-"))
    	{
        	temp = 
        		ra_h.trim() + "h+" +
        		ra_m.trim() + "m+" +
        		ra_s.trim() + "."  +
        		ra_s_decim.trim() + "s+" +
        		signo.trim() +
        		dec_d.trim() + "d+" +
        		dec_m.trim() + "m+" +
        		dec_s.trim() + "." +
        		dec_s_decim.trim()+ "s";    		
    	}
    	else
    	{
        	temp = 
        		ra_h.trim() + "h+" +
        		ra_m.trim() + "m+" +
        		ra_s.trim() + "."  +
        		ra_s_decim.trim() + "s+" +
        		signo.trim() +
        		dec_d.trim() + "d+" +
        		dec_m.trim() + "m+" +
        		dec_s.trim() + "." +
        		dec_s_decim.trim()+ "s";    		
    	}

    	this.longhexaCoords = temp;
    }

	/**
     * @return the temperature
     */
    public synchronized final double getTemperature() {
    	return temperature;
    }

	/**
     * @param temperature the temperature to set
     */
    public synchronized final void setTemperature(double temperature) {
    	this.temperature = temperature;
    }

	/**
     * @return the solarMasses
     */
    public synchronized final double getSolarMasses() {
    	return solarMasses;
    }

	/**
     * @return the radius
     */
    public synchronized final double getRadius() {
    	return radius;
    }

	/**
     * @return the bolometricAbsoluteMagnitud
     */
    public synchronized final double getBolometricAbsoluteMagnitud() {
    	return bolometricAbsoluteMagnitud;
    }

	/**
     * @param solarMasses the solarMasses to set
     */
    public synchronized final void setSolarMasses(double solarMasses) {
    	this.solarMasses = solarMasses;
    }

	/**
     * @param radius the radius to set
     */
    public synchronized final void setRadius(double radius) {
    	this.radius = radius;
    }

	/**
     * @param bolometricAbsoluteMagnitud the bolometricAbsoluteMagnitud to set
     */
    public synchronized final void setBolometricAbsoluteMagnitud(double bolometricAbsoluteMagnitud) {
    	this.bolometricAbsoluteMagnitud = bolometricAbsoluteMagnitud;
    }

	/* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	
    	System.out.println(String.format("TWOMASSStar [V=%s, J=%s, H=%s, K=%s, B_V=%s, V_I=%s, V_J=%s, M=%s, galacticLatitude=%s, bolCorrection=%s, dModulus=%s, mainSequence=%s, spectralType=%s, pmRA=%s, pmDEC=%s, totalPM=%s, reducedPM=%s, longhexaCoords=%s, temperature=%s, solarMasses=%s, radius=%s, bolometricAbsoluteMagnitud=%s, _Voption=%s, _params=%s, Av=%s]", V, J, H, K, B_V, V_I, V_J, M, galacticLatitude, bolCorrection, dModulus, mainSequence, spectralType, pmRA, pmDEC, totalPM, reducedPM, longhexaCoords, temperature, solarMasses, radius, bolometricAbsoluteMagnitud, _Voption, _params, Av));
//		return String.format("TWOMASSStar [V=%s, J=%s, H=%s, K=%s, B_V=%s, V_I=%s, V_J=%s, M=%s, galacticLatitude=%s, bolCorrection=%s, dModulus=%s, mainSequence=%s, spectralType=%s, pmRA=%s, pmDEC=%s, totalPM=%s, reducedPM=%s, longhexaCoords=%s, temperature=%s, solarMasses=%s, radius=%s, bolometricAbsoluteMagnitud=%s, _Voption=%s, _params=%s, Av=%s]", V, J, H, K, B_V, V_I, V_J, M, galacticLatitude, bolCorrection, dModulus, mainSequence, spectralType, pmRA, pmDEC, totalPM, reducedPM, longhexaCoords, temperature, solarMasses, radius, bolometricAbsoluteMagnitud, _Voption, _params, Av);
    	return String.format("Star: \n[V=%s, \nJ=%s, \nH=%s, \nK=%s, \nB_V=%s, \nV_I=%s, \nV_J=%s, \nM=%s, \ngalacticLatitude=%s, \nbolCorrection=%s, \ndModulus=%s,\nspectralType=%s, \npmRA=%s, \npmDEC=%s, \ntotalPM=%s, \nreducedPM=%s, \nlonghexaCoords=%s, \ntemperature=%s, \nsolarMasses=%s, \nradius=%s,\nbolometricAbsoluteMagnitud=%s, _Voption=%s, \nAv=%s]", V, J, H, K, B_V, V_I, V_J, M, galacticLatitude, bolCorrection, dModulus,
    		 mainSequence, spectralType, pmRA, pmDEC, totalPM, reducedPM, longhexaCoords, temperature, solarMasses, radius, bolometricAbsoluteMagnitud, _Voption,
    		 _params, Av);
    }

}
