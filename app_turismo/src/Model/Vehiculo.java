package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

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
}
