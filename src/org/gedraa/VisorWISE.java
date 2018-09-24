package org.gedraa;

import java.awt.*;
import java.io.*;
import javax.swing.*;


public class VisorWISE extends JPanel {
	
	public static void main(String[] args) throws Exception {
		
		VisorWISE v = new VisorWISE();

	}

	public VisorWISE() throws IOException {

		JLabel contentPane = new JLabel();
		// You'll want to be sure this component is opaque
		// since it is required for contentPanes. Some
		// LAFs may use non-opaque components.
		contentPane.setOpaque(true);
		contentPane.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 5, 5, 5);
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		contentPane.setIcon(new javax.swing.ImageIcon("imagenWISE.jpg"));
		contentPane.validate();
		contentPane.revalidate();
		JFrame f = new JFrame("Imagen WISE");
	    LayoutManager overlay = new OverlayLayout(contentPane);
	    contentPane.setLayout(overlay);
		Cross cruz = new Cross();
		cruz.setVisible(true);
		contentPane.add(cruz);
		//JLabel lab = new JLabel();
		//lab.setText("==============>");
		//lab.setForeground(Color.CYAN);
		//contentPane.add(lab);
		f.setTitle("Imagen WISE");
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setContentPane(contentPane);
		f.setSize(1024, 1024);
		f.setLocation(100, 0);
		f.setVisible(true);
	}
	
	/*
	 * 
	**/
	static class Cross extends Component {

		public void paint(Graphics g) {
			Graphics2D g2d = (Graphics2D) g;
			g2d.setColor(Color.ORANGE);
			int x = 0;
			int y = 0;
			int w = getSize().width - 1;
			int h = getSize().height - 1;
			//g2d.drawLine(x, y, w, h);
			//g2d.drawLine(w, y, x, h);
			g2d.drawOval(252, 250, 520, 508);
			g2d.setColor(Color.CYAN);
			g2d.drawLine(512, 500, 512, 524);
			g2d.drawLine(500,512, 524, 512);
		}

	}
	
}