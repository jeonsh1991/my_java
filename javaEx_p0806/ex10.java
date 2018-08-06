package p0806;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int result =0;
		System.out.print("과세 표준 금액을 입력하세요 : ");
		int num = s.nextInt();
		if (num>500000000) {
			result = ((num-500000000)*40)/100;
			System.out.printf("과세표준은 %d이고 소득세는 %d입니다.", num, result+170600000 );
		}
		else if(num<=500000000 && num>150000000) {
			result = ((num-150000000)*38)/100;
			System.out.printf("과세표준은 %d이고 소득세는 %d입니다.", num , result+37600000);
			
		}
		else if(num<=150000000 && num>88000000) {
			result = ((num-88000000)*35)/100;
			System.out.printf("과세표준은 %d이고 소득세는 %d입니다.", num , result+15900000);
			
		}
		else if (num<=88000000 && num>46000000) {
			result = ((num-46000000)*24)/100;
			System.out.printf("과세표준은 %d이고 소득세는 %d입니다.", num , result+5820000);
			
			
		}
		else if (num<=46000000 && num>12000000) {
			result = ((num-12000000)*15)/100;
			System.out.printf("과세표준은 %d이고 소득세는 %d입니다.", num , result+720000);
			
			
		}
		else {
			result = ((num)*6)/100;
			System.out.printf("과세표준은 %d이고 소득세는 %d입니다.", num , result);
			
			
		}
	}

}
