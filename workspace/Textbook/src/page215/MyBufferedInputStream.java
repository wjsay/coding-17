package page215;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Date;
public class MyBufferedInputStream {
	private static String fileName = "bin//page215//MyBufferedInputStream.class";
	
	public static void main(String[] args) {
		try {
			int i;
			i = 0;
			Date d1 = new Date();
			FileInputStream f = new FileInputStream(fileName);
			while ((f.read()) != -1) 
				i++;
			f.close();
			long t = (new Date()).getTime() - d1.getTime();
			System.out.println("��ȡ�ļ�" + fileName + "��" + i + "bytes");
			System.out.println("��������ķ�����Ҫ" + t + "ms");
			
			i = 0;
			d1 = new Date();
			f = new FileInputStream(fileName);
			BufferedInputStream fb = new BufferedInputStream(f);
			while ((fb.read()) != -1)
				++i;
			fb.close();
			t = (new Date()).getTime() - d1.getTime();
			System.out.println("������ķ�����Ҫ" + t + "ms");
			
		} catch (Exception e) {
			System.out.println("�����쳣��" + e);
			e.printStackTrace();
		}
	}
}
