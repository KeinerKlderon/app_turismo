package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controller.Conexion;

public class Tiposmedios {

	public int idtipomedio =0;
	public String nombre ="";
	public String observacion ="";
	Conexion conector = new Conexion();
	public int getIdtipomedio() {
		return idtipomedio;
	}
	public void setIdtipomedio(int idtipomedio) {
		this.idtipomedio = idtipomedio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public void create(String nombre, String observacion) {
		
		Conexion conector = new Conexion();

		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "INSERT INTO tblmedios (nombre,observacion) values (?,?)";

		try {

			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);

			pst.setString(1, nombre);
			pst.setString(2, observacion);
		
			pst.executeUpdate();

			JOptionPane.showConfirmDialog(null, "Registro con Exito.");

		} catch (SQLException e) {
			System.out.println(e.getLocalizedMessage());
		}

	}
	public void delete(int id_Tipomedio) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		String script = "DELETE FROM tbltiposmedios WHERE id_Tipomedio = ?";

		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);

			pst.setInt(1, id_Tipomedio);

			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + id_Tipomedio + "?");

			if (resp == JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + id_Tipomedio + "Eliminado");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void readOne(int Id_Tipomedio, JTextField nombre, JTextField observacion, JTextField Id_medio) {

		Connection bdConnection = null;
		PreparedStatement pst = null;
		String script = "SELECT * FROM tbltiposmedios WHERE Id_Tipomedio = ?";

		try {
			bdConnection = conector.conectarBD();
			pst = bdConnection.prepareStatement(script);

			pst.setInt(1, Id_Tipomedio);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				nombre.setText(rs.getString(2));
				observacion.setText(rs.getString(3));
				Id_medio.setText(rs.getString(4));
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}
	public void Update(int Id_Tipomedio, String nombre, String observacion, String Id_medio) {

		Connection bdConnection = null;
		PreparedStatement pst = null;

		String script = "UPDATE tbltiposmedios set nombre = ?,observacion = ?,Id_medio = ? WHERE Id_Tipomedio = ? ";

		try {
			bdConnection = conector.conectarBD();
			pst = bdConnection.prepareStatement(script);

			pst.setString(1, nombre);
			pst.setString(2, observacion);
			pst.setString(3, Id_medio);
			pst.setInt(4, Id_Tipomedio);
			

			int respuesta = JOptionPane.showConfirmDialog(null,
					"¿ Desea actualizar el registro No. " + Id_Tipomedio + "?");

			if (respuesta == JOptionPane.YES_OPTION) {
				pst.execute();
				JOptionPane.showConfirmDialog(null, "Registro No. " + Id_Tipomedio + "Actualizado");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}





