package vista;

import java.awt.*;
import javax.swing.*;

public class Ventana2_A extends JFrame {
	private static final long serialVersionUID = 1L;
	//panelan ikusten diren bariableak
	public Ventana2_A() {
		//panelaren propietateak
		setIconImage(Toolkit.getDefaultToolkit().getImage(".\\Argazkiak\\logoa.png")); 
		getContentPane().setLayout(null);
		this.setBounds(300,300,300,300);
		this.setTitle("OHARREN INPRIMAKIA");
		this.setResizable(false); // neurketak ez aldatzeko
		this.setSize(new Dimension(600, 600));
		
	}		
}
