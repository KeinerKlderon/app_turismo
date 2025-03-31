package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Clientes;
import Model.Vehiculo;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JAVehiculo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textpuestos;
	private JTextField textmodelo;
	private JTextField textnumeromotor;
	private JTextField textplacavéhiculo;
	private JTextField textnombre;
	private JTextField textobservción;
	private JTextField textid_tipotransporte;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JAVehiculo frame = new JAVehiculo();
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
	public JAVehiculo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GESTIÓN VEHICULO");
		lblNewLabel.setBounds(163, 22, 110, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblpuestos = new JLabel("Puestos");
		lblpuestos.setBounds(33, 79, 46, 14);
		contentPane.add(lblpuestos);
		
		JLabel lblmodelo = new JLabel("Modelo");
		lblmodelo.setBounds(33, 104, 46, 14);
		contentPane.add(lblmodelo);
		
		JLabel lblnumeromotor = new JLabel("Numero Motor");
		lblnumeromotor.setBounds(33, 129, 46, 14);
		contentPane.add(lblnumeromotor);
		
		JLabel lblplacavéhiculo = new JLabel("Placa Véhiculo");
		lblplacavéhiculo.setBounds(33, 158, 46, 14);
		contentPane.add(lblplacavéhiculo);
		
		textpuestos = new JTextField();
		textpuestos.setBounds(89, 76, 86, 20);
		contentPane.add(textpuestos);
		textpuestos.setColumns(10);
		
		textmodelo = new JTextField();
		textmodelo.setBounds(89, 104, 86, 20);
		contentPane.add(textmodelo);
		textmodelo.setColumns(10);
		
		textnumeromotor = new JTextField();
		textnumeromotor.setBounds(89, 126, 86, 20);
		contentPane.add(textnumeromotor);
		textnumeromotor.setColumns(10);
		
		textplacavéhiculo = new JTextField();
		textplacavéhiculo.setBounds(89, 155, 86, 20);
		contentPane.add(textplacavéhiculo);
		textplacavéhiculo.setColumns(10);
		
		JButton btnguardar = new JButton("GUARDAR");
		btnguardar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				Vehiculo cr = new Vehiculo();
				cr.create(textpuestos.getText(),textmodelo.getText(),textnumeromotor.getText(),textplacavéhiculo.getText(),textnombre.getText(),textobservción.getText(),textid_tipotransporte.getText());
			}
		});
		btnguardar.setBounds(163, 199, 89, 23);
		contentPane.add(btnguardar);
		
		textnombre = new JTextField();
		textnombre.setBounds(250, 76, 86, 20);
		contentPane.add(textnombre);
		textnombre.setColumns(10);
		
		JLabel lblnombre = new JLabel("Nombre");
		lblnombre.setBounds(194, 79, 46, 14);
		contentPane.add(lblnombre);
		
		JLabel lblobservción = new JLabel("Observción");
		lblobservción.setBounds(194, 104, 46, 14);
		contentPane.add(lblobservción);
		
		JLabel lblNidtipotransporte = new JLabel("Id Tipo Transporte");
		lblNidtipotransporte.setBounds(194, 129, 46, 14);
		contentPane.add(lblNidtipotransporte);
		
		textobservción = new JTextField();
		textobservción.setBounds(250, 101, 86, 20);
		contentPane.add(textobservción);
		textobservción.setColumns(10);
		
		textid_tipotransporte = new JTextField();
		textid_tipotransporte.setBounds(250, 126, 86, 20);
		contentPane.add(textid_tipotransporte);
		textid_tipotransporte.setColumns(10);
	}

}
