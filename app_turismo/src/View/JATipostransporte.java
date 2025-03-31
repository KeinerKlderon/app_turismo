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

public class JATipostransporte extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textnombre;
	private JTextField textobservacion;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblnombre = new JLabel("Nombre");
		lblnombre.setBounds(75, 88, 46, 14);
		contentPane.add(lblnombre);
		
		JLabel lblobservacion = new JLabel("Observación");
		lblobservacion.setBounds(75, 135, 46, 14);
		contentPane.add(lblobservacion);
		
		textnombre = new JTextField();
		textnombre.setBounds(143, 85, 86, 20);
		contentPane.add(textnombre);
		textnombre.setColumns(10);
		
		textobservacion = new JTextField();
		textobservacion.setBounds(143, 132, 86, 20);
		contentPane.add(textobservacion);
		textobservacion.setColumns(10);
		
		JButton btnguardar = new JButton("GUARDAR");
		btnguardar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				Tipotransporte cr = new Tipotransporte();
				cr.create(textnombre.getText(),textobservacion.getText());
			}
		});
		btnguardar.setBounds(143, 177, 89, 23);
		contentPane.add(btnguardar);
		
		JLabel lblNewLabel_2 = new JLabel("GESTIÓN TIPOS DE TRANSPORTE");
		lblNewLabel_2.setBounds(119, 27, 179, 14);
		contentPane.add(lblNewLabel_2);
	}

}
