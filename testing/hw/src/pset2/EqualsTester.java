package pset2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.*;

/** EqualsTester
 * @author ronny <br>
 * Checks the 4th equals property of the C, D, and Object classes.
 * 
 * Rules:
 * 1. each test uses exactly one assertTrue or assertFalse.
 * 2. each of the equals methods must be executed by some test.
 * 3. tested w.r. to each combo of the three classes. i.e. (C, D, Object) X (C, D, Object).
 * 
 */
public class EqualsTester {

    /*
     * P1: For any non-null reference value x, x.equals(null) should return
     * false.
     */
    // an example test for P1
    @Test
    public void testNullObjectEquals() {
        assertFalse(new Object().equals(null));
    }

    /*
     * P4: It is transitive: for any non-null reference values x, y, and z, if
     * x.equals(y) returns true and y.equals(z) returns true, then x.equals(z)
     * should return true.
     */

    /**
     * original methods coverage in just 9 cases.testCequalsO()
     * Each equals method from every class is invoked with an object of each type.
     */

    @Test
    public void testCequalsO() {
        C x = new C("yes");
        C y = new C("no");
        Object z = new Object();
        assertFalse(x.equals(z) || y.equals(z));
    }

    @Test
    public void testCequalsC() {
        C y = new C("yes");
        C x = new C("yes"), z = new C("yes");
        assertTrue(x.equals(y) && y.equals(z) && x.equals(z));
    }

    @Test
    public void testCequalsD() {
        C x = new C("yes");
        C y = new C("yes");
        D z = new D("yes", 1);
        assertFalse(x.equals(z) || y.equals(z));
    }

    @Test
    public void testDequalsO() {
        D x = new D("yes", 1);
        D y = new D("yes", 1);
        Object z = new Object();
        assertFalse(x.equals(z) || y.equals(z));
    }

    @Test
    public void testDequalsC() {
        D x = new D("yes", 1);
        D y = new D("yes", 1);
        C z = new C("yes");
        assertFalse(x.equals(z) || y.equals(z));
    }

    @Test
    public void testDequalsD() {
        D y = new D("yes", 1);
        D x = new D("yes", 1), z = new D("yes", 1);
        assertTrue(x.equals(y) && y.equals(z) && x.equals(z));
    }

    @Test
    public void testOequalsO() {
        Object y = new Object();
        Object x = y, z = y;
        assertTrue(x.equals(y) && y.equals(z) && x.equals(z));
    }

    @Test
    public void testOequalsC() {
        Object x = new Object();
        Object y = x;
        C z = new C("yes");
        assertFalse(x.equals(z) || y.equals(z));
    }

    @Test
    public void testOequalsD() {
        Object x = new Object();
        Object y = x;
        D z = new D("yes", 1);
        assertFalse(x.equals(z) || y.equals(z));
    }

    /******  27 Tests to check 3 x 3 x 3 possibilities for (x, y, z) type. **********/

    /** X is of type Object tests. */

    @Test // transitive property success.
    public void testEqualsOOO() {
        Object x = new Object();
        Object y = x;
        Object z = x;
        assertTrue(x.equals(y) && y.equals(z) && x.equals(z));
    }

    @Test
    public void testEqualsOOC() {
        Object x = new Object();
        Object y = x;
        C z = new C("yes");
        if (x.equals(y) && y.equals(z)) {
            assertTrue(x.equals(z));
        }
    }

    @Test
    public void testEqualsOOD() {
        Object x = new Object();
        Object y = x;
        D z = new D("yes", 1);
        if (x.equals(y) && y.equals(z)) {
            assertTrue(x.equals(z));
        }
    }

    @Test
    public void testEqualsOCO() {
        Object x = new Object();
        C y = new C("yes");
        Object z = x;
        if (x.equals(y) && y.equals(z)) {
            assertTrue(x.equals(z));
        }
    }

    @Test
    public void testEqualsOCC() {
        Object x = new Object();
        C y = new C("yes");
        C z = new C("yes");
        if (x.equals(y) && y.equals(z)) {
            assertTrue(x.equals(z));
        }
    }

    @Test
    public void testEqualsOCD() {
        Object x = new Object();
        C y = new C("yes");
        D z = new D("yes", 1);
        if (x.equals(y) && y.equals(z)) {
            assertTrue(x.equals(z));
        }
    }

    @Test
    public void testEqualsODO() {
        Object x = new Object();
        D y = new D("yes", 1);
        Object z = x;
        if (x.equals(y) && y.equals(z)) {
            assertTrue(x.equals(z));
        }
    }

    @Test
    public void testEqualsODC() {
        Object x = new Object();
        D y = new D("yes", 1);
        C z = new C("yes");
        if (x.equals(y) && y.equals(z)) {
            assertTrue(x.equals(z));
        }
    }

