//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution {
  public:
    static bool compare(const vector<int>& a, const vector<int>& b)
    {
        return a[0] == b[0] ? a[1] < b[1] : a[0] < b[0];
    }
    static bool IsOverlap(const vector<int>& a, const vector<int>& b)
    {
        return a[0] < b[0] ? b[0] < a[1] : a[0] < b[1];
    }
    static int minimum(const int& a, const int& b)
    {
        return a < b ? a : b;
    }
    int minRemoval(vector<vector<int>> &intervals) {
        sort(intervals.begin(), intervals.end(), compare);
        int output = 0;
        vector<int> p = intervals[0];
        for(int i=1; i<intervals.size(); i++)
        {
            if(IsOverlap(p, intervals[i]))
            {
                output++;
                p[1] = minimum(p[1], intervals[i][1]);
            }
            else p = intervals[i];
        }
        return output;
    }
};


//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int N;
        cin >> N;

        vector<vector<int>> intervals(N, vector<int>(2));
        for (int i = 0; i < N; i++) {
            cin >> intervals[i][0] >> intervals[i][1];
        }
        Solution obj;
        cout << obj.minRemoval(intervals) << endl;

        cout << "~"
             << "\n";
    }
    return 0;
}
// } Driver Code Ends