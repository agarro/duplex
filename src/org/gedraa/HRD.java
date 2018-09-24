package org.gedraa;



import java.awt.Color;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;


import javax.imageio.ImageIO;


import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.plot.PlotOrientation;

import org.jfree.chart.plot.XYPlot;

import org.jfree.chart.renderer.xy.XYDotRenderer;

import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.Align;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;


/**
 * 
 *
 * @author garroale
 */
public class HRD extends ApplicationFrame {
	
	private static String _a;
	private static String _b;

    /**
     * 
     *
     * @param title  the frame title.
     * @throws IOException 
     */
    public HRD(String title, double a_temp, double a_MagAbsolute,double b_temp, double b_MagAbsolute, String a, String  b, String ms) throws IOException {

        super(title);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
        _a=a;
        _b=b;
        
        XYDataset data = createDataset(a_temp,a_MagAbsolute,b_temp,b_MagAbsolute, ms);
        
        JFreeChart chart = ChartFactory.createScatterPlot(
            "",
            "Temp. Kelvin", "M",
            data,
            PlotOrientation.VERTICAL,
            true,
            true,
            false
        );
     
		XYPlot plot = chart.getXYPlot();
		XYDotRenderer dot = new XYDotRenderer();
		dot.setDotHeight(5);
		dot.setDotWidth(5);
		dot.setSeriesPaint(0, Color.RED, false);
		dot.setSeriesPaint(1, Color.BLUE, false);
		dot.setSeriesPaint(2, Color.ORANGE, false);
		plot.setRenderer(dot);
		
        NumberAxis domainAxis = (NumberAxis) chart.getXYPlot().getDomainAxis();

        domainAxis.setRange(2800, 12300);
        domainAxis.setInverted(true);
        domainAxis.setTickUnit(new NumberTickUnit(2000));
        //domainAxis.setVisible(false);

        NumberAxis range = (NumberAxis) chart.getXYPlot().getRangeAxis();
        range.setInverted(true); 
        range.setRange(-7, 15);
        range.setTickUnit(new NumberTickUnit(5)); 
      
        
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setMinimumSize(new java.awt.Dimension(720, 670));
        chartPanel.setPreferredSize(new java.awt.Dimension(720, 670));
        chartPanel.setVerticalAxisTrace(true);
        chartPanel.setHorizontalAxisTrace(true);
        chartPanel.setSize(new java.awt.Dimension(720, 670));

        
        BufferedImage image = ImageIO.read(new File("Diagrama_HR.jpg"));
        
        chart.setBackgroundImage(image);
        //chart.setPadding(new RectangleInsets(0.0,0.0,0.0,0.0));
        chart.setBackgroundImageAlignment(Align.TOP_RIGHT);
        chart.getPlot().setBackgroundAlpha(0.01f);
        ChartUtilities.saveChartAsJPEG(new File("HRD.jpg"), chart,720, 670);
        setContentPane(chartPanel);
        this.pack();
        this.setResizable(false);
        this.resize(720, 670);
        RefineryUtilities.centerFrameOnScreen(this);
        this.setVisible(true);

    }

    /**
     * Starting point for the application.
     *
     * @param args  ignored.
     */
    public static void main(String[] args) {

        HRD frame;
        try {
	        frame = new HRD("", 8000.0, 1.0,5000.0, 5.0,"Primaria","Secundaria", "Secuencia Principal");
	        frame.pack();
	        frame.setResizable(false);
	        frame.resize(720, 670);
	        RefineryUtilities.centerFrameOnScreen(frame);
	        frame.setVisible(true);
        } catch (MalformedURLException e) {

	        e.printStackTrace();
        } catch (IOException e) {

	        e.printStackTrace();
        }


    }
    private static XYDataset createDataset(double a_b_v, double a_Hv,double b_b_v, double b_Hv, String msq){
        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeries primaria = new XYSeries(_a);
        primaria.add(a_b_v, a_Hv);
        XYSeries secundaria = new XYSeries(_b);
        secundaria.add(b_b_v,b_Hv );
        // Luego borrar esto...solo es para calibrar el gráfico
        // ****************************************************************************
        XYSeries ms = new  XYSeries(msq);
		//ms.add(12300.0, -0.02);// B8
        //ms.add(12000.0, -0.34);//B9
        ms.add(9600.0, 0.7);//A0
        ms.add(9330.0, 0.95);//A1
        ms.add(9040.0, 1.21);//A2
        ms.add(8750.0, 1.47);//A3
        ms.add(8480.0, 1.75);//A4
        ms.add(8310.0, 2.0);//A5
        ms.add(8000.0, 2.12);//A6
        ms.add(7920.0, 2.24);//A7
        ms.add(7700.0, 2.36);//A8
        ms.add(7500.0, 2.48);//A9
        ms.add(7350.0, 2.60);//F0
        ms.add(7200.0, 2.76);//F1
        ms.add(7050.0, 2.92);//F2
        ms.add(6850.0, 3.08);//F3
        ms.add(6790.0, 3.24);//F4
        ms.add(6700.0, 3.40);//F5
        ms.add(6550.0, 3.60);//F6
        ms.add(6400.0, 3.80);//F7
        ms.add(6300.0, 4.0);//F8
        ms.add(6190.0, 4.20);//F9
        ms.add(6050.0, 4.40);//G0
        ms.add(5930.0, 4.54);//G1
        ms.add(5800.0, 4.68);//G2
        ms.add(5750.0, 4.82);//G3
        ms.add(5700.0, 4.96);//G4
        ms.add(5660.0, 5.10);//G5
        ms.add(5600.0, 5.26);//G6
        ms.add(5530.0, 5.42);//G7
        ms.add(5440.0, 5.58);//G8
        ms.add(5300.0, 5.74);//G8
        ms.add(5240.0, 5.90);//G9
        ms.add(5110.0, 6.18);//K1
        ms.add(4960.0, 6.46);//K2
        ms.add(4800.0, 6.74);//K3
        ms.add(4600.0, 7.02);//K4
        ms.add(4300.0, 7.30);//K6
        ms.add(4200.0, 7.64);//K6
        ms.add(4000.0, 7.98);//K7
        ms.add(3900.0, 8.32);//K8
        ms.add(3800.0, 8.66);//K9
        ms.add(3750.0, 9.0);//M0
        ms.add(3700.0, 9.25);//M1
        ms.add(3650.0, 9.75);//M1.5
        ms.add(3600.0, 10.0);//M2
        ms.add(3550.0, 11.10);//M2.5
        ms.add(3500.0, 12.10);//M3
        ms.add(3450.0, 12.60);//M3.5
        ms.add(3400.0, 13.10);//M4
        ms.add(3300.0, 13.60);//M4.5
        ms.add(3200.0, 14.10);//M5
        ms.add(3150.0, 15.65);//M5.5
        // ****************************************************************************
        
        dataset.addSeries(primaria);
        dataset.addSeries(secundaria);
        dataset.addSeries(ms);
        
        return dataset;
    }
    
	@Override
    public void windowClosing(final WindowEvent evt) {
		if (evt.getWindow() == this) {
			dispose();

		}
	}   

}