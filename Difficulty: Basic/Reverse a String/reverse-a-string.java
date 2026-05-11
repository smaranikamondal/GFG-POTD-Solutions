// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        String rev = "";
        char[] chrArr = s.toCharArray();
        for(int i = chrArr.length - 1; i >= 0; i--){
            rev = rev + chrArr[i];
        }
        return rev;
    }
}