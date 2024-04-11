//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution{
    
    // function to convert a given Gray equivalent n to Binary equivalent.
    public static int grayToBinary(int n) {
        
        // Your code here
        ArrayList<Integer> temp = new ArrayList<>();
        while(n!=0){
            if((n&1)==1)temp.add(1);
            else temp.add(0);
            n>>=1;
        }
        Collections.reverse(temp);
        for(int i=1;i<temp.size();i++){
            temp.set(i,temp.get(i-1)^temp.get(i));
        }
        int ans = 0,j=0;
        for(int i=temp.size()-1;i>=0;i--){
            if(temp.get(i)==1)ans+=Math.pow(2,j);
            j++;
        }
        return ans;
        
    }
       
}



//{ Driver Code Starts.

class GFG {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();//testcases
		while(t-->0){
		    int n = sc.nextInt();//initializing n
		    
		    Solution obj = new Solution();
		    
		    //calling grayToBinary() function
		    System.out.println(obj.grayToBinary(n));
		}
	}
}

// } Driver Code Ends