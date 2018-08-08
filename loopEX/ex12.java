package roopEX;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		int num = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("1부터 n까지의 합 중에서 5000을 넘지 않는 가장 큰 합은?");
		for(int i =1; i<5000; i++) {
			num = num + i;
			if(num>4999) {
				System.out.print("1부터 "+(i-1)+"까지의 합이"+(num-i)+"입니다.");
				break;
			}
		}

	}

}
