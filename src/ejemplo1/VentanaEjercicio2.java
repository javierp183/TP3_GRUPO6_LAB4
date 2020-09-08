package ejemplo1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.Box;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaEjercicio2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JTextField txtPromedio;
	private JTextField txtCondicion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaEjercicio2 frame = new VentanaEjercicio2();
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
	public VentanaEjercicio2() {
		setTitle("Promedio");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 489, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNotaDelEstudiante = new JLabel("Notas del estudiante");
		lblNotaDelEstudiante.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNotaDelEstudiante.setBounds(71, 46, 191, 14);
		contentPane.add(lblNotaDelEstudiante);
		
		JLabel lblNota = new JLabel("Nota 1:");
		lblNota.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNota.setBounds(71, 83, 46, 14);
		contentPane.add(lblNota);
		
		JLabel lblNota2 = new JLabel("Nota 2:");
		lblNota2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNota2.setBounds(71, 108, 46, 14);
		contentPane.add(lblNota2);
		
		JLabel lblNota3 = new JLabel("Nota 3:");
		lblNota3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNota3.setBounds(71, 133, 46, 14);
		contentPane.add(lblNota3);
		
		JLabel lblTps = new JLabel("TPs");
		lblTps.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTps.setBounds(71, 168, 46, 14);
		contentPane.add(lblTps);
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(128, 80, 150, 20);
		contentPane.add(txtNota1);
		txtNota1.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.setColumns(10);
		txtNota2.setBounds(127, 105, 151, 20);
		contentPane.add(txtNota2);
		
		txtNota3 = new JTextField();
		txtNota3.setColumns(10);
		txtNota3.setBounds(127, 130, 151, 20);
		contentPane.add(txtNota3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(127, 165, 151, 20);
		comboBox.addItem("Aprobados");
		comboBox.addItem("Desaprobados");
		contentPane.add(comboBox);
		
		JLabel lblNotadelEstudiante2 = new JLabel("Notas del estudiante");
		lblNotadelEstudiante2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNotadelEstudiante2.setBounds(71, 236, 191, 14);
		contentPane.add(lblNotadelEstudiante2);
		
		JLabel lblPromedio = new JLabel("Promedio:");
		lblPromedio.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPromedio.setBounds(71, 261, 69, 14);
		contentPane.add(lblPromedio);
		
		JLabel lblCondicion = new JLabel("Condicion:");
		lblCondicion.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCondicion.setBounds(71, 286, 69, 14);
		contentPane.add(lblCondicion);
		
		txtPromedio = new JTextField();
		txtPromedio.setBounds(150, 258, 128, 20);
		contentPane.add(txtPromedio);
		txtPromedio.setColumns(10);
		
		txtCondicion = new JTextField();
		txtCondicion.setBounds(150, 286, 128, 20);
		contentPane.add(txtCondicion);
		txtCondicion.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(332, 83, 107, 43);
		contentPane.add(btnCalcular);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.setToolTipText("");
		btnNuevo.setBounds(332, 133, 107, 36);
		contentPane.add(btnNuevo);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setBounds(332, 182, 107, 36);
		contentPane.add(btnSalir);
	}
}
