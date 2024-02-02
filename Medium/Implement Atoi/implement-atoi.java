//{ Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			int num = obj.atoi(str);
			
			System.out.println(num);
		t--;
		}
	}
}
// } Driver Code Ends


//User function template for JAVA

/*You are required to complete this method */
class Solution
{
    int atoi(String s) {
	// Your code here
	int n = s.length();
	int sign=1;
	int i=0;
	if(s.charAt(0)=='-'){
	    sign=-1; i++;
	}
	
	int num=0;
	for(int j=i; j<n; j++){
	    char ch = s.charAt(j);
	    if(ch>='0' && ch<='9')
	    num = num*10 + ch-'0';
	    else
	    return -1;
	}
	return sign*num;
    }
}
