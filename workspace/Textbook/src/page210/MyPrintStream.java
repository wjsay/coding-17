package page210;
import java.io.PrintStream;
import java.io.FileNotFoundException;
public class MyPrintStream {
	public static void main(String[] args) {
		try {
			PrintStream f = new PrintStream("C://out.txt");
			f.printf("%1$d + %2$d = %3$d", 1 , 2 , 1 + 2);
			f.close();
		} catch (FileNotFoundException e) { //Ȩ�޲���ʱ�׳��쳣
			System.out.println("�����쳣e ��" + e);
			e.printStackTrace();
		}
	}
}
