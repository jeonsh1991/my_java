package p0806;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = s.next();
		
		System.out.print("나이 : ");
		int age = s.nextInt();
		
		System.out.println("이름은 "+name+"이고 나이는 "+age+"입니다.");

	}

}
