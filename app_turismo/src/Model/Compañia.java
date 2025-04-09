package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controller.Conexion;

public class Compañia {

	public int idcompañia;
	public String razonsocial;
	public String dirección;
	public String correoelectronico;
	public int telefono;
	public String fechacreacion;
	public String web;
	Conexion conector = new Conexion();

	public int getIdcompañia() {
		return idcompañia;
	}

	public void setIdcompañia(int idcompañia) {
		this.idcompañia = idcompañia;
	}

	public String getRazonsocial() {
		return razonsocial;
	}

	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}

	public String getDirección() {
		return dirección;
	}

	public void setDirección(String dirección) {
		this.dirección = dirección;
	}

	public String getCorreoelectronico() {
		return correoelectronico;
	}

	public void setCorreoelectronico(String correoelectronico) {
		this.correoelectronico = correoelectronico;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getFechacreacion() {
		return fechacreacion;
	}

	public void setFechacreacion(String fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public void create(String razonsocial, String direccion, String correoelectronico, String telefono,
			String fechacreacion, String web) {

		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "INSERT INTO tblcompañia (razonsocial,direccion,correoelectronico,telefono,fechacreacion,web) values (?,?,?,?,?,?)";

		try {

			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);

			pst.setString(1, razonsocial);
			pst.setString(2, direccion);
			pst.setString(3, correoelectronico);
			pst.setString(4, telefono);
			pst.setString(5, fechacreacion);
			pst.setString(6, web);

			pst.executeUpdate();

			JOptionPane.showConfirmDialog(null, "Registro con Exito.");

		} catch (SQLException e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

	public void delete(int id_compañia) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		String script = "DELETE FROM tblcompañia WHERE id_compañia = ?";

		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);

			pst.setInt(1, id_compañia);

			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + id_compañia + "?");

			if (resp == JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + id_compañia + " Eliminado");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void readOne(int id_compañia, JTextField razonsocial, JTextField dirección,
			JTextField correoelectronico, JTextField telefono, JTextField fechacreacion,
			JTextField web) {

		Connection bdConnection = null;
		PreparedStatement pst = null;
		String script = "SELECT * FROM tblcompañia WHERE id_compañia = ?";

		try {
			bdConnection = conector.conectarBD();
			pst = bdConnection.prepareStatement(script);

			pst.setInt(1, id_compañia);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				razonsocial.setText(rs.getString(2));
				dirección.setText(rs.getString(3));
				correoelectronico.setText(rs.getString(4));
				telefono.setText(rs.getString(5));
				fechacreacion.setText(rs.getString(6));
				web.setText(rs.getString(7));
			
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}

	public void Update(int id_compañia, String razonsocial, String direccion, String correoelectronico, String telefono, String fechacreacion, String web) {
			Connection bdConnection = null;
			PreparedStatement pst = null;

			String script = "UPDATE tblcompañia set razonsocial = ?,direccion = ?,correoelectronico = ?,telefono  = ?, fechacreacion= ?, web = ? WHERE id_compañia = ? ";

			try {
				bdConnection = conector.conectarBD();
				pst = bdConnection.prepareStatement(script);

				pst.setString(1, razonsocial);
				pst.setString(2, direccion);
				pst.setString(3, correoelectronico);
				pst.setString(4, telefono);
				pst.setString(5, fechacreacion);
				pst.setString(6, web);
				pst.setInt(7, id_compañia);

				int respuesta = JOptionPane.showConfirmDialog(null,
						"¿ Desea actualizar el registro No. " + id_compañia + "?");

				if (respuesta == JOptionPane.YES_OPTION) {
					pst.execute();
					JOptionPane.showConfirmDialog(null, "Registro No. " + id_compañia + "Actualizado");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
	}
}
