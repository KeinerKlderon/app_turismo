package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Agencia;
import Model.Clientes;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JAClientes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField texttipodocumento;
	private JTextField textndocumento;
	private JTextField textnombre;
	private JTextField textapellido;
	private JTextField texteps;
	private JTextField textalergias;
	private JTextField textfechanacimiento;
	private JTextField textestadocivil;
	private JTextField texttelefono;
	private JTextField textcorreoelectronico;
	private JTextField textdireción;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JAClientes frame = new JAClientes();
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
	public JAClientes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lbltipodocumento = new JLabel("Tipo Documento:");
		lbltipodocumento.setBounds(44, 43, 46, 14);
		contentPane.add(lbltipodocumento);

		texttipodocumento = new JTextField();
		texttipodocumento.setBounds(100, 40, 86, 20);
		contentPane.add(texttipodocumento);
		texttipodocumento.setColumns(10);

		JLabel lblndocumento = new JLabel("Numero Documento");
		lblndocumento.setBounds(44, 75, 46, 14);
		contentPane.add(lblndocumento);

		textndocumento = new JTextField();
		textndocumento.setBounds(100, 71, 86, 20);
		contentPane.add(textndocumento);
		textndocumento.setColumns(10);

		JLabel lblnombre = new JLabel("Nombre");
		lblnombre.setBounds(44, 106, 46, 14);
		contentPane.add(lblnombre);

		textnombre = new JTextField();
		textnombre.setBounds(100, 103, 86, 20);
		contentPane.add(textnombre);
		textnombre.setColumns(10);

		JLabel lblapellido = new JLabel("Apellido");
		lblapellido.setBounds(44, 137, 46, 14);
		contentPane.add(lblapellido);

		textapellido = new JTextField();
		textapellido.setBounds(100, 134, 86, 20);
		contentPane.add(textapellido);
		textapellido.setColumns(10);

		JLabel lbleps = new JLabel("Eps");
		lbleps.setBounds(54, 162, 46, 14);
		contentPane.add(lbleps);

		texteps = new JTextField();
		texteps.setBounds(100, 159, 86, 20);
		contentPane.add(texteps);
		texteps.setColumns(10);

		JLabel lblalergias = new JLabel("Alergias");
		lblalergias.setBounds(44, 187, 46, 14);
		contentPane.add(lblalergias);

		textalergias = new JTextField();
		textalergias.setBounds(100, 184, 86, 20);
		contentPane.add(textalergias);
		textalergias.setColumns(10);

		textfechanacimiento = new JTextField();
		textfechanacimiento.setBounds(264, 40, 86, 20);
		contentPane.add(textfechanacimiento);
		textfechanacimiento.setColumns(10);

		JLabel lblfechanacimiento = new JLabel("Fecha Nacimiento");
		lblfechanacimiento.setBounds(208, 43, 46, 14);
		contentPane.add(lblfechanacimiento);

		JLabel lblestadocivil = new JLabel("Estado Civil");
		lblestadocivil.setBounds(208, 106, 46, 14);
		contentPane.add(lblestadocivil);

		JLabel lbltelefono = new JLabel("Telefono");
		lbltelefono.setBounds(208, 137, 46, 14);
		contentPane.add(lbltelefono);

		textestadocivil = new JTextField();
		textestadocivil.setBounds(264, 103, 86, 20);
		contentPane.add(textestadocivil);
		textestadocivil.setColumns(10);

		texttelefono = new JTextField();
		texttelefono.setBounds(264, 134, 86, 20);
		contentPane.add(texttelefono);
		texttelefono.setColumns(10);

		JButton btnguardar = new JButton("GUARDAR");
		btnguardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Clientes cr = new Clientes();
				cr.create(texttipodocumento.getText(),textndocumento.getText(),textnombre.getText(),textapellido.getText(),texteps.getText(),textalergias.getText(),textfechanacimiento.getText(),textcorreoelectronico.getText(),textestadocivil.getText(),texttelefono.getText(),textdireción.getText());
			}
		});
		btnguardar.setBounds(153, 212, 104, 38);
		contentPane.add(btnguardar);
		
		JLabel lblNewLabel = new JLabel("GESTIÓN CLIENTES");
		lblNewLabel.setBounds(153, 11, 123, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblcorreoelectronico = new JLabel("Correo Electronico");
		lblcorreoelectronico.setBounds(208, 75, 46, 14);
		contentPane.add(lblcorreoelectronico);
		
		textcorreoelectronico = new JTextField();
		textcorreoelectronico.setBounds(264, 72, 86, 20);
		contentPane.add(textcorreoelectronico);
		textcorreoelectronico.setColumns(10);
		
		JLabel lbldireción = new JLabel("Direción");
		lbldireción.setBounds(208, 162, 46, 14);
		contentPane.add(lbldireción);
		
		textdireción = new JTextField();
		textdireción.setBounds(264, 162, 86, 20);
		contentPane.add(textdireción);
		textdireción.setColumns(10);
	}
}
