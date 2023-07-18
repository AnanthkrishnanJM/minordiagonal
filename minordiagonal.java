package minordiagonal;

import java.util. Scanner;

public class minordiagonal {

	public static int minordiagonal(int[][]A,int n) {
		
		  int sum=0;
		  int i=0;
		  int j=n-1;
		  while(i<n&&j>0) {
			  sum+=A[i][j];
		  }
		  return sum;

	}
	public static void main(String[]args) {
		 Scanner B=new  Scanner(System.in) ;
		 System.out.println("enter the numbers:");
	    	int n=B.nextInt();
	    	int[][]A=new int[n][n];
	    	for(int i=0;i<n;i++) {
	    		for(int j=0;j<n;j++) {
	    			A[i][j]=B.nextInt();
	    		}
	    		int value=minordiagonal(A,n);
	    		System.out.println(value);
		}
	}

	}