    @Test
    public void testEqualsODD() {
        Object x = new Object();
        D y = new D("yes", 1);
        D z = new D("yes", 1);
        if (x.equals(y) && y.equals(z)) {
            assertTrue(x.equals(z));
        }
    }

    /** X is an object of type C **/

    @Test
    public void testEqualsCOO() {
        C x = new C("yes");
        Object y = new Object();
        Object z = y;
        if (x.equals(y) && y.equals(z)) {
            assertTrue(x.equals(z));
        }
    }

    @Test
    public void testEqualsC0C() {
        C x = new C("yes");
        Object y = new Object();
        C z = new C("yes");
        if (x.equals(y) && y.equals(z)) {
            assertTrue(x.equals(z));
        }
    }

    @Test
    public void testEqualsCOD() {
        C x = new C("yes");
        Object y = new Object();
        D z = new D("yes", 1);
        if (x.equals(y) && y.equals(z)) {
            assertTrue(x.equals(z));
        }
    }

    @Test
    public void testEqualsCCO() {
        C x = new C("yes");
        C y = new C("yes");
        Object z = new Object();
        if (x.equals(y) && y.equals(z)) {
            assertTrue(x.equals(z));
        }
    }

    @Test
    public void testEqualsCCC() {
        C y = new C("yes");
        C x = new C("yes"), z = new C("yes");
        assertTrue(x.equals(y) && y.equals(z) && x.equals(z));
    }

    @Test
    public void testEqualsCCD() {
        C x = new C("yes");
        C y = new C("yes");
        D z = new D("yes", 1);
        if (x.equals(y) && y.equals(z)) {
            assertTrue(x.equals(z));
        }
    }

    @Test
    public void testEqualsCDO() {
        C x = new C("yes");
        D y = new D("yes", 1);
        Object z = new Object();
        if (x.equals(y) && y.equals(z)) {
            assertTrue(x.equals(z));
        }
    }

    @Test
    public void testEqualsCDC() {
        C x = new C("yes");
        D y = new D("yes", 1);
        C z = new C("yes");
        if (x.equals(y) && y.equals(z)) {
            assertTrue(x.equals(z));
        }
    }

    @Test
    public void testEqualsCDD() {
        C x = new C("yes");
        D y = new D("yes", 1);
        D z = new D("yes", 1);
        if (x.equals(y) && y.equals(z)) {
            assertTrue(x.equals(z));
        }
    }

    /** X is an object of type D **/

    @Test
    public void testEqualsDOO() {
        D x = new D("yes", 1);
        Object y = new Object();
        Object z = new Object();
        if (x.equals(y) && y.equals(z)) {
            assertTrue(x.equals(z));
        }
    }

    @Test
    public void testEqualsDOC() {
        D x = new D("yes", 1);
        Object y = new Object();
        C z = new C("yes");
        if (x.equals(y) && y.equals(z)) {
            assertTrue(x.equals(z));
        }
    }

    @Test
    public void testEqualsDOD() {
        D x = new D("yes", 1);
        Object y = new Object();
        D z = new D("yes", 1);
        if (x.equals(y) && y.equals(z)) {
            assertTrue(x.equals(z));
        }
    }

    @Test
    public void testEqualsDCO() {
        D x = new D("yes", 1);
        C y = new C("yes");
        Object z = new Object();
        if (x.equals(y) && y.equals(z)) {
            assertTrue(x.equals(z));
        }
    }

    @Test
    public void testEqualsDCC() {
        D x = new D("yes", 1);
        C y = new C("yes");
        C z = new C("yes");
        if (x.equals(y) && y.equals(z)) {
            assertTrue(x.equals(z));
        }
    }

    @Test
    public void testEqualsDCD() {
        D x = new D("yes", 1);
        C y = new C("yes");
        D z = new D("yes", 1);
        if (x.equals(y) && y.equals(z)) {
            assertTrue(x.equals(z));
        }
    }

    @Test
    public void testEqualsDDO() {
        D x = new D("yes", 1);
        D y = new D("yes", 1);
        Object z = new Object();
        if (x.equals(y) && y.equals(z)) {
            assertTrue(x.equals(z));
        }
    }

    @Test
    public void testEqualsDDC() {
        D x = new D("yes", 1);
        D y = new D("yes", 1);
        C z = new C("yes");
        if (x.equals(y) && y.equals(z)) {
            assertTrue(x.equals(z));
        }
    }

    @Test
    public void testEqualsDDD() {
        D y = new D("yes", 1);
        D x = new D("yes", 1), z = new D("yes", 1);
        assertTrue(x.equals(y) && y.equals(z) && x.equals(z));
    }

}
