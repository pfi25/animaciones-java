package ventana;

import javax.swing.JFrame;

import panel.Panel;

public class Ventana extends JFrame{
 
	private static final long serialVersionUID = 1L;
	Panel panel;
	
	public Ventana(){
		
		setTitle("ZELDA");
		setBounds(400,300,400,400);
		panel = new Panel();
		add(panel);
		addKeyListener(panel);
	}
}
