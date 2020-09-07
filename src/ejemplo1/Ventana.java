package ejemplo1;

import javax.swing.JFrame;

public class Ventana extends JFrame {
	
	// Constructor
	
	public Ventana()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLocation(350, 350);
		setTitle("TP 3 Laboratorio 4");
		setLayout(null);
		
	}
	
	public void cambioVisibilidad(boolean estado)
	{
		setVisible(true);
	}

}
