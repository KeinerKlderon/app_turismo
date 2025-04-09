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
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;

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
	private JTextField textidclientes;
	Clientes cr = new Clientes();

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
		setBounds(100, 100, 390, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lbltipodocumento = new JLabel("Tipo Documento");
		lbltipodocumento.setBounds(44, 60, 86, 14);
		contentPane.add(lbltipodocumento);

		texttipodocumento = new JTextField();
		texttipodocumento.setBounds(44, 81, 86, 20);
		contentPane.add(texttipodocumento);
		texttipodocumento.setColumns(10);

		JLabel lblndocumento = new JLabel("Numero Documento");
		lblndocumento.setBounds(44, 103, 86, 14);
		contentPane.add(lblndocumento);

		textndocumento = new JTextField();
		textndocumento.setBounds(44, 118, 86, 20);
		contentPane.add(textndocumento);
		textndocumento.setColumns(10);

		JLabel lblnombre = new JLabel("Nombre");
		lblnombre.setBounds(44, 137, 46, 14);
		contentPane.add(lblnombre);

		textnombre = new JTextField();
		textnombre.setBounds(44, 152, 86, 20);
		contentPane.add(textnombre);
		textnombre.setColumns(10);

		JLabel lblapellido = new JLabel("Apellido");
		lblapellido.setBounds(44, 171, 46, 14);
		contentPane.add(lblapellido);

		textapellido = new JTextField();
		textapellido.setBounds(44, 189, 86, 20);
		contentPane.add(textapellido);
		textapellido.setColumns(10);

		JLabel lbleps = new JLabel("Eps");
		lbleps.setBounds(44, 209, 46, 14);
		contentPane.add(lbleps);

		texteps = new JTextField();
		texteps.setBounds(44, 224, 86, 20);
		contentPane.add(texteps);
		texteps.setColumns(10);

		JLabel lblalergias = new JLabel("Alergias");
		lblalergias.setBounds(44, 249, 46, 14);
		contentPane.add(lblalergias);

		textalergias = new JTextField();
		textalergias.setBounds(44, 267, 86, 20);
		contentPane.add(textalergias);
		textalergias.setColumns(10);

		textfechanacimiento = new JTextField();
		textfechanacimiento.setBounds(153, 81, 86, 20);
		contentPane.add(textfechanacimiento);
		textfechanacimiento.setColumns(10);

		JLabel lblfechanacimiento = new JLabel("Fecha Nacimiento");
		lblfechanacimiento.setBounds(153, 60, 86, 14);
		contentPane.add(lblfechanacimiento);

		JLabel lblestadocivil = new JLabel("Estado Civil");
		lblestadocivil.setBounds(153, 137, 86, 14);
		contentPane.add(lblestadocivil);

		JLabel lbltelefono = new JLabel("Telefono");
		lbltelefono.setBounds(153, 171, 46, 14);
		contentPane.add(lbltelefono);

		textestadocivil = new JTextField();
		textestadocivil.setBounds(153, 152, 86, 20);
		contentPane.add(textestadocivil);
		textestadocivil.setColumns(10);

		texttelefono = new JTextField();
		texttelefono.setBounds(153, 189, 86, 20);
		contentPane.add(texttelefono);
		texttelefono.setColumns(10);

		JButton btnguardar = new JButton("GUARDAR");
		btnguardar.setBounds(104, 306, 104, 38);
		btnguardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.create(texttipodocumento.getText(),textndocumento.getText(),textnombre.getText(),textapellido.getText(),texteps.getText(),textalergias.getText(),textfechanacimiento.getText(),textcorreoelectronico.getText(),textestadocivil.getText(),texttelefono.getText(),textdireción.getText(),textidclientes.getText());
			}
		});
		contentPane.add(btnguardar);
		
		JLabel lblNewLabel = new JLabel("GESTIÓN CLIENTES");
		lblNewLabel.setBounds(153, 11, 123, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblcorreoelectronico = new JLabel("Correo Electronico");
		lblcorreoelectronico.setBounds(153, 103, 86, 14);
		contentPane.add(lblcorreoelectronico);
		
		textcorreoelectronico = new JTextField();
		textcorreoelectronico.setBounds(153, 118, 86, 20);
		contentPane.add(textcorreoelectronico);
		textcorreoelectronico.setColumns(10);
		
		JLabel lbldireción = new JLabel("Direción");
		lbldireción.setBounds(153, 209, 46, 14);
		contentPane.add(lbldireción);
		
		textdireción = new JTextField();
		textdireción.setBounds(153, 224, 86, 20);
		contentPane.add(textdireción);
		textdireción.setColumns(10);
		
		JButton btndelete = new JButton("");
		btndelete.setBounds(311, 103, 55, 52);
		btndelete.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(textidclientes.getText()));

			}
		});
		btndelete.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\3030705_bin_delete_trash_unused_icon.png"));
		contentPane.add(btndelete);
		
		textidclientes = new JTextField();
		textidclientes.setBounds(257, 81, 86, 20);
		contentPane.add(textidclientes);
		textidclientes.setColumns(10);
		
		JLabel lblidclientes = new JLabel("ID Clientes");
		lblidclientes.setBounds(273, 60, 70, 14);
		contentPane.add(lblidclientes);
		
		JButton btnconsult = new JButton("");
		btnconsult.setBounds(249, 103, 52, 48);
		btnconsult.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.readOne(Integer.parseInt(textidclientes.getText()),texttipodocumento,textndocumento,textnombre,textapellido,texteps,textalergias,textfechanacimiento,textcorreoelectronico,textestadocivil,texttelefono,textdireción);
				 
			}
		});
		btnconsult.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\10186532_search_seo_glass_magnifying glass_magnifying_icon.png"));
		contentPane.add(btnconsult);
		
		JButton btnupdate = new JButton("");
		btnupdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.Update(Integer.parseInt(textidclientes.getText()),texttipodocumento.getText(),textndocumento.getText(),textnombre.getText(),textapellido.getText(),texteps.getText(),textalergias.getText(),textfechanacimiento.getText(),textcorreoelectronico.getText(),textestadocivil.getText(),texttelefono.getText(),textdireción.getText());

			}
		});
		btnupdate.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\430112_refresh_icon.png"));
		btnupdate.setBounds(311, 306, 55, 38);
		contentPane.add(btnupdate);
	}
}
