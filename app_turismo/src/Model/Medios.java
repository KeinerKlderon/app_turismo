package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controller.Conexion;

public class Medios {

	public int idmedio = 0;
	public String nombre = "";
	public String observacion = "";
	public int Tipomedio = 0;
	Conexion conector = new Conexion();


	public int getIdmedio() {

		return idmedio;

	}

	public void setIdmedio(int idmedio) {
		this.idmedio = idmedio;
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

	public int getTipomedio() {
		return Tipomedio;
	}

	public void setTipomedio(int tipomedio) {
		Tipomedio = tipomedio;
	}

	public void create(String nombre, String observacion, String Id_Tipomedio) {

		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "INSERT INTO tblmedios (nombre,observacion,Id_Tipomedio) values (?,?,?)";

		try {

			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);

			pst.setString(1, nombre);
			pst.setString(2, observacion);
			pst.setString(3, Id_Tipomedio);

			pst.executeUpdate();

			JOptionPane.showConfirmDialog(null, "Registro con Exito.");

		} catch (SQLException e) {
			System.out.println(e.getLocalizedMessage());
		}

	}

	public void delete(int Id_medio) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		String script = "DELETE FROM tblmedios WHERE Id_medio = ?";

		try {

			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);

			pst.setInt(1, Id_medio);

			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + Id_medio + "?");

			if (resp == JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + Id_medio + " Eliminado");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void readOne(int Id_medio, JTextField nombre, JTextField observacion, JTextField Id_Tipomedio) {

		Connection bdConnection = null;
		PreparedStatement pst = null;
		String script = "SELECT * FROM tblmedios WHERE Id_medio = ?";

		try {
			bdConnection = conector.conectarBD();
			pst = bdConnection.prepareStatement(script);

			pst.setInt(1, Id_medio);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				nombre.setText(rs.getString(2));
				observacion.setText(rs.getString(3));
				Id_Tipomedio.setText(rs.getString(4));
				
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}

	public void Update(int Id_medio, String nombre, String observacion, String Id_Tipomedio) {

			Connection bdConnection = null;
			PreparedStatement pst = null;

			String script = "UPDATE tblmedios set nombre = ?,observacion = ?,Id_Tipomedio = ?  WHERE Id_medio = ? ";

			try {
				bdConnection = conector.conectarBD();
				pst = bdConnection.prepareStatement(script);

				pst.setString(1, nombre);
				pst.setString(2, observacion);
				pst.setString(3, Id_Tipomedio);
				pst.setInt(4, Id_medio);
				

				int respuesta = JOptionPane.showConfirmDialog(null,
						"¿ Desea actualizar el registro No. " + Id_medio + "?");

				if (respuesta == JOptionPane.YES_OPTION) {
					pst.execute();
					JOptionPane.showConfirmDialog(null, "Registro No. " + Id_medio + "Actualizado");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
	}
}
