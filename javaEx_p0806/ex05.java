package p0806;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("구의 반지름: ");
		float num = s.nextFloat();
		
		System.out.printf("구의 부피: %2.2f", (4*(num*num*num))/3);
		
	}

}
