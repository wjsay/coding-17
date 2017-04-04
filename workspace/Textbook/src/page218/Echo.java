package page218;

import java.io.IOException;
import java.io.InputStream;

public class Echo {
	public static void echo(InputStream in) {
		try { 
			while (true) {
				int i = in.read();
				if (i == -1)
					break;
				System.out.print((char)i);
			}
		} catch (IOException e) {
			System.err.println("·¢Éú´íÎó£º" + e);
			e.printStackTrace();
		}
	}
}
