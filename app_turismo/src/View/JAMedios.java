package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Clientes;
import Model.Medios;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class JAMedios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textnombre;
	private JTextField textobservacion;
	private JTextField textId_Tipomedio;
	private JTextField textId_medio;
	Medios cr = new Medios();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JAMedios frame = new JAMedios();
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
	public JAMedios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 285, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblnombre = new JLabel("Nombre");
		lblnombre.setBounds(45, 55, 46, 14);
		contentPane.add(lblnombre);

		JLabel lblobservacion = new JLabel("Observacion");
		lblobservacion.setBounds(45, 90, 74, 27);
		contentPane.add(lblobservacion);

		textnombre = new JTextField();
		textnombre.setBounds(45, 70, 86, 20);
		contentPane.add(textnombre);
		textnombre.setColumns(10);

		textobservacion = new JTextField();
		textobservacion.setBounds(45, 117, 86, 20);
		contentPane.add(textobservacion);
		textobservacion.setColumns(10);

		JButton btnguardar = new JButton("GUARDAR");
		btnguardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.create(textnombre.getText(), textobservacion.getText(), textId_Tipomedio.getText());
			}
		});
		btnguardar.setBounds(89, 189, 99, 36);
		contentPane.add(btnguardar);

		JLabel lblNewLabel = new JLabel("GESTIÓN MEDIOS");
		lblNewLabel.setBounds(89, 11, 99, 14);
		contentPane.add(lblNewLabel);

		JLabel lblId_Tipomedio = new JLabel("Id Tipomedio");
		lblId_Tipomedio.setBounds(45, 142, 86, 14);
		contentPane.add(lblId_Tipomedio);

		textId_Tipomedio = new JTextField();
		textId_Tipomedio.setBounds(45, 161, 86, 20);
		contentPane.add(textId_Tipomedio);
		textId_Tipomedio.setColumns(10);

		JLabel lblId_medio = new JLabel("ID Medio");
		lblId_medio.setBounds(171, 73, 46, 14);
		contentPane.add(lblId_medio);

		textId_medio = new JTextField();
		textId_medio.setBounds(160, 93, 86, 20);
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
		btndelete.setBounds(216, 117, 46, 57);
		contentPane.add(btndelete);
		
		JButton btnselect = new JButton("");
		btnselect.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.readOne(Integer.parseInt(textId_medio.getText()),textnombre,textobservacion,textId_Tipomedio);

			}
		});
		btnselect.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\10186532_search_seo_glass_magnifying glass_magnifying_icon.png"));
		btnselect.setBounds(160, 117, 46, 42);
		contentPane.add(btnselect);
		
		JButton btnupdate = new JButton("");
		btnupdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.Update(Integer.parseInt(textId_medio.getText()),textnombre.getText(),textobservacion.getText(),textId_Tipomedio.getText());

			}
		});
		btnupdate.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\430112_refresh_icon.png"));
		btnupdate.setBounds(216, 223, 46, 36);
		contentPane.add(btnupdate);
	}
}
