package page289;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

class MyActionListener implements ActionListener {
	int count = 0;
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		b.setText("µ¥»÷" + (++count) + "´Î");
	}
}
