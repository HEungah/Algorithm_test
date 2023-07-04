package test_java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class test10 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		String s = bf.readLine(); //String//선언
		int num = Integer.parseInt(bf.readLine());

		
		for(int i = 0; i < num; i++) {
			String s2 = bf.readLine();
			StringTokenizer st = new StringTokenizer(s2);
			int a = Integer.parseInt(st.nextToken()); //첫번째 호출
			int b = Integer.parseInt(st.nextToken()); //두번째 호출
			String sum = String.valueOf(a + b);
			bw.write(sum);
			bw.newLine();
		}
		bw.close();
		
	}

}
