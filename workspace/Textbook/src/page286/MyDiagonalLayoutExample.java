package page286;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import page238.MyDiagonLayout;

public class MyDiagonalLayoutExample {
	public static void main(String[] args) {
		JFrame app = new JFrame("�Զ���Խ��߲��ֹ�����Ӧ������");
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(300, 200);
		Container c = app.getContentPane();
		c.setLayout(new MyDiagonLayout());
		String s;
		JButton b;
		for (int i = 0; i < 5; ++i) {
			s = "��ť" +(i + 1);
			b = new JButton(s);
			c.add(b);
		}
		app.setVisible(true);
	}
}
