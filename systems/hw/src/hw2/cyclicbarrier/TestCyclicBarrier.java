package hw2.cyclicbarrier;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/** TestCyclicBarrier
 * @author ronny <br>
 *
 * TODO: Document <br>
 */
public class TestCyclicBarrier {
	CyclicBarrier barrier;
	final int n = 10;
	final int delay = 100;
	
	/** setUp() <br>
	 * 
	 * TODO: Document Method <br>
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}
	
	/**
	 * Test method for {@link hw2.cyclicbarrier.CyclicBarrier#CyclicBarrier(int)}.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testCyclicBarrierZeroFailure() {
		barrier = new CyclicBarrier(0);
	}
	
	/**
	 * Test method for {@link hw2.cyclicbarrier.CyclicBarrier#CyclicBarrier(int)}.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testCyclicBarrierNegativeFailure() {
		barrier = new CyclicBarrier(-1);
	}
	
	/**
	 * Test method for {@link hw2.cyclicbarrier.CyclicBarrier#CyclicBarrier(int)}.
	 */
	@Test
	public void testCyclicBarrierSuccess() {
		barrier = new CyclicBarrier(1);
		barrier = new CyclicBarrier(10);
		barrier = new CyclicBarrier(100);
	}
	
	/**
	 * Test method for {@link hw2.cyclicbarrier.CyclicBarrier#await()}.
	 * @throws InterruptedException 
	 */
	@Test
	public void testAwaitOne() throws InterruptedException {
		barrier = new CyclicBarrier(1);
		BarrierThread thread = new BarrierThread(1, barrier);
		thread.start();
		thread.join();
		System.out.println("**\n");
	}
	
	/**
	 * Test method for {@link hw2.cyclicbarrier.CyclicBarrier#await()}.
	 * @throws InterruptedException 
	 */
	@Test
	public void testAwaitExact() throws InterruptedException {
		barrier = new CyclicBarrier(n);
		List<BarrierThread> threads = new ArrayList<BarrierThread>();
		for (int i = 0; i < n; i++) {
			BarrierThread thread = new BarrierThread(i, barrier);
			threads.add(thread);
			thread.start();
		}
		
		for (BarrierThread thread : threads) {
			thread.join();
		}
		
		System.out.println("**\n");
	}
	
	/**
	 * Test method for {@link hw2.cyclicbarrier.CyclicBarrier#await()}.
	 * @throws InterruptedException 
	 */
	@Test
	public void testAwaitOneExtra() throws InterruptedException {
		barrier = new CyclicBarrier(n - 1);
		List<BarrierThread> threads = new ArrayList<BarrierThread>();
		for (int i = 0; i < n; i++) {
			BarrierThread thread = new BarrierThread(i, barrier);
			threads.add(thread);
			thread.start();
		}
		
		for (BarrierThread thread : threads) {
			thread.join(delay);
		}
		BarrierThread.PrintThreadSet();
	}
	
	/**
	 * Test method for {@link hw2.cyclicbarrier.CyclicBarrier#await()}.
	 * @throws InterruptedException 
	 */
	@Test
	public void testAwaitMultipleExtra() throws InterruptedException {
		barrier = new CyclicBarrier(n - n + 3);
		List<BarrierThread> threads = new ArrayList<BarrierThread>();
		for (int i = 0; i < n; i++) {
			BarrierThread thread = new BarrierThread(i, barrier);
			threads.add(thread);
			thread.start();
		}
		
		for (BarrierThread thread : threads) {
			thread.join(delay);
		}
		BarrierThread.PrintThreadSet();
	}
	
	/**
	 * Test method for {@link hw2.cyclicbarrier.CyclicBarrier#await()}.
	 * @throws InterruptedException 
	 */
	@Test
	public void testAwaitMultipleExact() throws InterruptedException {
		barrier = new CyclicBarrier(n);
		for (int j = 0; j < n; j++) {
			List<BarrierThread> threads = new ArrayList<BarrierThread>();
			for (int i = 0; i < n; i++) {
				BarrierThread thread = new BarrierThread(i, barrier);
				threads.add(thread);
				thread.start();
			}
			
			for (BarrierThread thread : threads) {
				thread.join();
			}
		}
		
		System.out.println("**\n");
	}
}
