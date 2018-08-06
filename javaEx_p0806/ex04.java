package p0806;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("받은 돈 : ");
		int num = s.nextInt();
		
		System.out.print("상품 가격 : ");
		int price = s.nextInt();
		
		System.out.println("부가세 : "+price/10);
		System.out.println("잔돈 : "+ (num-price));
	}

}
