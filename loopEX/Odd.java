package roopEX;

public class Odd {
	int num = 0;
	int a = 0; 
	int b = 0;
	public void Calc(int num) { //홀수
		this.num = num;
		for(int i = num; i > 0; i--) {
			if(i%2==1) {
				a += i;
			}else continue; 
		}
	}
	public void OddShow() {
		System.out.print("홀수의 합 : "+a);
	}
	
}
