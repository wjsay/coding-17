package page232;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MyReadDate {
	public static void printInfo () {
		System.out.println("������������Ǹ�������");
		System.out.println("\t0: �˳�; 1: ����; 2: ������");
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
					System.out.println("\t������������");
					i = mygetInt(f);
					System.out.println("����������" + i);
				} else if (i == 2) {
					System.out.println("�����븡������");
					d = mygetDouble(f);
					System.out.println("���븡������" + d);
				}
			} while(true);
		} catch (Exception e) {
			System.err.println("�����쳣��" + e);
			e.printStackTrace();
		}
	}
}
