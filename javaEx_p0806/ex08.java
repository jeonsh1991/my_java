package p0806;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하시오 : ");
		int num1 = s.nextInt();
		System.out.print("두 번째 정수를 입력하시오 : ");
		int num2 = s.nextInt();
		
		System.out.printf("%d을 %d으로 나눈 몫은 %d이고 나머지는 %d 입니다.",num2,num1,num2/num1,num2%num1);
	}

}
