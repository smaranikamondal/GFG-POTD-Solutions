//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}

class GfG {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int w = Integer.parseInt(inputLine[1]);
            Item[] arr = new Item[n];
            inputLine = br.readLine().trim().split(" ");
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Item(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            System.out.println(String.format("%.6f", new Solution().fractionalKnapsack(w, arr, n)));
        }
    }
}
// } Driver Code Ends


/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/

class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // Your code here
        Arrays.sort(arr,new Comparator<Item>(){
            public int compare(Item a,Item b){
                if((double)a.value/a.weight<(double)b.value/b.weight)return -1;
                else if((double)a.value/a.weight>(double)b.value/b.weight)return 1;
                return 0;
            }
        });
        double ans = 0;
        for(int i=n-1;i>=0;i--){
            if(W>=arr[i].weight){
                ans+=arr[i].value;
                W-=arr[i].weight;
            }
            else{
                double oneUnit = (double)arr[i].value/arr[i].weight;
                ans+=(double)oneUnit*W;
                return ans;
            }
        }
        return ans;
    }
}