package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controller.Conexion;

public class Tipotransporte {

	public int idtransporte =0;
	public String nombre = "";
	public String observacion = "";
	Conexion conector = new Conexion();
	public int getIdtransporte() {
		return idtransporte;
	}
	public void setIdtransporte(int idtransporte) {
		this.idtransporte = idtransporte;
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

		String script = "INSERT INTO tbltipotransporte (nombre,observacion) values (?,?)";

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
	public void delete(int Id_tipotransporte) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		String script = "DELETE FROM tbltipotransporte WHERE Id_tipotransporte = ?";

		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);

			pst.setInt(1, Id_tipotransporte);

			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + Id_tipotransporte + "?");

			if (resp == JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + Id_tipotransporte + "Eliminado");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void readOne(int Id_tipotransporte, JTextField nombre, JTextField observacion) {

		Connection bdConnection = null;
		PreparedStatement pst = null;
		String script = "SELECT * FROM tbltipotransporte WHERE Id_tipotransporte = ?";

		try {
			bdConnection = conector.conectarBD();
			pst = bdConnection.prepareStatement(script);

			pst.setInt(1, Id_tipotransporte);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				nombre.setText(rs.getString(2));
				observacion.setText(rs.getString(3));
				
			
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}
	public void Update(int Id_tipotransporte, String nombre, String observacion) {
 
		
		Connection bdConnection = null;
		PreparedStatement pst = null;

		String script = "UPDATE tbltipotransporte set nombre = ?,observacion = ? WHERE Id_tipotransporte = ? ";

		try {
			bdConnection = conector.conectarBD();
			pst = bdConnection.prepareStatement(script);

			pst.setString(1, nombre);
			pst.setString(2, observacion);
			pst.setInt(3, Id_tipotransporte);
			

			int respuesta = JOptionPane.showConfirmDialog(null,
					"¿ Desea actualizar el registro No. " + Id_tipotransporte + "?");

			if (respuesta == JOptionPane.YES_OPTION) {
				pst.execute();
				JOptionPane.showConfirmDialog(null, "Registro No. " + Id_tipotransporte + "Actualizado");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
}
	