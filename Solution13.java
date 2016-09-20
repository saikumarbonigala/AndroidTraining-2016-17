import java.util.*;


class Spaced
{
	public boolean evenlySpaced(int a,int b,int c)
	{
		return(Math.abs(a-b)%2==0 && Math.abs(b-c)%2==0);
	}
}

class Solution13
{
	public static void main(String args[])
	{
		Spaced obj = new Spaced();

		System.out.println(obj.evenlySpaced(2,4,6));
		System.out.println(obj.evenlySpaced(4,6,2));
		System.out.println(obj.evenlySpaced(4,6,3));
	}
}