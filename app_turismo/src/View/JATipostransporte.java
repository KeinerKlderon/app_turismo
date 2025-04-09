package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Tiposmedios;
import Model.Tipotransporte;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JATipostransporte extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textnombre;
	private JTextField textobservacion;
	private JTextField textId_tipotransporte;
	Tipotransporte cr = new Tipotransporte();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JATipostransporte frame = new JATipostransporte();
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
	public JATipostransporte() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 323, 295);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblnombre = new JLabel("Nombre");
		lblnombre.setBounds(47, 63, 46, 14);
		contentPane.add(lblnombre);
		
		JLabel lblobservacion = new JLabel("Observación");
		lblobservacion.setBounds(47, 119, 46, 14);
		contentPane.add(lblobservacion);
		
		textnombre = new JTextField();
		textnombre.setBounds(60, 88, 86, 20);
		contentPane.add(textnombre);
		textnombre.setColumns(10);
		
		textobservacion = new JTextField();
		textobservacion.setBounds(60, 132, 86, 20);
		contentPane.add(textobservacion);
		textobservacion.setColumns(10);
		
		JButton btnguardar = new JButton("GUARDAR");
		btnguardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnguardar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				cr.create(textnombre.getText(),textobservacion.getText());
			}
		});
		btnguardar.setBounds(93, 169, 89, 23);
		contentPane.add(btnguardar);
		
		JLabel lblNewLabel_2 = new JLabel("GESTIÓN TIPOS DE TRANSPORTE");
		lblNewLabel_2.setBounds(60, 23, 179, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblid_tipotransporte = new JLabel("ID Tipo Transporte");
		lblid_tipotransporte.setBounds(190, 63, 61, 14);
		contentPane.add(lblid_tipotransporte);
		
		textId_tipotransporte = new JTextField();
		textId_tipotransporte.setBounds(182, 88, 86, 20);
		contentPane.add(textId_tipotransporte);
		textId_tipotransporte.setColumns(10);
		
		JButton btndelete = new JButton("");
		btndelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(textId_tipotransporte.getText()));
			}
			
		});
		btndelete.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\3030705_bin_delete_trash_unused_icon.png"));
		btndelete.setBounds(246, 116, 46, 57);
		contentPane.add(btndelete);
		
		JButton btnselect = new JButton("");
		btnselect.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.readOne(Integer.parseInt(textId_tipotransporte.getText()),textnombre,textobservacion);

			}
		});
		btnselect.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\10186532_search_seo_glass_magnifying glass_magnifying_icon.png"));
		btnselect.setBounds(175, 116, 61, 42);
		contentPane.add(btnselect);
		
		JButton btnupdate = new JButton("");
		btnupdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.Update(Integer.parseInt(textId_tipotransporte.getText()),textnombre.getText(),textobservacion.getText());

			}
		});
		btnupdate.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\430112_refresh_icon.png"));
		btnupdate.setBounds(236, 209, 61, 36);
		contentPane.add(btnupdate);
	}
}
