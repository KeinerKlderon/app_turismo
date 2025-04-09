package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controller.Conexion;

public class Vehiculo {

	public int idtipovehiculo =0;
	public int puestos = 0;
	public String modelo ="";
	public int numeromotor =0;
	public String placavéhiculo ="";
	public String nombre ="";
	public String observción ="";
	public int id_tipotransporte =0;
	Conexion conector = new Conexion();
	public int getIdtipovehiculo() {
		return idtipovehiculo;
	}
	public void setIdtipovehiculo(int idtipovehiculo) {
		this.idtipovehiculo = idtipovehiculo;
	}
	public int getPuestos() {
		return puestos;
	}
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNumeromotor() {
		return numeromotor;
	}
	public void setNumeromotor(int numeromotor) {
		this.numeromotor = numeromotor;
	}
	public String getPlacavéhiculo() {
		return placavéhiculo;
	}
	public void setPlacavéhiculo(String placavéhiculo) {
		this.placavéhiculo = placavéhiculo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getObservción() {
		return observción;
	}
	public void setObservción(String observción) {
		this.observción = observción;
	}
	public int getIdtipotransporte() {
		return id_tipotransporte;
	}
	public void setIdtipotransporte(int idtipotransporte) {
		this.id_tipotransporte = id_tipotransporte;
	}
	public void create(String puestos, String modelo, String numeromotor, String placavéhiculo, String nombre, String observacion,
			String Id_tipotransporte) {
		

		Conexion conector = new Conexion();

		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "INSERT INTO tblvehiculo (puestos,modelo,numeromotor,placavéhiculo,nombre,observacion,Id_tipotransporte) values (?,?,?,?,?,?,?)";

		try {

			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);

			pst.setString(1, puestos);
			pst.setString(2, modelo);
			pst.setString(3, numeromotor);
			pst.setString(4, placavéhiculo);
			pst.setString(5, nombre);
			pst.setString(6, observacion);
			pst.setString(7, Id_tipotransporte);
			
			pst.executeUpdate();

			JOptionPane.showConfirmDialog(null, "Registro con Exito.");

		} catch (SQLException e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

	public void delete(int Id_tipovehiculo) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		String script = "DELETE FROM tblvehiculo WHERE Id_tipovehiculo = ?";

		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);

			pst.setInt(1, Id_tipovehiculo);

			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + Id_tipovehiculo + "?");

			if (resp == JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + Id_tipovehiculo + "Eliminado");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void readOne(int Id_tipovehiculo, JTextField puestos, JTextField modelo, JTextField numeromotor,
			JTextField placavéhiculo, JTextField nombre, JTextField observación,JTextField Id_tipotransporte) {

		Connection bdConnection = null;
		PreparedStatement pst = null;
		String script = "SELECT * FROM tblvehiculo WHERE Id_tipovehiculo = ?";

		try {
			bdConnection = conector.conectarBD();
			pst = bdConnection.prepareStatement(script);

			pst.setInt(1, Id_tipovehiculo);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				puestos.setText(rs.getString(2));
				modelo.setText(rs.getString(3));
				numeromotor.setText(rs.getString(4));
				placavéhiculo.setText(rs.getString(5));
				nombre.setText(rs.getString(6));
				observación.setText(rs.getString(7));
				Id_tipotransporte.setText(rs.getString(8));
			
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}
	public void Update(int Id_tipovehiculo, String puestos, String modelo, String numeromotor, String placavéhiculo, String nombre, String observacion,
			String Id_tipotransporte) {

		Connection bdConnection = null;
		PreparedStatement pst = null;

		String script = "UPDATE tblvehiculo set puestos = ?,modelo = ?,numeromotor = ?,placavéhiculo = ?,nombre = ?,observacion = ?,Id_tipotransporte = ? WHERE Id_tipovehiculo = ? ";

		try {
			bdConnection = conector.conectarBD();
			pst = bdConnection.prepareStatement(script);

			pst.setString(1, puestos);
			pst.setString(2, modelo);
			pst.setString(3, numeromotor);
			pst.setString(4, placavéhiculo);
			pst.setString(5, nombre);
			pst.setString(6, observacion);
			pst.setString(7, Id_tipotransporte);
			pst.setInt(8, Id_tipovehiculo);
			

			int respuesta = JOptionPane.showConfirmDialog(null,
					"¿ Desea actualizar el registro No. " + Id_tipovehiculo + "?");

			if (respuesta == JOptionPane.YES_OPTION) {
				pst.execute();
				JOptionPane.showConfirmDialog(null, "Registro No. " + Id_tipovehiculo + "Actualizado");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
