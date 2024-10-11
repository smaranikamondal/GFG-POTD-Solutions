//{ Driver Code Starts
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// } Driver Code Ends
class Solution {
    public List<Integer> rearrange(List<Integer> arr) {
        // Code here
         List<Integer> res = new ArrayList<>();
        if (arr == null || arr.size() == 0)
            return res;

        
        boolean[] dp = new boolean[arr.size()];
        
  
        for (int num : arr) {
            if (num >= 0 && num < arr.size()) { 
                dp[num] = true; 
            }
        }

   
        for (int i = 0; i < arr.size(); i++) {
            if (dp[i]) {
                res.add(i); 
            } else {
                res.add(-1);
            }
        }

        return res;
    }
}

//{ Driver Code Starts.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Solution solution = new Solution();

        while (t-- > 0) {
            String input = scanner.nextLine();
            String[] inputArr = input.split("\\s+");
            List<Integer> arr = new ArrayList<>();
            for (String s : inputArr) {
                arr.add(Integer.parseInt(s));
            }

            List<Integer> ans = solution.rearrange(arr);

            for (int num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
// } Driver Code Ends