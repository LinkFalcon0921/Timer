package com.frames;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JSpinner;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

import com.administer.AddingColl;
import com.administer.AdminCola;
import com.administer.ColaCounters;
import com.administer.WaitList;

import javax.swing.AbstractListModel;
import javax.swing.ScrollPaneConstants;
import java.awt.Dimension;

public class AppDisable {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppDisable window = new AppDisable();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppDisable() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 346, 411);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel = new JLabel("Temporizador");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 29));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 7;
		gbc_lblNewLabel.gridheight = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel labeMin = new JLabel("00");
		labeMin.setFont(new Font("Segoe UI", Font.BOLD, 29));
		GridBagConstraints gbc_labeMin = new GridBagConstraints();
		gbc_labeMin.fill = GridBagConstraints.HORIZONTAL;
		gbc_labeMin.insets = new Insets(0, 0, 5, 5);
		gbc_labeMin.gridx = 2;
		gbc_labeMin.gridy = 3;
		panel.add(labeMin, gbc_labeMin);
		
		JLabel lblNewLabel_5 = new JLabel(":");
		lblNewLabel_5.setFont(new Font("Segoe UI", Font.BOLD, 29));
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 3;
		gbc_lblNewLabel_5.gridy = 3;
		panel.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		JLabel labeSeg = new JLabel("00");
		labeSeg.setFont(new Font("Segoe UI", Font.BOLD, 29));
		GridBagConstraints gbc_labeSeg = new GridBagConstraints();
		gbc_labeSeg.fill = GridBagConstraints.HORIZONTAL;
		gbc_labeSeg.insets = new Insets(0, 0, 5, 5);
		gbc_labeSeg.gridx = 4;
		gbc_labeSeg.gridy = 3;
		panel.add(labeSeg, gbc_labeSeg);
		
		JLabel Lmin = new JLabel("Minutos");
		Lmin.setFont(new Font("Segoe UI", Font.BOLD, 16));
		GridBagConstraints gbc_Lmin = new GridBagConstraints();
		gbc_Lmin.fill = GridBagConstraints.BOTH;
		gbc_Lmin.insets = new Insets(0, 0, 5, 5);
		gbc_Lmin.gridx = 1;
		gbc_Lmin.gridy = 5;
		panel.add(Lmin, gbc_Lmin);
		
		JLabel lblNewLabel_3 = new JLabel("Segundos");
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 16));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 5;
		gbc_lblNewLabel_3.gridy = 5;
		panel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JSpinner tMin = new JSpinner();
		GridBagConstraints gbc_tMin = new GridBagConstraints();
		gbc_tMin.fill = GridBagConstraints.HORIZONTAL;
		gbc_tMin.insets = new Insets(0, 0, 5, 5);
		gbc_tMin.gridx = 1;
		gbc_tMin.gridy = 6;
		panel.add(tMin, gbc_tMin);
		
		JSpinner tSeg = new JSpinner();
		GridBagConstraints gbc_tSeg = new GridBagConstraints();
		gbc_tSeg.fill = GridBagConstraints.HORIZONTAL;
		gbc_tSeg.insets = new Insets(0, 0, 5, 5);
		gbc_tSeg.gridx = 5;
		gbc_tSeg.gridy = 6;
		panel.add(tSeg, gbc_tSeg);
		
		JButton bSave = new JButton("Asignar");
		bSave.setFont(new Font("Segoe UI", Font.BOLD, 16));
		GridBagConstraints gbc_bSave = new GridBagConstraints();
		gbc_bSave.fill = GridBagConstraints.HORIZONTAL;
		gbc_bSave.gridwidth = 5;
		gbc_bSave.insets = new Insets(0, 0, 5, 5);
		gbc_bSave.gridx = 1;
		gbc_bSave.gridy = 7;
		panel.add(bSave, gbc_bSave);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBorder(new TitledBorder(null, "En espera", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.gridwidth = 5;
		gbc_scrollPane.fill = GridBagConstraints.HORIZONTAL;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 9;
		panel.add(scrollPane, gbc_scrollPane);
		
		JList<String> listStandBy = new JList<>();
		listStandBy.setFont(new Font("Segoe UI", Font.BOLD, 12));
		listStandBy.setVisibleRowCount(5);
		listStandBy.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(listStandBy);
		
		//Boton listener
		
		final class ActionableBotton implements ActionListener{
			
			final AdminCola cola;
			
			public ActionableBotton() {
				bSave.addActionListener(this);
				cola = new AdminCola(listStandBy, labeMin, labeSeg);
			}
			//Devulve verdadero si los valores son negativos
			boolean keep() {
				return (Integer)tMin.getValue() < 0 && (Integer)tSeg.getValue() < 0 ;
			}
			
			@Override
			public void actionPerformed(ActionEvent e) {
					cola.add((Integer)tMin.getValue(), (Integer)tSeg.getValue());	
				
				tMin.setValue((Integer)0);
				tSeg.setValue((Integer)0);
			}
			
		}
		
		new ActionableBotton();
		
	}
	
	
}
