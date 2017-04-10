package page289;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyButton1 extends JFrame {
	public MyButton1() {
		super("动作事件历程");
		Container c  = getContentPane();
		JButton b = new JButton("点赞 0 次"); //骗子
		MyActionListener a = new MyActionListener();
		b.addActionListener(a);
		c.add(b, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		MyButton1 app = new MyButton1();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(100, 80);
		app.setVisible(true);
	}
	
}
