package roopEX;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("exit을 입력하면 종료합니다.");
		
		do {
			System.out.print(">>");
			String st = s.next();
			if(st.equals("exit")) {System.out.println("종료합니다..."); break;}
			else continue;
		}while(true);

	}

}
