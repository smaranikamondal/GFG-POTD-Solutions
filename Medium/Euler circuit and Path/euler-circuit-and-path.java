//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        
        while (tc-- > 0) {
            int V = scanner.nextInt();
            int E = scanner.nextInt();
            
            List<Integer>[] adj = new ArrayList[V];
            for (int i = 0; i < V; i++) {
                adj[i] = new ArrayList<>();
            }
            
            for (int i = 0; i < E; i++) {
                int u = scanner.nextInt();
                int v = scanner.nextInt();
                adj[u].add(v);
                adj[v].add(u);
            }
            
            // String x=scanner.nextLine();
            // scanner.nextLine();
            
            Solution obj = new Solution();
            int ans = obj.isEulerCircuit(V, adj);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution{
    int[] vis;
    public int isEulerCircuit(int V, List<Integer>[] adj) 
    {
        vis = new int[V+1];
        dfs(0, vis, adj);
        
        for (int i = 0; i < V; i++) 
        {
            if (vis[i]==0 && adj[i].size()>0)
                return 0; 
        }
            
        int cnt = 0;
        for (int i = 0; i < V; i++) {
            if ((adj[i].size() % 2) == 1)
                cnt++;
        }
        if (cnt > 2)
             return 0; 
       else if(cnt==2) return 1; 
       else  return 2;
       
    }
    
    void dfs(int u, int[] vis, List<Integer>[] adj) {
        vis[u] = 1;
        for (int v : adj[u]) {
            if (vis[v]==0)
                dfs(v, vis, adj);
        }
    }
}