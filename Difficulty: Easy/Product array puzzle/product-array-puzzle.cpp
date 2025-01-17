//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function template for C++

class Solution {
  public:
    vector<int> productExceptSelf(vector<int>& arr) {
        // code here
        vector<int>res(arr.size(),0);
        long long int buffer = 1;
        int cnt_0 = 0;
        int n = arr.size();
        for(auto num:arr){
            if(num == 0) {
                cnt_0++;
                continue;
            }
            buffer *= num;
        }
        for(int i=0; i<n; i++){
            if(arr[i] == 0 && cnt_0 > 1){
                res[i] = 0;
            }
            else if(arr[i] == 0 && cnt_0 == 1){
                res[i] = buffer;
            }
            else if(cnt_0 >= 1){
                res[i] = 0;
            }
            else{
                res[i] = buffer/arr[i];
            }
        }
        return res;
    }
};


//{ Driver Code Starts.

int main() {

    int t;
    cin >> t;
    cin.ignore();

    while (t--) {
        vector<int> arr;
        string input;
        getline(cin, input);
        stringstream ss(input);
        int number;

        while (ss >> number) {
            arr.push_back(number);
        }

        Solution obj;
        vector<int> res = obj.productExceptSelf(arr);

        for (int i = 0; i < res.size(); i++) {
            cout << res[i] << " ";
        }
        cout << endl;
        cout << "~\n";
    }

    return 0;
}

// } Driver Code Ends