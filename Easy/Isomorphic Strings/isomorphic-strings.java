//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.*;


public class Driver {
    
    public static void main(String[] args)throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            String s1 = br.readLine();
            String s2 = br.readLine();
            
            Solution obj = new Solution();
            
            boolean a = obj.areIsomorphic(s1,s2);
            if(a)
            System.out.println(1);
            else
            System.out.println(0);
        }
    }
    
}

// } Driver Code Ends


class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String s1,String s2)
    {
         int n1 = s1.length(), n2 = s2.length();
        if (n1 != n2)
            return false;

        HashMap<Character, Character> map = new HashMap<>(); 
        HashMap<Character, Integer> vis = new HashMap<>(); 

        for (int i = 0; i < n1; i++) {
            char c1 = s1.charAt(i), c2 = s2.charAt(i);
            if (!map.containsKey(c1)) 
            {
                if (!vis.containsKey(c2)) {
                    map.put(c1, c2);
                    vis.put(c2, 1);
                }
                else if (vis.get(c2) == 1) 
                    return false;
            } 
            else if (map.get(c1) != c2) 
                return false;
        }
        return true;
        
    }
}