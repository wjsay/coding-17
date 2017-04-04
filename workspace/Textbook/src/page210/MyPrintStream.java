package page210;
import java.io.PrintStream;
import java.io.FileNotFoundException;
public class MyPrintStream {
	public static void main(String[] args) {
		try {
			PrintStream f = new PrintStream("C://out.txt");
			f.printf("%1$d + %2$d = %3$d", 1 , 2 , 1 + 2);
			f.close();
		} catch (FileNotFoundException e) { //权限不足时抛出异常
			System.out.println("发生异常e ：" + e);
			e.printStackTrace();
		}
	}
}
