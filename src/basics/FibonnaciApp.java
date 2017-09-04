package basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		// Fibonnaci number is defined by the sum of the 2 previous fibonacci numbers
		/*
		int a = 0;
		int b = 0;
		int c = 0;
		
		while(a < 21) {
			c = b;
			b = (a > 0) ? a : 1;
			a = ( a + c );
			System.out.println(a);
		}
		 */
		for(int i=0;fib(i)<21;i++){
			System.out.println(fib(i));
		}
	}

	static int fib(int i) {
		if(i == 0 || i == 1) {
			return i;
		}
		return (fib(i-1) + fib(i-2));
	}
}
