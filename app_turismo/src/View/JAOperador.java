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
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
	private JLabel lblidoperador;
	private JTextField textidoperador;
	private JButton btndelete;
	Operador cr = new Operador();
	private JButton btnselect;
	private JButton btnupdate;

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
		setBounds(100, 100, 313, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblapellido = new JLabel("Apellido");
		lblapellido.setBounds(41, 181, 46, 14);
		contentPane.add(lblapellido);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo De Identificacion");
		lblNewLabel_1.setBounds(41, 65, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblndocumento = new JLabel("Numero Documento");
		lblndocumento.setBounds(41, 112, 46, 14);
		contentPane.add(lblndocumento);
		
		JLabel lbldirección = new JLabel("Dirección");
		lbldirección.setBounds(41, 221, 46, 14);
		contentPane.add(lbldirección);
		
		JLabel lblcorreoelectronico = new JLabel("Correo Electronico");
		lblcorreoelectronico.setBounds(41, 264, 46, 14);
		contentPane.add(lblcorreoelectronico);
		
		JLabel lbltelefono = new JLabel("Telefono");
		lbltelefono.setBounds(41, 303, 46, 14);
		contentPane.add(lbltelefono);
		
		lblidtipovehiculo = new JLabel("Id Tipovehiculo");
		lblidtipovehiculo.setBounds(41, 336, 46, 14);
		contentPane.add(lblidtipovehiculo);
		
		texttipoidentificacion = new JTextField();
		texttipoidentificacion.setBounds(41, 84, 86, 20);
		contentPane.add(texttipoidentificacion);
		texttipoidentificacion.setColumns(10);
		
		textndocumento = new JTextField();
		textndocumento.setBounds(41, 126, 86, 20);
		contentPane.add(textndocumento);
		textndocumento.setColumns(10);
		
		textapellido = new JTextField();
		textapellido.setBounds(41, 199, 86, 20);
		contentPane.add(textapellido);
		textapellido.setColumns(10);
		
		textdirección = new JTextField();
		textdirección.setBounds(41, 240, 86, 20);
		contentPane.add(textdirección);
		textdirección.setColumns(10);
		
		textcorreoelectronico = new JTextField();
		textcorreoelectronico.setBounds(41, 279, 86, 20);
		contentPane.add(textcorreoelectronico);
		textcorreoelectronico.setColumns(10);
		
		texttelefono = new JTextField();
		texttelefono.setBounds(41, 316, 86, 20);
		contentPane.add(texttelefono);
		texttelefono.setColumns(10);
		
		textidtipovehiculo = new JTextField();
		textidtipovehiculo.setBounds(41, 351, 86, 20);
		contentPane.add(textidtipovehiculo);
		textidtipovehiculo.setColumns(10);
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.setBounds(103, 382, 89, 23);
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.create(texttipoidentificacion.getText(),textndocumento.getText(),textnombre.getText(),textapellido.getText(),textdirección.getText(),textcorreoelectronico.getText(),texttelefono.getText(),textidtipovehiculo.getText(),textidoperador.getText());
			}
		});
		contentPane.add(btnGuardar);
		
		JLabel lbloperador = new JLabel("GESTIÓN OPERADOR");
		lbloperador.setBounds(103, 24, 103, 14);
		contentPane.add(lbloperador);
		
		lblnombre = new JLabel("Nombre");
		lblnombre.setBounds(41, 146, 46, 14);
		contentPane.add(lblnombre);
		
		textnombre = new JTextField();
		textnombre.setBounds(41, 162, 86, 20);
		contentPane.add(textnombre);
		textnombre.setColumns(10);
		
		lblidoperador = new JLabel("Id Operador :");
		lblidoperador.setBounds(156, 90, 67, 14);
		contentPane.add(lblidoperador);
		
		textidoperador = new JTextField();
		textidoperador.setBounds(149, 109, 86, 20);
		contentPane.add(textidoperador);
		textidoperador.setColumns(10);
		
		btndelete = new JButton("");
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btndelete.setBounds(213, 138, 46, 57);
		btndelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(textidoperador.getText()));

			}
		});
		btndelete.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\3030705_bin_delete_trash_unused_icon.png"));
		contentPane.add(btndelete);
		
		btnselect = new JButton("");
		btnselect.setBounds(156, 146, 46, 38);
		btnselect.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.readOne(Integer.parseInt(textidoperador.getText()),texttipoidentificacion,textndocumento,textnombre,textapellido,textdirección,textcorreoelectronico,texttelefono,textidtipovehiculo);

			}
		});
		btnselect.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\10186532_search_seo_glass_magnifying glass_magnifying_icon.png"));
		contentPane.add(btnselect);
		
		btnupdate = new JButton("");
		btnupdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.Update(Integer.parseInt(textidoperador.getText()),texttipoidentificacion.getText(),textndocumento.getText(),textnombre.getText(),textapellido.getText(),textdirección.getText(),textcorreoelectronico.getText(),texttelefono.getText());

			}
		});
		btnupdate.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\430112_refresh_icon.png"));
		btnupdate.setBounds(228, 400, 59, 38);
		contentPane.add(btnupdate);
	}

}
