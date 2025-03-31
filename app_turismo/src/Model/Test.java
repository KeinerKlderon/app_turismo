package Model;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class Test {

	public static void main(String[] args) {
		
		Conexion test = new Conexion();
		
		if (test.conectarBD() != null) {
		 JOptionPane.showConfirmDialog(null, "Conectado a la BD");
		 } else {
		JOptionPane.showConfirmDialog(null, "No Conectado a la BD")	;
		}
	}

}
