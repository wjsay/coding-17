package problem01;

import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedInputStream(System.in));
		Vector<String> str = new Vector<String>();
		while (sc.hasNext())
			str.addElement(sc.next());
		sc.close();
		if (str.size() != 2) {
			System.out.println("? + ? = ?");
			return;
		}
		Integer num1 = mygetInt(str.get(0));
		Integer num2 = mygetInt(str.get(1));
		if (num1 == -1 && num2 == -1)
			System.out.println("? + ? = ?");
		else if (num1 == -1)
			System.out.println("? + " + num2 + " = ?");
		else if (num2 == -1)
			System.out.println(num1 + " + ? = ?");
		else System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		str.clear();
	}
	
	public static Integer mygetInt(String s) {
		try {
			Integer num = Integer.parseInt(s);
			return (num <= 0 || num > 1000) ? -1 : num;
		} catch (NumberFormatException e) {
			return -1;
		}
	}
	
}
