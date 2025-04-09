package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Clientes;
import Model.Paquete;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class JAPaquete extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textid_destino;
	private JTextField textid_origen;
	private JTextField textfechaventa;
	private JTextField texthoraventa;
	private JTextField texthorasalida;
	private JTextField textfechaejecucion;
	private JTextField textobservacion;
	private JTextField textidpromotores;
	private JTextField textidclientes;
	private JTextField textid_agencia;
	private JTextField textid_tipovehiculo;
	private JTextField textid_medio;
	private JTextField textprecio;
	private JTextField textcodigo;
	Paquete cr = new Paquete();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JAPaquete frame = new JAPaquete();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JAPaquete() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 316, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GESTIÓN PAQUETE");
		lblNewLabel.setBounds(93, 11, 98, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lbliddestino = new JLabel("Id Destino");
		lbliddestino.setBounds(39, 41, 86, 14);
		contentPane.add(lbliddestino);
		
		JLabel lblidorigen = new JLabel("Id Origen");
		lblidorigen.setBounds(39, 78, 46, 14);
		contentPane.add(lblidorigen);
		
		JLabel lblfechaventa = new JLabel("Fecha Venta");
		lblfechaventa.setBounds(39, 115, 86, 14);
		contentPane.add(lblfechaventa);
		
		JLabel lblhoraventa = new JLabel("Hora Venta");
		lblhoraventa.setBounds(39, 149, 86, 14);
		contentPane.add(lblhoraventa);
		
		JLabel lblhorasalida = new JLabel("Hora Salida");
		lblhorasalida.setBounds(39, 185, 46, 14);
		contentPane.add(lblhorasalida);
		
		JLabel lblfechaejecucion = new JLabel("Fecha Ejecucion");
		lblfechaejecucion.setBounds(39, 222, 46, 14);
		contentPane.add(lblfechaejecucion);
		
		JLabel lblidpromotores = new JLabel("Id Promotores");
		lblidpromotores.setBounds(162, 115, 86, 14);
		contentPane.add(lblidpromotores);
		
		JLabel lblidclientes = new JLabel("Id Clientes");
		lblidclientes.setBounds(162, 41, 46, 14);
		contentPane.add(lblidclientes);
		
		JLabel lblidagencia = new JLabel("Id Agencia");
		lblidagencia.setBounds(162, 78, 86, 14);
		contentPane.add(lblidagencia);
		
		JLabel lblidtipovehiculo = new JLabel("Id Tipovehiculo");
		lblidtipovehiculo.setBounds(162, 185, 86, 14);
		contentPane.add(lblidtipovehiculo);
		
		JLabel lblidmedio = new JLabel("Id Medio");
		lblidmedio.setBounds(162, 149, 78, 14);
		contentPane.add(lblidmedio);
		
		JLabel lblprecio = new JLabel("Precio");
		lblprecio.setBounds(39, 301, 46, 14);
		contentPane.add(lblprecio);
		
		JLabel lblobservacion = new JLabel("Observacion");
		lblobservacion.setBounds(39, 260, 46, 14);
		contentPane.add(lblobservacion);
		
		JButton btnguardar = new JButton("GUARDAR");
		btnguardar.setBounds(66, 379, 123, 40);
		btnguardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.create(textid_destino.getText(),textid_origen.getText(),textfechaventa.getText(),texthoraventa.getText(),texthorasalida.getText(),textfechaejecucion.getText(),textobservacion.getText(),textidpromotores.getText(),textidclientes.getText(),textid_agencia.getText(),textid_tipovehiculo.getText(),textid_medio.getText(),textprecio.getText());
			}
		});
		contentPane.add(btnguardar);
		
		textid_destino = new JTextField();
		textid_destino.setBounds(39, 55, 86, 20);
		contentPane.add(textid_destino);
		textid_destino.setColumns(10);
		
		textid_origen = new JTextField();
		textid_origen.setBounds(39, 93, 86, 20);
		contentPane.add(textid_origen);
		textid_origen.setColumns(10);
		
		textfechaventa = new JTextField();
		textfechaventa.setBounds(39, 129, 86, 20);
		contentPane.add(textfechaventa);
		textfechaventa.setColumns(10);
		
		texthoraventa = new JTextField();
		texthoraventa.setBounds(39, 162, 86, 20);
		contentPane.add(texthoraventa);
		texthoraventa.setColumns(10);
		
		texthorasalida = new JTextField();
		texthorasalida.setBounds(39, 196, 86, 20);
		contentPane.add(texthorasalida);
		texthorasalida.setColumns(10);
		
		textfechaejecucion = new JTextField();
		textfechaejecucion.setBounds(39, 236, 86, 20);
		contentPane.add(textfechaejecucion);
		textfechaejecucion.setColumns(10);
		
		textobservacion = new JTextField();
		textobservacion.setBounds(39, 276, 86, 20);
		contentPane.add(textobservacion);
		textobservacion.setColumns(10);
		
		textidpromotores = new JTextField();
		textidpromotores.setBounds(162, 129, 86, 20);
		contentPane.add(textidpromotores);
		textidpromotores.setColumns(10);
		
		textidclientes = new JTextField();
		textidclientes.setBounds(162, 55, 86, 20);
		contentPane.add(textidclientes);
		textidclientes.setColumns(10);
		
		textid_agencia = new JTextField();
		textid_agencia.setBounds(162, 93, 86, 20);
		contentPane.add(textid_agencia);
		textid_agencia.setColumns(10);
		
		textid_tipovehiculo = new JTextField();
		textid_tipovehiculo.setBounds(162, 196, 86, 20);
		contentPane.add(textid_tipovehiculo);
		textid_tipovehiculo.setColumns(10);
		
		textid_medio = new JTextField();
		textid_medio.setBounds(162, 162, 86, 20);
		contentPane.add(textid_medio);
		textid_medio.setColumns(10);
		
		textprecio = new JTextField();
		textprecio.setBounds(39, 316, 86, 20);
		contentPane.add(textprecio);
		textprecio.setColumns(10);
		
		JLabel lblcodigo = new JLabel("Codigo:");
		lblcodigo.setBounds(187, 239, 46, 14);
		contentPane.add(lblcodigo);
		
		textcodigo = new JTextField();
		textcodigo.setBounds(162, 257, 86, 20);
		contentPane.add(textcodigo);
		textcodigo.setColumns(10);
		
		JButton btndelete = new JButton("");
		btndelete.setBounds(218, 279, 46, 57);
		btndelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(textcodigo.getText()));

			}
		});
		btndelete.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\3030705_bin_delete_trash_unused_icon.png"));
		contentPane.add(btndelete);
		
		JButton btnselect = new JButton("");
		btnselect.setBounds(162, 289, 46, 47);
		btnselect.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.readOne(Integer.parseInt(textcodigo.getText()),textid_destino,textid_origen,textfechaventa,texthoraventa,texthorasalida,textfechaejecucion,textobservacion,textidclientes,textid_agencia,textid_tipovehiculo,textid_medio,textprecio,textidpromotores);

			}
		});
		btnselect.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\10186532_search_seo_glass_magnifying glass_magnifying_icon.png"));
		contentPane.add(btnselect);
		
		JButton btnupdate = new JButton("");
		btnupdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.Update(Integer.parseInt(textcodigo.getText()),textid_destino.getText(),textid_origen.getText(),textfechaventa.getText(),texthoraventa.getText(),texthorasalida.getText(),textfechaejecucion.getText(),textobservacion.getText(),textidclientes.getText(),textid_agencia.getText(),textid_tipovehiculo.getText(),textid_medio.getText(),textprecio.getText(),textidpromotores.getText());
			}
		});
		btnupdate.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\430112_refresh_icon.png"));
		btnupdate.setBounds(228, 406, 62, 40);
		contentPane.add(btnupdate);
	}
}
