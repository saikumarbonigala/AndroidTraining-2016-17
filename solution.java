import java.util.*;

class Tags
{
	public String makeTags(String tag,String text)
	{
		String tagBefore="<"+tag+">";
		String tagAfter="</"+tag+">";
		String taggedString=tagBefore+text+tagAfter;
		return taggedString;
	}
}

class Solution
{
	public static void main(String args[])
	{
		Tags obj = new Tags();

		System.out.println(obj.makeTags("i", "Hello"));
		System.out.println(obj.makeTags("h1", "Android"));
	}
}