/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++){
		    long A = sc.nextLong();
		    long B = sc.nextLong();
		    
		    long gcdVal = gcd(A, B);
		    long lcmVal = lcm(A, B, gcdVal);
		    
		    System.out.println(lcmVal + " " + gcdVal);
		}
	}
	
	public static long gcd(long a, long b){
	    while(b != 0){
	        long temp = b;
	        b = a % b;
	        a = temp;
	    }
	    return a;
	}
	
	public static long lcm(long a, long b, long gcdVal){
	    return (a / gcdVal) * b;
	}
}