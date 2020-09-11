package ejemplo1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaEjercicio3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private String mensaje;
	private String osmac = "Mac";
	private String oswindows = "Windows";
	private String oslinux = "Linux";
	ButtonGroup radiogroup = new ButtonGroup();
	ButtonGroup checkgroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaEjercicio3 frame = new VentanaEjercicio3();
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
	public VentanaEjercicio3() {
		setTitle("Selección Multiple");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnMac = new JRadioButton("Mac");
		rdbtnMac.setBounds(280, 28, 75, 23);
		rdbtnMac.setActionCommand("Mac");
		contentPane.add(rdbtnMac);
		
		JRadioButton rdbtnWindows = new JRadioButton("Windows");
		rdbtnWindows.setBounds(176, 28, 100, 23);
		rdbtnWindows.setActionCommand("Windows");
		contentPane.add(rdbtnWindows);
		
		JRadioButton rdbtnLinux = new JRadioButton("Linux");
		rdbtnLinux.setBounds(356, 28, 62, 23);
		rdbtnLinux.setActionCommand("Linux");
		contentPane.add(rdbtnLinux);
		
		JCheckBox chckbxProgramacion = new JCheckBox("Programación");
		chckbxProgramacion.setBounds(226, 109, 129, 23);
		chckbxProgramacion.setActionCommand("Programacion");
		contentPane.add(chckbxProgramacion);
		
		JCheckBox chckbxAdministracion = new JCheckBox("Administración");
		chckbxAdministracion.setBounds(226, 136, 162, 23);
		chckbxAdministracion.setActionCommand("Administracion");
		contentPane.add(chckbxAdministracion);
		
		JCheckBox chckbxDisenoGrafico = new JCheckBox("Diseño Gráfico");
		chckbxDisenoGrafico.setBounds(226, 163, 129, 23);
		chckbxDisenoGrafico.setActionCommand("Diseno");
		contentPane.add(chckbxDisenoGrafico);
		
		JTextPane txtpnTest = new JTextPane();
		txtpnTest.setText("Elije una especialidad");
		txtpnTest.setBounds(39, 138, 179, 21);
		contentPane.add(txtpnTest);
		
		textField = new JTextField();
		textField.setBounds(264, 207, 114, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JEditorPane dtrpnCantidadDeHoras = new JEditorPane();
		dtrpnCantidadDeHoras.setText("Cantidad de horas en el computador:");
		dtrpnCantidadDeHoras.setBounds(12, 207, 240, 21);
		contentPane.add(dtrpnCantidadDeHoras);
		
		// Agrupo los botones de sistemas operativos
		radiogroup.add(rdbtnMac);
		radiogroup.add(rdbtnWindows);
		radiogroup.add(rdbtnLinux);
		
		checkgroup.add(chckbxDisenoGrafico);
		checkgroup.add(chckbxAdministracion);
		checkgroup.add(chckbxProgramacion);
		
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(299, 238, 117, 25);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String osselected = radiogroup.getSelection().getActionCommand();
				String opselected = checkgroup.getSelection().getActionCommand();
				
				if(osselected == osmac) {
					System.out.println("es mac");
					if(opselected.equals("Programacion")) {
						mensaje = osselected + " - " + chckbxProgramacion.getText() + " - " + textField.getText() + " Hs";
						JOptionPane.showMessageDialog(null, mensaje,opselected, JOptionPane.INFORMATION_MESSAGE);
						System.out.println(mensaje);
					}
					
					if(opselected.equals("Administracion")) {
						mensaje = osselected + " - " + chckbxProgramacion.getText() + " - " + textField.getText() + " Hs";
						JOptionPane.showMessageDialog(null, mensaje,opselected, JOptionPane.INFORMATION_MESSAGE);
						System.out.println(mensaje);
					}
					
					if(opselected.equals("Diseno")) {
						mensaje = osselected + " - " + chckbxProgramacion.getText() + " - " + textField.getText() + " Hs";
						JOptionPane.showMessageDialog(null, mensaje,opselected, JOptionPane.INFORMATION_MESSAGE);
						System.out.println(mensaje);
					}
				}
				
				if(osselected == oswindows) {
					if(opselected.equals("Programacion")) {
						mensaje = osselected + " - " + chckbxProgramacion.getText() + " - " + textField.getText() + " Hs";
						System.out.println(mensaje);
						 JOptionPane.showMessageDialog(null, mensaje,opselected, JOptionPane.INFORMATION_MESSAGE);
					}
					
					if(opselected.equals("Administracion")) {
						mensaje = osselected + " - " + chckbxProgramacion.getText() + " - " + textField.getText() + " Hs";
						JOptionPane.showMessageDialog(null, mensaje,opselected, JOptionPane.INFORMATION_MESSAGE);
						System.out.println(mensaje);
					}
					
					if(opselected.equals("Diseno")) {
						mensaje = osselected + " - " + chckbxProgramacion.getText() + " - " + textField.getText() + " Hs";
						JOptionPane.showMessageDialog(null, mensaje,opselected, JOptionPane.INFORMATION_MESSAGE);
						System.out.println(mensaje);
					}
				}
				
				if(osselected == oslinux) {
					if(opselected.equals("Programacion")) {
						mensaje = osselected + " - " + chckbxProgramacion.getText() + " - " + textField.getText() + " Hs";
						JOptionPane.showMessageDialog(null, mensaje,opselected, JOptionPane.INFORMATION_MESSAGE);
						System.out.println(mensaje);
					}
					
					if(opselected.equals("Administracion")) {
						mensaje = osselected + " - " + chckbxProgramacion.getText() + " - " + textField.getText() + " Hs";
						JOptionPane.showMessageDialog(null, mensaje,opselected, JOptionPane.INFORMATION_MESSAGE);
						System.out.println(mensaje);
					}
					
					if(opselected.equals("Diseno")) {
						mensaje = osselected + " - " + chckbxProgramacion.getText() + " - " + textField.getText() + " Hs";
						JOptionPane.showMessageDialog(null, mensaje,opselected, JOptionPane.INFORMATION_MESSAGE);
						System.out.println(mensaje);
					}
				}
			}
		});
		contentPane.add(btnNewButton);
	}
}


