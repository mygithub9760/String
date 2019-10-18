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
		StringBuffer str = new StringBuffer("abcd");
		StringBuffer sb = new StringBuffer();
		
		permute(str, sb);
		
	}
	
	static void permute(StringBuffer str, StringBuffer sb)
	{
	    if(str.length()==0)
	    {
	        System.out.println(sb.toString());
	        return;
	    }
	    
	    for(int i = 0;i<str.length();i++)
	    {
	        char ch = str.charAt(i);
	        sb.append(ch);
	        str.deleteCharAt(i);
	        permute(str, sb);
	        sb.deleteCharAt(sb.length()-1);
	        str.insert(i, ch);
	        
	    }
	}
	
}
