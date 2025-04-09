package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Clientes;
import Model.Tipotransporte;
import Model.Vehiculo;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JAVehiculo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textpuestos;
	private JTextField textmodelo;
	private JTextField textnumeromotor;
	private JTextField textplacavéhiculo;
	private JTextField textnombre;
	private JTextField textobservación;
	private JTextField textId_tipovehiculo;
	Vehiculo cr = new Vehiculo();
	private JTextField textId_tipotransporte;


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
		setBounds(100, 100, 382, 457);
		contentPane = new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GESTIÓN VEHICULO");
		lblNewLabel.setBounds(119, 22, 110, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblpuestos = new JLabel("Puestos");
		lblpuestos.setBounds(33, 79, 46, 14);
		contentPane.add(lblpuestos);
		
		JLabel lblmodelo = new JLabel("Modelo");
		lblmodelo.setBounds(33, 126, 46, 14);
		contentPane.add(lblmodelo);
		
		JLabel lblnumeromotor = new JLabel("Numero Motor");
		lblnumeromotor.setBounds(33, 160, 46, 14);
		contentPane.add(lblnumeromotor);
		
		JLabel lblplacavéhiculo = new JLabel("Placa Véhiculo");
		lblplacavéhiculo.setBounds(33, 206, 46, 14);
		contentPane.add(lblplacavéhiculo);
		
		textpuestos = new JTextField();
		textpuestos.setBounds(33, 98, 86, 23);
		contentPane.add(textpuestos);
		textpuestos.setColumns(10);
		
		textmodelo = new JTextField();
		textmodelo.setBounds(33, 139, 86, 20);
		contentPane.add(textmodelo);
		textmodelo.setColumns(10);
		
		textnumeromotor = new JTextField();
		textnumeromotor.setBounds(33, 178, 86, 20);
		contentPane.add(textnumeromotor);
		textnumeromotor.setColumns(10);
		
		textplacavéhiculo = new JTextField();
		textplacavéhiculo.setBounds(33, 224, 86, 20);
		contentPane.add(textplacavéhiculo);
		textplacavéhiculo.setColumns(10);
		
		JButton btnguardar = new JButton("GUARDAR");
		btnguardar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				Vehiculo cr = new Vehiculo();
				cr.create(textpuestos.getText(),textmodelo.getText(),textnumeromotor.getText(),textplacavéhiculo.getText(),textnombre.getText(),textobservación.getText(),textId_tipotransporte.getText());
			}
		});
		btnguardar.setBounds(86, 309, 89, 23);
		contentPane.add(btnguardar);
		
		textnombre = new JTextField();
		textnombre.setBounds(33, 261, 86, 23);
		contentPane.add(textnombre);
		textnombre.setColumns(10);
		
		JLabel lblnombre = new JLabel("Nombre");
		lblnombre.setBounds(33, 244, 46, 14);
		contentPane.add(lblnombre);
		
		JLabel lblobservción = new JLabel("Observción");
		lblobservción.setBounds(140, 79, 46, 14);
		contentPane.add(lblobservción);
		
		textobservación = new JTextField();
		textobservación.setBounds(140, 99, 86, 20);
		contentPane.add(textobservación);
		textobservación.setColumns(10);
		
		JLabel lblId_tipovehiculo = new JLabel("ID Vehiculo");
		lblId_tipovehiculo.setBounds(267, 79, 63, 14);
		contentPane.add(lblId_tipovehiculo);
		
		textId_tipovehiculo = new JTextField();
		textId_tipovehiculo.setBounds(254, 99, 86, 20);
		contentPane.add(textId_tipovehiculo);
		textId_tipovehiculo.setColumns(10);
		
		JButton btndelete = new JButton("");
		btndelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(textId_tipovehiculo.getText()));
				
			}
			
		});
		
		
		btndelete.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\3030705_bin_delete_trash_unused_icon.png"));
		btndelete.setBounds(306, 126, 55, 57);
		contentPane.add(btndelete);
		
		JButton btnselect = new JButton("");
		btnselect.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.readOne(Integer.parseInt(textId_tipovehiculo.getText()),textpuestos,textmodelo,textnumeromotor,textplacavéhiculo,textnombre,textobservación,textId_tipotransporte);

			}
		});
		btnselect.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\10186532_search_seo_glass_magnifying glass_magnifying_icon.png"));
		btnselect.setBounds(250, 126, 46, 39);
		contentPane.add(btnselect);
		
		JLabel lblId_tipotransporte = new JLabel("Id Tipotransporte");
		lblId_tipotransporte.setBounds(140, 126, 46, 14);
		contentPane.add(lblId_tipotransporte);
		
		textId_tipotransporte = new JTextField();
		textId_tipotransporte.setBounds(140, 139, 86, 20);
		contentPane.add(textId_tipotransporte);
		textId_tipotransporte.setColumns(10);
		
		JButton btnupdate = new JButton("");
		btnupdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.Update(Integer.parseInt(textId_tipovehiculo.getText()),textpuestos.getText(),textmodelo.getText(),textnumeromotor.getText(),textplacavéhiculo.getText(),textnombre.getText(),textobservación.getText(),textId_tipotransporte.getText());

			}
		});
		btnupdate.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\430112_refresh_icon.png"));
		btnupdate.setBounds(293, 359, 63, 48);
		contentPane.add(btnupdate);
	}
}
