package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import vista.TresNRayaUI;

public class ParaTresNRayaUI extends TresNRayaUI {
	TresNRaya control = new TresNRaya();
	MyActionListener listener = new MyActionListener(control,lblFin);

	public ParaTresNRayaUI() {
		super();
		for (int i = 0; i < this.botonera.botones.length; i++) {
			for (int j = 0; j < this.botonera.botones[i].length; j++) {
				this.botonera.botones[i][j].addActionListener(listener);

			}

		}
		//Para mostar el Turno
		lblFin.setText("Turno "+control.verTurno());

	}
	
}
