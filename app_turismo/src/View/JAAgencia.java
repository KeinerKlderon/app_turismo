package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Agencia;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class JAAgencia extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNombre;
	private JLabel lblDirección;
	private JLabel lblTelefono;
	private JLabel lblWeb;
	private JTextField textnombre;
	private JTextField textdireccion;
	private JTextField textcorreoelectronico;
	private JTextField texttelefono;
	private JTextField textweb;
	private JLabel lblNewLabel;
	private JLabel lblid_compañia;
	private JTextField textid_compañia;
	Agencia cr = new Agencia();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JAAgencia frame = new JAAgencia();
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
	public JAAgencia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 348);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(90, 68, 46, 14);
		contentPane.add(lblNombre);

		lblDirección = new JLabel("Dirección");
		lblDirección.setBounds(90, 93, 46, 14);
		contentPane.add(lblDirección);

		lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(90, 153, 46, 14);
		contentPane.add(lblTelefono);

		lblWeb = new JLabel("Web");
		lblWeb.setBounds(90, 187, 46, 14);
		contentPane.add(lblWeb);

		textnombre = new JTextField();
		textnombre.setBounds(177, 65, 86, 20);
		contentPane.add(textnombre);
		textnombre.setColumns(10);

		textdireccion = new JTextField();
		textdireccion.setBounds(177, 90, 86, 20);
		contentPane.add(textdireccion);
		textdireccion.setColumns(10);

		textcorreoelectronico = new JTextField();
		textcorreoelectronico.setBounds(177, 115, 86, 20);
		contentPane.add(textcorreoelectronico);
		textcorreoelectronico.setColumns(10);

		texttelefono = new JTextField();
		texttelefono.setBounds(177, 150, 86, 20);
		contentPane.add(texttelefono);
		texttelefono.setColumns(10);

		textweb = new JTextField();
		textweb.setBounds(177, 184, 86, 20);
		contentPane.add(textweb);
		textweb.setColumns(10);


		JLabel lblCorreoelectronico = new JLabel("Correo Electronico");
		lblCorreoelectronico.setBounds(90, 118, 46, 14);
		contentPane.add(lblCorreoelectronico);
		
		lblNewLabel = new JLabel("GESTIÓN AGENCIA");
		lblNewLabel.setBounds(151, 26, 112, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnguardar = new JButton("GUARDAR");
		btnguardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 cr.create(textnombre.getText(),textdireccion.getText(),textcorreoelectronico.getText(),texttelefono.getText(),textweb.getText(),textid_compañia.getText());
						
			}
		});
		btnguardar.setBounds(174, 257, 89, 23);
		contentPane.add(btnguardar);
		
		lblid_compañia = new JLabel("Id Compañia");
		lblid_compañia.setBounds(90, 212, 46, 14);
		contentPane.add(lblid_compañia);
		
		textid_compañia = new JTextField();
		textid_compañia.setBounds(177, 209, 86, 20);
		contentPane.add(textid_compañia);
		textid_compañia.setColumns(10);
		
		JButton btndelete = new JButton("");
		btndelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btndelete.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\3030705_bin_delete_trash_unused_icon.png"));
		btndelete.setBounds(314, 68, 61, 57);
		contentPane.add(btndelete);
	}
}
