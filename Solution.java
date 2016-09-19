import java.util.*;

class Embed
{
	public String embedWord(String embed,String str)
	{
		int len=embed.length();
		String sb=embed.substring(0,len/2)+str+embed.substring(len/2);
		return sb;
	}
}

class Solution
{
	public static void main(String args[])
	{
		Embed obj = new Embed();

		System.out.println(obj.embedWord("<<>>", "Hello"));
		System.out.println(obj.embedWord("<>", "HTML"));
		System.out.println(obj.embedWord("[]", "1,2,3,4,5"));
		System.out.println(obj.embedWord("{[]}", "a:1, b:2, c:3"));
	}
}