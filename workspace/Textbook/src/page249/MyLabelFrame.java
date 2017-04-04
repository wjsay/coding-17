package page249;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyLabelFrame extends JFrame {
	public MyLabelFrame() {
		super("��ܺͱ�ǩ");
		String[] str = { "�ı���ǩ", "������ͼ�����", "������ͼ���·�"};
		ImageIcon[] ic = { null, new ImageIcon("src//img//img01.png"), new ImageIcon("src//img//img02.png") };
		int[] ih = { 0, JLabel.LEFT, JLabel.CENTER};
		int[] iv = {0, JLabel.CENTER, JLabel.BOTTOM};
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT));
		for (int i = 0; i < 3; ++i) {
			JLabel aLabel = new JLabel(str[i], ic[i], JLabel.LEFT);
			if (i > 0) {
				aLabel.setHorizontalAlignment(ih[i]);
				aLabel.setVerticalTextPosition(iv[i]);
			}
			aLabel.setToolTipText("��" + (i + 1)+ "����ǩ");
			c.add(aLabel);
		}
	}
	public static void main(String[] args) {
		MyLabelFrame app = new MyLabelFrame();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(360, 150);
		app.setVisible(true);

	}
}
