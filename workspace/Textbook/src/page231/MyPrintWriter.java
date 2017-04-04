package page231;

import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class MyPrintWriter {
	public static void main(String[] args) {
		try {
			PrintWriter f = new PrintWriter("out.txt");
			f.println("会当临绝顶，一览众山小");
			f.close();
		} catch (FileNotFoundException e) {
			System.err.println("发生异常：" + e);
			e.printStackTrace();
		}
	}
}
