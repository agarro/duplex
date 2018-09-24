package org.gedraa;

import java.awt.Shape;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;



import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.Align;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.util.ShapeUtilities;

/**
 * 
 *
 * @author garroale
 */
public class DiagramaDobleColor extends ApplicationFrame {
	
	private static String _primary;
	private static  String _secondary;
	private static  String _gigante;
	private static  String _enana;
	private static  String _subenana;
	private static  String _marron;
	
	

    /**
     * 
     *
     * @param title  the frame title.
     * @throws IOException 
     */
    public DiagramaDobleColor(String title, double a_h_k, double a_J_H,double b_h_k, double b_J_H
    	, String primary, String secondary, String enana, String gigante, String subenana
    	, String marron) throws IOException {
        super(title);
        
    	_primary = primary;
    	_secondary = secondary;
    	_gigante = gigante;
    	_enana = enana;
    	_subenana= subenana;
    	_marron = marron;
    	
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
        XYDataset data = createDataset(a_h_k,a_J_H,b_h_k,b_J_H );
        JFreeChart chart = ChartFactory.createScatterPlot(
        	title,
            "H-K", "J-H",
            data,
            PlotOrientation.HORIZONTAL,
            true,
            true,
            false
        );
        NumberAxis domainAxis = (NumberAxis) chart.getXYPlot().getDomainAxis();
        domainAxis.setAutoRange(true);
        //domainAxis.setRange(-0.75, 3.00);
        //domainAxis.setTickUnit(new NumberTickUnit(1));
        NumberAxis range = (NumberAxis) chart.getXYPlot().getRangeAxis();
        range.setAutoRange(true);
        //range.setRange(-25, 5);
        //range.setTickUnit(new NumberTickUnit(5));   
        
        Shape cross = ShapeUtilities.createDiagonalCross(1, 1);
        //Shape cross = ShapeUtilities.createDiamond(2);
        XYPlot plot = (XYPlot) chart.getPlot();
        XYItemRenderer renderer = plot.getRenderer();
        renderer = plot.getRenderer();
        renderer.setSeriesShape(0, cross);
        renderer.setSeriesShape(1, cross);
        renderer.setSeriesShape(2, cross);
        renderer.setSeriesShape(3, cross);
        renderer.setSeriesShape(4, cross);
        renderer.setSeriesShape(5, cross);
/*        
        XYLineAndShapeRenderer renderer2 = new XYLineAndShapeRenderer();
        renderer2.setSeriesLinesVisible(0, false);
        renderer2.setSeriesLinesVisible(1, false);
        renderer2.setSeriesLinesVisible(2, false);
        renderer2.setSeriesLinesVisible(3, true);
        renderer2.setSeriesLinesVisible(4, false);
        renderer2.setSeriesLinesVisible(5, false);
       
        plot.setRenderer(renderer2)*/;
        plot.setRenderer(renderer); 
        
        
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 450));
        chartPanel.setVerticalAxisTrace(true);
        chartPanel.setHorizontalAxisTrace(true);
        //chartPanel.setVerticalZoom(true);
        //chartPanel.setHorizontalZoom(true);
        
        //BufferedImage image = ImageIO.read(new File("B_V.jpg"));
        
        //chart.setBackgroundImage(image);
        
        chart.setBackgroundImageAlignment(Align.CENTER);
        chart.getPlot().setBackgroundAlpha(0.01f);
        ChartUtilities.saveChartAsJPEG(new File("GEDRAA_DDC.jpg"), chart, 640, 640);
        
        setContentPane(chartPanel);

    }

    /**
     * Starting point for the application.
     *
     * @param args  ignored.
     */
    public static void main(String[] args) {

        DiagramaDobleColor frame;
        try {
	        frame = new DiagramaDobleColor("Diagrama Color/Color", 1.33, 0.1, 1.33, 0.11,"","","","","","");
	        frame.pack();
	        frame.setResizable(false);
	        frame.resize(640, 640);
	        RefineryUtilities.centerFrameOnScreen(frame);
	        frame.setVisible(true);
        } catch (MalformedURLException e) {

	        e.printStackTrace();
        } catch (IOException e) {

	        e.printStackTrace();
        }


    }
    private static XYDataset createDataset(double a_h_k, double a_J_H,double b_h_k, double b_J_H){
        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeries primaria = new XYSeries(_primary);
        primaria.add( a_J_H,a_h_k);
        XYSeries secundaria = new XYSeries(_secondary);
        secundaria.add(b_J_H,b_h_k);

        //Enanas secuencia Ppal
        XYSeries mainSequence = new XYSeries(_enana);
        mainSequence.add(-0.05,-0.035);
        mainSequence.add(0,0);
        mainSequence.add(0.02,0.005);
        mainSequence.add(0.06,0.015);
        mainSequence.add(0.09,0.025);
        mainSequence.add(0.13, 0.03);
        mainSequence.add(0.165,0.035);
        mainSequence.add(0.23,0.04);
        mainSequence.add(0.285,0.045);
        mainSequence.add(0.305,0.05);
        mainSequence.add(0.32,0.052);
        mainSequence.add(0.33,0.055);
        mainSequence.add(0.37,0.06);
        mainSequence.add(0.45,0.075);
        mainSequence.add(0.5,0.09);
        mainSequence.add(0.58,0.105);
        mainSequence.add(0.61,0.11);
        mainSequence.add(0.66,0.13);
        mainSequence.add(0.695,0.165);
        mainSequence.add(0.68,0.2);
        mainSequence.add(0.665,0.21);
        mainSequence.add(0.62,0.25);
        mainSequence.add(0.6,0.275);
        mainSequence.add(0.62,0.32);
        mainSequence.add(0.66,0.37);
        mainSequence.add(0.64,0.38);
        mainSequence.add(0.74,0.43);
        
        
        //Gigantes
        XYSeries giants = new XYSeries(_gigante);
        giants.add(0.37,0.065); 
        giants.add(0.47,0.08); 
        giants.add(0.5,0.085); 
        giants.add(0.54,0.095); 
        giants.add(0.58,0.1); 
        giants.add(0.63,0.115); 
        giants.add(0.68, 0.14); 
        giants.add(0.73, 0.15); 
        giants.add(0.79, 0.165); 
        giants.add(0.83, 0.19); 
        giants.add(0.85, 0.205); 
        giants.add(0.87, 0.215); 
        giants.add(0.9, 0.235); 
        giants.add(0.93, 0.245); 
        giants.add(0.95, 0.285); 
        giants.add(0.96, 0.3); 
        giants.add(0.96, 0.31); 
        

        
      //Sub-enanas
        XYSeries subdwarfs = new XYSeries(_subenana);
        subdwarfs.add(0.54, 0.24); 
        subdwarfs.add(0.47, 0.24);
        subdwarfs.add(0.5, 0.22);
        subdwarfs.add(0.49, 0.23);
        subdwarfs.add(0.52, 0.2);
        subdwarfs.add(0.5, 0.2);
        subdwarfs.add(0.5, 0.26);
        subdwarfs.add(0.54, 0.28);
        subdwarfs.add(0.55, 0.26);
        subdwarfs.add(0.47, 0.22);
        subdwarfs.add(0.51, 0.26);
        subdwarfs.add(0.51, 0.25);
        subdwarfs.add(0.49, 0.22);
        subdwarfs.add(0.53, 0.3);
        subdwarfs.add(0.49, 0.27);
        subdwarfs.add(0.5, 0.23);
        subdwarfs.add(0.5, 0.24);
        
        //enanas marrones
        XYSeries bdwarfs = new XYSeries(_marron);
        bdwarfs.add(0.3, 0.7); 
        
        dataset.addSeries(primaria);
        dataset.addSeries(secundaria);
        dataset.addSeries(mainSequence);
        dataset.addSeries(giants);
        dataset.addSeries(subdwarfs);
        dataset.addSeries(bdwarfs);
        return dataset;
    }
    
	@Override
    public void windowClosing(final WindowEvent evt) {
		if (evt.getWindow() == this) {
			dispose();

		}
	}
    
}