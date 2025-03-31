package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class Paquete {

	public int codigo =0;
	public int iddestino = 0;
	public int idorigen = 0;
	public String fechaventa ="";
	public String horaventa ="";
	public String horasalida ="";
	public String fechaejecucion ="";
	public String observacion ="";
	public int idpromotores =0;
	public int idclientes =0;
	public int idagencia =0;
	public int idtipovehiculo =0;
	public int idmedio =0;
	public int precio =0;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getIddestino() {
		return iddestino;
	}
	public void setIddestino(int iddestino) {
		this.iddestino = iddestino;
	}
	public int getIdorigen() {
		return idorigen;
	}
	public void setIdorigen(int idorigen) {
		this.idorigen = idorigen;
	}
	public String getFechaventa() {
		return fechaventa;
	}
	public void setFechaventa(String fechaventa) {
		this.fechaventa = fechaventa;
	}
	public String getHoraventa() {
		return horaventa;
	}
	public void setHoraventa(String horaventa) {
		this.horaventa = horaventa;
	}
	public String getHorasalida() {
		return horasalida;
	}
	public void setHorasalida(String horasalida) {
		this.horasalida = horasalida;
	}
	public String getFechaejecucion() {
		return fechaejecucion;
	}
	public void setFechaejecucion(String fechaejecucion) {
		this.fechaejecucion = fechaejecucion;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public int getIdpromotores() {
		return idpromotores;
	}
	public void setIdpromotores(int idpromotores) {
		this.idpromotores = idpromotores;
	}
	public int getIdclientes() {
		return idclientes;
	}
	public void setIdclientes(int idclientes) {
		this.idclientes = idclientes;
	}
	public int getIdagencia() {
		return idagencia;
	}
	public void setIdagencia(int idagencia) {
		this.idagencia = idagencia;
	}
	public int getIdtipovehiculo() {
		return idtipovehiculo;
	}
	public void setIdtipovehiculo(int idtipovehiculo) {
		this.idtipovehiculo = idtipovehiculo;
	}
	public int getIdmedio() {
		return idmedio;
	}
	public void setIdmedio(int idmedio) {
		this.idmedio = idmedio;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public void create(String id_destino, String id_origen, String fechaventa, String horaventa, String horasalida, String fechaejecucion,String observacion ,String idpromotores,
			String idclientes, String id_agencia,String id_tipovehiculo, String id_medio, String Precio ) {
		Conexion conector = new Conexion();

		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "INSERT INTO tblpaquete (id_destino,id_origen,fechaventa,horaventa,horasalida,fechaejecucion,observacion,idpromotores,idclientes,id_agencia,id_tipovehiculo,id_medio,Precio) "
				+ "values (?,?,?,?,?,?,?,?,?,?,?,?,?)";

		try {

			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);

			pst.setString(1, id_destino);
			pst.setString(2, id_origen);
			pst.setString(3, fechaventa);
			pst.setString(4, horaventa);
			pst.setString(5, horasalida);
			pst.setString(6, fechaejecucion);
			pst.setString(7, observacion);
			pst.setString(8, idpromotores);
			pst.setString(9, idclientes);
			pst.setString(10, id_agencia);
			pst.setString(11, id_tipovehiculo);
			pst.setString(12, id_medio);
			pst.setString(13, Precio);

			pst.executeUpdate();

			JOptionPane.showConfirmDialog(null, "Registro con Exito.");

		} catch (SQLException e) {
			System.out.println(e.getLocalizedMessage());
		}

	}
	
}
