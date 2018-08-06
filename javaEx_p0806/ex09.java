package p0806;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num2 = 0, result =0;
		System.out.print("근무 시간을 입력하세요 : ");
		int num = s.nextInt();
		if(num>8) {
			num2 = num - 8; //  16 - 8 = 8
			num = 8;
			result = (int) (num2*(7530*1.5) + (num*7530));
		}else {
			result = num*7530;
		}
		System.out.printf("임근은 %d 입니다",result);
	}

}
