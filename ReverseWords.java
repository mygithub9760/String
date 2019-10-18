/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args){
		String str = "This is a Career Monk String";
		char[] A = str.toCharArray();
		    
		int i =0;
		int j = 0;
		int size = A.length;
		while(j<size)
		{
		    while(j<size && A[j] != ' ')
		        j++;
		        
		    reverse(A, i, j-1);
		    j++;
		    while(j<size && A[j] == ' ')
		        j++;
		    i = j;
		}
		reverse(A,0,size-1);
		for(char ch : A)
		    System.out.print(ch);
	}
	
	static void reverse(char[] A, int s, int e)
	{
	    while(s<e)
	    {
	        char ch = A[s];
	        A[s] = A[e];
	        A[e] = ch;
	        s++;
	        e--;
	    }
	}
	
}
