import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UndirectedGraph {
    private int V;
    private int E;
    private List<Integer>[] adj;

    //Basic graph constructor
    @SuppressWarnings("unchecked")
    public UndirectedGraph(int V)
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
        Random random = new Random();

        validateEdgesNumber(e);
        clearAllEdges();

        while(E != e)
        {
            int v = random.nextInt(V);
            int w = random.nextInt(V);

            addEdge(v, w);
        }


    }

    private void validateEdgesNumber(int e) throws Exception
    {
        int minValue = V - 1;
        int maxValue = (V*(V-1))/2;

        if(e < minValue || e > maxValue)
        {
            throw new Exception("Invalid edge number.");
        }
    }

    private void clearAllEdges()
    {
        for(int i = 0; i < V; i++)
        {
            adj[i].clear();
        }
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

    public int degree(int v) throws Exception
    {
        validateVertex(v);
        return adj[v].size();
    }

    private void validateVertex(int v) throws Exception
    {
        if(v < 0 || v >= V)
        {
            throw new Exception("Invalid vertex.");
        }
    }



}
