import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class hola_mundo extends JFrame{
	hola_mundo(){
		setSize(200, 100);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.RED);
		g.drawString("HOLA MUNDO", 40, 60);
	}
	
	public static void main(String args[]){
		new hola_mundo();
	}
}
