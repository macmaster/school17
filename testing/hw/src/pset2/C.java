package pset2;

/** C
 * @author ronny <br>
 * Parent Class with a string field.
 * 
 */
public class C {

    String s;

    /** C
     * 
     * Constructs a new C object. <br>
     */
    public C(String s) {
        this.s = s;
    }

    @Override
    public boolean equals(Object o) {
        // returns a boolean consistent with the contract for equals method;
        // returns true if and only if o is an object of class
        // C and has the same value for field s as this.s (w.r.t. String equals)

        if (o == null || !(o.getClass().equals(C.class))) {
            return false;
        } else {
            // equal if o.s equals this.s (string equality).
            return this.s.equals(((C)o).s);
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
        if(s == null){
            return 0;
        }
        
        // generate the hash value.
        // same char sequences yield equal hash codes.
        int hash = 0;
        final int base = 31;
        for(int n = 0; n < s.length(); n++){
            hash += (int)(s.charAt(n) * Math.pow(base, n)); 
        }
        return hash;
    }

}
