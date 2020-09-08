package ejemplo1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class Ventana extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	// Constructor
	public Ventana()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLocation(350, 350);
		setTitle("TP 3 Laboratorio 4");
		getContentPane().setLayout(null);
		
		JLabel lblGrupoNumero = new JLabel("GRUPO NUMERO: 6");
		lblGrupoNumero.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblGrupoNumero.setBounds(77, 88, 118, 19);
		getContentPane().add(lblGrupoNumero);
		
		JButton btnEjercicio1 = new JButton("Ejercicio 1");
		btnEjercicio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaEjercicio1 frame = new VentanaEjercicio1();
				frame.setVisible(true);
			}
		});
		btnEjercicio1.setBounds(167, 128, 140, 23);
		getContentPane().add(btnEjercicio1);
		
		JButton btnEjercicio2 = new JButton("Ejercicio 2");
		btnEjercicio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaEjercicio2 frame = new VentanaEjercicio2();
				frame.setVisible(true);
			}
		});
		btnEjercicio2.setBounds(167, 162, 140, 23);
		getContentPane().add(btnEjercicio2);
		
		JButton btnEjercicio3 = new JButton("Ejercicio 3");
		btnEjercicio3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaEjercicio3 frame = new VentanaEjercicio3();
				frame.setVisible(true);
			}
		});
		btnEjercicio3.setBounds(167, 201, 140, 23);
		getContentPane().add(btnEjercicio3);
		
	}
	
	public void cambioVisibilidad(boolean estado)
	{
		setVisible(true);
	}
}

class eventoBoton implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("Mensaje");
		
	}
	
}
