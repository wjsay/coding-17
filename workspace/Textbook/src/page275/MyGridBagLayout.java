package page275;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyGridBagLayout {
	public static void main(String[] args) {
		JFrame app = new JFrame("网格布局管理例程");
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(320, 160);
		Container c = app.getContentPane();
		GridBagLayout gr = new GridBagLayout();
		c.setLayout(gr);
		int[] gx = { 0, 1, 2, 3, 1, 0, 0, 2 };
		int[] gy = { 0, 0, 0, 0, 1, 2, 3, 2 };
		int[] gw = { 1, 1, 1, 1, GridBagConstraints.REMAINDER, 2, 2, 2 };
		int[] gh = { 2, 1, 1, 1, 1, 1, 1, 2 };
		GridBagConstraints gc = new GridBagConstraints();
		String s;
		JButton b;
		for (int i = 0; i < gx.length; ++i) {
			s = "按钮" + (i + 1);
			b = new JButton(s);
			gc.gridx = gx[i];
			gc.gridy = gy[i];
			gc.gridwidth = gw[i];
			gc.gridheight = gh[i];
			gc.fill = GridBagConstraints.BOTH;
			gr.setConstraints(b, gc);
			c.add(b);
		}
		app.setVisible(true);
	}
}
