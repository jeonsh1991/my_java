package cal;

public class SimpleCalculatorTest {
	public static void main(String[] args) {
		int n1=10;
		int n2=20;
		
		SimpleCalculator calc = new SimpleCalculator();
		int result = calc.add(n1,n2);
		System.out.println(n1 + "+" + n2 +"="+ result );
	}
}
