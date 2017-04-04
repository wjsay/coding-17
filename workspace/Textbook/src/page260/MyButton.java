package page260;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyButton extends JFrame {
	public MyButton() {
		super("��ť����");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		int i;
		//��������ʽ��ť����ӵ������
		ImageIcon[] ic = { new ImageIcon("src//img//img01.png"),
				new ImageIcon("src//img//img02.png") };
		JButton[] b = { new JButton("��", ic[0]), new JButton("�м�"), new JButton("��", ic[1])};
		for (i = 0; i < b.length; ++i) 
			c.add(b[i]);
		
		//������ѡ����ӵ������
		JCheckBox[] ck = { new JCheckBox("��"), new JCheckBox("��")};
		for (i = 0; i < ck.length; ++i) {
			c.add(ck[i]);
			ck[i].setSelected(true);
		}
		
		//������ѡ��ť����ӵ������
		JRadioButton[] r = { new JRadioButton("��"), new JRadioButton("��") };
		ButtonGroup rg = new ButtonGroup();
		for (i = 0; i < r.length; ++i) {
			c.add(r[i]);
			rg.add(r[i]);
		}
		r[0].setSelected(true);
		r[1].setSelected(false);
	}
	
	public static void main(String[] args) {
		MyButton app = new MyButton();
		app.setDefaultCloseOperation(EXIT_ON_CLOSE);
		app.setSize(250, 120);
		app.setVisible(true);
	}
	
}
