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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GESTIÓN PAQUETE");
		lblNewLabel.setBounds(162, 11, 98, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lbliddestino = new JLabel("Id Destino");
		lbliddestino.setBounds(10, 44, 46, 14);
		contentPane.add(lbliddestino);
		
		JLabel lblidorigen = new JLabel("Id Origen");
		lblidorigen.setBounds(10, 69, 46, 14);
		contentPane.add(lblidorigen);
		
		JLabel lblfechaventa = new JLabel("Fecha Venta");
		lblfechaventa.setBounds(10, 96, 46, 14);
		contentPane.add(lblfechaventa);
		
		JLabel lblhoraventa = new JLabel("Hora Venta");
		lblhoraventa.setBounds(10, 121, 46, 14);
		contentPane.add(lblhoraventa);
		
		JLabel lblhorasalida = new JLabel("Hora Salida");
		lblhorasalida.setBounds(10, 146, 46, 14);
		contentPane.add(lblhorasalida);
		
		JLabel lblfechaejecucion = new JLabel("Fecha Ejecucion");
		lblfechaejecucion.setBounds(10, 171, 46, 14);
		contentPane.add(lblfechaejecucion);
		
		JLabel lblidpromotores = new JLabel("Id Promotores");
		lblidpromotores.setBounds(182, 44, 46, 14);
		contentPane.add(lblidpromotores);
		
		JLabel lblidclientes = new JLabel("Id Clientes");
		lblidclientes.setBounds(182, 69, 46, 14);
		contentPane.add(lblidclientes);
		
		JLabel lblidagencia = new JLabel("Id Agencia");
		lblidagencia.setBounds(182, 96, 46, 14);
		contentPane.add(lblidagencia);
		
		JLabel lblidtipovehiculo = new JLabel("Id Tipovehiculo");
		lblidtipovehiculo.setBounds(182, 121, 46, 14);
		contentPane.add(lblidtipovehiculo);
		
		JLabel lblidmedio = new JLabel("Id Medio");
		lblidmedio.setBounds(182, 146, 46, 14);
		contentPane.add(lblidmedio);
		
		JLabel lblprecio = new JLabel("Precio");
		lblprecio.setBounds(182, 171, 46, 14);
		contentPane.add(lblprecio);
		
		JLabel lblobservacion = new JLabel("Observacion");
		lblobservacion.setBounds(10, 196, 46, 14);
		contentPane.add(lblobservacion);
		
		JButton btnguardar = new JButton("GUARDAR");
		btnguardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Paquete cr = new Paquete();
				cr.create(textid_destino.getText(),textid_origen.getText(),textfechaventa.getText(),texthoraventa.getText(),texthorasalida.getText(),textfechaejecucion.getText(),textobservacion.getText(),textidpromotores.getText(),textidclientes.getText(),textid_agencia.getText(),textid_tipovehiculo.getText(),textid_medio.getText(),textprecio.getText());
			}
		});
		btnguardar.setBounds(162, 196, 123, 40);
		contentPane.add(btnguardar);
		
		textid_destino = new JTextField();
		textid_destino.setBounds(66, 41, 86, 20);
		contentPane.add(textid_destino);
		textid_destino.setColumns(10);
		
		textid_origen = new JTextField();
		textid_origen.setBounds(66, 66, 86, 20);
		contentPane.add(textid_origen);
		textid_origen.setColumns(10);
		
		textfechaventa = new JTextField();
		textfechaventa.setBounds(66, 93, 86, 20);
		contentPane.add(textfechaventa);
		textfechaventa.setColumns(10);
		
		texthoraventa = new JTextField();
		texthoraventa.setBounds(66, 121, 86, 20);
		contentPane.add(texthoraventa);
		texthoraventa.setColumns(10);
		
		texthorasalida = new JTextField();
		texthorasalida.setBounds(66, 146, 86, 20);
		contentPane.add(texthorasalida);
		texthorasalida.setColumns(10);
		
		textfechaejecucion = new JTextField();
		textfechaejecucion.setBounds(66, 168, 86, 20);
		contentPane.add(textfechaejecucion);
		textfechaejecucion.setColumns(10);
		
		textobservacion = new JTextField();
		textobservacion.setBounds(66, 193, 86, 20);
		contentPane.add(textobservacion);
		textobservacion.setColumns(10);
		
		textidpromotores = new JTextField();
		textidpromotores.setBounds(248, 41, 86, 20);
		contentPane.add(textidpromotores);
		textidpromotores.setColumns(10);
		
		textidclientes = new JTextField();
		textidclientes.setBounds(248, 66, 86, 20);
		contentPane.add(textidclientes);
		textidclientes.setColumns(10);
		
		textid_agencia = new JTextField();
		textid_agencia.setBounds(248, 93, 86, 20);
		contentPane.add(textid_agencia);
		textid_agencia.setColumns(10);
		
		textid_tipovehiculo = new JTextField();
		textid_tipovehiculo.setBounds(248, 118, 86, 20);
		contentPane.add(textid_tipovehiculo);
		textid_tipovehiculo.setColumns(10);
		
		textid_medio = new JTextField();
		textid_medio.setBounds(248, 143, 86, 20);
		contentPane.add(textid_medio);
		textid_medio.setColumns(10);
		
		textprecio = new JTextField();
		textprecio.setBounds(248, 168, 86, 20);
		contentPane.add(textprecio);
		textprecio.setColumns(10);
	}

}
