import java.util.*;

class AddDigits
{
	public int sumDigits(String str)
	{
		int sum=0;
		char c;
		for(int i=0;i<str.length();i++)
		{
			c=str.charAt(i);
			if(Character.isDigit(c))
				sum=sum+Integer.parseInt(String.valueOf(c));
		}
		return sum;
	}
}


class Solution
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		AddDigits obj = new AddDigits();
		System.out.println(obj.sumDigits("aa1bc2d3"));
		System.out.println(obj.sumDigits("aa11b33"));
		System.out.println(obj.sumDigits("nodigits"));
	}
}