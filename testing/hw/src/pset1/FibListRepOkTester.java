package pset1;

import org.junit.*;
import static org.junit.Assert.*;

public class FibListRepOkTester {

    private FibList list;
    FibList.Node first, second, third;

    @Before
    public void setUp() {
        list = new FibList();

        // size originally 3 or more.
        assertTrue(list.size == 3);
        assertTrue(list.header != null);
        assertTrue(list.header.next != null);
        assertTrue(list.header.next.next != null);

        // set reference nodes
        first = list.header;
        second = list.header.next;
        third = list.header.next.next;
    }

    /**
     * testSizeFailure()
     * <A, B>
     * early exit with size < 3. 
     */
    @Test
    public void testSizeFailure() {
        // corrupt list size
        list.size = 0;

        // early exit on [size < 3]
        assertTrue(list.size < 3);
        assertFalse(list.repOk());
    }

    /**
     * testDuplicateNodes()
     * <A, C, D, E, K, G, ...,  D, E, F>
     * Failure on the visited assertion.
     */
    @Test
    public void testDuplicateNodes() {
        // Create an acyclic link in the list.
        third.next = list.header;

        // loop exit on duplicate node
        assertEquals(list.header, third.next);
        assertFalse(list.repOk());
    }

    /**
     * testFibonacciInvariant()
     * <A, C, D, E, G, H, I, J>
     * Early failure within loop on fibonacci invariant test.
     * There is an error in the fibonacci sequence.
     */
    @Test
    public void testFibonacciInvariant() {

        // corrupt the last node.
        third.elem = 0;

        // fibonacci invariant fails to hold.
        assertTrue(third.elem != first.elem + second.elem);
        assertFalse(list.repOk());
    }

    /**
     * testLoopCompletion()
     * <A, C, D, ... ,L>
     * Skip the loop and exit with success.
     */
    @Test
    public void testLoopCompletion() {
        // confirm loop completion.
        assertTrue(third.elem == first.elem + second.elem);
        assertTrue(second.next.next == null);
        assertTrue(third.next == null);

        // validate successful exit.
        assertTrue(list.size == 3);
        assertTrue(list.repOk());

    }
}
