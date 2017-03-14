package pset1;

import static org.junit.Assert.*;
import org.junit.Test;

/** FibListAugmentTester
 * @author ronny <br>
 * Test the fibonacci list container
 * 
 */
public class FibListAugmentTester {
    @Test
    public void test0() {
        FibList l = new FibList();
        assertTrue(l.repOk());
        l.augment();
        // write a sequence of assertTrue method invocations that
        // perform checks on the values for all the declared fields
        // of list and node objects reachable from l
        assertTrue(l.header != null);
        assertTrue(l.repOk());
        assertEquals(4, l.size);

        // check fibonacci values.
        FibList.Node node = l.header;
        int[] fib = { 1, 1, 2, 3 };
        for (int idx = 0; idx < 4; idx++) {
            assertTrue(node != null);
            assertEquals(fib[idx], node.elem);
            node = node.next;
        }
    }

    @Test
    public void test1() {
        FibList l = new FibList();
        assertTrue(l.repOk());
        l.augment();
        assertTrue(l.repOk());
        l.augment();
        assertTrue(l.repOk());
        // write a sequence of assertTrue method invocations that
        // perform checks on the values for all the declared fields
        // of list and node objects reachable from l
        assertTrue(l.header != null);
        assertTrue(l.repOk());
        assertEquals(5, l.size);

        // check fibonacci values.
        FibList.Node node = l.header;
        int[] fib = { 1, 1, 2, 3, 5 };
        for (int idx = 0; idx < 5; idx++) {
            assertTrue(node != null);
            assertEquals(fib[idx], node.elem);
            node = node.next;
        }
    }
}
