//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine().trim());

            String[] line1 = br.readLine().trim().split(" ");
            int[] a = new int[line1.length];
            for (int i = 0; i < line1.length; i++) {
                a[i] = Integer.parseInt(line1[i]);
            }

            String[] line2 = br.readLine().trim().split(" ");
            int[] b = new int[line2.length];
            for (int i = 0; i < line2.length; i++) {
                b[i] = Integer.parseInt(line2[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.kthElement(a, b, k));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        /*int result = 0;
        int arr[] = new int[a.length + b.length];
        for(int i = 0; i < a.length; i++){
            arr[i] = a[i];
        }
        for(int i = 0; i < b.length; i++){
            arr[a.length + i] = b[i];
        }
        
        Arrays.sort(arr);
        
        for(int i = 0; i < arr.length; i++){
            if(i == k){
                result = arr[i-1];
            }
        }
        
        return result;*/
        
        if (a.length > b.length) {
            return kthElement(b, a, k);
        }

        int m = a.length;
        int n = b.length;

        int low = Math.max(0, k - n); 
        int high = Math.min(k, m);  

        while (low <= high) {
            int midA = (low + high) / 2; 
            int midB = k - midA;         

            // Edge values
            int aLeft = (midA == 0) ? Integer.MIN_VALUE : a[midA - 1];
            int aRight = (midA == m) ? Integer.MAX_VALUE : a[midA];
            int bLeft = (midB == 0) ? Integer.MIN_VALUE : b[midB - 1];
            int bRight = (midB == n) ? Integer.MAX_VALUE : b[midB];

            if (aLeft <= bRight && bLeft <= aRight) {
                return Math.max(aLeft, bLeft);
            } else if (aLeft > bRight) {
                high = midA - 1;
            } else {
                low = midA + 1; 
            }
        }

        return -1;
    }
}