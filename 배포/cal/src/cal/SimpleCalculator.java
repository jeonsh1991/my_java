package cal;

public class SimpleCalculator {
	
	private int res= 0;
	
	public int add(int x, int y) {
		return x+y;
	}
	public void sub(int x, int y) {
		res = x-y;
	}
	public void inc(int d) {
		res += d;
	}
	public void dec(int d) {
		res -= d;
	}
	public int getResult() {
		return res;
	}

}
