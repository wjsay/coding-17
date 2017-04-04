package page227;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

public class MyBufferedReaderWriter {
	public static void main(String[] args) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
			bw.write("�������Ѻδ�,������,�������");
			bw.newLine();
			bw.write("������--����");
			bw.close();
			
			LineNumberReader br = new LineNumberReader(new FileReader("test.txt"));
			String s;
			for (s = br.readLine(); s != null; s = br.readLine())
				System.out.println(br.getLineNumber() + ":" + s);
			br.close();
		} catch (IOException e) {
			System.err.println("��������" + e);
			e.printStackTrace();
		}
	}
}
