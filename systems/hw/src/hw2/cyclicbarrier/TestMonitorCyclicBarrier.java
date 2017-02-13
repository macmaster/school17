package hw2.cyclicbarrier;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/** TestMonitorCyclicBarrier
 * @author ronny <br>
 *
 * TODO: Document <br>
 */
public class TestMonitorCyclicBarrier {
	MonitorCyclicBarrier barrier;
	final int n = 10;
	final int delay = 100;
	
	/**
	 * Test method for {@link hw2.cyclicbarrier.CyclicBarrier#CyclicBarrier(int)}.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testCyclicBarrierZeroFailure() {
		barrier = new MonitorCyclicBarrier(0);
	}
	
	/**
	 * Test method for {@link hw2.cyclicbarrier.CyclicBarrier#CyclicBarrier(int)}.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testCyclicBarrierNegativeFailure() {
		barrier = new MonitorCyclicBarrier(-1);
	}
	
	/**
	 * Test method for {@link hw2.cyclicbarrier.CyclicBarrier#CyclicBarrier(int)}.
	 */
	@Test
	public void testCyclicBarrierSuccess() {
		barrier = new MonitorCyclicBarrier(1);
		barrier = new MonitorCyclicBarrier(10);
		barrier = new MonitorCyclicBarrier(100);
	}
	
	/**
	 * Test method for {@link hw2.cyclicbarrier.CyclicBarrier#await()}.
	 * @throws InterruptedException 
	 */
	@Test
	public void testAwaitOne() throws InterruptedException {
		barrier = new MonitorCyclicBarrier(1);
		MonitorBarrierThread thread = new MonitorBarrierThread(1, barrier);
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
		barrier = new MonitorCyclicBarrier(n);
		List<MonitorBarrierThread> threads = new ArrayList<MonitorBarrierThread>();
		for (int i = 0; i < n; i++) {
			MonitorBarrierThread thread = new MonitorBarrierThread(i, barrier);
			threads.add(thread);
			thread.start();
		}
		
		for (MonitorBarrierThread thread : threads) {
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
		barrier = new MonitorCyclicBarrier(n - 1);
		List<MonitorBarrierThread> threads = new ArrayList<MonitorBarrierThread>();
		for (int i = 0; i < n; i++) {
			MonitorBarrierThread thread = new MonitorBarrierThread(i, barrier);
			threads.add(thread);
			thread.start();
		}
		
		for (MonitorBarrierThread thread : threads) {
			thread.join(delay);
		}
		MonitorBarrierThread.PrintThreadSet();
	}
	
	/**
	 * Test method for {@link hw2.cyclicbarrier.CyclicBarrier#await()}.
	 * @throws InterruptedException 
	 */
	@Test
	public void testAwaitMultipleExtra() throws InterruptedException {
		barrier = new MonitorCyclicBarrier(n - n + 3);
		List<MonitorBarrierThread> threads = new ArrayList<MonitorBarrierThread>();
		for (int i = 0; i < n; i++) {
			MonitorBarrierThread thread = new MonitorBarrierThread(i, barrier);
			threads.add(thread);
			thread.start();
		}
		
		for (MonitorBarrierThread thread : threads) {
			thread.join(delay);
		}
		MonitorBarrierThread.PrintThreadSet();
	}
	
	/**
	 * Test method for {@link hw2.cyclicbarrier.CyclicBarrier#await()}.
	 * @throws InterruptedException 
	 */
	@Test
	public void testAwaitMultipleExact() throws InterruptedException {
		barrier = new MonitorCyclicBarrier(n);
		for (int j = 0; j < n; j++) {
			List<MonitorBarrierThread> threads = new ArrayList<MonitorBarrierThread>();
			for (int i = 0; i < n; i++) {
				MonitorBarrierThread thread = new MonitorBarrierThread(i, barrier);
				threads.add(thread);
				thread.start();
			}
			
			for (MonitorBarrierThread thread : threads) {
				thread.join();
			}
		}
		
		System.out.println("**\n");
	}
}
