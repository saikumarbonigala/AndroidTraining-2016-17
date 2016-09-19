class Solution1
{
	public boolean sameLast(int a,int b)
	{
		return(a%10 == b%10);
	}

}

public class TestSolution1
{
	public static void main(String args[])
	{
		Solution1 obj = new Solution1();

		System.out.println(obj.sameLast(25,35));
		System.out.println(obj.sameLast(21,39));
	}
}