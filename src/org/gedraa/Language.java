/*
 * Language.java
 *
 * Created on __DATE__, __TIME__
 */

package org.gedraa;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author  __USER__
 */
public class Language extends javax.swing.JDialog {

	/** Creates new form Language */
	public Language(java.awt.Frame parent, boolean modal) {
		super(parent, modal);
		initComponents();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jComboBox1 = new javax.swing.JComboBox();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jLabel1.setText("Choose Language:");

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "EN", "SP", "IT" }));
		jComboBox1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(61, 61, 61).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)).addContainerGap(53, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(35, 35, 35).addComponent(jLabel1).addGap(34, 34, 34).addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(70, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		int lan = jComboBox1.getSelectedIndex();
		switch (lan) {
		case 0:
			AstrofisicaGEDRAA hunter = new AstrofisicaGEDRAA(1);
			hunter.setVisible(true);
			hunter.setLocationRelativeTo(null);
			this.hide();
			hunter.requestFocus();
			break;
		case 1:
			AstrofisicaGEDRAA hunter2 = new AstrofisicaGEDRAA(2);
			hunter2.setVisible(true);
			hunter2.setLocationRelativeTo(null);
			this.hide();
			hunter2.requestFocus();
			break;
		case 2:
			AstrofisicaGEDRAA hunter3 = new AstrofisicaGEDRAA(3);
			hunter3.setVisible(true);
			hunter3.setLocationRelativeTo(null);
			this.hide();
			hunter3.requestFocus();
			break;
		default:
		    
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				Language dialog = new Language(new javax.swing.JFrame(), true);
				dialog.addWindowListener(new java.awt.event.WindowAdapter() {
					public void windowClosing(java.awt.event.WindowEvent e) {
						System.exit(0);
					}
				});
				dialog.setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JLabel jLabel1;
	// End of variables declaration//GEN-END:variables

}