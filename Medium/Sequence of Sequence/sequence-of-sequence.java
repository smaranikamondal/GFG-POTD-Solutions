//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            int m = Integer.parseInt(input_line[0]);
            int n = Integer.parseInt(input_line[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.numberSequence(m, n));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int help(int i, int j, int n, int m){
        if(j==n)    return 1;
        if(i>m)     return 0;
        
        int pick= help(i*2, j+1, n, m);
        int not_pick=help(i+1, j, n, m);

        return pick+not_pick;
    }
    static int numberSequence(int m, int n){
        return help(1,0,n,m);
    }
}