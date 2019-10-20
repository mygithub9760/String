/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String P = "ab";
		String T = "abxabaacabcaby";
		    System.out.print(match(T,P));
	}
	
	public static int[] prep(String p)
	{
	    int j = 0;
	    int i = 1;
	    int size = p.length();
	    int[] A = new int[size];
	    A[0] = 0;
	    
	    while(i<size)
	    {
	        if(p.charAt(i) == p.charAt(j))
	        {
	            j++;
	            A[i] = j;
	            i++;
	        }
	        else
	        {
	            while(j>0 && p.charAt(i) != p.charAt(j))
	            {
	                j = A[j-1];
	            }
	            if(j==0 && p.charAt(i) != p.charAt(j))
	            {
	                A[i] = 0;
	                i++;
	            }
	        }
	    }
	    return A;
	}
	
	public static ArrayList<Integer> match(String T, String P)
	{
	    int p = P.length();
	    int t = T.length();
	    
	    int i = 0;
	    int j = 0;
	    int[] A = prep(P);
	    
	    ArrayList<Integer> list = new ArrayList<>();
	    
	    while(i<t)
	    {
    	    while(i<t && j<p)
    	    {
    	        if(T.charAt(i) == P.charAt(j))
    	        {
    	            i++;
    	            j++;
    	        }
    	        else
    	        {
    	            if(j==0)
    	                i++;
    	            else
    	                j = A[j-1];
    	        }
    	    }
    	    if(j == p){
    	        list.add(i-j);
    	        j = A[j-1];
    	    }
	    }  
	    
	    
	    return list;
	    
	}
}











