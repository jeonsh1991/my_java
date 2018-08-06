package p0806;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long result = 1;
		System.out.print("정수를 입력하세요 : ");
		int num = s.nextInt();
		for(int i=1; i<=num; i++) {
			result = result * i; 
			}
			
		
		System.out.printf("%d!은 %d입니다.", num, result);
	}

}
