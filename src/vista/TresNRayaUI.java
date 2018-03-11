package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class TresNRayaUI extends JFrame {

	private JPanel contentPane;
	protected Botonera botonera;
	protected JLabel lblFin;
	/**
	 * Create the frame.
	 */
	public TresNRayaUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		botonera=new Botonera(100, 0);
		botonera.setBackground(Color.ORANGE);
		botonera.setBounds(25, 48, 150, 150);
		contentPane.add(botonera);
		
		JLabel lblTresEnRaya = new JLabel("TRES EN RAYA");
		lblTresEnRaya.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblTresEnRaya.setBounds(10, 11, 167, 26);
		contentPane.add(lblTresEnRaya);
		
		lblFin = new JLabel("");
		lblFin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFin.setForeground(Color.RED);
		lblFin.setBounds(185, 60, 239, 78);
		contentPane.add(lblFin);
	}
}
