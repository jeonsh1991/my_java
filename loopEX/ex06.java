package roopEX;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = 0;
		System.out.print("정수를 10개 입력하세요.");
		
		for(int i =0; i<10; i++) {
			int num = s.nextInt();
			if(num>0) a += num;
			else continue;
		}
		System.out.println("양수의 합은 "+a);

	}

}
