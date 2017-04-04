package page232;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MyReadDate {
	public static void printInfo () {
		System.out.println("输的是整数还是浮点数？");
		System.out.println("\t0: 退出; 1: 整数; 2: 浮点数");
	}
	
	public static int mygetInt(BufferedReader f) {
		try {
			String s = f.readLine();
			int i = Integer.parseInt(s);
			return i;
		} catch (Exception e) {
			return -1;
		}
	}
	
	public static double mygetDouble (BufferedReader f) {
		try {
			String s = f.readLine();
			double i = Double.parseDouble(s);
			return i;
		} catch (Exception e) {
			return 0d;
		}
	}
	
	public static void main(String[] args) {
		int i;
		double d;
		try {
			BufferedReader f = 
					new BufferedReader(new InputStreamReader(System.in));
			do {
				printInfo();
				i = mygetInt(f);
				if (i == 0)
					break;
				else if (i == 1) {
					System.out.println("\t请输入整数：");
					i = mygetInt(f);
					System.out.println("输入整数：" + i);
				} else if (i == 2) {
					System.out.println("请输入浮点数：");
					d = mygetDouble(f);
					System.out.println("输入浮点数：" + d);
				}
			} while(true);
		} catch (Exception e) {
			System.err.println("发生异常：" + e);
			e.printStackTrace();
		}
	}
}
