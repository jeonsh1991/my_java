package roopEX;

import java.util.Scanner;

public class OddEvenTest {

	public static void main(String[] args) {
		OddEven oe = new OddEven();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		
		oe.Calc(num);
		oe.OddEvenCalc(num);
		oe.OEshow();
		oe.OddShow();

	}

}
