//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String s = sc.nextLine();
            String[] parts = s.split(" ");
            int[] nums = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                nums[i] = Integer.parseInt(parts[i]);
            }
            Solution ob = new Solution();
            List<Integer> ans = ob.findMajority(nums);

            if (ans.size() == 0) {
                System.out.println("[]");
            } else {
                for (int i : ans) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}

// } Driver Code Ends


class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
         int n=nums.length;
        Arrays.sort(nums);
        int threshold=n/3;
        List<Integer> list=new ArrayList<Integer>();
        int count=1;
        for(int i=1;i<n;i++)
        {
            if(nums[i]==nums[i-1])
            count++;
            else{ 
            if(count>threshold)
            list.add(nums[i-1]);
            count=1;
            }
        }
        if (count > threshold) {
            list.add(nums[n - 1]);
        }
        return list;
    }
}
