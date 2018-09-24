package org.gedraa;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import javax.swing.JPanel;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.StandardXYSeriesLabelGenerator;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RectangleInsets;
import org.jfree.ui.RefineryUtilities;

/**
 * Showing a line chart drawn using spline curves. 
 */
public class Fluxes extends ApplicationFrame {
	
	private  static String _title ="";
	private static String _tipo ="";
	private static String _wavelength="";
	private static String _colorindex="";
	private static String _teorico="";
	private static String _fotometria="";

    /**
     * Creates a new instance..
     *
     * @param title  the frame title.
     */
    public Fluxes(String title, String tipo,
    	TWOMASSStar star, String wave, String color,
    	String teorico, String fotometria) {
        super(title);
        _title = title;
        _tipo = tipo;
        _wavelength = wave;
        _colorindex= color;
        _teorico = teorico;
        _fotometria = fotometria;
        
        double[] flujos =  getFlujos(tipo);        
        JPanel content = createPanel(flujos, star);
        content.setPreferredSize(new java.awt.Dimension(500, 800));
        getContentPane().add(content);
        this.pack();
        RefineryUtilities.centerFrameOnScreen(this);
        this.setVisible(true);
    }

    /**
     * Creates a panel.
     *
     * @return A panel.
     */
    public static JPanel createPanel(double[] flujos, TWOMASSStar star ) {
    	
    	JPanel panel = new JPanel();
    	panel.setLayout(new BorderLayout());

        // create plot...
        NumberAxis xAxis = new NumberAxis(_wavelength);
        xAxis.setAutoRangeIncludesZero(false);
        NumberAxis yAxis = new NumberAxis("Flux  (Jy = 10^-23 erg*sec-1*cm^2*Hz^-1)");
        yAxis.setLabelAngle(0);
        yAxis.setLabelFont((new java.awt.Font("Arial",  java.awt.Font.PLAIN, 8)));
        yAxis.setAutoRangeIncludesZero(false);
        yAxis.setRange(0.00, 0.08);

        XYSplineRenderer renderer1 = new XYSplineRenderer();
        renderer1.setLegendItemToolTipGenerator(
            new StandardXYSeriesLabelGenerator("Legend {0}"));
        XYPlot plot = new XYPlot(createData(flujos, star), xAxis, yAxis, renderer1);
        plot.setBackgroundPaint(Color.lightGray);
        plot.setDomainGridlinePaint(Color.white);
        plot.setRangeGridlinePaint(Color.white);
        plot.setAxisOffset(new RectangleInsets(4, 4, 4, 4));

        // create and return the chart panel...
        JFreeChart chart = new JFreeChart(_title,
        	(new java.awt.Font("Arial",  java.awt.Font.BOLD, 8)), plot, true);
        chart.setAntiAlias(true);
        ChartUtilities.applyCurrentTheme(chart);
        ChartPanel chartPanel = new ChartPanel(chart);
        
        try {
	        ChartUtilities.saveChartAsJPEG(new File("FlujosEstelares.jpg"), chart, 300, 300);
        } catch (IOException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
        }
        
        // create plot...
        NumberAxis xAxis2 = new NumberAxis(_wavelength);
        xAxis2.setAutoRangeIncludesZero(false);
        NumberAxis yAxis2 = new NumberAxis(_colorindex);
        yAxis2.setLabelAngle(0);
        yAxis2.setAutoRangeIncludesZero(true);
        yAxis2.setRange(-0.20, 6.0);

        XYSplineRenderer renderer2 = new XYSplineRenderer();
        renderer2.setLegendItemToolTipGenerator(
            new StandardXYSeriesLabelGenerator("Legend {0}"));
        XYPlot plot2 = new XYPlot(createData2(flujos, star), xAxis2, yAxis2, renderer2);
        plot2.setBackgroundPaint(Color.lightGray);
        plot2.setDomainGridlinePaint(Color.white);
        plot2.setRangeGridlinePaint(Color.white);
        plot2.setAxisOffset(new RectangleInsets(4, 4, 4, 4));

        // create and return the chart panel...
        JFreeChart chart2 = new JFreeChart("",
        	(new java.awt.Font("Arial",  java.awt.Font.BOLD, 8)), plot2, true);
        chart2.setAntiAlias(true);
        ChartUtilities.applyCurrentTheme(chart2);
        ChartPanel chartPanel2 = new ChartPanel(chart2);
        
        try {
	        ChartUtilities.saveChartAsJPEG(new File("curva.jpg"), chart2, 300, 300);
        } catch (IOException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
        }
        chartPanel.setSize(300,500);
        chartPanel2.setSize(300,500);
        
        panel.add(chartPanel, BorderLayout.NORTH);
        panel.add(chartPanel2, BorderLayout.SOUTH);
        
        return panel;
    }

