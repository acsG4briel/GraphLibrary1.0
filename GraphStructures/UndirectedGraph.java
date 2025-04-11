package GraphStructures;

public class UndirectedGraph extends Graph {

    public UndirectedGraph(int V)
    {
        super(V);
    }

    public void addEdge(int v, int w) throws Exception
    {
        validateVertex(v);
        validateVertex(w);

        if(!(adj[v].contains(w) && adj[w].contains(v)) && v != w)
        {
            E++;
            adj[v].add(w);
            adj[w].add(v);
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
