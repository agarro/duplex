package org.gedraa;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import org.math.plot.Plot3DPanel;

public class Distancia {

    public static void main(String[] args) {
    	Distancia d = new Distancia(345.3f, 334.3f, "Sol", "Primaria","Secundaria");
    }
	public Distancia(float distA, float distB, String sol, String prim, String sec) 
	{
		double A = (double) distA;
		double B = (double) distB;
		B = B*0.99;
		double PI = 3.1416;

        // create your PlotPanel (you can use it as a JPanel)
        Plot3DPanel plot = new Plot3DPanel();
        plot.removePlotToolBar();
        plot.setAxisLabel(0, "parsecs");
        plot.setAxisLabel(1, "parsecs");
        plot.setAxisLabel(2, "parsecs");
        
        // Sol
        double[] x = { 0.8, 0.8};
        double[] y = { 0.8, 0.8};
        double[] z = { 0.8, 0.8};
        
        // define the legend position
        plot.addLegend("SOUTH");
        Font font = new Font("Arial", Font.PLAIN, 14);
        plot.setFont(font );
        // add a line plot to the PlotPanel
        //plot.addLinePlot("Primaria",java.awt.Color.RED, x,y,z);
        plot.addPlot("SCATTER", sol, Color.YELLOW, x,y,z);

        double[] x2 = { A, A};
        double[] y2 = { A, A};
        double[] z2 = { A, A};
        
        plot.addPlot("SCATTER", prim, Color.RED, x2,y2,z2);
        

        double[] x3 = { B, B};
        double[] y3 = { B, B};
        double[] z3 = { B, B};
        
        plot.addPlot("SCATTER", sec, Color.BLUE, x3,y3,z3);
        
        plot.getAxis(0).setLightLabelAngle(-PI / 4);
        plot.getAxis(1).setLightLabelAngle(-PI / 4);
        plot.getAxis(2).setLightLabelAngle(-PI / 4);
        
        // put the PlotPanel in a JFrame like a JPanel
        JFrame frame = new JFrame("Distancia");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(720, 720);
        frame.setContentPane(plot);
        frame.setVisible(true);	
        frame.setLocationRelativeTo(null);
        

	}

}
