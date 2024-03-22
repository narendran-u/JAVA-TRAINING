class Islandcounter
{
    void dfs(int[][] matrix,Boolean[][] visited,int x,int y,int n,int m)
    {
        if (x < 0 || y < 0 || x >= n || y >= m

        || visited[x][y] == true || matrix[x][y] == 0)

        return;
       visited[x][y] = true;
       dfs(matrix, visited, x + 1, y, n, m);
       dfs(matrix, visited, x, y + 1, n, m);
       dfs(matrix, visited, x - 1, y, n, m);
       dfs(matrix, visited, x, y - 1, n, m);

    }

   int  countClosedIsland(int[][] matrix,int n,int m)
   {
    Boolean[][] visited=new Boolean[n][m];
   
    for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
        visited[i][j] = false; 
    }
}

    int count=0;
    for(int i=0;i<n;++i)
    {
        for(int j=0;j<m;++j)
        {
            if ((i * j == 0 || i == n - 1 || j == m - 1)

                    && matrix[i][j] == 1

                    && visited[i][j] == false)

                    dfs(matrix, visited, i, j, n, m);

        }
    }
    for(int i=0;i<n;++i)
        {
            for(int j=0;j<m;++j)
            {
                if(visited[i][j]==false&&matrix[i][j]==1)
                {
                    count++;
                    dfs(matrix,visited,i,j,n,m);
                }
            }
        }
    return count;

    
    
   }
}
public class floodfill {
    public static void main(String[] args) {
        int N = 5, M = 8;
 

    

        int[][] matrix = { { 0, 0, 0, 0, 0, 0, 0, 1 },

                           { 0, 1, 1, 1, 1, 0, 0, 1 },

                           { 0, 1, 0, 1, 0, 0, 0, 1 },

                           { 0, 1, 1, 1, 1, 0, 1, 0 },

                           { 0, 0, 0, 0, 0, 0, 0, 1 } };
 

        
        Islandcounter i=new Islandcounter();
        System.out.print(i.countClosedIsland(matrix, N, M));

    }

}
