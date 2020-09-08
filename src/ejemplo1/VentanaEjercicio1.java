package ejemplo1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaEjercicio1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField txtFecha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaEjercicio1 frame = new VentanaEjercicio1();
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
	public VentanaEjercicio1() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 550, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(54, 28, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(54, 60, 46, 14);
		contentPane.add(lblApellido);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(54, 85, 89, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha Nac.");
		lblFechaDeNacimiento.setBounds(54, 110, 121, 22);
		contentPane.add(lblFechaDeNacimiento);
		
		JLabel lblLosDatosIngresados = new JLabel("Los datos ingresados fueron:");
		lblLosDatosIngresados.setBounds(54, 194, 449, 119);
		contentPane.add(lblLosDatosIngresados);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtNombre.getText().isEmpty()==true) { txtNombre.setBackground(Color.red); txtNombre.setForeground(Color.white);}
					if(txtApellido.getText().isEmpty()==true) {txtApellido.setBackground(Color.red); txtApellido.setForeground(Color.white);}
						if(txtTelefono.getText().isEmpty()==true) { txtTelefono.setBackground(Color.red); txtTelefono.setForeground(Color.white);  }
							if(txtFecha.getText().isEmpty()==true) { txtFecha.setBackground(Color.red); txtFecha.setForeground(Color.white); }
				if (txtNombre.getText().isEmpty()==false&&txtApellido.getText().isEmpty()==false&&txtTelefono.getText().isEmpty()==
						false&&txtFecha.getText().isEmpty()==false) {
				lblLosDatosIngresados.setText("Los datos ingresados fueron:" + txtNombre.getText() + " " + 
						txtApellido.getText() + " " + txtTelefono.getText() +" " + txtFecha.getText());
				
				//cambia fondo y limpia texto
				txtNombre.setBackground(Color.white);
				txtNombre.setForeground(Color.black);
				txtNombre.setText("");
				txtApellido.setBackground(Color.white);
				txtApellido.setForeground(Color.black);
				txtApellido.setText("");
				txtTelefono.setBackground(Color.white);
				txtTelefono.setForeground(Color.black);
				txtTelefono.setText("");
				txtFecha.setBackground(Color.white);
				txtFecha.setForeground(Color.black);
				txtFecha.setText("");
				
				}
			}
		});
		btnMostrar.setBounds(226, 147, 89, 23);
		contentPane.add(btnMostrar);
		
		
		setTitle("Contactos");
		txtNombre = new JTextField();
		txtNombre.setBounds(169, 25, 146, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(169, 54, 146, 20);
		contentPane.add(txtApellido);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(169, 82, 146, 20);
		contentPane.add(txtTelefono);
		
		txtFecha = new JTextField();
		txtFecha.setColumns(10);
		txtFecha.setBounds(169, 111, 146, 20);
		contentPane.add(txtFecha);
	}
}
