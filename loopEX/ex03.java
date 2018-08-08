package roopEX;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("학점을 입력하세요.(A~D,F) : ");
		String grade = s.nextLine();
		
		if(grade.equals("A") || grade.equals("B")) System.out.println("참 잘하였습니다.");
		else if(grade.equals("C") || grade.equals("D")) System.out.println("좀 더 노력하세요.");
		else if(grade.equals("F")) System.out.println("다음 학기에 다시 수강하세요.");
		else System.out.println("잘못된 학점입니다.");
		
		
	}

}
