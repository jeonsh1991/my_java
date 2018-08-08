package roopEX;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = 0, b=0;
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
		do {
			int num = s.nextInt();
			if(num!=-1) {
				a += 1;
				b += num;
			}
			else if (num==-1) {
				break;
			}
			
			
		}while(true);
		float c = (float)b/a;
		System.out.printf("정수의 개수는 %d개이며 합은 %d이고 평균은 %2.2f입니다.",a,b,c);


	}

}
