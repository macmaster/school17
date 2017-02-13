package hw2.cyclicbarrier;

/** MonitorCyclicBarrier
 * 
 * A MonitorCyclicBarrier will trip when 
 * the given number of parties (threads) are waiting upon it
 */
public class MonitorCyclicBarrier {

    private int parties;
    private int position;

    /** MonitorCyclicBarrier <br>
     * 
     * A MonitorCyclicBarrier will trip when 
     * the given number of parties (threads) are waiting upon it
     */
    public MonitorCyclicBarrier(int parties) {
        // Creates a new CyclicBarrier that will trip when
        // the given number of parties (threads) are waiting upon it

        if (parties <= 0) {
            throw new IllegalArgumentException("parties must be > 0");
        }

        this.position = 1;
        this.parties = parties;
    }

    synchronized int await() throws InterruptedException {
        // Waits until all parties have invoked await on this barrier.
        // If the current thread is not the last to arrive then it is
        // disabled for thread scheduling purposes and lies dormant until
        // the last thread arrives.
        // Returns: the arrival index of the current thread, where index
        // (parties - 1) indicates the first to arrive and zero indicates
        // the last to arrive.

        int rank = parties - position;
        position = position + 1;

        if (rank > 0) {
            wait();
            return rank;
        } else {
            position = 1;
            notifyAll();
            return rank;
        }

    }
}
