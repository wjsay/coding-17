package page218;
import java.io.FileInputStream;
public class SetIn {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("out.txt"));
			Echo.echo(System.in);
		} catch (Exception e) {
			System.err.println("∑¢…˙“Ï≥££∫" + e);
			e.printStackTrace();
		}
	}
}
