package pset4;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

/** GraphTester
 * @author ronny <br>
 * Tests the pset 4 graph data structure.
 * 
 */
public class GraphTester {

    /** GraphTester
     * 
     * Constructs a new GraphTester object. <br>
     */
    public GraphTester() {
        // TODO Auto-generated constructor stub
    }

    /** Test methods for addEdge: */
    // you must provide at least 4 test methods;
    // each test method must have at least 1 invocation of addEdge;
    // each test method must have at least 1 test assertion;
    // your test methods must provide full statement coverage of your implementation of addEdge and any helper methods
    // no test method directly invokes any method that is not declared in the Graph class.

    @Test // tests for method "addEdge" in class "Graph"
    public void sampleTestAddEdge() {
        Graph g = new Graph();
        g.addEdge(0, 1);
        assertEquals("nodes=[0, 1]; edges={0=[1]}", g.toString());
    }

    @Test
    public void testInvalidFromEdge() {
        Graph graph = new Graph();
        graph.addNode(6);
        graph.addEdge(5, 6);
        assertEquals("nodes=[5, 6]; edges={5=[6]}", graph.toString());
    }

    @Test
    public void testInvalidToEdge() {
        Graph graph = new Graph();
        graph.addNode(5);
        graph.addEdge(5, 6);
        assertEquals("nodes=[5, 6]; edges={5=[6]}", graph.toString());
    }

    @Test
    public void testNullNeighbors() {
        Graph graph = new Graph();
        graph.addEdge(5, 6);
        assertEquals("nodes=[5, 6]; edges={5=[6]}", graph.toString());
    }

    @Test
    public void testNotNullNeighbors() {
        Graph graph = new Graph();
        graph.addEdge(5, 6);
        graph.addEdge(5, 6);
        assertEquals("nodes=[5, 6]; edges={5=[6, 6]}", graph.toString());
    }

    /** Test methods for addEdge: */
    // you must provide at least 6 test methods;
    // each test method must have at least 1 invocation of unreachable;
    // each test method must have at least 1 test assertion;
    // at least 2 test methods must have at least 1 invocation of addEdge;
    // your test methods must provide full statement coverage of your implementation of unreachable and any helper methods
    // no test method directly invokes any method that is not declared in the Graph class as given in this homework

    @Test // tests for method "unreachable" in class "Graph"
    public void sampleTestUnreachable() {
        Graph g = new Graph();
        g.addNode(0);
        Set<Integer> nodes = new HashSet<Integer>();
        nodes.add(0);
        assertTrue(g.unreachable(new HashSet<Integer>(), nodes));
    }

    @Test // sources not a subset of nodes
    public void testInvalidSources() {
        Graph graph = new Graph();
        Set<Integer> sources = new HashSet<Integer>();
        Set<Integer> targets = new HashSet<Integer>();
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.addEdge(5, 2);

        // build parameters
        sources.add(7);
        targets.add(1);
        targets.add(2);
        targets.add(3);

        // verify results 
        assertFalse(graph.unreachable(sources, targets));
    }

    @Test // targets not a subset of nodes
    public void testInvalidTargets() {
        Graph graph = new Graph();
        Set<Integer> sources = new HashSet<Integer>();
        Set<Integer> targets = new HashSet<Integer>();
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.addEdge(5, 2);
        
        // build parameters
        targets.add(7);
        sources.add(1);
        sources.add(2);
        sources.add(3);
        
        // verify results 
        assertFalse(graph.unreachable(sources, targets));
    }
    
    @Test // the targets are reachable from the sources
    public void testReachableCombination() {
        Graph graph = new Graph();
        Set<Integer> sources = new HashSet<Integer>();
        Set<Integer> targets = new HashSet<Integer>();
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.addEdge(5, 2);
        
        // build parameters
        targets.add(5);
        sources.add(1);
        sources.add(2);
        
        // verify results 
        assertFalse(graph.unreachable(sources, targets));
    }
    

    @Test // the targets are not reachable from the sources
    public void testUnreachableCombination() {
        Graph graph = new Graph();
        Set<Integer> sources = new HashSet<Integer>();
        Set<Integer> targets = new HashSet<Integer>();
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.addEdge(5, 2);
        
        // build parameters
        targets.add(1);
        sources.add(2);
        sources.add(3);
        sources.add(4);
        sources.add(5);
        
        // verify results 
        assertTrue(graph.unreachable(sources, targets));
    }
    
    @Test // the targets are not reachable from the sources
    public void testEmptyCombination() {
        Graph graph = new Graph();
        Set<Integer> sources = new HashSet<Integer>();
        Set<Integer> targets = new HashSet<Integer>();
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.addEdge(5, 2);
        
        // build parameters
        
        // verify results 
        assertTrue(graph.unreachable(sources, targets));
    }
    
    @Test // the graph is empty
    public void testEverythingEmpty() {
        Graph graph = new Graph();
        Set<Integer> sources = new HashSet<Integer>();
        Set<Integer> targets = new HashSet<Integer>();
        
        // verify results 
        assertTrue(graph.unreachable(sources, targets));
    }
}
