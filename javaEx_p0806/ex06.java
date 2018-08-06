package p0806;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("수도입니까?(수도: 1 수도아님: 0) :");
		int num = s.nextInt();
		System.out.print("인구(단위:만) : ");
		int pop = s.nextInt();
		System.out.print("부자의 수(단위:만) : ");
		int mil = s.nextInt();
		
		if(num==1 && pop >=100 && mil >= 50 ) {
			System.out.println("메트로폴리스 입니다.");
		}else {
			System.out.println("메트로폴리스가 아닙니다.");
		}

	}

}
