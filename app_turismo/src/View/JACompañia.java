package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Clientes;
import Model.Compañia;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JACompañia extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textrazonsocial;
	private JTextField textdirección;
	private JTextField textcorreoelectronico;
	private JTextField texttelefono;
	private JTextField textfechacreacion;
	private JTextField textweb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JACompañia frame = new JACompañia();
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
	public JACompañia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblrazonsocial = new JLabel("Razon Social");
		lblrazonsocial.setBounds(42, 39, 46, 14);
		contentPane.add(lblrazonsocial);

		JLabel lbldirección = new JLabel("Dirección");
		lbldirección.setBounds(42, 64, 46, 14);
		contentPane.add(lbldirección);

		JLabel lblcorreoelectronico = new JLabel("Correo Electronico");
		lblcorreoelectronico.setBounds(42, 89, 46, 14);
		contentPane.add(lblcorreoelectronico);

		JLabel lbltelefono = new JLabel("Telefono");
		lbltelefono.setBounds(42, 114, 46, 14);
		contentPane.add(lbltelefono);

		JLabel lblfechacreacion = new JLabel("Fecha De Creacion");
		lblfechacreacion.setBounds(42, 139, 46, 14);
		contentPane.add(lblfechacreacion);

		JLabel lblweb = new JLabel("Web");
		lblweb.setBounds(42, 164, 46, 14);
		contentPane.add(lblweb);

		textrazonsocial = new JTextField();
		textrazonsocial.setBounds(109, 36, 86, 20);
		contentPane.add(textrazonsocial);
		textrazonsocial.setColumns(10);

		textdirección = new JTextField();
		textdirección.setBounds(109, 61, 86, 20);
		contentPane.add(textdirección);
		textdirección.setColumns(10);

		textcorreoelectronico = new JTextField();
		textcorreoelectronico.setBounds(109, 86, 86, 20);
		contentPane.add(textcorreoelectronico);
		textcorreoelectronico.setColumns(10);

		texttelefono = new JTextField();
		texttelefono.setBounds(109, 111, 86, 20);
		contentPane.add(texttelefono);
		texttelefono.setColumns(10);

		textfechacreacion = new JTextField();
		textfechacreacion.setBounds(109, 136, 86, 20);
		contentPane.add(textfechacreacion);
		textfechacreacion.setColumns(10);

		textweb = new JTextField();
		textweb.setBounds(109, 161, 86, 20);
		contentPane.add(textweb);
		textweb.setColumns(10);

		JButton btnguardar = new JButton("GUARDAR");
		btnguardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Compañia cr = new Compañia();
				cr.create(textrazonsocial.getText(),textdirección.getText(),textcorreoelectronico.getText(),texttelefono.getText(),textfechacreacion.getText(),textweb.getText());
			}
		});
		btnguardar.setBounds(164, 202, 106, 31);
		contentPane.add(btnguardar);
		
		JLabel lblNewLabel = new JLabel("GESTIÓN COMPAÑIA");
		lblNewLabel.setBounds(164, 11, 106, 14);
		contentPane.add(lblNewLabel);
	}

}
