package page255;

import javax.swing.JOptionPane;

public class MyDialogMode {
	public static void main(String[] args) {
		String mystr = "��ȷ��Ҫȥȡ����";
		String[] str = {"ȷ��", "��" };
		JOptionPane.showMessageDialog(null, mystr);
		JOptionPane.showConfirmDialog(null, mystr);
		JOptionPane.showInputDialog(null, mystr);
		JOptionPane.showInputDialog(null, mystr, "����ѡ��", JOptionPane.QUESTION_MESSAGE, null, str, str[1]);
	}
}