    /**
     * Creates and returns a dataset Flujos estelares.  .
     *
     * @return a dataset.
     */
    private static XYDataset createData(double[] flujos, TWOMASSStar star) {
        XYSeries teorico = new XYSeries(_teorico);
        
        
        teorico.add(440, flujos[0]);
        teorico.add(550, flujos[1]);
        teorico.add(790, flujos[2]);
        teorico.add(1260, flujos[3]);
        teorico.add(1600, flujos[4]);
        teorico.add(2220, flujos[5]);


        XYSeriesCollection result = new XYSeriesCollection(teorico);
        XYSeries datos = new XYSeries(_fotometria);
        datos.add(440, B_flux(star.getV() + star.getB_V()));
        datos.add(550, V_flux(star.getV()));
        datos.add(790, I_flux(star.getV() - star.getV_I()));
        datos.add(1260, J_flux(star.getJ()));
        datos.add(1600, H_flux(star.getH()));
        datos.add(2220, K_flux(star.getK()));
        result.addSeries(datos);
        return result;
    }
    
    /**
     * Creates and returns a dataset curvas.  .
     *
     * @return a dataset.
     */
    private static XYDataset createData2(double[] flujos, TWOMASSStar star) {
        XYSeries teorico = new XYSeries(_teorico);
        
        
        teorico.add(440, flujos[6]);
        teorico.add(550, flujos[7]);
        teorico.add(790, flujos[8]);
        teorico.add(1260, flujos[9]);
        teorico.add(1600, flujos[10]);

   	//  B-V,  	V-I,	 V-K,	J-H,	  H-K

        XYSeriesCollection result = new XYSeriesCollection(teorico);
        XYSeries datos = new XYSeries(_fotometria);
        datos.add(440, star.getB_V());
        datos.add(550, star.getV_I());
        datos.add(790, star.getV() - star.getK());
        datos.add(1260, star.getJ() - star.getH());
        datos.add(1600, star.getH() - star.getK());

        result.addSeries(datos);
        return result;
    }

/*    *//**
     * The starting point.
     *
     * @param args  ignored.
     *//*
    public static void main(String args[]) {
    	
    	
    	Fluxes appFrame = new Fluxes("Primaria", "G0V", 
    		new TWOMASSStar(12,12,12,13,13,13));
        appFrame.pack();
        RefineryUtilities.centerFrameOnScreen(appFrame);
        appFrame.setVisible(true);
    }*/
    
    
/*    			Wavelength		  Jansky flux Constants
			B	4400			4260
			V	5500			3640
			I	7900			2550
			J	12600			1600
			H	16000			1080
			K	22200			670
			
			=(Constante_Flujo_Jansky*POWER(10,(-magnitud/2.5)))
			
			*/
    
    public static double B_flux(double mag)
    {
    	double flux= 0.0;
    	flux = B_Jansky * Math.pow(10, -mag/2.5);
    	return flux;
    }
    
    public static double V_flux(double mag)
    {
    	double flux= 0.0;
    	flux = B_Jansky * Math.pow(10, -mag/2.5);
    	return flux;
    }
    public static double I_flux(double mag)
    {
    	double flux= 0.0;
    	flux = B_Jansky * Math.pow(10,-mag/2.5);
    	return flux;
    }
    public static double J_flux(double mag)
    {
    	double flux= 0.0;
    	flux = B_Jansky * Math.pow(10, -mag/2.5);
    	return flux;
    }
    public static double H_flux(double mag)
    {
    	double flux= 0.0;
    	flux = B_Jansky * Math.pow(10, -mag/2.5);
    	return flux;
    }

    public static double K_flux(double mag)
    {
    	double flux= 0.0;
    	flux = B_Jansky * Math.pow(10, -mag/2.5);
    	return flux;
    }
    
