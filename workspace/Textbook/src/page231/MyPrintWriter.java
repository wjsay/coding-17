package page231;

import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class MyPrintWriter {
	public static void main(String[] args) {
		try {
			PrintWriter f = new PrintWriter("out.txt");
			f.println("�ᵱ�پ�����һ����ɽС");
			f.close();
		} catch (FileNotFoundException e) {
			System.err.println("�����쳣��" + e);
			e.printStackTrace();
		}
	}
}
