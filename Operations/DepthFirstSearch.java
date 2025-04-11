package Operations;

import GraphStructures.Graph;

public class DepthFirstSearch {

    public static int[] depthFirstSearch(Graph g)
    {
        int count = 0;
        int[] findTime = new int[g.V()];
        int[] finishTime = new int[g.V()];
        int[] pred = new int[g.V()];

        for(int i = 0; i < g.V(); i++)
        {
            findTime[i] = 0;
            finishTime[i] = 0;
            pred[i] = 0;
        }

        int root  = 0;

        while(VertexNotFound(findTime))
        {
            dfs(root, pred, findTime, finishTime, count);
        }


    }

    private static void dfs(int root, int[] pred, int[] findTime, int[] finishTime, int count)
    {
        count++;
        findTime[root] = count;
        
    }

    private static boolean VertexNotFound(int[] findTime)
    {
        for(int i = 0; i < findTime.length; i++)
        {
            if(findTime[i] == 0)
            {
                return true;
            }
        }

        return false;
    }

}
