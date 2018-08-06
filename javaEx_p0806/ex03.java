package p0806;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	
	System.out.print("마일을 입력하시오 : ");
	float num = s.nextFloat();
	
	System.out.printf("%1.1f마일은 %2.2f", num, num*1.609);

	}

}
