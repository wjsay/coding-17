package page298;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;

public class MyDraw extends JFrame {
	public MyDraw() {
		super("ËæÊÖ»­Àý³Ì");
		Container c = getContentPane();
		c.add(new MyPanel(), BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		MyDraw app = new MyDraw();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(270, 150);
		app.setVisible(true);
	}
}
