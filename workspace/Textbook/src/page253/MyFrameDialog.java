package page253;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrameDialog {
	public static void main(String[] args) {
		JFrame app = new JFrame("���");
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(200, 100);
		app.setVisible(true);
		
		JDialog d = new JDialog(app, "�Ի���", false);
		Container c = d.getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT));
		c.add(new JLabel("����"));
		d.setSize(80, 80);
		d.setVisible(true);
	}
}
