import GraphStructures.DirectedGraph;
import GraphStructures.UndirectedGraph;

public class Main {
    public static void main(String[] args) throws Exception {
        UndirectedGraph ug = new UndirectedGraph(10);
        DirectedGraph dg = new DirectedGraph(10);

        ug.generateSimpleGraph(20);

        ug.showGraph();

        dg.generateSimpleGraph(20);
        dg.showGraph();
    }

}
