package p0806;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("정수입력>>");
		int num2 = 0;
		
		int num = s.nextInt();
		num2 = num+1; // 11
		for(int i=0; i<num; i++) {
			num2 = num2-1; // 10
			System.out.print("num:"+num);
			System.out.print("num2:"+num2);
			for(int j=0; j<num2; j++) {
				System.out.print("*");
				
			}

			System.out.println("");
			
		}

	}

}
