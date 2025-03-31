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

public class JATiposmedios extends JFrame {

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblnombre = new JLabel("Nombre");
		lblnombre.setBounds(51, 66, 46, 14);
		contentPane.add(lblnombre);
		
		JLabel lblobservacion = new JLabel("Observacion");
		lblobservacion.setBounds(51, 118, 63, 14);
		contentPane.add(lblobservacion);
		
		textnombre = new JTextField();
		textnombre.setBounds(124, 63, 86, 20);
		contentPane.add(textnombre);
		textnombre.setColumns(10);
		
		textobservacion = new JTextField();
		textobservacion.setBounds(124, 115, 86, 20);
		contentPane.add(textobservacion);
		textobservacion.setColumns(10);
		
		JButton btnguardar = new JButton("GUARDAR");
		btnguardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Tiposmedios cr = new Tiposmedios();
				cr.create(textnombre.getText(),textobservacion.getText());
			}
		});
		btnguardar.setBounds(148, 166, 89, 23);
		contentPane.add(btnguardar);
		
		JLabel lbltiposmedios = new JLabel("Gestion Tipos De Medios");
		lbltiposmedios.setBounds(160, 11, 127, 14);
		contentPane.add(lbltiposmedios);
	}

}
