package page244;

import java.io.File;

public class MyFile {
	public static void main(String[] args) {
		args[0] = "bin//page244//MyFile.class"; //����Ŀ���ƶ���args��Ҫ�޸�
		args[1] = "src//page244//MyFile.java";
		for (int i = 0; i < args.length; ++i) {
			File f = new File(args[i]);
			if (f.exists()) {
				System.out.println("getName: " + f.getName());
				System.out.println("getPath: " + f.getPath());
				System.out.println("getParent: " + f.getParent());
				System.out.println("length: " + f.length());
			}
		}
	}
}

//�Ǻǣ���������������������(windows�£���סShiftͬʱ�Ҽ����ڵ�ǰ·���´��ն�)