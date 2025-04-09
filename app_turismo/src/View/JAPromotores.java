package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Clientes;
import Model.Operador;
import Model.Promotores;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
	private JTextField textcodigo;
	private JTextField textidpromotores;
	Promotores cr = new Promotores();


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
		setBounds(100, 100, 450, 477);
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
		lblndocumento.setBounds(25, 90, 46, 14);
		contentPane.add(lblndocumento);
		
		JLabel lblnombre = new JLabel("Nombre");
		lblnombre.setBounds(25, 124, 46, 14);
		contentPane.add(lblnombre);
		
		JLabel lblapellido = new JLabel("Apellido");
		lblapellido.setBounds(25, 163, 46, 14);
		contentPane.add(lblapellido);
		
		JLabel lbldirección = new JLabel("Dirección");
		lbldirección.setBounds(25, 205, 46, 14);
		contentPane.add(lbldirección);
		
		texttipoidentificacion = new JTextField();
		texttipoidentificacion.setBounds(25, 71, 86, 20);
		contentPane.add(texttipoidentificacion);
		texttipoidentificacion.setColumns(10);
		
		textndocumento = new JTextField();
		textndocumento.setBounds(25, 102, 86, 20);
		contentPane.add(textndocumento);
		textndocumento.setColumns(10);
		
		textnombre = new JTextField();
		textnombre.setBounds(25, 138, 86, 20);
		contentPane.add(textnombre);
		textnombre.setColumns(10);
		
		textapellido = new JTextField();
		textapellido.setBounds(25, 179, 86, 20);
		contentPane.add(textapellido);
		textapellido.setColumns(10);
		
		textdirección = new JTextField();
		textdirección.setBounds(25, 220, 86, 20);
		contentPane.add(textdirección);
		textdirección.setColumns(10);
		
		JLabel lblcorreopersonal = new JLabel("Correo Personal");
		lblcorreopersonal.setBounds(25, 242, 46, 14);
		contentPane.add(lblcorreopersonal);
		
		JLabel lblcorreocorporativo = new JLabel("Correo Corporativo");
		lblcorreocorporativo.setBounds(134, 52, 86, 14);
		contentPane.add(lblcorreocorporativo);
		
		JLabel lblfechanacimiento = new JLabel("Fecha Nacimiento");
		lblfechanacimiento.setBounds(134, 90, 86, 14);
		contentPane.add(lblfechanacimiento);
		
		JLabel lbltelefono = new JLabel("Telefono");
		lbltelefono.setBounds(134, 124, 46, 14);
		contentPane.add(lbltelefono);
		
		JLabel lblcodigo = new JLabel("Codigo");
		lblcodigo.setBounds(134, 163, 46, 14);
		contentPane.add(lblcodigo);
		
		textcorreopersonal = new JTextField();
		textcorreopersonal.setBounds(25, 256, 86, 20);
		contentPane.add(textcorreopersonal);
		textcorreopersonal.setColumns(10);
		
		textcorreocorporativo = new JTextField();
		textcorreocorporativo.setBounds(134, 71, 86, 20);
		contentPane.add(textcorreocorporativo);
		textcorreocorporativo.setColumns(10);
		
		textfechanacimiento = new JTextField();
		textfechanacimiento.setBounds(134, 102, 86, 20);
		contentPane.add(textfechanacimiento);
		textfechanacimiento.setColumns(10);
		
		texttelefono = new JTextField();
		texttelefono.setBounds(134, 138, 86, 20);
		contentPane.add(texttelefono);
		texttelefono.setColumns(10);
		
		textcodigo = new JTextField();
		textcodigo.setBounds(134, 179, 86, 20);
		contentPane.add(textcodigo);
		textcodigo.setColumns(10);
		
		JButton btnguardar = new JButton("GUARDAR");
		btnguardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Promotores cr = new Promotores();
				cr.create(texttipoidentificacion.getText(),textndocumento.getText(),textnombre.getText(),textapellido.getText(),textdirección.getText(),textcorreopersonal.getText(),textcorreocorporativo.getText(),textfechanacimiento.getText(),texttelefono.getText(),textcodigo.getText());
			}
		});
		btnguardar.setBounds(52, 301, 89, 23);
		contentPane.add(btnguardar);
		
		JLabel lblNewLabel_10 = new JLabel("GESTIÓN PROMOTORES");
		lblNewLabel_10.setBounds(175, 11, 136, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblidpromotores = new JLabel("ID Promotores");
		lblidpromotores.setBounds(268, 74, 85, 14);
		contentPane.add(lblidpromotores);
		
		textidpromotores = new JTextField();
		textidpromotores.setBounds(256, 87, 86, 20);
		contentPane.add(textidpromotores);
		textidpromotores.setColumns(10);
		
		JButton btndelete = new JButton("");
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cr.delete(Integer.parseInt(textidpromotores.getText()));

			}
			
		});
		btndelete.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\3030705_bin_delete_trash_unused_icon.png"));
		btndelete.setBounds(307, 108, 57, 50);
		contentPane.add(btndelete);
		
		JButton btnselect = new JButton("");
		btnselect.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			cr.readOne(Integer.parseInt(textidpromotores.getText()),texttipoidentificacion,textndocumento,textnombre,textapellido,textdirección,textcorreopersonal,textcorreocorporativo,textfechanacimiento,texttelefono,textcodigo);

			}
		});
		btnselect.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\10186532_search_seo_glass_magnifying glass_magnifying_icon.png"));
		btnselect.setBounds(253, 105, 46, 50);
		contentPane.add(btnselect);
	}
}
