package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class Operador {

	public int idoperador = 0;
	public String tipoidentificacion = "";
	public String ndocumento = "";
	public String nombre = "";
	public String apellido = "";
	public String dirección = "";
	public String correoelectronico = "";
	public int telefono = 0;
	public int idtipovehiculo = 0;

	public int getIdoperador() {
		return idoperador;
	}

	public void setIdoperador(int idoperador) {
		this.idoperador = idoperador;
	}

	public String getTipoidentificacion() {
		return tipoidentificacion;
	}

	public void setTipoidentificacion(String tipoidentificacion) {
		this.tipoidentificacion = tipoidentificacion;
	}

	public String getNdocumento() {
		return ndocumento;
	}

	public void setNdocumento(String ndocumento) {
		this.ndocumento = ndocumento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
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

	public int getIdtipovehiculo() {
		return idtipovehiculo;
	}

	public void setIdtipovehiculo(int idtipovehiculo) {
		this.idtipovehiculo = idtipovehiculo;
	}

	public void create(String tipoidentificacion, String ndocumento, String nombre, String apellido, String direción,
			String correoelectronico, String telefono, String Id_tipovehiculo) {

		Conexion conector = new Conexion();

		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "INSERT INTO tbloperador (tipoidentificacion,ndocumento,nombre,apellido,direción,correoelectronico,telefono,Id_tipovehiculo) values (?,?,?,?,?,?,?,?)";

		try {

			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);

			pst.setString(1, tipoidentificacion);
			pst.setString(2, ndocumento);
			pst.setString(3, nombre);
			pst.setString(4, apellido);
			pst.setString(5, direción);
			pst.setString(6, correoelectronico);
			pst.setString(7, telefono);
			pst.setString(8, Id_tipovehiculo);

			pst.executeUpdate();

			JOptionPane.showConfirmDialog(null, "Registro con Exito.");

		} catch (SQLException e) {
			System.out.println(e.getLocalizedMessage());
		}

	}
}
