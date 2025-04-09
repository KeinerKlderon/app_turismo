package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controller.Conexion;

public class Promotores {

	public int idpromotores =0;
	public String tipoidentificacion = "";
	public String ndocumento ="";
	public String nombre ="";
	public String apellido ="";
	public String dirección ="";
	public String correopersonal ="";
	public String correocorporativo ="";
	public String fechanacimiento ="";
	public int telefono =0;
	public int codigo =0;
	Conexion conector = new Conexion();
	public int getIdpromotores() {
		return idpromotores;
	}
	public void setIdpromotores(int idpromotores) {
		this.idpromotores = idpromotores;
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
	public String getCorreopersonal() {
		return correopersonal;
	}
	public void setCorreopersonal(String correopersonal) {
		this.correopersonal = correopersonal;
	}
	public String getCorreocorporativo() {
		return correocorporativo;
	}
	public void setCorreocorporativo(String correocorporativo) {
		this.correocorporativo = correocorporativo;
	}
	public String getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void create( String tipoidentificacion, String ndocumento, String nombre, String apellido, String direción, String correopersonal,
			String correocorporativo, String fechanacimiento, String telefono ,String codigo) {

		Conexion conector = new Conexion();

		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "INSERT INTO tblpromotores (tipoidentificacion,ndocumento,nombre,apellido,direción,correopersonal,correocorporativo,fechanacimiento,telefono,codigo) values (?,?,?,?,?,?,?,?,?,?)";

		try {

			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);

			pst.setString(1, tipoidentificacion);
			pst.setString(2, ndocumento);
			pst.setString(3, nombre);
			pst.setString(4, apellido);
			pst.setString(5, direción);
			pst.setString(6, correopersonal);
			pst.setString(7, correocorporativo);
			pst.setString(8, fechanacimiento);
			pst.setString(9, telefono);
			pst.setString(10, codigo);

			pst.executeUpdate();

			JOptionPane.showConfirmDialog(null, "Registro con Exito.");

		} catch (SQLException e) {
			System.out.println(e.getLocalizedMessage());
		}

	}
		
	public void delete(int idpromotores) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		String script = "DELETE FROM tblpromotores WHERE idpromotores = ?";

		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);

			pst.setInt(1, idpromotores);

			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idpromotores + "?");

			if (resp == JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + idpromotores + "Eliminado");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void readOne(int idpromotores, JTextField tipoidentificacion, JTextField ndocumento, JTextField nombre,
			JTextField apellido, JTextField dirección, JTextField correopersonal,
			JTextField correocorporativo, JTextField fechanacimiento, JTextField telefono,
			JTextField codigo) {

		Connection bdConnection = null;
		PreparedStatement pst = null;
		String script = "SELECT * FROM tblpromotores WHERE idpromotores = ?";

		try {
			bdConnection = conector.conectarBD();
			pst = bdConnection.prepareStatement(script);

			pst.setInt(1, idpromotores);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				tipoidentificacion.setText(rs.getString(2));
				ndocumento.setText(rs.getString(3));
				nombre.setText(rs.getString(4));
				apellido.setText(rs.getString(5));
				dirección.setText(rs.getString(6));
				correopersonal.setText(rs.getString(7));
				correocorporativo.setText(rs.getString(8));
				fechanacimiento.setText(rs.getString(9));
				telefono.setText(rs.getString(10));
				codigo.setText(rs.getString(11));
			
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}
}


