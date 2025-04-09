package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Clientes;
import Model.Tiposmedios;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class JATiposmedios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textnombre;
	private JTextField textobservacion;
	private JTextField textId_medio;
	Tiposmedios cr = new Tiposmedios();
	private JTextField textId_Tipomedio;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JATiposmedios frame = new JATiposmedios();
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
	public JATiposmedios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 289, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblnombre = new JLabel("Nombre");
		lblnombre.setBounds(51, 49, 46, 14);
		contentPane.add(lblnombre);
		
		JLabel lblobservacion = new JLabel("Observacion");
		lblobservacion.setBounds(51, 84, 63, 14);
		contentPane.add(lblobservacion);
		
		textnombre = new JTextField();
		textnombre.setBounds(51, 63, 86, 20);
		contentPane.add(textnombre);
		textnombre.setColumns(10);
		
		textobservacion = new JTextField();
		textobservacion.setBounds(51, 99, 86, 20);
		contentPane.add(textobservacion);
		textobservacion.setColumns(10);
		
		JButton btnguardar = new JButton("GUARDAR");
		btnguardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnguardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.create(textnombre.getText(),textobservacion.getText());
			}
		});
		btnguardar.setBounds(61, 170, 89, 23);
		contentPane.add(btnguardar);
		
		JLabel lbltiposmedios = new JLabel("Gestion Tipos De Medios");
		lbltiposmedios.setBounds(77, 11, 127, 14);
		contentPane.add(lbltiposmedios);
		
		JLabel lblId_medio = new JLabel("ID Medios");
		lblId_medio.setBounds(51, 123, 54, 14);
		contentPane.add(lblId_medio);
		
		textId_medio = new JTextField();
		textId_medio.setBounds(51, 139, 86, 20);
		contentPane.add(textId_medio);
		textId_medio.setColumns(10);
		
		JButton btndelete = new JButton("");
		btndelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(textId_medio.getText()));
				
			}
		});
		btndelete.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\3030705_bin_delete_trash_unused_icon.png"));
		btndelete.setBounds(219, 99, 46, 48);
		contentPane.add(btndelete);
		
		JButton btnselect = new JButton("");
		btnselect.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.readOne(Integer.parseInt(textId_Tipomedio.getText()),textnombre,textobservacion,textId_medio);

			}
		});
		btnselect.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\10186532_search_seo_glass_magnifying glass_magnifying_icon.png"));
		btnselect.setBounds(169, 99, 46, 48);
		contentPane.add(btnselect);
		
		textId_Tipomedio = new JTextField();
		textId_Tipomedio.setBounds(169, 81, 86, 20);
		contentPane.add(textId_Tipomedio);
		textId_Tipomedio.setColumns(10);
		
		JLabel lblId_Tipomedio = new JLabel("Id Tipomedio :");
		lblId_Tipomedio.setBounds(172, 66, 71, 14);
		contentPane.add(lblId_Tipomedio);
		
		JButton btnupdate = new JButton("");
		btnupdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.Update(Integer.parseInt(textId_Tipomedio.getText()),textnombre.getText(),textobservacion.getText(),textId_medio.getText());

			}
		});
		btnupdate.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\430112_refresh_icon.png"));
		btnupdate.setBounds(212, 213, 53, 37);
		contentPane.add(btnupdate);
	}
}
