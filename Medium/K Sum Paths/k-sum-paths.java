//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class GFG
{
    static Node buildTree(String str)
    {
        // Corner Case
        if(str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");
        
        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        
        // Starting from the second element
        int i = 1;
        while(!q.isEmpty() && i < s.length)
        {
              // Get and remove the front of the queue
              Node currNode = q.remove();
        
              // Get the current node's value from the string
              String currVal = s[i];
        
              // If the left child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the left child for the current node
                  currNode.left = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.left);
              }
        
              // For the right child
              i++;
              if(i >= s.length)
                  break;
              currVal = s[i];
        
              // If the right child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the right child for the current node
                  currNode.right = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.right);
              }
              
              i++;
        }
    
        return root;
    }
    
    public static void main(String args[]) throws IOException {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t>0)
        {
            String s = br.readLine();
            Node root = buildTree(s);
            int k = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            
            System.out.println(ob.sumK(root,k));
            t--;
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    int mod = 1000000007; 
    int ans;
    HashMap<Integer,Integer> mp;
    
    public int sumK(Node root,int k)
    {
        // code here 
        mp= new HashMap<>(); 
        ans = 0;
        dfs(root, k, 0);
        return ans;
    }
    
    public void dfs(Node root, int k, int cur)
    {

        if(root == null)  return;
            
        //two case where we can get the answer
         if((cur + root.data) == k) 
            ans = (ans+1)%mod;

        //check if( currsum - k ) exists in the HashMap
        ans = (ans + (mp.getOrDefault(cur + root.data - k,0))%mod)%mod;

        //update the current path
        mp.put(cur + root.data, (mp.getOrDefault(cur + root.data,0)+1)%mod);
        
        dfs(root.left, k, cur+root.data);
        dfs(root.right, k, cur+root.data);
        
        //remove the path after processing it
        mp.put(cur + root.data, ((mp.getOrDefault(cur + root.data,0)-1) + mod)%mod);
    }
}