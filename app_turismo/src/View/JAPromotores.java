package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Clientes;
import Model.Promotores;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JAPromotores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField texttipoidentificacion;
	private JTextField textndocumento;
	private JTextField textnombre;
	private JTextField textapellido;
	private JTextField textdirección;
	private JTextField textcorreopersonal;
	private JTextField textcorreocorporativo;
	private JTextField textfechanacimiento;
	private JTextField texttelefono;
	private JTextField textFcodigo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JAPromotores frame = new JAPromotores();
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
	public JAPromotores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
			
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbltipoidentificacion = new JLabel("Tipo Identificacion");
		lbltipoidentificacion.setBounds(25, 52, 46, 14);
		contentPane.add(lbltipoidentificacion);
		
		JLabel lblndocumento = new JLabel("Numero Documento");
		lblndocumento.setBounds(25, 77, 46, 14);
		contentPane.add(lblndocumento);
		
		JLabel lblnombre = new JLabel("Nombre");
		lblnombre.setBounds(25, 105, 46, 14);
		contentPane.add(lblnombre);
		
		JLabel lblapellido = new JLabel("Apellido");
		lblapellido.setBounds(25, 130, 46, 14);
		contentPane.add(lblapellido);
		
		JLabel lbldirección = new JLabel("Dirección");
		lbldirección.setBounds(25, 155, 46, 14);
		contentPane.add(lbldirección);
		
		texttipoidentificacion = new JTextField();
		texttipoidentificacion.setBounds(92, 49, 86, 20);
		contentPane.add(texttipoidentificacion);
		texttipoidentificacion.setColumns(10);
		
		textndocumento = new JTextField();
		textndocumento.setBounds(92, 77, 86, 20);
		contentPane.add(textndocumento);
		textndocumento.setColumns(10);
		
		textnombre = new JTextField();
		textnombre.setBounds(92, 102, 86, 20);
		contentPane.add(textnombre);
		textnombre.setColumns(10);
		
		textapellido = new JTextField();
		textapellido.setBounds(92, 127, 86, 20);
		contentPane.add(textapellido);
		textapellido.setColumns(10);
		
		textdirección = new JTextField();
		textdirección.setBounds(92, 152, 86, 20);
		contentPane.add(textdirección);
		textdirección.setColumns(10);
		
		JLabel lblcorreopersonal = new JLabel("Correo Personal");
		lblcorreopersonal.setBounds(202, 52, 46, 14);
		contentPane.add(lblcorreopersonal);
		
		JLabel lblcorreocorporativo = new JLabel("Correo Corporativo");
		lblcorreocorporativo.setBounds(202, 77, 46, 14);
		contentPane.add(lblcorreocorporativo);
		
		JLabel lblfechanacimiento = new JLabel("Fecha Nacimiento");
		lblfechanacimiento.setBounds(202, 105, 46, 14);
		contentPane.add(lblfechanacimiento);
		
		JLabel lbltelefono = new JLabel("Telefono");
		lbltelefono.setBounds(202, 130, 46, 14);
		contentPane.add(lbltelefono);
		
		JLabel lblcodigo = new JLabel("Codigo");
		lblcodigo.setBounds(202, 155, 46, 14);
		contentPane.add(lblcodigo);
		
		textcorreopersonal = new JTextField();
		textcorreopersonal.setBounds(267, 49, 86, 20);
		contentPane.add(textcorreopersonal);
		textcorreopersonal.setColumns(10);
		
		textcorreocorporativo = new JTextField();
		textcorreocorporativo.setBounds(267, 77, 86, 20);
		contentPane.add(textcorreocorporativo);
		textcorreocorporativo.setColumns(10);
		
		textfechanacimiento = new JTextField();
		textfechanacimiento.setBounds(267, 102, 86, 20);
		contentPane.add(textfechanacimiento);
		textfechanacimiento.setColumns(10);
		
		texttelefono = new JTextField();
		texttelefono.setBounds(267, 127, 86, 20);
		contentPane.add(texttelefono);
		texttelefono.setColumns(10);
		
		textFcodigo = new JTextField();
		textFcodigo.setBounds(267, 152, 86, 20);
		contentPane.add(textFcodigo);
		textFcodigo.setColumns(10);
		
		JButton btnguardar = new JButton("GUARDAR");
		btnguardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Promotores cr = new Promotores();
				cr.create(texttipoidentificacion.getText(),textndocumento.getText(),textnombre.getText(),textapellido.getText(),textdirección.getText(),textcorreopersonal.getText(),textcorreocorporativo.getText(),textfechanacimiento.getText(),texttelefono.getText(),textFcodigo.getText());
			}
		});
		btnguardar.setBounds(163, 195, 89, 23);
		contentPane.add(btnguardar);
		
		JLabel lblNewLabel_10 = new JLabel("GESTIÓN PROMOTORES");
		lblNewLabel_10.setBounds(175, 11, 136, 14);
		contentPane.add(lblNewLabel_10);
	}

}
