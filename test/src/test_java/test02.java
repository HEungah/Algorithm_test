package test_java;

import java.util.Scanner;

public class test02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("불기년도를 입력해주세요 => ");
		int a = sc.nextInt();
		
		System.out.println("서기년도는 " + (a - 544) + "년입니다.");
		
		
	}

}
