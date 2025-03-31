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

public class JAMedios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textnombre;
	private JTextField textobservacion;
	private JTextField textId_Tipomedio;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblnombre = new JLabel("Nombre");
		lblnombre.setBounds(45, 66, 46, 14);
		contentPane.add(lblnombre);
		
		JLabel lblobservacion = new JLabel("Observacion");
		lblobservacion.setBounds(45, 101, 74, 27);
		contentPane.add(lblobservacion);
		
		textnombre = new JTextField();
		textnombre.setBounds(134, 63, 86, 20);
		contentPane.add(textnombre);
		textnombre.setColumns(10);
		
		textobservacion = new JTextField();
		textobservacion.setBounds(134, 104, 86, 20);
		contentPane.add(textobservacion);
		textobservacion.setColumns(10);
		
		JButton btnguardar = new JButton("GUARDAR");
		btnguardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Medios cr = new Medios();
				cr.create(textnombre.getText(),textobservacion.getText(),textId_Tipomedio.getText());
			}
		});
		btnguardar.setBounds(160, 170, 99, 36);
		contentPane.add(btnguardar);
		
		JLabel lblNewLabel = new JLabel("GESTIÓN MEDIOS");
		lblNewLabel.setBounds(160, 26, 99, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblId_Tipomedio = new JLabel("Id Tipomedio");
		lblId_Tipomedio.setBounds(55, 148, 46, 14);
		contentPane.add(lblId_Tipomedio);
		
		textId_Tipomedio = new JTextField();
		textId_Tipomedio.setBounds(134, 139, 86, 20);
		contentPane.add(textId_Tipomedio);
		textId_Tipomedio.setColumns(10);
	}
}
