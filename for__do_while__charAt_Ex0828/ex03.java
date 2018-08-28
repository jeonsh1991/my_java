package ex0828;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		int upper = 0; 
		int lower = 0;
		int num = 0;
		int cnt = 0;
		char t;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("문자열을 입력 : ");
		String insert = s.nextLine();
		
		do {
			t = insert.charAt(cnt);
			if(Character.isUpperCase(t)==true) {upper++;}
			else if (Character.isLowerCase(t)==true) {lower++;}
			else if (Character.isDigit(t)==true) {num++;}
			cnt++;
		}while(cnt<insert.length());
		
		
		
		System.out.println("대문자 "+upper+"개, 소문자 "+lower+"개, 숫자 "+num+"개");
		s.close();

	}

}
