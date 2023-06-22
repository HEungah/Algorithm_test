package test_java;

import java.util.Scanner;

public class test04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		short a = sc.nextShort();
		
		if((a % 4 == 0) && ((a % 100 != 0) || (a % 400 == 0))) {
			System.out.println(1);
		}else{System.out.println(0);}
	}
}
