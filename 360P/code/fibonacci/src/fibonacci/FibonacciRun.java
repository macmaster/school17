/**
 * 
 */
package fibonacci;

/**
 * @author ronny
 *
 */
public class FibonacciRun implements Runnable {

	// nth fibonacci number to compute
	private Integer n, result;

	/**
	 * 
	 */
	public FibonacciRun(int n) {
		this.n = n;
	}

	@Override
	public void run() {
		try {
			if (n == 0 || n == 1) {
				result = 1; // base case
			} else {
				FibonacciRun f1 = new FibonacciRun(n - 1), f2 = new FibonacciRun(n - 2);
				Thread thread1 = new Thread(f1), thread2 = new Thread(f2);
				thread1.start();
				thread2.start();
				thread1.join();
				thread2.join();
				result = f1.getResult() + f2.getResult();
			}
		} catch (InterruptedException err) {
			err.printStackTrace(); // thread exception
		}
	}

	public Integer getResult() {
		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			for (int idx = 0; idx < 25; idx++) {
				FibonacciRun fib = new FibonacciRun(idx);
				Thread fibThread = new Thread(fib);
				fibThread.start();
				fibThread.join();
				System.out.println("result: " + fib.getResult());
			}
		} catch (InterruptedException err) {
			err.printStackTrace();
		} finally{
			System.out.println("Finished!!!");
		}
	}

}
