package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

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
	Conexion conector = new Conexion();

	
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
			String correoelectronico, String telefono, String Id_tipovehiculo, String idoperador) {


		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "INSERT INTO tbloperador (tipoidentificacion,ndocumento,nombre,apellido,direción,correoelectronico,telefono,Id_tipovehiculo,idoperador) values (?,?,?,?,?,?,?,?,?)";

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
			pst.setString(9, idoperador);

			pst.executeUpdate();

			JOptionPane.showConfirmDialog(null, "Registro con Exito.");

		} catch (SQLException e) {
			System.out.println(e.getLocalizedMessage());
		}

	}

	public void delete(int idoperador) {
			Connection dbConnection = null;
			PreparedStatement pst = null;
			String script = "DELETE FROM tbloperador WHERE idoperador = ?";

			try {
				dbConnection = conector.conectarBD();
				pst = dbConnection.prepareStatement(script);
				
				pst.setInt(1, idoperador);
				
				int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. "+ idoperador + "?");
				
				if (resp == JOptionPane.OK_OPTION) {
					pst.executeUpdate();
					JOptionPane.showConfirmDialog(null, "Registro No. "+ idoperador + "Eliminado");
				}
				
			} catch (Exception e) {
			System.out.println(e.getMessage());
			}	
	}

	public void readOne(int idoperador, JTextField tipoidentificacion, JTextField ndocumento, JTextField nombre,
			JTextField apellido, JTextField dirección, JTextField correoelectronico,
			JTextField telefono, JTextField idtipovehiculo) {

		Connection bdConnection = null;
		PreparedStatement pst = null;
		String script = "SELECT * FROM tbloperador WHERE idoperador = ?";

		try {
			bdConnection = conector.conectarBD();
			pst = bdConnection.prepareStatement(script);

			pst.setInt(1, idoperador);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				tipoidentificacion.setText(rs.getString(2));
				ndocumento.setText(rs.getString(3));
				nombre.setText(rs.getString(4));
				apellido.setText(rs.getString(5));
				dirección.setText(rs.getString(6));
				correoelectronico.setText(rs.getString(7));
				telefono.setText(rs.getString(8));
				idtipovehiculo.setText(rs.getString(9));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void Update(int idoperador, String tipoidentificacion, String ndocumento, String nombre, String apellido, String direción, String correoelectronico,
			String telefono) {
		
		Connection bdConnection = null;
		PreparedStatement pst = null;

		String script = "UPDATE tbloperador set tipoidentificacion = ?,ndocumento = ?,nombre = ?,apellido  = ?, direción= ?, correoelectronico = ?,telefono = ? WHERE idoperador = ? ";

		try {
			bdConnection = conector.conectarBD();
			pst = bdConnection.prepareStatement(script);

			pst.setString(1, tipoidentificacion);
			pst.setString(2, ndocumento);
			pst.setString(3, nombre);
			pst.setString(4, apellido);
			pst.setString(5, direción);
			pst.setString(6, correoelectronico);
			pst.setString(7, telefono);
			pst.setInt(8, idoperador);

			int respuesta = JOptionPane.showConfirmDialog(null,
					"¿ Desea actualizar el registro No. " + idoperador + "?");

			if (respuesta == JOptionPane.YES_OPTION) {
				pst.execute();
				JOptionPane.showConfirmDialog(null, "Registro No. " + idoperador + "Actualizado");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		
	}
}
