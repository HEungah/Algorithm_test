package test_java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		List<Integer> num = new ArrayList<>();
		
		for(int i = 0; i < a; i++) {
			num.add(i + 1);
		}
		
		for(int i = 0; i < b; i++) {
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();
			int temp = 0;
			
			temp = num.get(num2 - 1);
			num.set(num2 - 1, num.get(num3 - 1));
			num.set(num3 - 1, temp);
		}
		
		for(int i = 0; i < num.size(); i++) {
			System.out.print(num.get(i) + " ");
		}
		
	}

}
