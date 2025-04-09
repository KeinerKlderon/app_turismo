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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

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
	private JTextField textid_agencia;
	private JButton btnconsult;

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
		setBounds(100, 100, 297, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(37, 78, 46, 14);
		contentPane.add(lblNombre);

		lblDirección = new JLabel("Dirección");
		lblDirección.setBounds(37, 114, 46, 14);
		contentPane.add(lblDirección);

		lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(37, 185, 46, 14);
		contentPane.add(lblTelefono);

		lblWeb = new JLabel("Web");
		lblWeb.setBounds(37, 221, 46, 14);
		contentPane.add(lblWeb);

		textnombre = new JTextField();
		textnombre.setBounds(37, 93, 86, 20);
		contentPane.add(textnombre);
		textnombre.setColumns(10);

		textdireccion = new JTextField();
		textdireccion.setBounds(37, 130, 86, 20);
		contentPane.add(textdireccion);
		textdireccion.setColumns(10);

		textcorreoelectronico = new JTextField();
		textcorreoelectronico.setBounds(37, 165, 86, 20);
		contentPane.add(textcorreoelectronico);
		textcorreoelectronico.setColumns(10);

		texttelefono = new JTextField();
		texttelefono.setBounds(37, 199, 86, 20);
		contentPane.add(texttelefono);
		texttelefono.setColumns(10);

		textweb = new JTextField();
		textweb.setBounds(37, 239, 86, 20);
		contentPane.add(textweb);
		textweb.setColumns(10);


		JLabel lblCorreoelectronico = new JLabel("Correo Electronico");
		lblCorreoelectronico.setBounds(37, 149, 105, 14);
		contentPane.add(lblCorreoelectronico);
		
		lblNewLabel = new JLabel("GESTIÓN AGENCIA");
		lblNewLabel.setBounds(93, 34, 112, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnguardar = new JButton("GUARDAR");
		btnguardar.setForeground(new Color(0, 0, 0));
		btnguardar.setBounds(47, 307, 89, 23);
		btnguardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 cr.create(textnombre.getText(),textdireccion.getText(),textcorreoelectronico.getText(),texttelefono.getText(),textweb.getText(),textid_compañia.getText(),textid_agencia.getText());
						
			}
		});
		contentPane.add(btnguardar);
		
		lblid_compañia = new JLabel("Id Compañia");
		lblid_compañia.setBounds(37, 259, 67, 20);
		contentPane.add(lblid_compañia);
		
		textid_compañia = new JTextField();
		textid_compañia.setBounds(37, 276, 86, 20);
		contentPane.add(textid_compañia);
		textid_compañia.setColumns(10);
		
		JButton btndelete = new JButton("");
		btndelete.setFont(new Font("Tahoma", Font.PLAIN, 5));
		btndelete.setBounds(207, 142, 46, 57);
		btndelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(textid_agencia.getText()));
			}
		});
		btndelete.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\3030705_bin_delete_trash_unused_icon.png"));
		contentPane.add(btndelete);
		
		JLabel lblid_agencia = new JLabel("Id Agencia :");
		lblid_agencia.setBounds(153, 96, 67, 14);
		contentPane.add(lblid_agencia);
		
		textid_agencia = new JTextField();
		textid_agencia.setBounds(153, 111, 86, 20);
		contentPane.add(textid_agencia);
		textid_agencia.setColumns(10);
		
		btnconsult = new JButton("");
		btnconsult.setBounds(159, 148, 46, 51);
		btnconsult.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.readOne(Integer.parseInt(textid_agencia.getText()),textnombre,textdireccion,textcorreoelectronico,texttelefono,textweb,textid_compañia);
			}
		});
		btnconsult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnconsult.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\10186532_search_seo_glass_magnifying glass_magnifying_icon.png"));
		contentPane.add(btnconsult);
		
		JButton btnupdate = new JButton("");
		btnupdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.Update(Integer.parseInt(textid_agencia.getText()),textnombre.getText(),textdireccion.getText(),textcorreoelectronico.getText(),texttelefono.getText(),textweb.getText(),textid_compañia.getText());
			}
		});
		btnupdate.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnupdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnupdate.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\430112_refresh_icon.png"));
		btnupdate.setBounds(217, 289, 54, 41);
		contentPane.add(btnupdate);
	}
}
