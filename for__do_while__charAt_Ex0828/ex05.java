package ex0828;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		int num1 = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.print("임의의 정수를 입력하시오 >>");
		num1 = s.nextInt();
		
		for(int i = 0; i<num1; i++) {
			for(int j = i; j<num1; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		for(int i =1; i<=num1; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		s.close();
		

	}

}
