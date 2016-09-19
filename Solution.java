import java.util.*;

class DeleteChar
{
	public String missingChar(String str,int index)
	{
		StringBuffer sb = new StringBuffer(str);

		return(sb.deleteCharAt(index).toString());
	}
}


class Solution
{
	public static void main(String args[])
	{
		DeleteChar obj = new DeleteChar();

		System.out.println(obj.missingChar("Java", 1));
		System.out.println(obj.missingChar("Android", 0));
	}
}