    private double[] getFlujos(String tipo)
    {
    	double[] flujos = null;
    	if(tipo.equals("B8V"))
    	{
    	  flujos = 	B8V;
    	}
    	if(tipo.equals("B9V"))
    	{
    	  flujos = 	B9V;
    	}    	

    	if(tipo.equals("A0V"))
    	{
    	  flujos = A0V	;
    	}    	

    	if(tipo.equals("A1V"))
    	{
    	  flujos = A1V	;
    	} 

    	if(tipo.equals("AV"))
    	{
    	  flujos = A2V	;
    	} 

    	if(tipo.equals("A3V"))
    	{
    	  flujos = A3V;
    	} 

    	if(tipo.equals("A4V"))
    	{
    	  flujos = A4V;
    	} 

    	if(tipo.equals("A5V"))
    	{
    	  flujos = A5V	;
    	} 

    	if(tipo.equals("A6V"))
    	{
    	  flujos = A6V	;
    	} 
    	

    	if(tipo.equals("A7V"))
    	{
    	  flujos = A7V	;
    	} 

    	if(tipo.equals("A8V"))
    	{
    	  flujos = A8V	;
    	} 

    	if(tipo.equals("A9V"))
    	{
    	  flujos = A9V	;
    	} 
    	
    	if(tipo.equals("F0V"))
    	{
    	  flujos = F0V	;
    	} 

    	if(tipo.equals("F1V"))
    	{
    	  flujos = 	F1V;
    	} 

    	if(tipo.equals("F2V"))
    	{
    	  flujos = F2V	;
    	} 

    	if(tipo.equals("F3V"))
    	{
    	  flujos = 	F3V;
    	} 

    	if(tipo.equals("F4V"))
    	{
    	  flujos = F4V	;
    	} 

    	if(tipo.equals("F5V"))
    	{
    	  flujos = F5V	;
    	} 

    	if(tipo.equals("F6V"))
    	{
    	  flujos = F6V	;
    	} 
    	

    	if(tipo.equals("F7V"))
    	{
    	  flujos = F7V	;
    	} 

    	if(tipo.equals("F8V"))
    	{
    	  flujos = F8V	;
    	} 

    	if(tipo.equals("F9V"))
    	{
    	  flujos = F9V	;
    	} 

    	if(tipo.equals("G0V"))
    	{
    	  flujos = G0V	;
    	} 

    	if(tipo.equals("G1V"))
    	{
    	  flujos = G1V	;
    	} 

    	if(tipo.equals("G2V"))
    	{
    	  flujos = G2V	;
    	} 

    	if(tipo.equals("G3V"))
    	{
    	  flujos = G3V	;
    	} 

    	if(tipo.equals("G4V"))
    	{
    	  flujos = G4V	;
    	} 

    	if(tipo.equals("G5V"))
    	{
    	  flujos = 	G5V;
    	} 

    	if(tipo.equals("G6V"))
    	{
    	  flujos = 	G6V;
    	} 

    	if(tipo.equals("G7V"))
    	{
    	  flujos = 	G7V;
    	} 

    	if(tipo.equals("G8V"))
    	{
    	  flujos = G8V	;
    	} 

    	if(tipo.equals("G9V"))
    	{
    	  flujos =  G9V	;
    	} 

    	if(tipo.equals("K0V"))
    	{
    	  flujos = K0V	;
    	} 

    	if(tipo.equals("K1V"))
    	{
    	  flujos = K1V	;
    	} 

    	if(tipo.equals("K2V"))
    	{
    	  flujos = 	K2V;
    	} 

    	if(tipo.equals("K3V"))
    	{
    	  flujos = 	K3V;
    	} 

    	if(tipo.equals("K4V"))
    	{
    	  flujos = K4V	;
    	} 

    	if(tipo.equals("K5V"))
    	{
    	  flujos = 	K5V;
    	} 

    	if(tipo.equals("K6V"))
    	{
    	  flujos = K6V	;
    	} 

    	if(tipo.equals("K7V"))
    	{
    	  flujos = K7V	;
    	} 

    	if(tipo.equals("K8V"))
    	{
    	  flujos = K8V	;
    	} 

    	if(tipo.equals("K9V"))
    	{
    	  flujos = 	K9V;
    	} 

    	if(tipo.equals("M0V"))
    	{
    	  flujos = 	M0V;
    	} 

    	if(tipo.equals("M0.5V"))
    	{
    	  flujos = M0_5V	;
    	} 

    	if(tipo.equals("M1V"))
    	{
    	  flujos = M1V	;
    	} 
    	

    	if(tipo.equals("M1.5V"))
    	{
    	  flujos = M1_5V	;
    	} 
    	

    	if(tipo.equals("M2V"))
    	{
    	  flujos = 	M2V;
    	} 
    	

    	if(tipo.equals("M2.5V"))
    	{
    	  flujos = M2_5V	;
    	} 
    	

    	if(tipo.equals("M3V"))
    	{
    	  flujos = M3V 	;
    	} 
    	

    	if(tipo.equals("M3.5V"))
    	{
    	  flujos = M3_5V;
    	} 
    	

    	if(tipo.equals("M4V"))
    	{
    	  flujos = 	M4V;
    	} 
    	

    	if(tipo.equals("M4.5V"))
    	{
    	  flujos = 	M4_5V;
    	} 
    	

    	if(tipo.equals("M5V"))
    	{
    	  flujos = M5V	;
    	} 
    	

    	if(tipo.equals("M5.5V"))
    	{
    	  flujos = M5_5V	;
    	} 
    	

    	if(tipo.equals("M6V"))
    	{
    	  flujos = M6V	;
    	} 

    	if(tipo.equals("B8III"))
    	{
    	  flujos = B8III	;
    	} 
    	if(tipo.equals("B9III"))
    	{
    	  flujos = B9III	;
    	} 
    	if(tipo.equals("A0III"))
    	{
    	  flujos = A0III	;
    	} 
    	if(tipo.equals("A1III"))
    	{
    	  flujos = A1III	;
    	} 
    	if(tipo.equals("A2III"))
    	{
    	  flujos = A2III	;
    	} 
    	if(tipo.equals("A3III"))
    	{
    	  flujos = A3III	;
    	} 
    	if(tipo.equals("A4III"))
    	{
    	  flujos = A4III	;
    	} 
    	if(tipo.equals("A5III"))
    	{
    	  flujos = A5III	;
    	} 
    	if(tipo.equals("A6III"))
    	{
    	  flujos = A6III	;
    	} 
    	if(tipo.equals("A7III"))
    	{
    	  flujos = A7III	;
    	} 
    	if(tipo.equals("A8III"))
    	{
    	  flujos = A8III	;
    	} 
    	if(tipo.equals("A9III"))
    	{
    	  flujos = A9III	;
    	} 
    	if(tipo.equals("F0III"))
    	{
    	  flujos = F0III	;
    	} 
    	if(tipo.equals("F1III"))
    	{
    	  flujos = F1III	;
    	} 
    	if(tipo.equals("F2III"))
    	{
    	  flujos = F2III	;
    	} 
    	if(tipo.equals("F3III"))
    	{
    	  flujos = F3III	;
    	} 
    	if(tipo.equals("F4III"))
    	{
    	  flujos = F4III	;
    	} 
    	if(tipo.equals("F5III"))
    	{
    	  flujos = F5III	;
    	} 
    	if(tipo.equals("F6III"))
    	{
    	  flujos = F6III	;
    	} 
    	if(tipo.equals("F7III"))
    	{
    	  flujos = F7III	;
    	} 
    	if(tipo.equals("F8III"))
    	{
    	  flujos = F8III	;
    	} 
    	if(tipo.equals("F9III"))
    	{
    	  flujos = F9III	;
    	} 
    	if(tipo.equals("G0III"))
    	{
    	  flujos = G0III	;
    	} 
    	if(tipo.equals("G1III"))
    	{
    	  flujos = G1III	;
    	} 
    	if(tipo.equals("G2III"))
    	{
    	  flujos = G2III	;
    	} 
    	if(tipo.equals("G3III"))
    	{
    	  flujos = G3III	;
    	} 
    	if(tipo.equals("G4III"))
    	{
    	  flujos = G4III	;
    	} 
    	if(tipo.equals("G5III"))
    	{
    	  flujos = G5III	;
    	} 
    	if(tipo.equals("G6III"))
    	{
    	  flujos = G6III	;
    	} 
    	if(tipo.equals("G7III"))
    	{
    	  flujos = G7III	;
    	} 
    	if(tipo.equals("G8III"))
    	{
    	  flujos = G8III	;
    	} 
    	if(tipo.equals("G9III"))
    	{
    	  flujos = G9III	;
    	} 
    	if(tipo.equals("K0III"))
    	{
    	  flujos = K0III	;
    	} 
    	if(tipo.equals("K1III"))
    	{
    	  flujos = K1III	;
    	} 
    	if(tipo.equals("K2III"))
    	{
    	  flujos = K2III	;
    	} 
    	if(tipo.equals("K3III"))
    	{
    	  flujos = K3III	;
    	} 
    	if(tipo.equals("K4III"))
    	{
    	  flujos = K4III	;
    	} 
    	if(tipo.equals("K5III"))
    	{
    	  flujos = K5III	;
    	} 
    	if(tipo.equals("K6III"))
    	{
    	  flujos = K6III	;
    	} 
    	if(tipo.equals("K7III"))
    	{
    	  flujos = K7III	;
    	} 
    	if(tipo.equals("K8III"))
    	{
    	  flujos = K8III	;
    	} 
    	if(tipo.equals("K9III"))
    	{
    	  flujos = K9III	;
    	} 
    	if(tipo.equals("M0III"))
    	{
    	  flujos = M0III	;
    	} 
    	if(tipo.equals("M1III"))
    	{
    	  flujos = M1III	;
    	} 
    	if(tipo.equals("M2III"))
    	{
    	  flujos = M2III	;
    	} 
    	if(tipo.equals("M3III"))
    	{
    	  flujos = M3III	;
    	} 
    	if(tipo.equals("M4III"))
    	{
    	  flujos = M4III	;
    	} 
    	if(tipo.equals("M5III"))
    	{
    	  flujos = M5III	;
    	} 
    	if(tipo.equals("M6III"))
    	{
    	  flujos = M6III	;
    	} 

    	
    return flujos;
    }
    
