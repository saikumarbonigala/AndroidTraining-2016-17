import java.util.*;

class BackAround
{
	public String backAround(String str)
	{
		//StringBuffer sb = new StringBuffer(str);
		int length=str.length();
		return(str.charAt(length-1)+str+str.charAt(length-1));
	}
}

class Solution
{
	public static void main(String args[])
	{
		BackAround obj = new BackAround();

		System.out.println(obj.backAround("Hello"));
	}
}