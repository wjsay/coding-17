package page244;

import java.io.File;

public class MyFile {
	public static void main(String[] args) {
		args[0] = "bin//page244//MyFile.class"; //若项目被移动，args需要修改
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

//呵呵，这个类可以在命令中运行(windows下，按住Shift同时右键，在当前路径下打开终端)