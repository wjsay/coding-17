package page237;

import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class MyObjectInputStream {
	public static void main(String[] args) {
		try {
			ObjectInputStream f = new ObjectInputStream(
					new FileInputStream("object.dat"));
			Student s = (Student)(f.readObject());
			s.output();
			f.close();
		} catch (Exception e) { //若object.dat文件中的格式不符合Student类，就会抛出异常
			System.err.println("发生错误" + e);
			e.printStackTrace();
		}

	}
}
