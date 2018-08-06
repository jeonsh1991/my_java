package p0806;
import java.util.*;
public class ex01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("월급을 입력하세요 : ");
		int num = s.nextInt();
		
		System.out.println("10년 동안의 저축액 : "+(num*12)*10);

	}

}
