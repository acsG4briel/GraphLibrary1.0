package GraphStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Graph {

    protected int V;
    protected int E;
    protected List<Integer>[] adj;

    protected Random random = new Random();

    @SuppressWarnings("unchecked")
    public Graph(int V)
    {
        this.V = V;
        this.adj = new ArrayList[V];

        for(int i = 0; i < this.V; i++)
        {
            adj[i] = new ArrayList<Integer>();
        }
    }

    public int V()
    {
        return this.V;
    }

    public int E()
    {
        return this.E;
    }

    public void showGraph() throws Exception
    {
        for(int i = 0; i < V; i++)
        {
            System.out.println("Vertex["+ i +"]: " + adj(i));
        }
    }

    public Iterable<Integer> adj(int v) throws Exception
    {
        validateVertex(v);
        return adj[v];
    }

    protected void validateEdgesNumber(int e) throws Exception
    {
        int minValue = V - 1;
        int maxValue = (V*(V-1))/2;

        if(e < minValue || e > maxValue)
        {
            throw new Exception("Invalid edge number.");
        }
    }

    protected void clearAllEdges()
    {
        for(int i = 0; i < V; i++)
        {
            adj[i].clear();
        }
    }

    protected void validateVertex(int v) throws Exception
    {
        if(v < 0 || v >= V)
        {
            throw new Exception("Invalid vertex.");
        }
    }
}
