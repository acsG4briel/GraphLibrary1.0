package GraphStructures;

public class DirectedGraph extends Graph {

    //Basic graph constructor
    public DirectedGraph(int V)
    {
        super(V);
    }

    public void addEdge(int v, int w) throws Exception
    {
        validateVertex(v);
        validateVertex(w);

        if(!(adj[v].contains(w)))
        {
            E++;
            adj[v].add(w);
        }
    }

    public void generateSimpleGraph(int e) throws Exception
    {
        validateEdgesNumber(e);
        clearAllEdges();

        while(E != e)
        {
            int v = random.nextInt(V);
            int w = random.nextInt(V);

            addEdge(v, w);
        }
    }

}
