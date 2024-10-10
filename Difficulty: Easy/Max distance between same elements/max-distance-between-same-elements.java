//{ Driver Code Starts
import java.util.*;
import java.util.Scanner;


// } Driver Code Ends
class Solution {
    public int maxDistance(int[] arr) {
        // Code here
        HashMap<Integer, Integer> firstOccurrence = new HashMap<>();
        int maxDist = 0;

        for (int i = 0; i < arr.length; i++) {
            if (firstOccurrence.containsKey(arr[i])) {
                int dist = i - firstOccurrence.get(arr[i]);
                maxDist = Math.max(maxDist, dist);
            } else {
                firstOccurrence.put(arr[i], i);
            }
        }

        return maxDist;
    }
}

//{ Driver Code Starts.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String input = sc.nextLine();
            String[] parts = input.split(" ");
            int[] arr = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                arr[i] = Integer.parseInt(parts[i]);
            }
            Solution ob = new Solution();
            System.out.println(ob.maxDistance(arr));
        }
        sc.close();
    }
}
// } Driver Code Ends