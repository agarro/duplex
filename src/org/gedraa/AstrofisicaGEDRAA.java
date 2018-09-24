/*
 * AstrofisicaGEDRAA.java
 *
 * Grupo de Estrellas Dobles de RAA.
 */

package org.gedraa;

import java.awt.Cursor;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Properties;

import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.docx4j.dml.wordprocessingDrawing.Inline;
import org.docx4j.jaxb.Context;
import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.docx4j.openpackaging.exceptions.InvalidFormatException;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.openpackaging.parts.WordprocessingML.BinaryPartAbstractImage;
import org.jfree.ui.RefineryUtilities;

import com.sun.xml.rpc.processor.modeler.j2ee.xml.javaXmlTypeMappingType;

/**
 *
 * @author  __USER__
 */
public class AstrofisicaGEDRAA extends javax.swing.JFrame {

	/** Creates new form AstrofisicaGEDRAA */
	public AstrofisicaGEDRAA(int lan) {
		language = lan;
		loadProps(lan);
		this.setTitle(_mainWindowTitle);
		initComponents();
		RedirectFrame outputFrame = new RedirectFrame(true, false, null, 600, 500, JFrame.DO_NOTHING_ON_CLOSE, "Duplex detrás de la Escena");

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
			public void run() {
				toFront();
				repaint();
			}
		});
		//this.setAlwaysOnTop(true);

	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jButton_Exportar_Datos = new javax.swing.JButton();
		creditosTabPanel = new javax.swing.JTabbedPane();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		denominacionA = new javax.swing.JTextField();
		denominacionB = new javax.swing.JTextField();
		jLabel11 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		jSeparator1 = new javax.swing.JSeparator();
		jTextField_J_A = new javax.swing.JTextField();
		jTextField_H_A = new javax.swing.JTextField();
		jTextField_K_A = new javax.swing.JTextField();
		jTextField_galacticLat_A = new javax.swing.JTextField();
		jTextField_pmRA_A = new javax.swing.JTextField();
		jTextField_pmDEC_A = new javax.swing.JTextField();
		jTextField_J_B = new javax.swing.JTextField();
		jTextField_H_B = new javax.swing.JTextField();
		jTextField_K_B = new javax.swing.JTextField();
		jTextField_galacticLat_B = new javax.swing.JTextField();
		jTextField_pmRA_B = new javax.swing.JTextField();
		jTextField_pmDEC_B = new javax.swing.JTextField();
		jLabel20 = new javax.swing.JLabel();
		jLabel22 = new javax.swing.JLabel();
		jLabel48 = new javax.swing.JLabel();
		jButton3 = new javax.swing.JButton();
		jLabel15 = new javax.swing.JLabel();
		UCAC3_pmra_A = new javax.swing.JTextField();
		UCAC3_pmdec_A = new javax.swing.JTextField();
		setUCAC3_button_A = new javax.swing.JButton();
		jButton10 = new javax.swing.JButton();
		UCAC3_pmra_B = new javax.swing.JTextField();
		UCAC3_pmdec_B = new javax.swing.JTextField();
		UCAC4_pmra_A = new javax.swing.JTextField();
		UCAC4_pmdec_A = new javax.swing.JTextField();
		jButton11 = new javax.swing.JButton();
		UCAC4_pmra_B = new javax.swing.JTextField();
		UCAC4_pmdec_B = new javax.swing.JTextField();
		jButton12 = new javax.swing.JButton();
		jButton13 = new javax.swing.JButton();
		jPanel2 = new javax.swing.JPanel();
		jButton4 = new javax.swing.JButton();
		jButton1 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jLabel16 = new javax.swing.JLabel();
		jLabel17 = new javax.swing.JLabel();
		distanceA = new javax.swing.JLabel();
		distanceB = new javax.swing.JLabel();
		jPanel8 = new javax.swing.JPanel();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		primaria_GIGANTE_Button = new javax.swing.JButton();
		secundaria_GIGANTE_Button = new javax.swing.JButton();
		AMBAS_GIGANTES_Button = new javax.swing.JButton();
		jButton14 = new javax.swing.JButton();
		jButton15 = new javax.swing.JButton();
		jButton16 = new javax.swing.JButton();
		jButton17 = new javax.swing.JButton();
		jPanel3 = new javax.swing.JPanel();
		jButton5 = new javax.swing.JButton();
		jLabel18 = new javax.swing.JLabel();
		jLabel19 = new javax.swing.JLabel();
		MK_A = new javax.swing.JLabel();
		MK_icon_A = new javax.swing.JLabel();
		jLabel21 = new javax.swing.JLabel();
		disstA = new javax.swing.JLabel();
		jLabel23 = new javax.swing.JLabel();
		jLabel24 = new javax.swing.JLabel();
		MK_B = new javax.swing.JLabel();
		MK_Icon_B = new javax.swing.JLabel();
		jLabel26 = new javax.swing.JLabel();
		distB = new javax.swing.JLabel();
		jLabel25 = new javax.swing.JLabel();
		jLabel27 = new javax.swing.JLabel();
		Ma_a = new javax.swing.JLabel();
		Ma_b = new javax.swing.JLabel();
		LabelMasasSolaresA = new javax.swing.JLabel();
		LabelMasasSolaresB = new javax.swing.JLabel();
		MasasSolaresA = new javax.swing.JLabel();
		MasasSolaresB = new javax.swing.JLabel();
		LabelRadiosSolaresA = new javax.swing.JLabel();
		LabelRadiosSolaresB = new javax.swing.JLabel();
		RadiosSolaresA = new javax.swing.JLabel();
		RadiosSolaresB = new javax.swing.JLabel();
		LabelMasasSolaresB1 = new javax.swing.JLabel();
		LabelMasasSolaresB2 = new javax.swing.JLabel();
		LabelMasasSolaresB3 = new javax.swing.JLabel();
		GradosKelvinA = new javax.swing.JLabel();
		GradosKelvinB = new javax.swing.JLabel();
		jPanel4 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		DatosProcesadosTextArea = new javax.swing.JTextArea();
		jPanel5 = new javax.swing.JPanel();
		jLabel28 = new javax.swing.JLabel();
		jLabel29 = new javax.swing.JLabel();
		jLabel30 = new javax.swing.JLabel();
		jLabel31 = new javax.swing.JLabel();
		CoordComponenteA_jTextField = new javax.swing.JTextField();
		CoordComponenteB_jTextField = new javax.swing.JTextField();
		jButton2 = new javax.swing.JButton();
		jLabel32 = new javax.swing.JLabel();
		distanceA_corregida = new javax.swing.JLabel();
		jLabel33 = new javax.swing.JLabel();
		distanceB_corregida = new javax.swing.JLabel();
		jLabel34 = new javax.swing.JLabel();
		jLabel35 = new javax.swing.JLabel();
		jLabel36 = new javax.swing.JLabel();
		E_B_V_a = new javax.swing.JLabel();
		E_B_V_b = new javax.swing.JLabel();
		jLabel37 = new javax.swing.JLabel();
		jLabel38 = new javax.swing.JLabel();
		jLabel39 = new javax.swing.JLabel();
		jPanel7 = new javax.swing.JPanel();
		jLabel49 = new javax.swing.JLabel();
		jLabel50 = new javax.swing.JLabel();
		SDSSra = new javax.swing.JTextField();
		jLabel51 = new javax.swing.JLabel();
		SDSSdec = new javax.swing.JTextField();
		jButton7 = new javax.swing.JButton();
		jLabel52 = new javax.swing.JLabel();
		jLabel53 = new javax.swing.JLabel();
		jLabel54 = new javax.swing.JLabel();
		jButton8 = new javax.swing.JButton();
		jPanel6 = new javax.swing.JPanel();
		jLabel40 = new javax.swing.JLabel();
		jLabel41 = new javax.swing.JLabel();
		jLabel42 = new javax.swing.JLabel();
		jLabel43 = new javax.swing.JLabel();
		jLabel44 = new javax.swing.JLabel();
		jLabel45 = new javax.swing.JLabel();
		jLabel46 = new javax.swing.JLabel();
		jLabel47 = new javax.swing.JLabel();
		jPanel9 = new javax.swing.JPanel();
		dist_A_jButton = new javax.swing.JButton();
		dist_B_jButton = new javax.swing.JButton();
		jPanel10 = new javax.swing.JPanel();
		galacticLocation_A_jButton = new javax.swing.JButton();
		jPanel11 = new javax.swing.JPanel();
		jScrollPane3 = new javax.swing.JScrollPane();
		jTextArea2 = new javax.swing.JTextArea();
		jButton_ProcesarDatos = new javax.swing.JButton();
		jLabel55 = new javax.swing.JLabel();
		jButton9 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jButton_Exportar_Datos.setFont(new java.awt.Font("Segoe UI", 1, 10));
		jButton_Exportar_Datos.setText(_exportData);
		jButton_Exportar_Datos.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton_Exportar_DatosActionPerformed(evt);
			}
		});

		jLabel1.setText(_twomassALabel);

		jLabel2.setText("J");

		jLabel3.setText("H");

		jLabel4.setText("K");

		jLabel5.setText(_glatitude);

		jLabel6.setText(_twomassALabe2);

		jLabel7.setText("J");

		jLabel8.setText("H");

		jLabel9.setText("K");

		jLabel10.setText(_glatitude);

		denominacionA.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				denominacionAActionPerformed(evt);
			}
		});

		jLabel11.setText(_pmRA);

		jLabel12.setText(_pmDec);

		jLabel13.setText(_pmDec);

		jLabel14.setText(_pmRA);

		jTextField_J_A.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField_J_AActionPerformed(evt);
			}
		});

		jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 60));
		jLabel20.setForeground(new java.awt.Color(204, 204, 204));
		jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel20.setText("A");
		jLabel20.setIconTextGap(1);

		jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 60));
		jLabel22.setForeground(new java.awt.Color(204, 204, 204));
		jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel22.setText("B");
		jLabel22.setIconTextGap(1);

		jLabel48.setForeground(new java.awt.Color(153, 0, 0));
		jLabel48.setText(_twoMASScoordsFormatExample);

		jButton3.setFont(new java.awt.Font("Segoe UI", 1, 11));
		jButton3.setForeground(new java.awt.Color(0, 102, 0));
		jButton3.setText(_retrieveJHKfromInternetButton);
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jLabel15.setFont(new java.awt.Font("Calibri", 2, 12));
		jLabel15.setForeground(new java.awt.Color(204, 0, 0));
		jLabel15.setText(_retrieveDataMsg);

		UCAC3_pmra_A.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				UCAC3_pmra_AActionPerformed(evt);
			}
		});

		UCAC3_pmdec_A.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				UCAC3_pmdec_AActionPerformed(evt);
			}
		});

		setUCAC3_button_A.setFont(new java.awt.Font("Segoe UI", 1, 9));
		setUCAC3_button_A.setForeground(new java.awt.Color(0, 102, 0));
		setUCAC3_button_A.setText(_setUCAC3);
		setUCAC3_button_A.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				setUCAC3_button_AActionPerformed(evt);
			}
		});

		jButton10.setFont(new java.awt.Font("Segoe UI", 1, 9));
		jButton10.setForeground(new java.awt.Color(0, 102, 0));
		jButton10.setText(_setUCAC3);
		jButton10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton10ActionPerformed(evt);
			}
		});

		UCAC3_pmra_B.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				UCAC3_pmra_BActionPerformed(evt);
			}
		});

		UCAC3_pmdec_B.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				UCAC3_pmdec_BActionPerformed(evt);
			}
		});

		UCAC4_pmra_A.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				UCAC4_pmra_AActionPerformed(evt);
			}
		});

		UCAC4_pmdec_A.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				UCAC4_pmdec_AActionPerformed(evt);
			}
		});

		jButton11.setForeground(new java.awt.Color(0, 0, 153));
		jButton11.setText(_setUCAC4);
		jButton11.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton11ActionPerformed(evt);
			}
		});

		UCAC4_pmra_B.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				UCAC4_pmra_BActionPerformed(evt);
			}
		});

		UCAC4_pmdec_B.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				UCAC4_pmdec_BActionPerformed(evt);
			}
		});

		jButton12.setForeground(new java.awt.Color(0, 0, 153));
		jButton12.setText(_setUCAC4);
		jButton12.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton12ActionPerformed(evt);
			}
		});

		jButton13.setText(_restorePPMXL);
		jButton13.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton13ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(21, 21, 21).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(jPanel1Layout.createSequentialGroup().addComponent(denominacionA, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(90, 90, 90).addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))).addGap(127, 127, 127)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addComponent(jLabel5).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jTextField_galacticLat_A, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(jPanel1Layout.createSequentialGroup().addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jLabel11).addComponent(jLabel12)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jTextField_pmDEC_A, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jTextField_pmRA_A, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)))).addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addComponent(jLabel4).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jTextField_K_A)).addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel2).addComponent(jLabel3)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(jTextField_H_A).addComponent(jTextField_J_A, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))))).addGap(120, 120, 120).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(UCAC3_pmra_A, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(UCAC3_pmdec_A, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(setUCAC3_button_A).addGap(19, 19, 19).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(UCAC4_pmra_A, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(UCAC4_pmdec_A, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jButton11).addGap(68, 68, 68)))).addGroup(jPanel1Layout.createSequentialGroup().addGap(21, 21, 21).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel6).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(denominacionB, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel7).addComponent(jLabel8).addComponent(jLabel9)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(jTextField_K_B).addComponent(jTextField_H_B).addComponent(jTextField_J_B, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addComponent(jLabel10).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jTextField_galacticLat_B)).addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING)).addComponent(jLabel13)).addGap(19, 19, 19).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jTextField_pmDEC_B, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jTextField_pmRA_B)))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(UCAC3_pmra_B, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(UCAC3_pmdec_B, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jButton10)).addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(UCAC4_pmra_B, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(UCAC4_pmdec_B, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jButton12).addGap(68, 68, 68))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))))).addGap(1, 1, 1)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(30, 30, 30).addComponent(jLabel48).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel1).addComponent(denominacionA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel2).addComponent(jTextField_J_A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel3).addComponent(jTextField_H_A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel4).addComponent(jTextField_K_A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(13, 13, 13).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel5).addComponent(jTextField_galacticLat_A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(setUCAC3_button_A, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(jPanel1Layout.createSequentialGroup().addComponent(UCAC4_pmra_A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(10, 10, 10).addComponent(UCAC4_pmdec_A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(jPanel1Layout.createSequentialGroup().addComponent(UCAC3_pmra_A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(UCAC3_pmdec_A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel11).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel12)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jTextField_pmRA_A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jTextField_pmDEC_A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))).addGap(0, 0, 0))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(79, 79, 79))).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(29, 29, 29).addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(jPanel1Layout.createSequentialGroup().addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jButton13)))).addGap(7, 7, 7).addComponent(jLabel15).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel6).addComponent(denominacionB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel7).addComponent(jTextField_J_B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel8).addComponent(jTextField_H_B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel9).addComponent(jTextField_K_B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel10).addComponent(jTextField_galacticLat_B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel14).addComponent(jTextField_pmRA_B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(10, 10, 10).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel13).addComponent(jTextField_pmDEC_B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))).addGroup(jPanel1Layout.createSequentialGroup().addGap(8, 8, 8).addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(jPanel1Layout.createSequentialGroup().addComponent(UCAC4_pmra_B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(10, 10, 10).addComponent(UCAC4_pmdec_B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))).addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(jPanel1Layout.createSequentialGroup().addComponent(UCAC3_pmra_B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(10, 10, 10).addComponent(UCAC3_pmdec_B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		creditosTabPanel.addTab(_dataEntryTab, jPanel1);

		jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jButton4.setText(_b_vDiagram);
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jButton1.setText(_v_iDiagram);
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton6.setText(_v_jDiagram);
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jLabel16.setText(_distanceInParsecsA);

		jLabel17.setText(_distanceInParsecsB);

		distanceA.setFont(new java.awt.Font("Segoe UI", 0, 14));
		distanceA.setForeground(new java.awt.Color(153, 0, 51));

		distanceB.setFont(new java.awt.Font("Segoe UI", 0, 14));
		distanceB.setForeground(new java.awt.Color(153, 0, 51));

		jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jTextArea1.setColumns(20);
		jTextArea1.setEditable(false);
		jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 12));
		jTextArea1.setForeground(new java.awt.Color(0, 0, 102));
		jTextArea1.setLineWrap(true);
		jTextArea1.setRows(5);
		jTextArea1.setText(_long_legend);
		jTextArea1.setWrapStyleWord(true);
		jTextArea1.setAutoscrolls(false);
		jTextArea1.setOpaque(false);
		jTextArea1.setRequestFocusEnabled(false);
		jScrollPane2.setViewportView(jTextArea1);

		primaria_GIGANTE_Button.setFont(new java.awt.Font("Segoe UI", 1, 9));
		primaria_GIGANTE_Button.setForeground(new java.awt.Color(153, 0, 0));
		primaria_GIGANTE_Button.setText(_primary_is_giant);
		primaria_GIGANTE_Button.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				primaria_GIGANTE_ButtonActionPerformed(evt);
			}
		});

		secundaria_GIGANTE_Button.setFont(new java.awt.Font("Segoe UI", 1, 9));
		secundaria_GIGANTE_Button.setForeground(new java.awt.Color(153, 0, 0));
		secundaria_GIGANTE_Button.setText(_secondary_is_giant);
		secundaria_GIGANTE_Button.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				secundaria_GIGANTE_ButtonActionPerformed(evt);
			}
		});

		AMBAS_GIGANTES_Button.setFont(new java.awt.Font("Segoe UI", 1, 9));
		AMBAS_GIGANTES_Button.setForeground(new java.awt.Color(153, 0, 0));
		AMBAS_GIGANTES_Button.setText(_both_are_giant);
		AMBAS_GIGANTES_Button.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				AMBAS_GIGANTES_ButtonActionPerformed(evt);
			}
		});

		jButton14.setFont(new java.awt.Font("Segoe UI", 1, 9));
		jButton14.setForeground(new java.awt.Color(0, 102, 0));
		jButton14.setEnabled(false);

		jButton15.setFont(new java.awt.Font("Segoe UI", 1, 9));
		jButton15.setForeground(new java.awt.Color(0, 102, 0));
		jButton15.setEnabled(false);

		jButton16.setFont(new java.awt.Font("Segoe UI", 1, 9));
		jButton16.setForeground(new java.awt.Color(0, 102, 0));
		jButton16.setEnabled(false);

		jButton17.setText(_recalcDistance);
		jButton17.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton17ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
		jPanel8.setLayout(jPanel8Layout);
		jPanel8Layout.setHorizontalGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel8Layout.createSequentialGroup().addContainerGap().addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE).addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup().addComponent(AMBAS_GIGANTES_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup().addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addComponent(primaria_GIGANTE_Button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(secundaria_GIGANTE_Button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)).addGap(18, 18, 18).addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)))).addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)).addContainerGap()));
		jPanel8Layout.setVerticalGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel8Layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(27, 27, 27).addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(primaria_GIGANTE_Button).addComponent(jButton14)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(secundaria_GIGANTE_Button).addComponent(jButton15)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(AMBAS_GIGANTES_Button).addComponent(jButton16)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(28, Short.MAX_VALUE)));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addContainerGap()).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addGap(167, 167, 167).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel17).addGap(8, 8, 8).addComponent(distanceB, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)).addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE).addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE).addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE).addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel16).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(distanceA, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE))).addGap(138, 138, 138)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(33, 33, 33).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel16).addComponent(distanceA, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel17).addComponent(distanceB, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addContainerGap()));

		creditosTabPanel.addTab(_reducedPMTab, jPanel2);

		jPanel3.setBackground(new java.awt.Color(0, 0, 0));
		jPanel3.setForeground(new java.awt.Color(255, 255, 204));
		jPanel3.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				jPanel3FocusGained(evt);
			}
		});

		jButton5.setBackground(new java.awt.Color(102, 102, 102));
		jButton5.setForeground(new java.awt.Color(51, 51, 51));
		jButton5.setText(_doubleColorDiagramButton);
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jLabel18.setForeground(new java.awt.Color(255, 255, 204));
		jLabel18.setText(_componentA);

		jLabel19.setForeground(new java.awt.Color(255, 255, 204));
		jLabel19.setText(_spectralType);

		MK_A.setFont(new java.awt.Font("Segoe UI", 1, 18));
		MK_A.setForeground(new java.awt.Color(0, 255, 0));
		MK_A.setText("B3V");

		jLabel21.setForeground(new java.awt.Color(255, 255, 204));
		jLabel21.setText(_A_distanceInParsecs);

		disstA.setFont(new java.awt.Font("Segoe UI", 0, 18));
		disstA.setForeground(new java.awt.Color(153, 255, 255));

		jLabel23.setForeground(new java.awt.Color(255, 255, 204));
		jLabel23.setText(_componentB);

		jLabel24.setForeground(new java.awt.Color(255, 255, 204));
		jLabel24.setText(_spectralType);

		MK_B.setFont(new java.awt.Font("Segoe UI", 1, 18));
		MK_B.setForeground(new java.awt.Color(0, 255, 0));
		MK_B.setText("B3V");

		jLabel26.setForeground(new java.awt.Color(255, 255, 204));
		jLabel26.setText(_B_distanceInParsecs);

		distB.setFont(new java.awt.Font("Segoe UI", 0, 18));
		distB.setForeground(new java.awt.Color(153, 255, 255));

		jLabel25.setForeground(new java.awt.Color(255, 255, 204));
		jLabel25.setText(_abosluteMag);

		jLabel27.setForeground(new java.awt.Color(255, 255, 204));
		jLabel27.setText(_abosluteMag);

		Ma_a.setFont(new java.awt.Font("Segoe UI", 1, 18));
		Ma_a.setForeground(new java.awt.Color(204, 255, 255));
		Ma_a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

		Ma_b.setFont(new java.awt.Font("Segoe UI", 1, 18));
		Ma_b.setForeground(new java.awt.Color(204, 255, 255));
		Ma_b.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

		LabelMasasSolaresA.setForeground(new java.awt.Color(255, 255, 204));
		LabelMasasSolaresA.setText("Masas Solares:");

		LabelMasasSolaresB.setForeground(new java.awt.Color(255, 255, 204));
		LabelMasasSolaresB.setText("Masas Solares:");

		MasasSolaresA.setFont(new java.awt.Font("Segoe UI", 1, 12));
		MasasSolaresA.setForeground(new java.awt.Color(204, 255, 255));
		MasasSolaresA.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		MasasSolaresA.setText("Masas Solares");

		MasasSolaresB.setFont(new java.awt.Font("Segoe UI", 1, 12));
		MasasSolaresB.setForeground(new java.awt.Color(204, 255, 255));
		MasasSolaresB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		MasasSolaresB.setText("Masas Solares");

		LabelRadiosSolaresA.setForeground(new java.awt.Color(255, 255, 204));
		LabelRadiosSolaresA.setText("Radio (Sol = 1 radio) :");

		LabelRadiosSolaresB.setForeground(new java.awt.Color(255, 255, 204));
		LabelRadiosSolaresB.setText("Radio (Sol = 1 radio) :");

		RadiosSolaresA.setFont(new java.awt.Font("Segoe UI", 1, 12));
		RadiosSolaresA.setForeground(new java.awt.Color(204, 255, 255));
		RadiosSolaresA.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		RadiosSolaresA.setText("Radios Solares");

		RadiosSolaresB.setFont(new java.awt.Font("Segoe UI", 1, 12));
		RadiosSolaresB.setForeground(new java.awt.Color(204, 255, 255));
		RadiosSolaresB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		RadiosSolaresB.setText("Radios Solares");

		LabelMasasSolaresB1.setForeground(new java.awt.Color(255, 255, 204));

		LabelMasasSolaresB2.setForeground(new java.awt.Color(255, 255, 204));
		LabelMasasSolaresB2.setText("" + (char) 186 + " Kelvin");

		LabelMasasSolaresB3.setForeground(new java.awt.Color(255, 255, 204));
		LabelMasasSolaresB3.setText("" + (char) 186 + " Kelvin");

		GradosKelvinA.setFont(new java.awt.Font("Segoe UI", 1, 12));
		GradosKelvinA.setForeground(new java.awt.Color(204, 255, 255));
		GradosKelvinA.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		GradosKelvinA.setText("grados Kelvin");

		GradosKelvinB.setFont(new java.awt.Font("Segoe UI", 1, 12));
		GradosKelvinB.setForeground(new java.awt.Color(204, 255, 255));
		GradosKelvinB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		GradosKelvinB.setText("grados Kelvin");

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGap(131, 131, 131).addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap()).addGroup(jPanel3Layout.createSequentialGroup().addGap(20, 20, 20).addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel19).addComponent(jLabel18).addGroup(jPanel3Layout.createSequentialGroup().addGap(37, 37, 37).addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(MK_A, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(MK_icon_A, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))).addGroup(jPanel3Layout.createSequentialGroup().addGap(12, 12, 12).addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel21).addComponent(disstA, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel25).addComponent(Ma_a, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(jPanel3Layout.createSequentialGroup().addComponent(LabelMasasSolaresA).addGap(18, 18, 18).addComponent(MasasSolaresA, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)).addComponent(LabelMasasSolaresB1).addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(LabelRadiosSolaresA).addComponent(LabelMasasSolaresB2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(GradosKelvinA, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(RadiosSolaresA, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE).addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel23).addComponent(jLabel24).addGroup(jPanel3Layout.createSequentialGroup().addGap(37, 37, 37).addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(MK_B, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(MK_Icon_B, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))).addComponent(distB, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel26).addComponent(jLabel27).addComponent(Ma_b, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(jPanel3Layout.createSequentialGroup().addComponent(LabelMasasSolaresB).addGap(18, 18, 18).addComponent(MasasSolaresB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addGroup(jPanel3Layout.createSequentialGroup().addComponent(LabelMasasSolaresB3).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(GradosKelvinB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup().addComponent(LabelRadiosSolaresB).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(RadiosSolaresB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))).addGap(59, 59, 59)));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGap(20, 20, 20).addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jLabel18).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel19).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(MK_A).addGap(2, 2, 2).addComponent(MK_icon_A, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel21).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(disstA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jLabel23).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel24).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(MK_B).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(MK_Icon_B, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel26).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(distB, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel25).addComponent(jLabel27)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(Ma_a, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(Ma_b, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(LabelMasasSolaresA).addComponent(LabelMasasSolaresB).addComponent(MasasSolaresA).addComponent(MasasSolaresB)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(LabelRadiosSolaresA).addComponent(LabelRadiosSolaresB).addComponent(RadiosSolaresA).addComponent(RadiosSolaresB)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(LabelMasasSolaresB1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(LabelMasasSolaresB2).addComponent(LabelMasasSolaresB3).addComponent(GradosKelvinA).addComponent(GradosKelvinB)).addGap(18, 18, 18)));

		creditosTabPanel.addTab(_astrophysicAnalysis, jPanel3);

		DatosProcesadosTextArea.setColumns(80);
		DatosProcesadosTextArea.setFont(new java.awt.Font("Consolas", 0, 11));
		DatosProcesadosTextArea.setRows(200);
		DatosProcesadosTextArea.setWrapStyleWord(true);
		DatosProcesadosTextArea.setDoubleBuffered(true);
		jScrollPane1.setViewportView(DatosProcesadosTextArea);

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(71, Short.MAX_VALUE)));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE).addContainerGap()));

		creditosTabPanel.addTab(_processedData, jPanel4);

		jLabel28.setForeground(new java.awt.Color(153, 0, 0));
		jLabel28.setText(_intenetConnectionNeededMessage);

		jLabel29.setForeground(new java.awt.Color(153, 0, 0));
		jLabel29.setText(_coordinateFormatLegend);

		jLabel30.setText(_A_coordinatesLabel);

		jLabel31.setText(_B_coordinatesLabel);

		jButton2.setText(_de_reddeningButton);
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 14));
		jLabel32.setText(_distanceToA);

		distanceA_corregida.setFont(new java.awt.Font("Segoe UI", 1, 18));
		distanceA_corregida.setForeground(new java.awt.Color(153, 0, 51));

		jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 14));
		jLabel33.setText(_distanceToB);

		distanceB_corregida.setFont(new java.awt.Font("Segoe UI", 1, 18));
		distanceB_corregida.setForeground(new java.awt.Color(153, 0, 51));

		jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 14));
		jLabel34.setText(_e_b_v_componentA_label);

		jLabel35.setText(_colorExcessLabel);

		jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 14));
		jLabel36.setText(_e_b_v_componentB_label);

		E_B_V_a.setFont(new java.awt.Font("Segoe UI", 1, 14));
		E_B_V_a.setForeground(new java.awt.Color(0, 0, 102));

		E_B_V_b.setFont(new java.awt.Font("Segoe UI", 1, 14));
		E_B_V_b.setForeground(new java.awt.Color(0, 0, 102));

		jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/gedraa/imagenes/excesoDeColor.png"))); // NOI18N

		jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/gedraa/imagenes/Av.png"))); // NOI18N

		jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/gedraa/imagenes/distancia_corregida.png"))); // NOI18N

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addGap(165, 165, 165).addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(250, Short.MAX_VALUE)).addGroup(jPanel5Layout.createSequentialGroup().addGap(82, 82, 82).addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jLabel35).addComponent(jLabel34).addComponent(jLabel36)).addGap(47, 47, 47).addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(E_B_V_a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(E_B_V_b, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))).addGroup(jPanel5Layout.createSequentialGroup().addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(36, 36, 36).addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)).addGroup(jPanel5Layout.createSequentialGroup().addComponent(jLabel33).addGap(8, 8, 8).addComponent(distanceB_corregida, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)).addGroup(jPanel5Layout.createSequentialGroup().addComponent(jLabel32).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(distanceA_corregida, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE))).addGap(227, 227, 227)).addGroup(jPanel5Layout.createSequentialGroup().addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addGap(21, 21, 21).addComponent(CoordComponenteA_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(jPanel5Layout.createSequentialGroup().addGap(41, 41, 41).addComponent(jLabel30)).addGroup(jPanel5Layout.createSequentialGroup().addGap(53, 53, 53).addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel29)))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel31).addComponent(CoordComponenteB_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(24, Short.MAX_VALUE)));
		jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addComponent(jLabel28).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel29).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel30).addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(CoordComponenteA_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(CoordComponenteB_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(18, 18, 18).addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(26, 26, 26).addComponent(jLabel35).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel34).addComponent(E_B_V_a, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(22, 22, 22).addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jLabel36).addComponent(E_B_V_b, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(18, 18, 18).addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(23, 23, 23).addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel32).addComponent(distanceA_corregida, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel33).addComponent(distanceB_corregida, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)).addContainerGap()));

		creditosTabPanel.addTab(_galacticExtinction, jPanel5);

		jLabel49.setForeground(new java.awt.Color(102, 0, 0));
		jLabel49.setText(_please_enter_coordinates_label);

		jLabel50.setText(_ra);

		jLabel51.setText("DEC :");

		jButton7.setText(_retrieveSDSS_image_button);
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		jLabel52.setForeground(new java.awt.Color(102, 0, 0));

		jLabel53.setForeground(new java.awt.Color(102, 0, 0));
		jLabel53.setText(_coord_format_example);

		jLabel54.setFont(new java.awt.Font("Tahoma", 2, 11));
		jLabel54.setText(_advice_about_jhk_automatic_retrieving);

		jButton8.setText(_wise);
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton8ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
		jPanel7.setLayout(jPanel7Layout);
		jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel7Layout.createSequentialGroup().addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel7Layout.createSequentialGroup().addGap(221, 221, 221).addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addGroup(jPanel7Layout.createSequentialGroup().addComponent(jLabel50).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(SDSSra, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(jPanel7Layout.createSequentialGroup().addComponent(jLabel51).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(SDSSdec, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)).addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE).addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))).addGroup(jPanel7Layout.createSequentialGroup().addContainerGap().addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(jPanel7Layout.createSequentialGroup().addContainerGap().addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(jPanel7Layout.createSequentialGroup().addContainerGap().addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel7Layout.createSequentialGroup().addContainerGap().addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(33, 33, 33).addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel50).addComponent(SDSSra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(36, 36, 36).addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel51).addComponent(SDSSdec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(18, 18, 18).addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(128, Short.MAX_VALUE)));

		creditosTabPanel.addTab(_sdssImaage, jPanel7);

		jLabel40.setText(_eqcolorexcess);

		jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/gedraa/imagenes/excesoDeColor.png"))); // NOI18N

		jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/gedraa/imagenes/Av.png"))); // NOI18N

		jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/gedraa/imagenes/distancia_corregida.png"))); // NOI18N

		jLabel44.setText(_eqdistance);

		jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/gedraa/imagenes/distance.png"))); // NOI18N

		jLabel46.setText(_absoluteMag);

		jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/gedraa/imagenes/mag_absoluta.png"))); // NOI18N

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addGap(165, 165, 165).addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jLabel40).addComponent(jLabel46)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))).addGroup(jPanel6Layout.createSequentialGroup().addGap(166, 166, 166).addComponent(jLabel44).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))).addContainerGap(192, Short.MAX_VALUE)));
		jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addGap(111, 111, 111).addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel45, javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jLabel44, javax.swing.GroupLayout.Alignment.TRAILING)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addGap(8, 8, 8).addComponent(jLabel40)).addGroup(jPanel6Layout.createSequentialGroup().addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))).addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(6, 6, 6).addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(jPanel6Layout.createSequentialGroup().addGap(47, 47, 47).addComponent(jLabel46))).addContainerGap(224, Short.MAX_VALUE)));

		creditosTabPanel.addTab(_formulae, jPanel6);

		dist_A_jButton.setFont(new java.awt.Font("Segoe UI", 1, 12));
		dist_A_jButton.setForeground(new java.awt.Color(102, 0, 0));
		dist_A_jButton.setText(_buttonSpectral_A);
		dist_A_jButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				dist_A_jButtonActionPerformed(evt);
			}
		});

		dist_B_jButton.setFont(new java.awt.Font("Segoe UI", 1, 12));
		dist_B_jButton.setForeground(new java.awt.Color(102, 0, 0));
		dist_B_jButton.setText(_buttonSpectral_B);
		dist_B_jButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				dist_B_jButtonActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
		jPanel9.setLayout(jPanel9Layout);
		jPanel9Layout.setHorizontalGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel9Layout.createSequentialGroup().addGap(25, 25, 25).addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addComponent(dist_A_jButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(dist_B_jButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)).addContainerGap(98, Short.MAX_VALUE)));
		jPanel9Layout.setVerticalGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel9Layout.createSequentialGroup().addGap(39, 39, 39).addComponent(dist_A_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(29, 29, 29).addComponent(dist_B_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(363, Short.MAX_VALUE)));

		creditosTabPanel.addTab(_spectralEnergyDistribution, jPanel9);

		galacticLocation_A_jButton.setText(_probablyGalacticLocation);
		galacticLocation_A_jButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				galacticLocation_A_jButtonActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
		jPanel10.setLayout(jPanel10Layout);
		jPanel10Layout.setHorizontalGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel10Layout.createSequentialGroup().addGap(79, 79, 79).addComponent(galacticLocation_A_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(159, Short.MAX_VALUE)));
		jPanel10Layout.setVerticalGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel10Layout.createSequentialGroup().addGap(34, 34, 34).addComponent(galacticLocation_A_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(420, Short.MAX_VALUE)));

		creditosTabPanel.addTab(_probablyGalacticLocation, jPanel10);

		jTextArea2.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
		jTextArea2.setColumns(80);
		jTextArea2.setEditable(false);
		jTextArea2.setFont(new java.awt.Font("Calibri", 0, 13));
		jTextArea2.setForeground(new java.awt.Color(153, 0, 0));
		jTextArea2.setLineWrap(true);
		jTextArea2.setRows(30);
		jTextArea2.setText(_creditsList);
		jTextArea2.setWrapStyleWord(true);
		jTextArea2.setDoubleBuffered(true);
		jTextArea2.setOpaque(false);
		jScrollPane3.setViewportView(jTextArea2);

		javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
		jPanel11.setLayout(jPanel11Layout);
		jPanel11Layout.setHorizontalGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel11Layout.createSequentialGroup().addGap(17, 17, 17).addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(63, Short.MAX_VALUE)));
		jPanel11Layout.setVerticalGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel11Layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(17, Short.MAX_VALUE)));

		creditosTabPanel.addTab(_creditos, jPanel11);

		jButton_ProcesarDatos.setFont(new java.awt.Font("Segoe UI", 1, 11));
		jButton_ProcesarDatos.setForeground(new java.awt.Color(102, 0, 0));
		jButton_ProcesarDatos.setText(_processEnteredData);
		jButton_ProcesarDatos.setLabel(_processEnteredData);
		jButton_ProcesarDatos.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton_ProcesarDatosActionPerformed(evt);
			}
		});

		jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/gedraa/imagenes/newlogosmall.png"))); // NOI18N

		jButton9.setText("Hertzprung-Russell");
		jButton9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton9ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(creditosTabPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE).addGroup(layout.createSequentialGroup().addComponent(jButton_ProcesarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(31, 31, 31).addComponent(jButton_Exportar_Datos).addGap(27, 27, 27).addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(layout.createSequentialGroup().addComponent(creditosTabPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE).addGap(8, 8, 8).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(jButton_ProcesarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE).addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jButton_Exportar_Datos, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)))).addContainerGap()));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

		VoptionParameters a_params2;
		VoptionParameters b_params2;

		if (_2mass_catalog_a == null) {
			_2mass_catalog_a = new TWOMASScatalog("NP");
			_ucac3_catalog_a = new UCAC3catalog("NP");
			_ucac4_catalog_a = new UCAC4catalog("NP");
			_usnob1_catalog_a = new USNOB1catalog("NP");
			_cmc14_catalog_a = new CMC14catalog("NP");

			a_params2 = new VoptionParameters(2, _2mass_catalog_a._twoMASSList, _ucac3_catalog_a._ucac3List, _ucac4_catalog_a._ucac4List, "", _usnob1_catalog_a._usnob1List, _cmc14_catalog_a._cmc14List);
		}

		if (_2mass_catalog_b == null) {
			_2mass_catalog_b = new TWOMASScatalog("NP");
			_ucac3_catalog_b = new UCAC3catalog("NP");
			_ucac4_catalog_b = new UCAC4catalog("NP");
			_usnob1_catalog_b = new USNOB1catalog("NP");
			_cmc14_catalog_b = new CMC14catalog("NP");

			b_params2 = new VoptionParameters(2, _2mass_catalog_b._twoMASSList, _ucac3_catalog_b._ucac3List, _ucac4_catalog_b._ucac4List, "",_usnob1_catalog_b._usnob1List, _cmc14_catalog_b._cmc14List);
		}
		float floatA = (float) componenteA.getdModulus();
		float floatB = (float) componenteB.getdModulus();
		try {
			Distancia d = new Distancia(floatA, floatB, _sun, _primary, _secondary);
		
		} catch (Exception e1) {
			JTextArea textArea = new JTextArea();
			String a = e1.getMessage();
			String s = e1.getStackTrace().toString();
			textArea.setText(a + "\n" + s); // A string of ~100 words "Lorem ipsum...\nFin."
			textArea.setColumns(50);
			textArea.setOpaque(false);
			textArea.setEditable(false);
			textArea.setLineWrap(true);
			textArea.setWrapStyleWord(true);
			JOptionPane.showMessageDialog(null, textArea, "Truncated!", JOptionPane.WARNING_MESSAGE);
			e1.printStackTrace();
		}
	}

	private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
		// HRD:

		try {
			HRD hrd = new HRD("HRD", componenteA.getTemperature(), componenteA.getM(), componenteB.getTemperature(), componenteB.getM(), _primary, _secondary, "Secuencia Principal");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

		jTextField_pmRA_B.setText(this.UCAC4_pmra_B.getText());
		jTextField_pmDEC_B.setText(this.UCAC4_pmdec_B.getText());
	}

	private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

		jTextField_pmRA_A.setText(this.UCAC4_pmra_A.getText());
		jTextField_pmDEC_A.setText(this.UCAC4_pmdec_A.getText());
	}

	private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		jTextField_pmRA_B.setText(this.UCAC3_pmra_B.getText());
		jTextField_pmDEC_B.setText(this.UCAC3_pmdec_B.getText());
	}

	private void setUCAC3_button_AActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

		jTextField_pmRA_A.setText(this.UCAC3_pmra_A.getText());
		jTextField_pmDEC_A.setText(this.UCAC3_pmdec_A.getText());
	}

	private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		//RESTORE  PPMXL 
		jTextField_pmRA_A.setText(ppxml_ra_a);
		jTextField_pmDEC_A.setText(ppxml_de_a);
		jTextField_pmRA_B.setText(ppxml_ra_b);
		jTextField_pmDEC_B.setText(ppxml_de_b);

	}

	private void UCAC4_pmdec_BActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	void UCAC4_pmra_BActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	void UCAC4_pmdec_AActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	void UCAC4_pmra_AActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void UCAC3_pmdec_BActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	void UCAC3_pmra_BActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void UCAC3_pmdec_AActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void UCAC3_pmra_AActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		try {
			this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
			// Processing .....
			String ra = SDSSra.getText();
			String dec = SDSSdec.getText();
			String coords = "ra=" + ra + "&dec=" + dec;
			WISEImage img = new WISEImage(coords);
			/*				try {
			 Thread.sleep(3000);
			 } catch (InterruptedException e) {
			 // TODO Auto-generated catch block
			 e.printStackTrace();
			 }*/

			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					try {
						VisorWISE vw = new VisorWISE();
						vw.validate();
						vw.revalidate();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
		} finally {
			this.setCursor(Cursor.getDefaultCursor());
		}

	}

	private void galacticLocation_A_jButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		try {
			ProbableUbicacionGalactica p = new ProbableUbicacionGalactica(_probablyGalacticLocationButton, componenteA.getH()
			    - componenteA.getK(), componenteA.getJ() - componenteA.getH(), componenteB.getH() - componenteB.getK(), componenteB.getJ()
			    - componenteB.getH(), _primary, _secondary);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void dist_B_jButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		Fluxes f = new Fluxes(_secondary, componenteB.getSpectralType(), componenteB, _wavelength, _colorIndexValue, _theoreticalModel, _photometry);
	}

	private void dist_A_jButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

		Fluxes f = new Fluxes(_primary, componenteA.getSpectralType(), componenteA, _wavelength, _colorIndexValue, _theoreticalModel, _photometry);
	}

	protected void denominacionAActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub

	}

	protected void AMBAS_GIGANTES_ButtonActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		componenteA.recalculateBecauseIsGIANT();
		componenteB.recalculateBecauseIsGIANT();
		reProcesarDatos();
	}

	private void primaria_GIGANTE_ButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

		componenteA.recalculateBecauseIsGIANT();
		reProcesarDatos();
	}

	private void secundaria_GIGANTE_ButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

		componenteB.recalculateBecauseIsGIANT();
		reProcesarDatos();
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		// Llamado a Sloan SDSS Image
		try {
			this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
			// Processing .....

			v = null;
			String ra = SDSSra.getText();
			String dec = SDSSdec.getText();
			String coords = "ra=" + ra + "&dec=" + dec;
			SDSSImage img = new SDSSImage(coords, "&width=512", "&height=512");
			/*				try {
			 Thread.sleep(3000);
			 } catch (InterruptedException e) {
			 // TODO Auto-generated catch block
			 e.printStackTrace();
			 }*/

			final String titulo = "Coord.  RA: " + ra + "  DEC: " + dec;
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					try {
						v = new Visor(titulo);
						v.validate();
						v.revalidate();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});

		} finally {
			this.setCursor(Cursor.getDefaultCursor());
		}
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

		//*********************************************************************************************
		//*********************************************************************************************
		//***                                                                                       ***
		//***                                                                                       ***
		//***                       CATALOGOS ON LINE                                               ***
		//***                                                                                       ***
		//***                                                                                       ***
		//***                                                                                       ***
		//*********************************************************************************************
		//*********************************************************************************************		
		
		
		//Trae datos desde catálogos en línea...

		//    public RedirectFrame
		//   (boolean catchErrors, boolean logFile, String fileName, int width,
		//       int height, int closeOperation, String title);

		try {
			this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
			String s_a = denominacionA.getText().substring(6);
			String s_b = denominacionB.getText().substring(6);
			TWOMASScatalog a = new TWOMASScatalog(s_a);
			_2mass_catalog_a = a;
			TWOMASScatalog b = new TWOMASScatalog(s_b);
			_2mass_catalog_b = b;
			jTextField_J_A.setText(String.valueOf(a.getJmag()));
			jTextField_H_A.setText(String.valueOf(a.getHmag()));
			jTextField_K_A.setText(String.valueOf(a.getKmag()));
			jTextField_J_B.setText(String.valueOf(b.getJmag()));
			jTextField_H_B.setText(String.valueOf(b.getHmag()));
			jTextField_K_B.setText(String.valueOf(b.getKmag()));
			jTextField_galacticLat_A.setText(String.valueOf(a.getgLatitud()));
			jTextField_galacticLat_B.setText(String.valueOf(b.getgLatitud()));
			SDSSra.setText(a.getRa_dec());
			SDSSdec.setText(a.getDec_dec());
			String idParaUCAC4_a = b.getRa_dec() + b.getDec_dec();
			String idParaUCAC4_b = b.getRa_dec() + b.getDec_dec();
			// Transformacion a coordenadas hexa formato largo
			VoptionParameters apar = new VoptionParameters(1, new ArrayList<TwoMASS>(), new ArrayList<UCAC3>(), new ArrayList<UCAC4>(), "", new ArrayList<USNOB1>(), new ArrayList<CMC14>());
			VoptionParameters bpar = new VoptionParameters(1, new ArrayList<TwoMASS>(), new ArrayList<UCAC3>(), new ArrayList<UCAC4>(), "", new ArrayList<USNOB1>(), new ArrayList<CMC14>());
			TWOMASSStar esta = new TWOMASSStar(12.00, 12.00, 10.50, 34.00, -0.789, -0.0929, 2, apar);// Fake star
			TWOMASSStar estb = new TWOMASSStar(12.00, 12.00, 10.50, 34.00, -0.789, -0.0929, 2, bpar);// Fake star
			esta.setLonghexaCoords(s_a);
			estb.setLonghexaCoords(s_b);
			CoordComponenteA_jTextField.setText(esta.getLonghexaCoords());
			CoordComponenteB_jTextField.setText(estb.getLonghexaCoords());
			PPMXLcatalog ppmxl_a = new PPMXLcatalog(s_a);
			PPMXLcatalog ppmxl_b = new PPMXLcatalog(s_b);
			this.jTextField_pmRA_A.setText(String.valueOf(ppmxl_a.getPmRA()));
			this.jTextField_pmRA_B.setText(String.valueOf(ppmxl_b.getPmRA()));
			this.jTextField_pmDEC_A.setText(String.valueOf(ppmxl_a.getPmDEC()));
			this.jTextField_pmDEC_B.setText(String.valueOf(ppmxl_b.getPmDEC()));

			ppxml_ra_a = String.valueOf(ppmxl_a.getPmRA());
			ppxml_de_a = String.valueOf(ppmxl_a.getPmDEC());
			ppxml_ra_b = String.valueOf(ppmxl_b.getPmRA());
			ppxml_de_b = String.valueOf(ppmxl_b.getPmDEC());

			UCAC3catalog ucacA = new UCAC3catalog(s_a);
			_ucac3_catalog_a = ucacA;
			UCAC3catalog ucacB = new UCAC3catalog(s_b);
			_ucac3_catalog_b = ucacB;
			this.UCAC3_pmra_A.setText(String.valueOf(ucacA.getPmRA()));
			this.UCAC3_pmdec_A.setText(String.valueOf(ucacA.getPmDEC()));
			this.UCAC3_pmra_B.setText(String.valueOf(ucacB.getPmRA()));
			this.UCAC3_pmdec_B.setText(String.valueOf(ucacB.getPmDEC()));

			UCAC4catalog ucac4A = new UCAC4catalog(idParaUCAC4_a);
			_ucac4_catalog_a = ucac4A;
			UCAC4catalog ucac4B = new UCAC4catalog(idParaUCAC4_b);
			_ucac4_catalog_b = ucac4B;
			
			UCAC4_pmra_A.setText(String.valueOf(ucac4A.getPmRA()));
			UCAC4_pmdec_A.setText(String.valueOf(ucac4A.getPmDEC()));
			UCAC4_pmra_B.setText(String.valueOf(ucac4B.getPmRA()));
			UCAC4_pmdec_B.setText(String.valueOf(ucac4B.getPmDEC()));
			_ucac4_catalog_a.setVmag(ucac4A.getVmag());
			_ucac4_catalog_b.setVmag(ucac4B.getVmag());

			USNOB1catalog usnoA = new USNOB1catalog(s_a);
			_usnob1_catalog_a = usnoA;
			USNOB1catalog usnoB = new USNOB1catalog(s_b);
			_usnob1_catalog_b = usnoB;

			CMC14catalog cmc14A = new CMC14catalog(idParaUCAC4_a);
			_cmc14_catalog_a = cmc14A;
			CMC14catalog cmc14B = new CMC14catalog(idParaUCAC4_b);
			_cmc14_catalog_b = cmc14B;


			//******************************************************

		} finally {
			this.setCursor(Cursor.getDefaultCursor());
		}

	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// Extinción Galactica:
		
		InterstellarReddening a = new InterstellarReddening(this.CoordComponenteA_jTextField.getText());
		InterstellarReddening b = new InterstellarReddening(this.CoordComponenteB_jTextField.getText());
		double excesoColorA = a.getColorExcessB_V();
		double excesoColorB = b.getColorExcessB_V();
		this.E_B_V_a.setText(String.valueOf(excesoColorA));
		this.E_B_V_b.setText(String.valueOf(excesoColorB));
		double a_corregida = componenteA.distanceCorrectedByGalacticExtinction(excesoColorA);
		double b_corregida = componenteB.distanceCorrectedByGalacticExtinction(excesoColorB);
		correctedDist_A = a_corregida;
		correctedDist_B = b_corregida;

		this.distanceA_corregida.setText(String.valueOf(a_corregida));
		this.distanceB_corregida.setText(String.valueOf(b_corregida));
	}

	private void jPanel3FocusGained(java.awt.event.FocusEvent evt) {
		// TODO add your handling code here:

	}

	private void jButton_Exportar_DatosActionPerformed(java.awt.event.ActionEvent evt) {
		
		// Exportar datos
		WordprocessingMLPackage wordMLPackage;
		try {
			this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
			wordMLPackage = WordprocessingMLPackage.createPackage();
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Title", _rptTitle);
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Subtitle", _rptSubtitle);
			// Captura de pantalla del analisis astrofisico
			// la imagen a insertar
			try {
				grabScreenShot();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			File archivoImagen = new File("screen.jpg");

			// Our utility method wants that as a byte array
			java.io.InputStream istream = new java.io.FileInputStream(archivoImagen);
			long largo = archivoImagen.length();
			// You cannot create an array using a long type.
			// It needs to be an int type.
			if (largo > Integer.MAX_VALUE) {
				System.out.println("File too large!!");
			}
			byte[] bytes0 = new byte[(int) largo];
			int offset0 = 0;
			int numRead0 = 0;
			while (offset0 < bytes0.length && (numRead0 = istream.read(bytes0, offset0, bytes0.length - offset0)) >= 0) {
				offset0 += numRead0;
			}
			// Ensure all the bytes have been read in
			if (offset0 < bytes0.length) {
				System.out.println("Could not completely read archivoImagen " + archivoImagen.getName());
			}
			istream.close();

			String archivoImagennameHint = null;
			String altText0 = null;
			int id10 = 0;
			int id20 = 1;

			// Image 1: no width specified
			org.docx4j.wml.P p0;
			try {
				p0 = newImage(wordMLPackage, bytes0, archivoImagennameHint, altText0, id10, id20);
				wordMLPackage.getMainDocumentPart().addObject(p0);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// Componente A ******************************************
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading1", _rpt_analysisA
			    + this.denominacionA.getText());
			//wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", componenteA.toString());
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", _rpt_V);
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteA.getV()));
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", _rpt_J);
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteA.getJ()));
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", _rpt_H);
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteA.getH()));
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", _rpt_K);
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteA.getK()));
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", _rpt_b_v);
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteA.getB_V()));
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", _rpt_v_i);
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteA.getV_I()));
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", _rpt_v_j);
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteA.getV_J()));
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", _rpt_M);
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteA.getM()));
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", _rpt_glat);
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteA.getGalacticLatitude()));
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", _rpt_BolCorr);
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteA.getBolCorrection()));
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", _rpt_distance);
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteA.getdModulus()));
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", _rpt_corrected_distance);
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(this.correctedDist_A));
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", _rpt_color_excess);
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", this.E_B_V_a.getText());
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", _rpt_Av);
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteA.getAv()));
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", _rpt_SpecType);
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", componenteA.getSpectralType());
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", _rpt_pmRA);
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteA.getPmRA()));
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", _rpt_pmDEC);
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteA.getPmDEC()));
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", _rpt_total_pm);
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteA.getTotalPM()));
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", _rpt_reducedPM);
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteA.getReducedPM()));

			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", "SEXAGESIMAL Coords: ");
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteA.getLonghexaCoords()));
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", "Temperature: ");
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteA.getTemperature()));
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", "Solar Masses: ");
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteA.getSolarMasses()));
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", "Radius: ");
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteA.getRadius()));
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", "Bolometric Abs. Magnitude: ");
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteA.getBolometricAbsoluteMagnitud()));

			// Componente B ******************************************
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading1", _rpt_analysisB
			    + this.denominacionB.getText());
			//wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", componenteB.toString());
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", _rpt_V);
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteB.getV()));
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", _rpt_J);
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteB.getJ()));
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", _rpt_H);
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteB.getH()));
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", _rpt_K);
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteB.getK()));
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", _rpt_b_v);
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteB.getB_V()));
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", _rpt_v_i);
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteB.getV_I()));
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", _rpt_v_j);
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteB.getV_J()));
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", _rpt_M);
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteB.getM()));
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", _rpt_glat);
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteB.getGalacticLatitude()));
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", _rpt_BolCorr);
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteB.getBolCorrection()));
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", _rpt_distance);
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteB.getdModulus()));
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", _rpt_corrected_distance);
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(this.correctedDist_B));
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", _rpt_color_excess);
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", this.E_B_V_b.getText());
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", _rpt_Av);
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteB.getAv()));
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", _rpt_SpecType);
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", componenteB.getSpectralType());
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", _rpt_pmRA);
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteB.getPmRA()));
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", _rpt_pmDEC);
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteB.getPmDEC()));
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", _rpt_total_pm);
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteB.getTotalPM()));
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", _rpt_reducedPM);
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteB.getReducedPM()));

			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", "SEXAGESIMAL Coords: ");
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteB.getLonghexaCoords()));
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", "Temperature: ");
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteB.getTemperature()));
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", "Solar Masses: ");
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteB.getSolarMasses()));
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", "Radius: ");
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteB.getRadius()));
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading3", "Bolometric Abs. Magnitude: ");
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", String.valueOf(componenteB.getBolometricAbsoluteMagnitud()));

			// Guardar cambios		
			String name = "DUPLEX_Analisis_" + denominacionA.getText() + ".docx";

			wordMLPackage.save(new java.io.File(name));

			//inserta imagen
			//*******************************************************************************			

			// la imagen a insertar
			File file = new File("GEDRAA_DDC.jpg");

			// Our utility method wants that as a byte array
			java.io.InputStream is = new java.io.FileInputStream(file);
			long length = file.length();
			// You cannot create an array using a long type.
			// It needs to be an int type.
			if (length > Integer.MAX_VALUE) {
				System.out.println("File too large!!");
			}
			byte[] bytes = new byte[(int) length];
			int offset = 0;
			int numRead = 0;
			while (offset < bytes.length && (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
				offset += numRead;
			}
			// Ensure all the bytes have been read in
			if (offset < bytes.length) {
				System.out.println("Could not completely read file " + file.getName());
			}
			is.close();

			String filenameHint = null;
			String altText = null;
			int id1 = 0;
			int id2 = 1;

			// Image 1: no width specified
			org.docx4j.wml.P p;
			try {
				p = newImage(wordMLPackage, bytes, filenameHint, altText, id1, id2);
				wordMLPackage.getMainDocumentPart().addObject(p);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//===============================

			// Image 2: 
			File file2 = new File("GEDRAA_MPR.jpg");

			// Our utility method wants that as a byte array
			java.io.InputStream is2 = new java.io.FileInputStream(file2);
			long length2 = file2.length();
			// You cannot create an array using a long type.
			// It needs to be an int type.
			if (length2 > Integer.MAX_VALUE) {
				System.out.println("File too large!!");
			}
			byte[] bytes2 = new byte[(int) length2];
			int offset2 = 0;
			int numRead2 = 0;
			while (offset2 < bytes2.length && (numRead2 = is2.read(bytes2, offset2, bytes2.length - offset2)) >= 0) {
				offset2 += numRead2;
			}
			// Ensure all the bytes have been read in
			if (offset2 < bytes2.length) {
				System.out.println("Could not completely read file " + file2.getName());
			}
			is2.close();

			String filenameHint2 = null;
			String altText2 = null;
			int id12 = 0;
			int id22 = 1;

			// Image 1: no width specified
			org.docx4j.wml.P p2;
			try {
				p2 = newImage(wordMLPackage, bytes2, filenameHint2, altText2, id12, id22);
				wordMLPackage.getMainDocumentPart().addObject(p2);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//===============================

			// Image 3: 
			File file3 = new File("GEDRAA_MPR_2.jpg");

			// Our utility method wants that as a byte array
			java.io.InputStream is3 = new java.io.FileInputStream(file3);
			long length3 = file3.length();
			// You cannot create an array using a long type.
			// It needs to be an int type.
			if (length3 > Integer.MAX_VALUE) {
				System.out.println("File too large!!");
			}
			byte[] bytes3 = new byte[(int) length3];
			int offset3 = 0;
			int numRead3 = 0;
			while (offset3 < bytes3.length && (numRead3 = is3.read(bytes3, offset3, bytes3.length - offset3)) >= 0) {
				offset3 += numRead3;
			}
			// Ensure all the bytes have been read in
			if (offset3 < bytes3.length) {
				System.out.println("Could not completely read file " + file3.getName());
			}
			is3.close();

			String filenameHint3 = null;
			String altText3 = null;
			int id13 = 0;
			int id23 = 1;

			// Image 1: no width specified
			org.docx4j.wml.P p3;
			try {
				p3 = newImage(wordMLPackage, bytes3, filenameHint3, altText3, id13, id23);
				wordMLPackage.getMainDocumentPart().addObject(p3);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			//===============================
			//===============================

			// Image 4: 
			File file4 = new File("GEDRAA_MPR_3.jpg");

			// Our utility method wants that as a byte array
			java.io.InputStream is4 = new java.io.FileInputStream(file4);
			long length4 = file4.length();
			// You cannot create an array using a long type.
			// It needs to be an int type.
			if (length4 > Integer.MAX_VALUE) {
				System.out.println("File too large!!");
			}
			byte[] bytes4 = new byte[(int) length4];
			int offset4 = 0;
			int numRead4 = 0;
			while (offset4 < bytes4.length && (numRead4 = is4.read(bytes4, offset4, bytes4.length - offset4)) >= 0) {
				offset4 += numRead4;
			}
			// Ensure all the bytes have been read in
			if (offset4 < bytes4.length) {
				System.out.println("Could not completely read file " + file4.getName());
			}
			is4.close();

			String filenameHint4 = null;
			String altText4 = null;
			int id14 = 0;
			int id24 = 1;

			// Image 1: no width specified
			org.docx4j.wml.P p4;
			try {
				p4 = newImage(wordMLPackage, bytes4, filenameHint4, altText4, id14, id24);
				wordMLPackage.getMainDocumentPart().addObject(p4);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			//===============================

			// Image 5: 
			File file5 = new File("HRD.jpg");

			// Our utility method wants that as a byte array
			java.io.InputStream is5 = new java.io.FileInputStream(file5);
			long length5 = file5.length();
			// You cannot create an array using a long type.
			// It needs to be an int type.
			if (length5 > Integer.MAX_VALUE) {
				System.out.println("File too large!!");
			}
			byte[] bytes5 = new byte[(int) length5];
			int offset5 = 0;
			int numRead5 = 0;
			while (offset5 < bytes5.length && (numRead5 = is5.read(bytes5, offset5, bytes5.length - offset5)) >= 0) {
				offset5 += numRead5;
			}
			// Ensure all the bytes have been read in
			if (offset5 < bytes5.length) {
				System.out.println("Could not completely read file " + file5.getName());
			}
			is5.close();

			String filenameHint5 = null;
			String altText5 = null;
			int id15 = 0;
			int id25 = 1;

			// Image 1: no width specified
			org.docx4j.wml.P p5;
			try {
				p5 = newImage(wordMLPackage, bytes5, filenameHint5, altText5, id15, id25);
				wordMLPackage.getMainDocumentPart().addObject(p5);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			//===============================			

			//===============================

			// Image 6: 
			File file6 = new File("FlujosEstelares.jpg");

			// Our utility method wants that as a byte array
			java.io.InputStream is6 = new java.io.FileInputStream(file6);
			long length6 = file6.length();
			// You cannot create an array using a long type.
			// It needs to be an int type.
			if (length6 > Integer.MAX_VALUE) {
				System.out.println("File too large!!");
			}
			byte[] bytes6 = new byte[(int) length6];
			int offset6 = 0;
			int numRead6 = 0;
			while (offset6 < bytes6.length && (numRead6 = is6.read(bytes6, offset6, bytes6.length - offset6)) >= 0) {
				offset6 += numRead6;
			}
			// Ensure all the bytes have been read in
			if (offset6 < bytes6.length) {
				System.out.println("Could not completely read file " + file6.getName());
			}
			is6.close();

			String filenameHint6 = null;
			String altText6 = null;
			int id16 = 0;
			int id26 = 1;

			// Image 1: no width specified
			org.docx4j.wml.P p6;
			try {
				p6 = newImage(wordMLPackage, bytes6, filenameHint6, altText6, id16, id26);
				wordMLPackage.getMainDocumentPart().addObject(p6);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			//===============================			

			//===============================

			// Image 7: 
			File file7 = new File("curva.jpg");

			// Our utility method wants that as a byte array
			java.io.InputStream is7 = new java.io.FileInputStream(file7);
			long length7 = file7.length();
			// You cannot create an array using a long type.
			// It needs to be an int type.
			if (length7 > Integer.MAX_VALUE) {
				System.out.println("File too large!!");
			}
			byte[] bytes7 = new byte[(int) length7];
			int offset7 = 0;
			int numRead7 = 0;
			while (offset7 < bytes7.length && (numRead7 = is7.read(bytes7, offset7, bytes7.length - offset7)) >= 0) {
				offset7 += numRead7;
			}
			// Ensure all the bytes have been read in
			if (offset7 < bytes7.length) {
				System.out.println("Could not completely read file " + file7.getName());
			}
			is7.close();

			String filenameHint7 = null;
			String altText7 = null;
			int id17 = 0;
			int id27 = 1;

			// Image 1: no width specified
			org.docx4j.wml.P p7;
			try {
				p7 = newImage(wordMLPackage, bytes7, filenameHint7, altText7, id17, id27);
				wordMLPackage.getMainDocumentPart().addObject(p7);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			//===============================			

			//===============================

			// Image 8: 
			File file8 = new File("J_H_H_K.jpg");

			// Our utility method wants that as a byte array
			java.io.InputStream is8 = new java.io.FileInputStream(file8);
			long length8 = file8.length();
			// You cannot create an array using a long type.
			// It needs to be an int type.
			if (length8 > Integer.MAX_VALUE) {
				System.out.println("File too large!!");
			}
			byte[] bytes8 = new byte[(int) length8];
			int offset8 = 0;
			int numRead8 = 0;
			while (offset8 < bytes8.length && (numRead8 = is8.read(bytes8, offset8, bytes8.length - offset8)) >= 0) {
				offset8 += numRead8;
			}
			// Ensure all the bytes have been read in
			if (offset8 < bytes8.length) {
				System.out.println("Could not completely read file " + file8.getName());
			}
			is8.close();

			String filenameHint8 = null;
			String altText8 = null;
			int id18 = 0;
			int id28 = 1;

			// Image 1: no width specified
			org.docx4j.wml.P p8;
			try {
				p8 = newImage(wordMLPackage, bytes8, filenameHint8, altText8, id18, id28);
				wordMLPackage.getMainDocumentPart().addObject(p8);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			//===============================			

			//*******************************************************************************
			// Now save it
			wordMLPackage.save(new java.io.File(System.getProperty("user.dir") + "/Analisis_Astrofisico_GEDRAA.docx"));

			//*******************************************************************************

		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Docx4JException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			this.setCursor(Cursor.getDefaultCursor());
		}

	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {

		// Diagrama de Doble Color Fotometría JHK:

		try {
			DiagramaDobleColor frame = new DiagramaDobleColor(_colorcolorD, componenteA.getH() - componenteA.getK(), componenteA.getJ()
			    - componenteA.getH(), componenteB.getH() - componenteB.getK(), componenteB.getJ() - componenteB.getH(), _primary, _secondary, _dwarfs, _giants, _sub_dwarfs, _brownDwarfs);
			frame.pack();
			frame.setResizable(false);
			frame.resize(640, 640);
			RefineryUtilities.centerFrameOnScreen(frame);
			frame.setVisible(true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		try {
			MovimientoPropioReducidoV_Jota frame = new MovimientoPropioReducidoV_Jota(_rpm, componenteA.getV_J(), componenteA.getReducedPM(), componenteB.getV_J(), componenteB.getReducedPM(), _primary, _secondary);

			frame.pack();
			frame.setResizable(false);
			frame.resize(430, 400);
			RefineryUtilities.centerFrameOnScreen(frame);
			frame.setVisible(true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jButton_ProcesarDatosActionPerformed(java.awt.event.ActionEvent evt) {
		// Procesar Datos:

		int Voption = 0;
		String manualVa = "";
		String manualVb = "";

		JOptionPane pane = new JOptionPane(_vCalctext, JOptionPane.OK_OPTION);
		JRadioButton ucac4, bilir, bilirWarner, warner, greeves, dymock, usnob1, ucac3, manual;
		ButtonGroup buttonGroup = new ButtonGroup();
		ucac4 = new JRadioButton(_Voption0);
		buttonGroup.add(ucac4);
		bilir = new JRadioButton(_Voption1);
		buttonGroup.add(bilir);
		bilirWarner = new JRadioButton(_Voption2);
		buttonGroup.add(bilirWarner);
		warner = new JRadioButton(_Voption3);
		buttonGroup.add(warner);
		greeves = new JRadioButton(_Voption4);
		buttonGroup.add(greeves);
		dymock = new JRadioButton(_Voption5);
		buttonGroup.add(dymock);
		usnob1 = new JRadioButton(_Voption6);
		buttonGroup.add(usnob1);
		ucac3 = new JRadioButton(_Voption7);
		buttonGroup.add(ucac3);
		manual = new JRadioButton(_Voption9);
		buttonGroup.add(manual);

		//all = new JRadioButton(_Voption10);
		//buttonGroup.add(all);
		bilirWarner.setSelected(true);
		pane.add(new JLabel("    "));
		pane.add(new JLabel("    "));
		pane.add(new JLabel("    "));
		pane.add(ucac4);
		pane.add(bilir);
		pane.add(bilirWarner);
		pane.add(warner);
		pane.add(greeves);
		pane.add(dymock);
		pane.add(usnob1);
		pane.add(ucac3);
		pane.add(manual);
		//pane.add(all);

		JDialog dialog = pane.createDialog(this, "Método de Cálculo de magnitud V ");

		dialog.setModalityType(JDialog.ModalityType.APPLICATION_MODAL);
		dialog.setVisible(true);

		Enumeration<AbstractButton> e = buttonGroup.getElements();
		int opt = 0;
		while (e.hasMoreElements()) {
			JRadioButton j = (JRadioButton) e.nextElement();
			if (j.isSelected()) {
				Voption = opt;
			}
			opt++;
		}
		if (Voption == 8) {
			manualVa = JOptionPane.showInputDialog(_Voption9 + " A :");
			manualVb = JOptionPane.showInputDialog(_Voption9 + " B :");
		}

		procesarDatos(Voption, manualVa, manualVb);
		this.DatosProcesadosTextArea.setText("");
		String datos = "";
		datos = "Primary:\n" + this.denominacionA.getText() + "\n\n" + componenteA.toString() + "\n\n\n\nSecondary:\n"
		    + this.denominacionB.getText() + "\n\n" + componenteB.toString();

		this.DatosProcesadosTextArea.setText(datos);
		try {
			grabScreenShot();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		float floatA = (float) componenteA.getdModulus();
		float floatB = (float) componenteB.getdModulus();

		try {
			Distancia d = new Distancia(floatA, floatB, _sun, _primary, _secondary);
		} catch (Exception e1) {
			JTextArea textArea = new JTextArea();
			String a = e1.getMessage();
			String s = e1.getStackTrace().toString();
			textArea.setText(a + "\n" + s); // A string of ~100 words "Lorem ipsum...\nFin."
			textArea.setColumns(50);
			textArea.setOpaque(false);
			textArea.setEditable(false);
			textArea.setLineWrap(true);
			textArea.setWrapStyleWord(true);
			JOptionPane.showMessageDialog(null, textArea, "Truncated!", JOptionPane.WARNING_MESSAGE);
			e1.printStackTrace();
		}
		/*		try {
		 // set up the command and parameter
		 String pythonScriptPath = "duplex.py";
		 String[] cmd = new String[2];
		 cmd[0] = "c:\\Python33\\python.exe";
		 cmd[1] = pythonScriptPath;
		
		 // create runtime to execute external command
		 Runtime rt = Runtime.getRuntime();
		 Process pr = rt.exec(cmd);;
		 } catch (IOException e1) {
		 // TODO Auto-generated catch block
		 e1.printStackTrace();
		 }*/
		this.jPanel2.requestFocus(true);
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

		try {
			MovimientoPropioReducido frame = new MovimientoPropioReducido(_rpm, componenteA.getB_V(), componenteA.getReducedPM(), componenteB.getB_V(), componenteB.getReducedPM(), _primary, _secondary);
			frame.pack();
			frame.setResizable(false);
			frame.resize(500, 450);
			RefineryUtilities.centerFrameOnScreen(frame);
			frame.setVisible(true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jTextField_J_AActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

		try {
			MovimientoPropioReducidoV_I frame = new MovimientoPropioReducidoV_I(_rpm, componenteA.getV_I(), componenteA.getReducedPM(), componenteB.getV_I(), componenteB.getReducedPM(), _primary, _secondary);
			frame.pack();
			frame.setResizable(false);
			frame.resize(500, 450);
			RefineryUtilities.centerFrameOnScreen(frame);
			frame.setVisible(true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
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
				new AstrofisicaGEDRAA(1).setVisible(true);
			}
		});
	}

	private void procesarDatos(int Voption, String manualVa, String manualVb) {
		VoptionParameters a_params;
		VoptionParameters b_params;

		if (_2mass_catalog_a != null) {
			a_params = new VoptionParameters(Voption, _2mass_catalog_a._twoMASSList, _ucac3_catalog_a._ucac3List, _ucac4_catalog_a._ucac4List, manualVa, _usnob1_catalog_a._usnob1List, _cmc14_catalog_a._cmc14List);
		} else {
			_2mass_catalog_a = new TWOMASScatalog("NP");
			_ucac3_catalog_a = new UCAC3catalog("NP");
			_ucac4_catalog_a = new UCAC4catalog("NP");
			_usnob1_catalog_a = new USNOB1catalog("NP");
			_cmc14_catalog_a = new CMC14catalog("NP");


			a_params = new VoptionParameters(Voption, _2mass_catalog_a._twoMASSList, _ucac3_catalog_a._ucac3List, _ucac4_catalog_a._ucac4List, manualVa,_usnob1_catalog_a._usnob1List, _cmc14_catalog_a._cmc14List);
		}

		if (_2mass_catalog_b != null) {
			b_params = new VoptionParameters(Voption, _2mass_catalog_b._twoMASSList, _ucac3_catalog_b._ucac3List, _ucac4_catalog_b._ucac4List, manualVa,_usnob1_catalog_b._usnob1List, _cmc14_catalog_b._cmc14List);
		} else {
			_2mass_catalog_b = new TWOMASScatalog("NP");
			_ucac3_catalog_b = new UCAC3catalog("NP");
			_ucac4_catalog_b = new UCAC4catalog("NP");
			_usnob1_catalog_b = new USNOB1catalog("NP");
			_cmc14_catalog_b = new CMC14catalog("NP");
			
			b_params = new VoptionParameters(Voption, _2mass_catalog_b._twoMASSList, _ucac3_catalog_b._ucac3List, _ucac4_catalog_b._ucac4List, manualVa,_usnob1_catalog_b._usnob1List, _cmc14_catalog_b._cmc14List);
		}
		a_params.setManualV(manualVa);
		b_params.setManualV(manualVb);

		double j = Double.parseDouble(jTextField_J_A.getText());
		double h = Double.parseDouble(jTextField_H_A.getText());
		double k = Double.parseDouble(jTextField_K_A.getText());
		double galactlat = Double.parseDouble(jTextField_galacticLat_A.getText());
		double pmra = Double.parseDouble(jTextField_pmRA_A.getText());
		double pmdec = Double.parseDouble(jTextField_pmDEC_A.getText());

		componenteA = new TWOMASSStar(j, h, k, galactlat, pmra, pmdec, Voption, a_params);
		distanceA.setText(String.valueOf(componenteA.getdModulus()));
		disstA.setText(String.valueOf(componenteA.getdModulus()));
		renderMK_A(componenteA.getSpectralType());

		double jb = Double.parseDouble(jTextField_J_B.getText());
		double hb = Double.parseDouble(jTextField_H_B.getText());
		double kb = Double.parseDouble(jTextField_K_B.getText());
		double galactlatb = Double.parseDouble(jTextField_galacticLat_B.getText());
		double pmrab = Double.parseDouble(jTextField_pmRA_B.getText());
		double pmdecb = Double.parseDouble(jTextField_pmDEC_B.getText());

		componenteB = new TWOMASSStar(jb, hb, kb, galactlatb, pmrab, pmdecb, Voption, b_params);
		distanceB.setText(String.valueOf(componenteB.getdModulus()));
		distB.setText(String.valueOf(componenteB.getdModulus()));
		renderMK_B(componenteB.getSpectralType());
		Ma_a.setText(String.valueOf(componenteA.getM()));
		Ma_b.setText(String.valueOf(componenteB.getM()));
		MasasSolaresA.setText(String.valueOf(componenteA.getSolarMasses()));
		MasasSolaresB.setText(String.valueOf(componenteB.getSolarMasses()));
		RadiosSolaresA.setText(String.valueOf(componenteA.getRadius()));
		RadiosSolaresB.setText(String.valueOf(componenteB.getRadius()));
		GradosKelvinA.setText(String.valueOf(componenteA.getTemperature()));
		GradosKelvinB.setText(String.valueOf(componenteB.getTemperature()));

	}

	private void reProcesarDatos() {
		//Componente A

		distanceA.setText(String.valueOf(componenteA.getdModulus()));
		disstA.setText(String.valueOf(componenteA.getdModulus()));
		renderMK_A(componenteA.getSpectralType());

		distanceB.setText(String.valueOf(componenteB.getdModulus()));
		distB.setText(String.valueOf(componenteB.getdModulus()));
		renderMK_B(componenteB.getSpectralType());
		Ma_a.setText(String.valueOf(componenteA.getM()));
		Ma_b.setText(String.valueOf(componenteB.getM()));
		MasasSolaresA.setText(String.valueOf(componenteA.getSolarMasses()));
		MasasSolaresB.setText(String.valueOf(componenteB.getSolarMasses()));
		RadiosSolaresA.setText(String.valueOf(componenteA.getRadius()));
		RadiosSolaresB.setText(String.valueOf(componenteB.getRadius()));
		GradosKelvinA.setText(String.valueOf(componenteA.getTemperature()));
		GradosKelvinB.setText(String.valueOf(componenteB.getTemperature()));
	}

	private void renderMK_A(String mk) {
		MK_A.setText("");
		MK_A.setText(mk);
		/*		if (mk.startsWith("O")) {
		 this.MK_icon_A.setIcon(new javax.swing.ImageIcon("O.jpg"));
		 } else if (mk.startsWith("B")) {
		 this.MK_icon_A.setIcon(new javax.swing.ImageIcon("B.jpg"));
		 } else if (mk.startsWith("A")) {
		 this.MK_icon_A.setIcon(new javax.swing.ImageIcon("A.jpg"));
		 } else if (mk.startsWith("F")) {
		 this.MK_icon_A.setIcon(new javax.swing.ImageIcon("F.jpg"));
		 } else if (mk.startsWith("G")) {
		 this.MK_icon_A.setIcon(new javax.swing.ImageIcon("G.jpg"));
		 } else if (mk.startsWith("K")) {
		 this.MK_icon_A.setIcon(new javax.swing.ImageIcon("K.jpg"));
		 } else if (mk.startsWith("M")) {
		 this.MK_icon_A.setIcon(new javax.swing.ImageIcon("M.jpg"));
		 }*/

		if (mk.startsWith("O")) {
			this.MK_icon_A.setIcon(new javax.swing.ImageIcon("O.gif"));
		} else if (mk.startsWith("B")) {
			this.MK_icon_A.setIcon(new javax.swing.ImageIcon("B.gif"));
		} else if (mk.startsWith("A")) {
			this.MK_icon_A.setIcon(new javax.swing.ImageIcon("A.gif"));
		} else if (mk.startsWith("F")) {
			this.MK_icon_A.setIcon(new javax.swing.ImageIcon("F.gif"));
		} else if (mk.startsWith("G")) {
			this.MK_icon_A.setIcon(new javax.swing.ImageIcon("G.gif"));
		} else if (mk.startsWith("K")) {
			this.MK_icon_A.setIcon(new javax.swing.ImageIcon("K.gif"));
		} else if (mk.startsWith("M")) {
			this.MK_icon_A.setIcon(new javax.swing.ImageIcon("M.gif"));
		}
	}

	private void renderMK_B(String mk) {
		MK_B.setText("");
		MK_B.setText(mk);
		/*		if (mk.startsWith("O")) {
		 this.MK_Icon_B.setIcon(new javax.swing.ImageIcon("O.jpg"));
		 } else if (mk.startsWith("B")) {
		 this.MK_Icon_B.setIcon(new javax.swing.ImageIcon("B.jpg"));
		 } else if (mk.startsWith("A")) {
		 this.MK_Icon_B.setIcon(new javax.swing.ImageIcon("A.jpg"));
		 } else if (mk.startsWith("F")) {
		 this.MK_Icon_B.setIcon(new javax.swing.ImageIcon("F.jpg"));
		 } else if (mk.startsWith("G")) {
		 this.MK_Icon_B.setIcon(new javax.swing.ImageIcon("G.jpg"));
		 } else if (mk.startsWith("K")) {
		 this.MK_Icon_B.setIcon(new javax.swing.ImageIcon("K.jpg"));
		 } else if (mk.startsWith("M")) {
		 this.MK_Icon_B.setIcon(new javax.swing.ImageIcon("M.jpg"));
		 }*/

		if (mk.startsWith("O")) {
			this.MK_Icon_B.setIcon(new javax.swing.ImageIcon("O.gif"));
		} else if (mk.startsWith("B")) {
			this.MK_Icon_B.setIcon(new javax.swing.ImageIcon("B.gif"));
		} else if (mk.startsWith("A")) {
			this.MK_Icon_B.setIcon(new javax.swing.ImageIcon("A.gif"));
		} else if (mk.startsWith("F")) {
			this.MK_Icon_B.setIcon(new javax.swing.ImageIcon("F.gif"));
		} else if (mk.startsWith("G")) {
			this.MK_Icon_B.setIcon(new javax.swing.ImageIcon("G.gif"));
		} else if (mk.startsWith("K")) {
			this.MK_Icon_B.setIcon(new javax.swing.ImageIcon("K.gif"));
		} else if (mk.startsWith("M")) {
			this.MK_Icon_B.setIcon(new javax.swing.ImageIcon("M.gif"));
		}
	}

	/**
	 * Create image, without specifying width
	 */
	public static org.docx4j.wml.P newImage(WordprocessingMLPackage wordMLPackage, byte[] bytes, String filenameHint, String altText, int id1, int id2) throws Exception {

		BinaryPartAbstractImage imagePart = BinaryPartAbstractImage.createImagePart(wordMLPackage, bytes);

		Inline inline = imagePart.createImageInline(filenameHint, altText, id1, id2, false);

		// Now add the inline in w:p/w:r/w:drawing
		org.docx4j.wml.ObjectFactory factory = Context.getWmlObjectFactory();
		org.docx4j.wml.P p = factory.createP();
		org.docx4j.wml.R run = factory.createR();
		p.getContent().add(run);
		org.docx4j.wml.Drawing drawing = factory.createDrawing();
		run.getContent().add(drawing);
		drawing.getAnchorOrInline().add(inline);

		return p;

	}

	private void grabScreenShot() throws Exception {
		BufferedImage image = (BufferedImage) createImage(jPanel3.getSize().width, jPanel3.getSize().height);
		jPanel3.paint(image.getGraphics());
		try {
			ImageIO.write(image, "jpg", new File(System.getProperty("user.dir") + "/screen.jpg"));
		} catch (IOException e) {

			throw e;
		}
	}

	/**
	 * 
	 */
	private void loadProps(int lan) {
		Properties props = new Properties();
		switch (lan) {
		case 1:
			try {
				props.load(new FileInputStream("ui_en.properties"));
			} catch (IOException e) {
			}
			break;
		case 2:
			try {
				props.load(new FileInputStream("ui_es.properties"));
			} catch (IOException e) {
			}
			break;
		case 3:
			try {
				props.load(new FileInputStream("ui_it.properties"));
			} catch (IOException e) {
			}
			break;
		default:
			try {
				props.load(new FileInputStream("ui_en.properties"));
			} catch (IOException e) {
			}
		}
		_mainWindowTitle = props.getProperty("mainWindowTitle");
		_dataEntryTab = props.getProperty("dataEntryTab");
		_reducedPMTab = props.getProperty("reducedPMTab");
		_astrophysicAnalysis = props.getProperty("astrophysicAnalysis");
		_processedData = props.getProperty("processedData");
		_galacticExtinction = props.getProperty("galacticExtinction");
		_formulae = props.getProperty("formulae");
		_spectralEnergyDistribution = props.getProperty("spectralEnergyDistribution");
		_sdssImaage = props.getProperty("sdssImaage");
		_probablyGalacticLocation = props.getProperty("probablyGalacticLocation");
		_processEnteredData = props.getProperty("processEnteredData");
		_exportData = props.getProperty("exportData");
		_twoMASScoordsFormatExample = props.getProperty("twoMASScoordsFormatExample");
		_twomassALabel = props.getProperty("twomassALabel");
		_twomassALabe2 = props.getProperty("twomassALabe2");
		_glatitude = props.getProperty("glatitude");
		_pmRA = props.getProperty("pmRA");
		_pmDec = props.getProperty("pmDec");
		_retrieveJHKfromInternetButton = props.getProperty("retrieveJHKfromInternetButton");
		_b_vDiagram = props.getProperty("b_vDiagram");
		_v_iDiagram = props.getProperty("v_iDiagram");
		_v_jDiagram = props.getProperty("v_jDiagram");
		_distanceInParsecsA = props.getProperty("distanceInParsecsA");
		_distanceInParsecsB = props.getProperty("distanceInParsecsB");
		_long_legend = props.getProperty("long_legend");
		_primary_is_giant = props.getProperty("primary_is_giant");
		_secondary_is_giant = props.getProperty("secondary_is_giant");
		_both_are_giant = props.getProperty("both_are_giant");
		_doubleColorDiagramButton = props.getProperty("doubleColorDiagramButton");
		_componentA = props.getProperty("componentA");
		_componentB = props.getProperty("componentB");
		_spectralType = props.getProperty("spectralType");
		_abosluteMag = props.getProperty("abosluteMag");
		_A_distanceInParsecs = props.getProperty("A_distanceInParsecs");
		_B_distanceInParsecs = props.getProperty("B_distanceInParsecs");
		_intenetConnectionNeededMessage = props.getProperty("intenetConnectionNeededMessage");
		_coordinateFormatLegend = props.getProperty("coordinateFormatLegend");
		_A_coordinatesLabel = props.getProperty("A_coordinatesLabel");
		_B_coordinatesLabel = props.getProperty("B_coordinatesLabel");
		_de_reddeningButton = props.getProperty("de_reddeningButton");
		_colorExcessLabel = props.getProperty("colorExcessLabel");
		_e_b_v_componentA_label = props.getProperty("e_b_v-componentA_label");
		_e_b_v_componentB_label = props.getProperty("e_b_v-componentB_label");
		_distanceToA = props.getProperty("distanceToA");
		_distanceToB = props.getProperty("distanceToB");
		_please_enter_coordinates_label = props.getProperty("please_enter_coordinates_label");
		_advice_about_jhk_automatic_retrieving = props.getProperty("advice_about_jhk_automatic_retrieving");
		_coord_format_example = props.getProperty("coord_format_example");
		_retrieveSDSS_image_button = props.getProperty("retrieveSDSS_image_button");
		_probablyGalacticLocationButton = props.getProperty("probablyGalacticLocationButton");
		_buttonSpectral_A = props.getProperty("buttonSpectral_A");
		_buttonSpectral_B = props.getProperty("buttonSpectral_B");
		_primary = props.getProperty("primary");
		_secondary = props.getProperty("secondary");
		_rpm = props.getProperty("rpm");
		_colorcolorD = props.getProperty("colorcolorD");
		_theoreticalModel = props.getProperty("theoreticalModel");
		_photometry = props.getProperty("photometry");
		_colorIndexValue = props.getProperty("colorIndexValue");
		_dwarfs = props.getProperty("dwarfs");
		_giants = props.getProperty("giants");
		_sub_dwarfs = props.getProperty("sub_dwarfs");
		_brownDwarfs = props.getProperty("brownDwarfs");
		_wavelength = props.getProperty("wavelength");
		_rptTitle = props.getProperty("rptTitle");
		_rptSubtitle = props.getProperty("rptSubtitle");
		_rpt_analysisA = props.getProperty("rpt_analysisA");
		_rpt_analysisB = props.getProperty("rpt_analysisB");
		_rpt_V = props.getProperty("rpt_V");
		_rpt_J = props.getProperty("rpt_J");
		_rpt_H = props.getProperty("rpt_H");
		_rpt_K = props.getProperty("rpt_K");
		_rpt_b_v = props.getProperty("rpt_b_v");
		_rpt_v_i = props.getProperty("rpt__v_i");
		_rpt_v_j = props.getProperty("rpt_v_j");
		_rpt_M = props.getProperty("rpt_M");
		_rpt_glat = props.getProperty("rpt_glat");
		_rpt_BolCorr = props.getProperty("rpt_BolCorr");
		_rpt_distance = props.getProperty("rpt_distance");
		_rpt_corrected_distance = props.getProperty("rpt_corrected_distance");
		_rpt_color_excess = props.getProperty("rpt_color_excess");
		_rpt_Av = props.getProperty("rpt_Av");
		_rpt_SpecType = props.getProperty("rpt_SpecType");
		_rpt_pmRA = props.getProperty("rpt_pmRA");
		_rpt_pmDEC = props.getProperty("rpt_pmDEC");
		_rpt_total_pm = props.getProperty("rpt_total_pm");
		_rpt_reducedPM = props.getProperty("rpt_reducedPM");
		_retrieveDataMsg = props.getProperty("retrieveDataMsg");
		_creditos = props.getProperty("credits");
		_setUCAC3 = props.getProperty("setUCAC3");
		_setUCAC4 = props.getProperty("setUCAC4");
		_restorePPMXL = props.getProperty("restorePPMXL");
		_creditsList = props.getProperty("creditsList");
		_ra = props.getProperty("ra");
		_wise = props.getProperty("wise");
		_eqdistance = props.getProperty("eqdistance");
		_eqcolorexcess = props.getProperty("eqcolorexcess");
		_absoluteMag = props.getProperty("absoluteMag");
		_a_is_subdwarf = props.getProperty("a_is_subdwarf");
		_b_is_subdwarf = props.getProperty("b_is_subdwarf ");
		_both_are_subsubdwarf = props.getProperty("both_are_subsubdwarf");
		_a_is_superGiant = props.getProperty("a_is_superGiant");
		_b_is_superGiant = props.getProperty("b_is_superGiant");
		_both_are_superGiants = props.getProperty("both_are_superGiants");
		_Voption1 = props.getProperty("voption1");
		_Voption2 = props.getProperty("voption2");
		_Voption3 = props.getProperty("voption3");
		_Voption4 = props.getProperty("voption4");
		_Voption5 = props.getProperty("voption5");
		_Voption6 = props.getProperty("voption6");
		_Voption7 = props.getProperty("voption7");
		_Voption8 = props.getProperty("voption8");
		_Voption9 = props.getProperty("voption9");
		_Voption10 = props.getProperty("voption10");
		_recalcDistance = props.getProperty("recalcDistance");
		_sun = props.getProperty("sun");
		_vCalctext = props.getProperty("vCalctext");

		local = props;
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton AMBAS_GIGANTES_Button;
	private javax.swing.JTextField CoordComponenteA_jTextField;
	private javax.swing.JTextField CoordComponenteB_jTextField;
	private javax.swing.JTextArea DatosProcesadosTextArea;
	private javax.swing.JLabel E_B_V_a;
	private javax.swing.JLabel E_B_V_b;
	private javax.swing.JLabel GradosKelvinA;
	private javax.swing.JLabel GradosKelvinB;
	private javax.swing.JLabel LabelMasasSolaresA;
	private javax.swing.JLabel LabelMasasSolaresB;
	private javax.swing.JLabel LabelMasasSolaresB1;
	private javax.swing.JLabel LabelMasasSolaresB2;
	private javax.swing.JLabel LabelMasasSolaresB3;
	private javax.swing.JLabel LabelRadiosSolaresA;
	private javax.swing.JLabel LabelRadiosSolaresB;
	private javax.swing.JLabel MK_A;
	private javax.swing.JLabel MK_B;
	private javax.swing.JLabel MK_Icon_B;
	private javax.swing.JLabel MK_icon_A;
	private javax.swing.JLabel Ma_a;
	private javax.swing.JLabel Ma_b;
	private javax.swing.JLabel MasasSolaresA;
	private javax.swing.JLabel MasasSolaresB;
	private javax.swing.JLabel RadiosSolaresA;
	private javax.swing.JLabel RadiosSolaresB;
	private javax.swing.JTextField SDSSdec;
	private javax.swing.JTextField SDSSra;
	private javax.swing.JTextField UCAC3_pmdec_A;
	private javax.swing.JTextField UCAC3_pmdec_B;
	private javax.swing.JTextField UCAC3_pmra_A;
	private javax.swing.JTextField UCAC3_pmra_B;
	private javax.swing.JTextField UCAC4_pmdec_A;
	private javax.swing.JTextField UCAC4_pmdec_B;
	private javax.swing.JTextField UCAC4_pmra_A;
	private javax.swing.JTextField UCAC4_pmra_B;
	private javax.swing.JTabbedPane creditosTabPanel;
	private javax.swing.JTextField denominacionA;
	private javax.swing.JTextField denominacionB;
	private javax.swing.JLabel disstA;
	private javax.swing.JLabel distB;
	private javax.swing.JButton dist_A_jButton;
	private javax.swing.JButton dist_B_jButton;
	private javax.swing.JLabel distanceA;
	private javax.swing.JLabel distanceA_corregida;
	private javax.swing.JLabel distanceB;
	private javax.swing.JLabel distanceB_corregida;
	private javax.swing.JButton galacticLocation_A_jButton;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton10;
	private javax.swing.JButton jButton11;
	private javax.swing.JButton jButton12;
	private javax.swing.JButton jButton13;
	private javax.swing.JButton jButton14;
	private javax.swing.JButton jButton15;
	private javax.swing.JButton jButton16;
	private javax.swing.JButton jButton17;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
	private javax.swing.JButton jButton_Exportar_Datos;
	private javax.swing.JButton jButton_ProcesarDatos;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel20;
	private javax.swing.JLabel jLabel21;
	private javax.swing.JLabel jLabel22;
	private javax.swing.JLabel jLabel23;
	private javax.swing.JLabel jLabel24;
	private javax.swing.JLabel jLabel25;
	private javax.swing.JLabel jLabel26;
	private javax.swing.JLabel jLabel27;
	private javax.swing.JLabel jLabel28;
	private javax.swing.JLabel jLabel29;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel30;
	private javax.swing.JLabel jLabel31;
	private javax.swing.JLabel jLabel32;
	private javax.swing.JLabel jLabel33;
	private javax.swing.JLabel jLabel34;
	private javax.swing.JLabel jLabel35;
	private javax.swing.JLabel jLabel36;
	private javax.swing.JLabel jLabel37;
	private javax.swing.JLabel jLabel38;
	private javax.swing.JLabel jLabel39;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel40;
	private javax.swing.JLabel jLabel41;
	private javax.swing.JLabel jLabel42;
	private javax.swing.JLabel jLabel43;
	private javax.swing.JLabel jLabel44;
	private javax.swing.JLabel jLabel45;
	private javax.swing.JLabel jLabel46;
	private javax.swing.JLabel jLabel47;
	private javax.swing.JLabel jLabel48;
	private javax.swing.JLabel jLabel49;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel50;
	private javax.swing.JLabel jLabel51;
	private javax.swing.JLabel jLabel52;
	private javax.swing.JLabel jLabel53;
	private javax.swing.JLabel jLabel54;
	private javax.swing.JLabel jLabel55;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel10;
	private javax.swing.JPanel jPanel11;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JPanel jPanel7;
	private javax.swing.JPanel jPanel8;
	private javax.swing.JPanel jPanel9;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JTextArea jTextArea1;
	private javax.swing.JTextArea jTextArea2;
	private javax.swing.JTextField jTextField_H_A;
	private javax.swing.JTextField jTextField_H_B;
	private javax.swing.JTextField jTextField_J_A;
	private javax.swing.JTextField jTextField_J_B;
	private javax.swing.JTextField jTextField_K_A;
	private javax.swing.JTextField jTextField_K_B;
	private javax.swing.JTextField jTextField_galacticLat_A;
	private javax.swing.JTextField jTextField_galacticLat_B;
	private javax.swing.JTextField jTextField_pmDEC_A;
	private javax.swing.JTextField jTextField_pmDEC_B;
	private javax.swing.JTextField jTextField_pmRA_A;
	private javax.swing.JTextField jTextField_pmRA_B;
	private javax.swing.JButton primaria_GIGANTE_Button;
	private javax.swing.JButton secundaria_GIGANTE_Button;
	private javax.swing.JButton setUCAC3_button_A;
	// End of variables declaration//GEN-END:variables
	private TWOMASSStar componenteA;
	private TWOMASSStar componenteB;
	//private double excesoColorA;
	//private double excesoColorB;
	private double correctedDist_A;
	private double correctedDist_B;
	private Visor v;
	private int language = 0;
	public Properties local;
	private String _mainWindowTitle;
	private String _dataEntryTab;
	private String _reducedPMTab;
	private String _astrophysicAnalysis;
	private String _processedData;
	private String _galacticExtinction;
	private String _formulae;
	private String _spectralEnergyDistribution;
	private String _sdssImaage;
	private String _probablyGalacticLocation;
	private String _processEnteredData;
	private String _exportData;
	private String _twoMASScoordsFormatExample;
	private String _twomassALabel;
	private String _twomassALabe2;
	private String _glatitude;
	private String _pmRA;
	private String _pmDec;
	private String _retrieveJHKfromInternetButton;
	private String _retrieveDataMsg;
	private String _b_vDiagram;
	private String _v_iDiagram;
	private String _v_jDiagram;
	private String _distanceInParsecsA;
	private String _distanceInParsecsB;
	private String _long_legend;
	private String _primary_is_giant;
	private String _secondary_is_giant;
	private String _both_are_giant;
	private String _doubleColorDiagramButton;
	private String _componentA;
	private String _componentB;
	private String _spectralType;
	private String _abosluteMag;
	private String _A_distanceInParsecs;
	private String _B_distanceInParsecs;
	private String _intenetConnectionNeededMessage;
	private String _coordinateFormatLegend;
	private String _A_coordinatesLabel;
	private String _B_coordinatesLabel;
	private String _de_reddeningButton;
	private String _colorExcessLabel;
	private String _e_b_v_componentA_label;
	private String _e_b_v_componentB_label;
	private String _distanceToA;
	private String _distanceToB;
	private String _please_enter_coordinates_label;
	private String _advice_about_jhk_automatic_retrieving;
	private String _coord_format_example;
	private String _retrieveSDSS_image_button;
	private String _probablyGalacticLocationButton;
	private String _buttonSpectral_A;
	private String _buttonSpectral_B;
	private String _primary;
	private String _secondary;
	private String _rpm;
	private String _colorcolorD;
	private String _theoreticalModel;
	private String _photometry;
	private String _colorIndexValue;
	private String _dwarfs;
	private String _giants;
	private String _sub_dwarfs;
	private String _brownDwarfs;
	private String _wavelength;
	private String _rptTitle;
	private String _rptSubtitle;
	private String _rpt_analysisA;
	private String _rpt_analysisB;
	private String _rpt_V;
	private String _rpt_J;
	private String _rpt_H;
	private String _rpt_K;
	private String _rpt_b_v;
	private String _rpt_v_i;
	private String _rpt_v_j;
	private String _rpt_M;
	private String _rpt_glat;
	private String _rpt_BolCorr;
	private String _rpt_distance;
	private String _rpt_corrected_distance;
	private String _rpt_color_excess;
	private String _rpt_Av;
	private String _rpt_SpecType;
	private String _rpt_pmRA;
	private String _rpt_pmDEC;
	private String _rpt_total_pm;
	private String _rpt_reducedPM;
	private String _creditos;
	private String _setUCAC3;
	private String _setUCAC4;
	private String _restorePPMXL;
	private String _creditsList;
	private String ppxml_ra_a;
	private String ppxml_de_a;
	private String ppxml_ra_b;
	private String ppxml_de_b;
	private String _wise;
	private String _ra;
	private String _eqdistance;
	private String _eqcolorexcess;
	private String _absoluteMag;
	private String _a_is_subdwarf;
	private String _b_is_subdwarf;
	private String _both_are_subsubdwarf;
	private String _a_is_superGiant;
	private String _b_is_superGiant;
	private String _both_are_superGiants;
	private String _Voption0 = "magV UCAC4";
	private String _Voption1;
	private String _Voption2;
	private String _Voption3;
	private String _Voption4;
	private String _Voption5;
	private String _Voption6;
	private String _Voption7;
	private String _Voption8;
	private String _Voption9;
	private String _Voption10;
	private TWOMASScatalog _2mass_catalog_a;
	private TWOMASScatalog _2mass_catalog_b;
	private UCAC3catalog _ucac3_catalog_a;
	private UCAC3catalog _ucac3_catalog_b;
	private UCAC4catalog _ucac4_catalog_a;
	private UCAC4catalog _ucac4_catalog_b;
	private USNOB1catalog _usnob1_catalog_a;
	private USNOB1catalog _usnob1_catalog_b;
	private CMC14catalog _cmc14_catalog_a;
	private CMC14catalog _cmc14_catalog_b;
	private String _recalcDistance;
	private String _sun;
	private String _vCalctext;

}