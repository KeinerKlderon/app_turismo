package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Clientes;
import Model.Operador;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JAOperador extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField texttipoidentificacion;
	private JTextField textndocumento;
	private JTextField textapellido;
	private JTextField textdirección;
	private JTextField textcorreoelectronico;
	private JTextField texttelefono;
	private JTextField textidtipovehiculo;
	private JLabel lblidtipovehiculo;
	private JLabel lblnombre;
	private JTextField textnombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JAOperador frame = new JAOperador();
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
	public JAOperador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblapellido = new JLabel("Apellido");
		lblapellido.setBounds(41, 143, 46, 14);
		contentPane.add(lblapellido);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo De Identificacion");
		lblNewLabel_1.setBounds(41, 65, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblndocumento = new JLabel("Numero Documento");
		lblndocumento.setBounds(41, 90, 46, 14);
		contentPane.add(lblndocumento);
		
		JLabel lbldirección = new JLabel("Dirección");
		lbldirección.setBounds(199, 65, 46, 14);
		contentPane.add(lbldirección);
		
		JLabel lblcorreoelectronico = new JLabel("Correo Electronico");
		lblcorreoelectronico.setBounds(199, 90, 46, 14);
		contentPane.add(lblcorreoelectronico);
		
		JLabel lbltelefono = new JLabel("Telefono");
		lbltelefono.setBounds(199, 115, 46, 14);
		contentPane.add(lbltelefono);
		
		lblidtipovehiculo = new JLabel("Id Tipovehiculo");
		lblidtipovehiculo.setBounds(199, 143, 46, 14);
		contentPane.add(lblidtipovehiculo);
		
		texttipoidentificacion = new JTextField();
		texttipoidentificacion.setBounds(97, 62, 86, 20);
		contentPane.add(texttipoidentificacion);
		texttipoidentificacion.setColumns(10);
		
		textndocumento = new JTextField();
		textndocumento.setBounds(97, 87, 86, 20);
		contentPane.add(textndocumento);
		textndocumento.setColumns(10);
		
		textapellido = new JTextField();
		textapellido.setBounds(97, 140, 86, 20);
		contentPane.add(textapellido);
		textapellido.setColumns(10);
		
		textdirección = new JTextField();
		textdirección.setBounds(268, 62, 86, 20);
		contentPane.add(textdirección);
		textdirección.setColumns(10);
		
		textcorreoelectronico = new JTextField();
		textcorreoelectronico.setBounds(268, 87, 86, 20);
		contentPane.add(textcorreoelectronico);
		textcorreoelectronico.setColumns(10);
		
		texttelefono = new JTextField();
		texttelefono.setBounds(268, 112, 86, 20);
		contentPane.add(texttelefono);
		texttelefono.setColumns(10);
		
		textidtipovehiculo = new JTextField();
		textidtipovehiculo.setBounds(268, 140, 86, 20);
		contentPane.add(textidtipovehiculo);
		textidtipovehiculo.setColumns(10);
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Operador cr = new Operador();
				cr.create(texttipoidentificacion.getText(),textndocumento.getText(),textnombre.getText(),textapellido.getText(),textdirección.getText(),textcorreoelectronico.getText(),texttelefono.getText(),textidtipovehiculo.getText());
			}
		});
		btnGuardar.setBounds(156, 200, 89, 23);
		contentPane.add(btnGuardar);
		
		JLabel lbloperador = new JLabel("GESTIÓN OPERADOR");
		lbloperador.setBounds(156, 24, 103, 14);
		contentPane.add(lbloperador);
		
		lblnombre = new JLabel("Nombre");
		lblnombre.setBounds(41, 115, 46, 14);
		contentPane.add(lblnombre);
		
		textnombre = new JTextField();
		textnombre.setBounds(97, 112, 86, 20);
		contentPane.add(textnombre);
		textnombre.setColumns(10);
	}

}
