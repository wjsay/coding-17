package page225;

import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

public class MyFileReaderWriter {
	public static void main(String[] args) {
		try {
			FileWriter fout = new FileWriter("test.txt");
			fout.write("Ī���У���������ͷ");
			fout.close();
			
			FileReader fin = new FileReader("test.txt");
			for (int c = fin.read(); c != -1; c = fin.read()) {
				System.out.print((char)c);
			}
			fin.close();
		} catch (IOException e) {
			System.err.println("��������" + e);
			e.printStackTrace();
		}
				
	}
}