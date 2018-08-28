package ex0828;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("문자열을 입력 ==> ");
		String ins = s.nextLine();
		
		for(int i = ins.length(); i > 0; i-- ) {
			System.out.print(ins.charAt(i-1));
		}
		s.close();
		

	}

}
