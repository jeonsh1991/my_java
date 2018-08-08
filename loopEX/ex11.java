package roopEX;

public class ex11 {

	public static void main(String[] args) {
		int num = 1;
		for(int i=0; i<100; i++) {
			if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0) {
				num = num+1;
				if(num < 11) {
					System.out.print(i+" ");
				}
				else {
					System.out.print(i+" ");
					num = 1;
					System.out.print("\n");
				}
		}

	}

	}
}
