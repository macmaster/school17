package hw2.cyclicbarrier;

import java.util.HashSet;
import java.util.Set;

/** BarrierThread
 * @author ronny <br>
 *
 * TODO: Document <br>
 */
public class BarrierThread extends Thread {
	
	private int id;
	private CyclicBarrier barrier;
	private static Set<Integer> threads = new HashSet<Integer>(); 
	
	/** BarrierThread <br>
	 * 
	 * Constructs a new BarrierThread Object. <br>
	 */
	public BarrierThread(int id, CyclicBarrier barrier) {
		this.id = id;
		this.barrier = barrier;
		threads.add(id);
	}
	
	@Override
	public void run() {
		try {
			System.out.format("Thread %d: Now entering barrier%n", id);
			int position = barrier.await();
			threads.remove(id);
			System.out.format("Thread %d: Woohoo (position %d), I'm Free!!!%n", id, position);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void PrintThreadSet(){
		System.out.println(threads);
	}
	
}
