package pset2;

import static org.junit.Assert.*;
import org.junit.Test;

/** HashCodeTester
 * @author ronny <br>
 * Checks the 5th hashCode property of the C, D, and Object classes.
 * 
 * Rules:
 * 1. each test uses exactly one assertTrue or assertFalse.
 * 2. each of the hashCode methods must be executed by some test.
 * 
 */
public class HashCodeTester {

    /*
     * P5: If two objects are equal according to the equals(Object) method, then
     * calling the hashCode method on each of the two objects must produce the
     * same integer result.
     */
    @Test
    public void testHashCodeO() {
        Object x = new Object();
        Object y = x;
        assertTrue(x.equals(y) && (x.hashCode() == y.hashCode()));
    }

    @Test
    public void testHashCodeC() {
        C x = new C("yes");
        C y = new C("yes");
        assertTrue(x.equals(y) && (x.hashCode() == y.hashCode()));
    }

    @Test
    public void testHashCodeD() {
        D x = new D("yes", 1);
        D y = new D("yes", 1);
        assertTrue(x.equals(y) && (x.hashCode() == y.hashCode()));
    }

}
