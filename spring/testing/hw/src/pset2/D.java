package pset2;

/** D
 * @author ronny <br>
 * Child Class with an integer field.
 * 
 */
public class D extends C {

    int g;

    /** D
     * 
     * Constructs a new D object. <br>
     * @param s
     */
    public D(String s, int g) {
        super(s);
        this.g = g;
    }

    @Override
    public boolean equals(Object o) {
        // returns a boolean consistent with the contract for equals method;
        // returns true if and only if o is an object of class D and
        // has the same value for field s as this.s (w.r.t. String equals) and
        // the same value for field g as this.g

        if (o == null || !(o.getClass().equals(D.class))) {
            return false;
        } else {
            // equal if o.s equals this.s (string equality). and this.g == o.g
            return this.s.equals(((D) o).s) && this.g == (((D) o).g);
        }
    }

    @Override
    public int hashCode() {
        // returns an integer consistent with the contract for hashCode method;
        // does not return a constant value

        /**
         * Java Contract for hashCode:
         * 1. Whenever it is invoked on the same object more than once, 
         * hashCode must consistently return the same integer, 
         * provided no information used in equals comparisons on the object is modified. 
         * This integer need not remain consistent from one execution of an application to another execution.
         * 
         * 2. If two objects are equal according to the equals(Object) method, 
         * calling the hashCode method on each of the two objects must produce the same integer result.
         * 
         * 3. It is not required that if two objects are unequal according to the equals(java.lang.Object) method, 
         * then calling the hashCode method on each of the two objects must produce distinct integer results. 
         * However, producing distinct integer results for unequal objects may improve the performance of hash tables. 
         */

        // null hashcode.
        if (s == null) {
            return 0;
        }

        // generate the hash value.
        // same char sequences yield equal hash codes.
        int hash = 0;
        int base = g % 31;
        for (int n = 0; n < s.length(); n++) {
            hash += (int) (s.charAt(n) * Math.pow(base, n));
        }
        return hash;
    }

}
