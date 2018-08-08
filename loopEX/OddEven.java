package roopEX;

public class OddEven extends Odd {
	int num = 0;
	public void OddEvenCalc(int num) {
		this.num = num;
		for(int i = num; i > 0; i--) {
			if(i%2==0) {
				b += i;
			}else continue; 
	}
}
	public void OEshow() {
		System.out.println("짝수의 합 : "+b);
	}
	public static void main(String[] args) {
		Odd od = new Odd();
	}
}
