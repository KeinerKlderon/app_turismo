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
import javax.swing.ImageIcon;

public class JACompañia extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textrazonsocial;
	private JTextField textdirección;
	private JTextField textcorreoelectronico;
	private JTextField texttelefono;
	private JTextField textfechacreacion;
	private JTextField textweb;
	private JTextField textid_compañia;
	Compañia cr = new Compañia();

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
		setBounds(100, 100, 307, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblrazonsocial = new JLabel("Razon Social");
		lblrazonsocial.setBounds(42, 39, 46, 14);
		contentPane.add(lblrazonsocial);

		JLabel lbldirección = new JLabel("Dirección");
		lbldirección.setBounds(42, 83, 46, 14);
		contentPane.add(lbldirección);

		JLabel lblcorreoelectronico = new JLabel("Correo Electronico");
		lblcorreoelectronico.setBounds(42, 118, 46, 14);
		contentPane.add(lblcorreoelectronico);

		JLabel lbltelefono = new JLabel("Telefono");
		lbltelefono.setBounds(42, 155, 46, 14);
		contentPane.add(lbltelefono);

		JLabel lblfechacreacion = new JLabel("Fecha De Creacion");
		lblfechacreacion.setBounds(42, 186, 46, 14);
		contentPane.add(lblfechacreacion);

		JLabel lblweb = new JLabel("Web");
		lblweb.setBounds(42, 221, 46, 14);
		contentPane.add(lblweb);

		textrazonsocial = new JTextField();
		textrazonsocial.setBounds(42, 61, 86, 20);
		contentPane.add(textrazonsocial);
		textrazonsocial.setColumns(10);

		textdirección = new JTextField();
		textdirección.setBounds(42, 98, 86, 20);
		contentPane.add(textdirección);
		textdirección.setColumns(10);

		textcorreoelectronico = new JTextField();
		textcorreoelectronico.setBounds(42, 135, 86, 20);
		contentPane.add(textcorreoelectronico);
		textcorreoelectronico.setColumns(10);

		texttelefono = new JTextField();
		texttelefono.setBounds(42, 167, 86, 20);
		contentPane.add(texttelefono);
		texttelefono.setColumns(10);

		textfechacreacion = new JTextField();
		textfechacreacion.setBounds(42, 198, 86, 20);
		contentPane.add(textfechacreacion);
		textfechacreacion.setColumns(10);

		textweb = new JTextField();
		textweb.setBounds(42, 235, 86, 20);
		contentPane.add(textweb);
		textweb.setColumns(10);

		JButton btnguardar = new JButton("GUARDAR");
		btnguardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.create(textrazonsocial.getText(),textdirección.getText(),textcorreoelectronico.getText(),texttelefono.getText(),textfechacreacion.getText(),textweb.getText());
			}
		});
		btnguardar.setBounds(84, 266, 106, 31);
		contentPane.add(btnguardar);
		
		JLabel lblNewLabel = new JLabel("GESTIÓN COMPAÑIA");
		lblNewLabel.setBounds(164, 11, 106, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblid_compañia = new JLabel("ID Compañia");
		lblid_compañia.setBounds(164, 83, 70, 14);
		contentPane.add(lblid_compañia);
		
		textid_compañia = new JTextField();
		textid_compañia.setBounds(164, 98, 86, 20);
		contentPane.add(textid_compañia);
		textid_compañia.setColumns(10);
		
		JButton btndelete = new JButton("");
		btndelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(textid_compañia.getText()));

			}
		});
		btndelete.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\3030705_bin_delete_trash_unused_icon.png"));
		btndelete.setBounds(227, 118, 46, 57);
		contentPane.add(btndelete);
		
		JButton btnconsult = new JButton("");
		btnconsult.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.readOne(Integer.parseInt(textid_compañia.getText()),textrazonsocial,textdirección,textcorreoelectronico,texttelefono,textfechacreacion,textweb);

			}
		});
		btnconsult.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\10186532_search_seo_glass_magnifying glass_magnifying_icon.png"));
		btnconsult.setBounds(164, 126, 53, 43);
		contentPane.add(btnconsult);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(202, 315, 60, -2);
		contentPane.add(btnNewButton);
		
		JButton btnupdate = new JButton("");
		btnupdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.Update(Integer.parseInt(textid_compañia.getText()),textrazonsocial.getText(),textdirección.getText(),textcorreoelectronico.getText(),texttelefono.getText(),textfechacreacion.getText(),textweb.getText());

			}
		});
		btnupdate.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\430112_refresh_icon.png"));
		btnupdate.setBounds(224, 300, 46, 38);
		contentPane.add(btnupdate);
	}
}
