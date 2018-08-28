package ex0828;

import java.util.Scanner;

public class ex04 {
	public static void main(String[] args) {
		
		String num = null;
		int cnt = 0, cnt2 = 0;
		char t;
		int a = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.print("숫자를 여러 개 입력 : ");
		num = s.next(); // num = 5914
		do {
			t = num.charAt(cnt); // t = 5 -> t = 9 -> t = 1 -> t = 4 
			a = Character.getNumericValue(t);
			do {
				System.out.print("*");
				cnt2++;
			}while(cnt2<a); // 5 9 1 4
			System.out.print("\n");
			cnt2 = 0;
			cnt++;
		}while(cnt<num.length());
		s.close();
	}
}
