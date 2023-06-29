package test_java;

import java.util.Scanner;

public class test09 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int num2 = num / 4;
		
		String text = "int";
		String text2 = "";
		
		if(num2 == 1) {
			System.out.println("long " + text);
		}else {
			for(int i = 0; i < num2; i++) {
				text2 += "long ";
			}
			System.out.println(text2 + text);
		}
		
	}

}
