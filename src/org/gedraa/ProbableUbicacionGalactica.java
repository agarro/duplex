package org.gedraa;



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
public class ProbableUbicacionGalactica extends ApplicationFrame {
	
	private static String _a;
	private static String _b;

    /**
     * 
     *
     * @param title  the frame title.
     * @throws IOException 
     */
    public ProbableUbicacionGalactica(String title, double a_h_k, double a_J_H,
    	double b_h_k, double b_J_H, String a, String b) throws IOException {

        super(title);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
        _a=a;
        _b=b;
        
        XYDataset data = createDataset(a_h_k,a_J_H,b_h_k,b_J_H );
        JFreeChart chart = ChartFactory.createScatterPlot(
            title,
            "H-K", "J-H",
            data,
            PlotOrientation.VERTICAL,
            true,
            true,
            false
        );
        NumberAxis domainAxis = (NumberAxis) chart.getXYPlot().getDomainAxis();
        domainAxis.setRange(0.00, 0.51);
        domainAxis.setTickUnit(new NumberTickUnit(0.1));
        NumberAxis range = (NumberAxis) chart.getXYPlot().getRangeAxis();
        range.setRange(00.00 , 00.8);
        range.setTickUnit(new NumberTickUnit(0.1));        
        
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(420, 540));
       // chartPanel.setVerticalAxisTrace(true);
       // chartPanel.setHorizontalAxisTrace(true);
        //chartPanel.setVerticalZoom(true);
        //chartPanel.setHorizontalZoom(true);
        
        BufferedImage image = ImageIO.read(new File("galacticLocat.jpg"));
        
        chart.setBackgroundImage(image);
        
        chart.setBackgroundImageAlignment(Align.NORTH_EAST);
        chart.getPlot().setBackgroundAlpha(0.01f);
        ChartUtilities.saveChartAsJPEG(new File("J_H_H_K.jpg"), chart, 420, 540);
        setContentPane(chartPanel);
        pack();
        setResizable(false);
        resize(500, 450);
        RefineryUtilities.centerFrameOnScreen(this);
        setVisible(true);

    }

    /**
     * Starting point for the application.
     *
     * @param args  ignored.
     */
    public static void main(String[] args) {

        ProbableUbicacionGalactica frame;
        try {
	        frame = new ProbableUbicacionGalactica("Probable Ubicación Galáctica", 0.13, 0.21,0.19, 0.31, "a", "b");
	        frame.pack();
	        frame.setResizable(false);
	        frame.resize(500, 450);
	        RefineryUtilities.centerFrameOnScreen(frame);
	        frame.setVisible(true);
        } catch (MalformedURLException e) {

	        e.printStackTrace();
        } catch (IOException e) {

	        e.printStackTrace();
        }


    }
    private static XYDataset createDataset(double a_b_v, double a_Hv,double b_b_v, double b_Hv){
        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeries primaria = new XYSeries(_a);
        primaria.add(a_b_v, a_Hv);
        XYSeries secundaria = new XYSeries(_b);
        secundaria.add(b_b_v,b_Hv );
        
        dataset.addSeries(primaria);
        dataset.addSeries(secundaria);
        return dataset;
    }
    
	@Override
    public void windowClosing(final WindowEvent evt) {
		if (evt.getWindow() == this) {
			dispose();

		}
	}   

}