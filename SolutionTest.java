import java.io.*;
import java.util.*;
 
 class FindBlock
 {
 	public int maxBlock(String str)
 	{
 		int max=0,count=1;//change max=1 if not work
 		for(int i=1;i<str.length();i++)
 		{
 			char maxChar=0;	
 			count=(str.charAt(i)==str.charAt(i-1)) ? (count+1) :1;
 			if(count>max)
 				max=count;
 		}
 		return max;
 	}
 }
 
 class SolutionTest
 {
 	public static void main(String args[])
 	{
 		Scanner sc = new Scanner(System.in);
 
 		FindBlock obj = new FindBlock();
 		System.out.println(obj.maxBlock("hello"));
 		System.out.println(obj.maxBlock("abbCCCddBBBxx"));
 		System.out.println(obj.maxBlock(""));
 	}
 } 
