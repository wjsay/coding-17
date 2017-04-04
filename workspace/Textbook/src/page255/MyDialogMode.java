package page255;

import javax.swing.JOptionPane;

public class MyDialogMode {
	public static void main(String[] args) {
		String mystr = "你确定要去取消吗？";
		String[] str = {"确定", "不" };
		JOptionPane.showMessageDialog(null, mystr);
		JOptionPane.showConfirmDialog(null, mystr);
		JOptionPane.showInputDialog(null, mystr);
		JOptionPane.showInputDialog(null, mystr, "下拉选择", JOptionPane.QUESTION_MESSAGE, null, str, str[1]);
	}
}