	@Override
    public void windowClosing(final WindowEvent evt) {
		if (evt.getWindow() == this) {
			dispose();

		}
	}   
    
    private static double B_Jansky = 4260;
    private static double V_Jansky = 3640;
    private static double I_Jansky = 2550;
    private static double J_Jansky = 1600;
    private static double H_Jansky = 1080;
    private static double K_Jansky = 670;


	// Secuencia ENANAS.
	//					Espectro,	   B,		   V,		     I,		    J,	       H,	    	K,      B-V,  	V-I,	 V-K,	J-H,	  H-K

    private static double[] B8V = {0.244235955,0.192088508,0.117203392,0.066148497,0.042640644,0.025613847,-0.09,-0.15,-0.35,-0.05,-0.035};
    private static double[] B9V = {0.202213245,0.163493836,0.106890764,0.063638507,0.041978195,0.025613847,-0.06,-0.075,-0.175,-0.025,-0.018};
    private static double[] A0V = {0.162858188,0.139155823,0.097485535,0.061167395,0.041287991,0.025613847,0,0,0,0,0};
    private static double[] A1V = {0.148528433,0.130467213,0.093959388,0.060467217,0.041193032,0.025613847,0.03,0.03,0.07,0.01,0.003};
    private static double[] A2V = {0.135459541,0.122321102,0.090560785,0.059775055,0.04109829,0.025613847,0.06,0.06,0.14,0.02,0.005};
    private static double[] A3V = {0.122784327,0.113632192,0.089730519,0.058864481,0.040972307,0.025613847,0.09,0.13,0.22,0.03,0.008};
    private static double[] A4V = {0.111295157,0.105560487,0.088907865,0.057967777,0.040846711,0.025613847,0.11,0.20,0.30,0.05,0.012};
    private static double[] A5V = {0.100881051,0.098062144,0.088092753,0.057084734,0.040721499,0.025613847,0.14,0.27,0.38,0.06,0.015};
    private static double[] A6V = {0.093284524,0.092790045,0.084516242,0.05604282,0.040534401,0.025613847,0.17,0.29,0.44,0.08,0.02};
    private static double[] A7V = {0.086260029,0.087801388,0.081084936,0.055019924,0.040348162,0.025613847,0.19,0.3,0.50,0.09,0.025};
    private static double[] A8V = {0.078188509,0.082572364,0.076961498,0.054265022,0.040286273,0.025613847,0.23,0.31,0.57,0.10,0.027};
    private static double[] A9V = {0.070872257,0.077654754,0.073047751,0.053520478,0.040224478,0.025613847,0.27,0.32,0.63,0.12,0.028};
    private static double[] F0V = {0.064240602,0.073030014,0.06933303,0.052786149,0.040162779,0.025613847,0.31,0.33,0.7,0.13,0.030};
    private static double[] F1V = {0.059403167,0.069103713,0.067754818,0.051822694,0.040070407,0.025613847,0.335,0.365,0.76,0.1475,0.0325};
    private static double[] F2V = {0.05493,0.065388501,0.06621253,0.050876823,0.039978248,0.025613847,0.36,0.4,0.82,0.165,0.035};
    private static double[] F3V = {0.049333614,0.060002321,0.063232475,0.049795105,0.039916926,0.025613847,0.38,0.44,0.91,0.19,0.037};
    private static double[] F4V = {0.0443074,0.055059811,0.060386545,0.048736385,0.039855698,0.025613847,0.41,0.49,1.01,0.21,0.038};
    private static double[] F5V = {0.039793267,0.050524425,0.057668703,0.047700176,0.039794564,0.025613847,0.43,0.53,1.10,0.23,0.040};
    private static double[] F6V = {0.034818463,0.04565637,0.054317551,0.046400214,0.039703039,0.025613847,0.47,0.58,1.21,0.26,0.043};
    private static double[] F7V = {0.03046559,0.041257355,0.051161136,0.045135679,0.039611725,0.025613847,0.50,0.62,1.32,0.29,0.045};
    private static double[] F8V = {0.02856338,0.040132978,0.05022734,0.0449283,0.039721328,0.025613847,0.54,0.63,1.35,0.29,0.042};
    private static double[] F9V = {0.027152486,0.039039243,0.049538195,0.044516395,0.039575258,0.025613847,0.57,0.65,1.38,0.30,0.046};
    private static double[] G0V = {0.025811283,0.037975315,0.048858506,0.044108266,0.039429726,0.025613847,0.59,0.66,1.41,0.31,0.050};
    private static double[] G1V = {0.024763362,0.037110891,0.048188142,0.0437643,0.039393426,0.025613847,0.61,0.67,1.44,0.31,0.051};
    private static double[] G2V = {0.023757985,0.036266144,0.047526976,0.043423016,0.03935716,0.025613847,0.63,0.68,1.46,0.32,0.052};
    private static double[] G3V = {0.022793426,0.035115704,0.046659511,0.043163831,0.039302824,0.025613847,0.64,0.70,1.50,0.33,0.054};
    private static double[] G4V = {0.021868027,0.034001759,0.045807879,0.042906193,0.039248563,0.025613847,0.65,0.71,1.53,0.33,0.055};
    private static double[] G5V = {0.02069234,0.032471428,0.044559487,0.042006837,0.039140264,0.025613847,0.66,0.73,1.58,0.35,0.058};
    private static double[] G6V = {0.019046255,0.030725672,0.042947727,0.041164229,0.039068232,0.025613847,0.69,0.75,1.64,0.37,0.060};
    private static double[] G7V = {0.017290581,0.028543116,0.041204076,0.040264284,0.038924564,0.025613847,0.72,0.79,1.72,0.39,0.064};
    private static double[] G8V = {0.015696745,0.026515595,0.039531217,0.039384014,0.038781424,0.025613847,0.74,0.82,1.80,0.41,0.068};
    private static double[] G9V = {0.014054312,0.024632097,0.037752019,0.038540734,0.038656609,0.025613847,0.78,0.85,1.88,0.43,0.072};
    private static double[] K0V = {0.012583736,0.02288239,0.036052898,0.03771551,0.038532196,0.025613847,0.82,0.88,1.96,0.45,0.075};
    private static double[] K1V = {0.010661286,0.02030025,0.03349193,0.036603278,0.038266942,0.025613847,0.87,0.93,2.09,0.48,0.083};
    private static double[] K2V = {0.009032534,0.018009489,0.031112878,0.035523846,0.038003514,0.025613847,0.92,0.98,2.22,0.50,0.090};
    private static double[] K3V = {0.006979264,0.014910815,0.027857374,0.034003215,0.0377419,0.025613847,1.00,1.07,2.43,0.54,0.098};
    private static double[] K4V = {0.005392741,0.012345292,0.024942511,0.032547676,0.037482086,0.025613847,1.07,1.15,2.63,0.58,0.105};
    private static double[] K5V = {0.004090813,0.010080948,0.021724019,0.031515194,0.037309872,0.025613847,1.15,1.22,2.85,0.61,0.11};
    private static double[] K6V = {0.00330986,0.008739798,0.02093824,0.030515464,0.036967813,0.025613847,1.23,1.34,3.01,0.64,0.12};
    private static double[] K7V = {0.002677994,0.007577071,0.020180884,0.029547448,0.03662889,0.025613847,1.30,1.45,3.16,0.66,0.13};
    private static double[] K8V = {0.002227458,0.006518806,0.019331854,0.028919225,0.036237405,0.025613847,1.34,1.57,3.32,0.67,0.14};
    private static double[] K9V = {0.001852719,0.005608345,0.018518544,0.028304358,0.035850104,0.025613847,1.37,1.68,3.49,0.68,0.15};
    private static double[] M0V = {0.001541025,0.004825045,0.017739451,0.027702565,0.035466943,0.025613847,1.41,1.80,3.65,0.70,0.17};
    private static double[] M0_5V = {0.001348372,0.00436015,0.017256002,0.027448586,0.034899866,0.025613847,1.45,1.88,3.76,0.69,0.18};
    private static double[] M1V = {0.001179803,0.003940047,0.016785728,0.027196936,0.034341855,0.025613847,1.48,1.96,3.87,0.68,0.20};
    private static double[] M1_5V = {0.001037074,0.003527779,0.01632827,0.027259632,0.034184069,0.025613847,1.50,2.05,3.99,0.67,0.21};
    private static double[] M2V = {0.000911611,0.003158649,0.01588328,0.027322472,0.034027007,0.025613847,1.52,2.14,4.11,0.67,0.21};
    private static double[] M2_5V = {0.000701148,0.00246321,0.014419167,0.027385456,0.033405945,0.025613847,1.54,2.31,4.38,0.64,0.23};
    private static double[] M3V = {0.000539274,0.001920885,0.013090016,0.027448586,0.032796217,0.025613847,1.55,2.47,4.65,0.62,0.25};
    private static double[] M3_5V = {0.000405331,0.001450445,0.011828786,0.027385456,0.032420802,0.025613847,1.56,2.67,4.96,0.61,0.26};
    private static double[] M4V = {0.000304656,0.00109522,0.010689076,0.027322472,0.032049684,0.025613847,1.56,2.86,5.26,0.6,0.28};
    private static double[] M4_5V = {0.000200359,0.000737058,0.009182061,0.026516731,0.031392345,0.025613847,1.59,3.13,5.69,0.61,0.30};
    private static double[] M5V = {0.000131768,0.000496023,0.007887515,0.025734752,0.030748487,0.025613847,1.61,3.39,6.12,0.62,0.32};
    private static double[] M5_5V = {0.000288072,0.000288072,0.006590831,0.024689937,0.030048566,0.025613847,1.67,3.79,6.71,0.64,0.35};
    private static double[] M6V = {0.000167302,0.000167302,0.005507318,0.023687541,0.029364577,0.025613847,1.72,4.18,7.3,0.66,0.37};

	
	// SECUENCIA Gigantes. 
	//					  Espectro, 	B-V,	V-I,	V-K,	J-H,	H-K
    private static double[] B8III = {-0.0800,-0.1500,-0.3500,-0.0500,-0.0350,-0.08,-0.15,-0.35,-0.05,-0.035};
    private static double[] B9III = {-0.0800,-0.0750,-0.1750,-0.0250,-0.0180,-0.08,-0.075,-0.175,-0.025,-0.018};
    private static double[] A0III = {-0.0300,0.0000,0.0000,0.0000,0.0000,-0.03,0,0,0,0};
    private static double[] A1III = {0.0100,0.0300,0.0700,0.0100,0.0030,0.01,0.03,0.07,0.01,0.003};
    private static double[] A2III = {0.0500,0.0600,0.1400,0.0200,0.0050,0.05,0.06,0.14,0.02,0.005};
    private static double[] A3III = {0.0900,0.1300,0.2200,0.0300,0.0080,0.09,0.13,0.22,0.03,0.008};
    private static double[] A4III = {0.1200,0.2000,0.3000,0.0500,0.0120,0.12,0.20,0.30,0.05,0.012};
    private static double[] A5III = {0.1500,0.2700,0.3800,0.0600,0.0150,0.15,0.27,0.38,0.06,0.015};
    private static double[] A6III = {0.2900,0.2900,0.4400,0.0800,0.0200,0.20,0.29,0.44,0.08,0.02};
    private static double[] A7III = {0.2400,0.3000,0.5000,0.0900,0.0250,0.24,0.3,0.50,0.09,0.025};
    private static double[] A8III = {0.2600,0.3100,0.5700,0.1000,0.0270,0.26,0.31,0.57,0.10,0.027};
    private static double[] A9III = {0.2800,0.3200,0.6300,0.1200,0.0280,0.28,0.32,0.63,0.12,0.028};
    private static double[] F0III = {0.3200,0.3300,0.7000,0.1300,0.0300,0.32,0.33,0.7,0.13,0.030};
    private static double[] F1III = {0.0900,0.1500,0.3500,0.0500,0.0350,0.34,0.365,0.76,0.1475,0.0325};
    private static double[] F2III = {0.0900,0.1500,0.3500,0.0500,0.0350,0.36,0.4,0.82,0.165,0.035};
    private static double[] F3III = {0.0900,0.1500,0.3500,0.0500,0.0350,0.39,0.44,0.91,0.19,0.037};
    private static double[] F4III = {0.0900,0.1500,0.3500,0.0500,0.0350,0.42,0.49,1.01,0.21,0.038};
    private static double[] F5III = {0.0900,0.1500,0.3500,0.0500,0.0350,0.43,0.53,1.10,0.23,0.040};
    private static double[] F6III = {0.0900,0.1500,0.3500,0.0500,0.0350,0.46,0.58,1.21,0.26,0.043};
    private static double[] F7III = {0.0900,0.1500,0.3500,0.0500,0.0350,0.48,0.62,1.32,0.29,0.045};
    private static double[] F8III = {0.0900,0.1500,0.3500,0.0500,0.0350,0.52,0.63,1.35,0.29,0.042};
    private static double[] F9III = {0.0900,0.1500,0.3500,0.0500,0.0350,0.60,0.72,1.55,0.33,0.0535};
    private static double[] G0III = {0.0900,0.1500,0.3500,0.0500,0.0350,0.64,0.81,1.75,0.37,0.065};
    private static double[] G1III = {0.0900,0.1500,0.3500,0.0500,0.0350,0.69,0.84,1.83,0.40,0.069};
    private static double[] G2III = {0.0900,0.1500,0.3500,0.0500,0.0350,0.77,0.86,1.90,0.42,0.073};
    private static double[] G3III = {0.0900,0.1500,0.3500,0.0500,0.0350,0.85,0.89,1.98,0.45,0.08};
    private static double[] G4III = {0.0900,0.1500,0.3500,0.0500,0.0350,0.88,0.91,2.05,0.470,0.08};
    private static double[] G5III = {0.0900,0.1500,0.3500,0.0500,0.0350,0.92,0.93,2.09,0.485,0.083};
    private static double[] G6III = {0.0900,0.1500,0.3500,0.0500,0.0350,0.93,0.94,2.15,0.500,0.085};
    private static double[] G7III = {0.0900,0.1500,0.3500,0.0500,0.0350,0.94,0.94,2.16,0.50,0.085};
    private static double[] G8III = {0.0900,0.1500,0.3500,0.0500,0.0350,0.95,0.94,2.16,0.50,0.085};
    private static double[] G9III = {0.0900,0.1500,0.3500,0.0500,0.0350,1.00,0.97,2.24,0.52,0.090};
    private static double[] K0III = {0.0900,0.1500,0.3500,0.0500,0.0350,1.04,1.00,2.31,0.54,0.095};
    private static double[] K1III = {0.0900,0.1500,0.3500,0.0500,0.0350,1.1,1.08,2.5,0.58,0.100};
    private static double[] K2III = {0.0900,0.1500,0.3500,0.0500,0.0350,1.16,1.17,2.7,0.63,0.115};
    private static double[] K3III = {0.0900,0.1500,0.3500,0.0500,0.0350,1.30,1.36,3.00,0.68,0.140};
    private static double[] K4III = {0.0900,0.1500,0.3500,0.0500,0.0350,1.41,1.5,3.26,0.73,0.15};
    private static double[] K5III = {0.0900,0.1500,0.3500,0.0500,0.0350,1.54,1.63,3.60,0.79,0.17};
    private static double[] K6III = {0.0900,0.1500,0.3500,0.0500,0.0350,1.54,1.66,3.65,0.80,0.17};
    private static double[] K7III = {0.0900,0.1500,0.3500,0.0500,0.0350,1.54,1.69,3.70,0.81,0.18};
    private static double[] K8III = {0.0900,0.1500,0.3500,0.0500,0.0350,1.55,1.72,3.75,0.81,0.18};
    private static double[] K9III = {0.0900,0.1500,0.3500,0.0500,0.0350,1.55,1.75,3.80,0.82,0.19};
    private static double[] M0III = {0.0900,0.1500,0.3500,0.0500,0.0350,1.55,1.78,3.85,0.83,0.19};
    private static double[] M1III = {0.0900,0.1500,0.3500,0.0500,0.0350,1.56,1.9,4.05,0.85,0.21};
    private static double[] M2III = {0.0900,0.1500,0.3500,0.0500,0.0350,1.59,2.05,4.3,0.87,0.215};
    private static double[] M3III = {0.0900,0.1500,0.3500,0.0500,0.0350,1.6,2.25,4.64,0.9,0.235};
    private static double[] M4III = {0.0900,0.1500,0.3500,0.0500,0.0350,1.59,2.55,5.1,0.93,0.25};
    private static double[] M5III = {0.0900,0.1500,0.3500,0.0500,0.0350,1.55,3.05,5.96,0.95,0.285};
    private static double[] M6III = {0.0900,0.1500,0.3500,0.0500,0.0350,1.54,0,6.84,0.96,0.3};
	
	// Secuencia SUB-ENANAS
	
	private static double[] K7VI = {1.3000,1.4500,3.1600,0.6600,0.1300};
	private static double[] K8VI = {1.3367,1.5667,3.3233,0.6717,0.1417};
	private static double[] K9VI = {1.3733,1.6833,3.4867,0.6833,0.1533};
	private static double[] M0VI = {1.4100,1.8000,3.6500,0.6950,0.1650};
	private static double[] M1VI = {1.4450,1.8800,3.7600,0.6875,0.1825};
	private static double[] M2VI = {1.4800,1.9600,3.8700,0.6800,0.2000};
	private static double[] M3VI = {1.5000,2.0500,3.9900,0.6725,0.2050};
	private static double[] M4VI = {1.5200,2.1400,4.1100,0.6650,0.2100};
	private static double[] M5VI = {1.5350,2.3050,4.3800,0.6425,0.2300};
	private static double[] M6VI = {1.5500,2.4700,4.6500,0.6200,0.2500};

}
