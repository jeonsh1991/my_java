package ex0828;

import java.util.Scanner;

public class ex02 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1 = 0; int num2 = 0; int num3 =0;
		int cnt = 0; int add = 0;
		System.out.print("합계의 시작값 == >");
		 num1 = s.nextInt();
		System.out.print("합계의 끝값 ==>");
		 num2 = s.nextInt();
		System.out.print("배수 ==>");
		 num3 = s.nextInt();
		
		int result = 0;
		cnt = num1; // cnt = 100
		
		while(num1<=cnt && cnt<=num2) {
			result = cnt%num3;
			if(result==0) {
				add = add+cnt;
			}
			cnt++; //cnt = 101;
			
		
	}
		
		
		System.out.println(num1+"부터"+num2+"까지의 "+num3+"배수의 합계 ==>"+add);
		s.close();
		
	}
	

}
