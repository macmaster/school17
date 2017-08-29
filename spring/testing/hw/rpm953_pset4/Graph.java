package pset4;

import java.util.*;

/** Graph
 * @author Ronald Macmaster <br>
 * Graph data structure for hw4.
 * 
 */
public class Graph {

    private Set<Integer> nodes; // set of nodes in the graph
    private Map<Integer, List<Integer>> edges;
    // map between a node and list of nodes connected by outgoing edges
    // class invariant: fields "nodes" and "edges" are non-null;
    // "this" graph has no node that is not in "nodes"

    /** Graph
     * 
     * Constructs a new Graph object. <br>
     */
    public Graph() {
        nodes = new HashSet<Integer>();
        edges = new HashMap<Integer, List<Integer>>();
    }

    public String toString() {
        return "nodes=" + nodes + "; " + "edges=" + edges;
    }

    public void addNode(int n) {
        // postcondition: adds the node "n" to this graph
        nodes.add(n);
    }

    /** 
     * postcondition: adds a directed edge "from" -> "to" to this graph
     */
    public void addEdge(int from, int to) {
        // check edge validity.
        if (!nodes.contains(from) || !nodes.contains(to)) {
            this.addNode(from);
            this.addNode(to);
        }

        // update edge set in graph.
        List<Integer> neighbors = edges.get(from);
        if (neighbors == null)
            neighbors = new ArrayList<Integer>();
        neighbors.add(to);
        edges.put(from, neighbors);
    }

    public boolean unreachable(Set<Integer> sources, Set<Integer> targets) {
        if (sources == null || targets == null)
            throw new IllegalArgumentException();
        // postcondition: returns true if 
        // (1) "sources" is a subset of "nodes",
        // (2) "targets" is a subset of "nodes", 
        // and (3) for each node "m" in set "targets",
        // there is no node "n" in set "sources" such that there is a
        // directed path that starts at "n" and ends at "m" in "this"; 
        // returns false otherwise

        // verify sources is a subset of nodes.
        for (Integer source : sources) {
            if (!nodes.contains(source)) {
                return false;
            }
        }

        // verify targets is a subset of nodes.
        for (Integer target : targets) {
            if (!nodes.contains(target)) {
                return false;
            }
        }

        // check reachability between source and target.
        for (Integer target : targets) {
            // search for target from each source
            for (Integer source : sources) {
                Set<Integer> discovered = new HashSet<Integer>();
                Queue<Integer> frontier = new LinkedList<Integer>();
                discovered.add(source);
                frontier.add(source);

                // breadth first search
                while (!frontier.isEmpty()) {
                    Integer node = frontier.remove();
                    System.out.println("exploring node: " + node);
                    if (node.equals(target)) {
                        return false; // target was found!
                    }

                    // enqueue neighbors
                    List<Integer> neighbors = edges.get(node);
                    neighbors = neighbors == null ? new ArrayList<Integer>() : neighbors;
                    for (Integer neighbor : neighbors) {
                        if (!discovered.contains(neighbor)) {
                            discovered.add(neighbor);
                            frontier.add(neighbor);
                        }
                    }
                }
            }
        }

        return true; // finished reachability checks.
    }

}
