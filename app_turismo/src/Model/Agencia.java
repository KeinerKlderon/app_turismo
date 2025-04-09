package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controller.Conexion;

public class Agencia {

	public int idagencia;
	public String nombre;
	public String direccion;
	public String correoelectronico;
	public int telefono;
	public String web;
	public int id_compañia;
	Conexion conector = new Conexion();

	public int getIdagencia() {
		return idagencia;
	}

	public void setIdagencia(int idagencia) {
		this.idagencia = idagencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDirección(String direccion) {
		this.direccion = direccion;
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

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public int getIdcompañia() {
		return id_compañia;
	}

	public void setIdcompañia(int idcompañia) {
		this.id_compañia = idcompañia;
	}

	public void create(String nombre, String direccion, String correoelectronico, String telefono, String web,
			String id_compañia, String id_agencia) {

		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "INSERT INTO tblagencia (nombre,direccion,correoelectronico,telefono,web,id_compañia,id_agencia) values (?,?,?,?,?,?,?)";

		try {

			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);

			pst.setString(1, nombre);
			pst.setString(2, direccion);
			pst.setString(3, correoelectronico);
			pst.setString(4, telefono);
			pst.setString(5, web);
			pst.setString(6, id_compañia);
			pst.setString(7, id_agencia);

			pst.executeUpdate();

			JOptionPane.showConfirmDialog(null, "Registro con Exito.");

		} catch (SQLException e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

	public void delete(int id_agencia) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		String script = "DELETE FROM tblagencia WHERE id_agencia = ?";

		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);

			pst.setInt(1, id_agencia);

			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + id_agencia + "?");

			if (resp == JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + id_agencia + " Eliminado");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void readOne(int id_agencia, JTextField nombre, JTextField direccion, JTextField correoelectronico,
			JTextField telefono, JTextField web, JTextField id_compañia) {

		Connection bdConnection = null;
		PreparedStatement pst = null;
		String script = "SELECT * FROM tblagencia WHERE id_agencia = ?";

		try {
			bdConnection = conector.conectarBD();
			pst = bdConnection.prepareStatement(script);

			pst.setInt(1, id_agencia);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				nombre.setText(rs.getString(2));
				direccion.setText(rs.getString(3));
				correoelectronico.setText(rs.getString(4));
				telefono.setText(rs.getString(5));
				web.setText(rs.getString(6));
				id_compañia.setText(rs.getString(7));

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}

	public void Update(int id_agencia, String nombre, String direccion, String correoelectronico, String telefono,String web, String id_compañia) {
		
		Connection bdConnection = null;
		PreparedStatement pst = null;

		String script = "UPDATE tblagencia set nombre = ?,direccion = ?,correoelectronico = ?,telefono  = ?, web= ?, id_compañia = ? WHERE id_agencia = ? ";

		try {
			bdConnection = conector.conectarBD();
			pst = bdConnection.prepareStatement(script);

			pst.setString(1, nombre);
			pst.setString(2, direccion);
			pst.setString(3, correoelectronico);
			pst.setString(4, telefono);
			pst.setString(5, web);
			pst.setString(6, id_compañia);
			pst.setInt(7, id_agencia);

			int respuesta = JOptionPane.showConfirmDialog(null,
					"¿ Desea actualizar el registro No. " + id_agencia + "?");

			if (respuesta == JOptionPane.YES_OPTION) {
				pst.execute();
				JOptionPane.showConfirmDialog(null, "Registro No. " + id_agencia + "Actualizado");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
