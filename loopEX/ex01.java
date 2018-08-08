package roopEX;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("점수를 입력 하시오: ");
		int num = s.nextInt();
		
		if(num>=80) System.out.println("축하합니다! 합격입니다");
		else System.out.println("불합격입니다.");

	}

}
