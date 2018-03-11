package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class MyActionListener implements ActionListener {

	TresNRaya control;
	JLabel lblFin;
	
	public MyActionListener(TresNRaya control,JLabel lblFin) {
		super();
		this.control = control;
		this.lblFin=lblFin;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton boton=((JButton)e.getSource());
		control.destinox=Integer.parseInt(String.valueOf(boton.getName().charAt(0)));
		control.destinoy=Integer.parseInt(String.valueOf(boton.getName().charAt(1)));
		if(control.realizarJugada()&&!casillaPintada(boton)) {
			((JButton)e.getSource()).setText(String.valueOf(control.retornaSimbolo(control.verTurno())));
			if(control.comprobarTresEnRaya()) {
				lblFin.setText("Has ganado");
			}else {
				lblFin.setText("Turno "+control.verTurno());
			}
				
		}
	
	}
	
	private boolean casillaPintada(JButton boton) {
		if(!boton.getText().equals("")) {
			boton.setText("");
			return true;
		}else {
			return false;
		}
		
		
	}
	

}
