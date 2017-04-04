package test;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(new BufferedInputStream(System.in));
		while (true) {
			s = sc.next();
			System.out.println( mygetInt(s) );
		}
		
	}
	
	static Integer mygetInt(String s) {
		try {
			int num = Integer.parseInt(s);
			return (num <= 0) ? -1 : num;
		} catch (NumberFormatException e) {
			return -1;
		}
	}
}
