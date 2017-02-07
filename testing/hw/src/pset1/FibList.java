package pset1;

import java.util.HashSet;
import java.util.Set;

/** FibList
 * @author ronny <br>
 * singly-linked list container for fibonacci series.
 * 
 */
public class FibList {
    Node header;
    int size;

    static class Node {
        int elem;
        Node next;
    }

    public FibList() {
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        header = n1;
        n1.elem = 1;
        n1.next = n2;
        n2.elem = 1;
        n2.next = n3;
        n3.elem = 2;
        size = 3;
    }

    public boolean repOk() {
        // postcondition: returns true iff (1) <this> is an acyclic list, i.e.,
        // there is no path from a node to itself;
        // (2) the list elements form a Fibonacci series,
        // i.e., the element in any node is the sum of
        // the elements in the two preceding nodes
        // (if they exist); and (3) size >=3
        if (size < 3)
            return false;
        Set<Node> visited = new HashSet<Node>();
        Node n = header;
        while (n != null) {
            if (!visited.add(n)) {
                return false;
            }
            if (n.next != null) {
                if (n.next.next != null) {
                    if (n.next.next.elem != n.elem + n.next.elem) {
                        return false;
                    }
                }
            }
            n = n.next;
        }
        return size == visited.size();
    }

    public int augment() {
        // precondition: this.repOk()
        // postcondition: adds a new node at the end of the list w.r.t. repOk
        // and returns the element in this node;
        // the rest of the list is unmodified;

        // check for fiblist failure.
        if (header == null) {
            return -1;
        }

        // find last two nodes
        Node previous = null, current = header;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }

        // fib[n+1] = fib[n] + fib[n - 1]
        Node node = new Node();
        int value = previous.elem + current.elem;

        // augment new node
        current.next = node;
        node.elem = value;
        node.next = null;
        size = size + 1;
        return node.elem;
    }
}