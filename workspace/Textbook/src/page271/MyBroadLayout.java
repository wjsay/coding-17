package page271;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyBroadLayout {
	public static void main(String[] args) {
		JFrame app = new JFrame("�߽粼�ֹ�������");
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(360, 130);
		Container c = app.getContentPane();
		c.setLayout(new BorderLayout());
		c.add(new JButton("��"), BorderLayout.EAST);
		c.add(new JButton("��"), BorderLayout.WEST);
		c.add(new JButton("��"), BorderLayout.SOUTH);
		c.add(new JButton("��"), BorderLayout.NORTH);
		c.add(new JButton("��"), BorderLayout.CENTER);
		app.setVisible(true);
	}
}
