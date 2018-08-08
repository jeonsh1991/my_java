package roopEX;

public class ex10 {

	public static void main(String[] args) {
		int num = 1, num1 = 1, num2 = 0;
		String ab;
		System.out.println("1 = 1");
		for(int i = 1; i<10; i++) {
			System.out.print(1);
			for(int j=2; j<i+2; j++) {
				System.out.print(" * "+j);
			}
			num1 = num1*(i+1);
			System.out.print(" = "+num1);
			System.out.print("\n");
		}

	}

}
