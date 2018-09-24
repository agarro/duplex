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
public class MovimientoPropioReducidoV_I extends ApplicationFrame {
	
	private static String _a;
	private static String _b;
	
    /**
     * 
     *
     * @param title  the frame title.
     * @throws IOException 
     */
    public MovimientoPropioReducidoV_I(String title, double a_v_i,
    	double a_Hv,double b_v_i, double b_Hv, String a, String b) throws IOException {

        super(title);
        super.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    	_a=a;
    	_b=b;
    	
        XYDataset data = createDataset(a_v_i,a_Hv,b_v_i,b_Hv );
        JFreeChart chart = ChartFactory.createScatterPlot(
            title,
            "V-I", "Hv",
            data,
            PlotOrientation.VERTICAL,
            true,
            true,
            false
        );
        NumberAxis domainAxis = (NumberAxis) chart.getXYPlot().getDomainAxis();
        domainAxis.setRange(0.00, 4.50);
        domainAxis.setTickUnit(new NumberTickUnit(1));
        NumberAxis range = (NumberAxis) chart.getXYPlot().getRangeAxis();
        range.setRange(-25, -15);
        range.setTickUnit(new NumberTickUnit(1));        
        
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 450));
        chartPanel.setVerticalAxisTrace(true);
        chartPanel.setHorizontalAxisTrace(true);
        //chartPanel.setVerticalZoom(true);
        //chartPanel.setHorizontalZoom(true);
        
        BufferedImage image = ImageIO.read(new File("V_I.jpg"));
        
        chart.setBackgroundImage(image);
        
        chart.setBackgroundImageAlignment(Align.CENTER);
        chart.getPlot().setBackgroundAlpha(0.01f);
        ChartUtilities.saveChartAsJPEG(new File("GEDRAA_MPR_2.jpg"), chart, 500, 450);
        setContentPane(chartPanel);

    }

    /**
     * Starting point for the application.
     *
     * @param args  ignored.
     */
    public static void main(String[] args) {

        MovimientoPropioReducidoV_I frame;
        try {
	        frame = new MovimientoPropioReducidoV_I("Movimiento Propio Reducido",
	        	0.33, -4.1,0.33, -2.81,"a","b");
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
    private static XYDataset createDataset(double a_v_i, double a_Hv,double b_v_i, double b_Hv){
        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeries primaria = new XYSeries(_a);
        primaria.add(a_v_i, a_Hv);
        XYSeries secundaria = new XYSeries(_b);
        secundaria.add(b_v_i,b_Hv );
        
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