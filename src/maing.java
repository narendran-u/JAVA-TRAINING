import java.util.Arrays;

public class Graph {
    int v;
    int graph[][];
    Graph(){}
    Graph(int v){
        this.v=v;
        this.graph=new int[v][v];
    }
    void addEdge(int i,int j,int weight)
    {
        graph[i][j]=weight;
        graph[j][i]=weight;
    }
    void removeEdge(int i,int j)
    {
        graph[i][j]=0;
        graph[j][i]=0;
    }
    void displayG()
    {
        for(int i=0;i<v;i++)
        {
            for(int j=0;j<v;j++)
            {
                System.out.print(" "+graph[i][j]+"  ");
            }
            System.out.println();
        }
    }
    int [][] addVertex()
    {
        int arr[][]=new int[v+1][v+1];
        for(int i=0;i<v;i++)
        {
            for(int j=0;j<v;j++)
            {
                arr[i][j]=graph[i][j];
            }
        }
        v=v+1;
        return arr;
    }
    void printNeighbout(int i)
    {
        System.out.print(i+"->");
        for(int j=0;j<v;j++)
        {
            if(graph[i][j]==1)
            {
                System.out.print(j+" ");
            }
        }
    }
    int [] sdist(int source)
    {
        int dist[]=new int[v];
        boolean visit[]=new boolean[v];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[source]=0;
        int n=v-1;
        while(n-->0)
        {
            int j=mindDist(dist,visit);
            visit[j]=true;
            for(int i=0;i<v;i++)
            {
                if(!visit[i] && graph[j][i]!=0 && dist[j]!=Integer.MAX_VALUE && dist[j]+graph[j][i]<dist[i] )
                {
                    dist[i]=dist[j]+graph[j][i];
                }
            }
        }
        return dist;   
    }
    int mindDist(int[] dist,boolean []visit)
    {
        int min=Integer.MAX_VALUE,minIndex=-1;
        for(int i=0;i<dist.length;i++)
        {
            if(!visit[i] && dist[i]<=min)
            {
                min=dist[i];
                minIndex=i;
            }
        }
        return minIndex;
    }
    int [] bell(int source)
    {
        int dist[]=new int[v];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[source]=0;
        int n=v-1;
        for (int i = 1; i < v; ++i) {
            for (int j = 0; j < v; ++j) {
                for (int k = 0; k < v; ++k) {
                    if (graph[j][k] != 0 && dist[j] != Integer.MAX_VALUE && dist[j] + graph[j][k] < dist[k]) {
                        dist[k] = dist[j] + graph[j][k];
                    }
                }
            }
        }
        while(n-->0)
        {
            for(int i=0;i<v;i++)
            {
                for(int j=0;j<v;j++)
                {
                    if(graph[i][j]!=0 && dist[i]!=Integer.MAX_VALUE && dist[j]+graph[i][j]<dist[i] )
                    {
                        return null;
                    }
                }
            }
        }
        return dist;
    }
    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(1,2,5);
        g.addEdge(3,2,4);
        g.addEdge(0,2,1);
        g.displayG();
        System.out.println(Arrays.toString(g.bell(1)));
        System.out.println(Arrays.toString(g.sdist(1)));
    }
}