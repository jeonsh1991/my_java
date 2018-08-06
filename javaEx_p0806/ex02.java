package p0806;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("반지름을 입력하세요 : ");
		float num = s.nextFloat();
		
		System.out.printf("원의 면적은 : %2.2f",(num*num)*3.14);

	}

}
