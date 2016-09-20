import java.util.*;

class Triple
{
	public int countTriple(String str)
	{
		int flag=0,count=1;
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==str.charAt(i+1))
				count++;
			else
				count=1;
			if(count>=3)
				flag++;
		}
		return flag;
	}
}

class Solution11
{
	public static void main(String args[])
	{
		Triple obj = new Triple();

		System.out.println(obj.countTriple("abcXXXabc"));
		System.out.println(obj.countTriple("xxxabyyyycd"));
		System.out.println(obj.countTriple("a"));
	}
}