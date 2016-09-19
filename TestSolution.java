class Solution
{
	public boolean containE(String str)
	{
		int count=0;
		for(int i=0;i<=str.length()-1;i++)
			if(str.charAt(i)=='e')
				count++;
		return(count>=1 && count<=3);
	}
}

class TestSolution
{
	public static void main(String args[])
	{
		Solution obj = new Solution();

		System.out.println(obj.containE("hello"));
		System.out.println(obj.containE("helloeee"));
		System.out.println(obj.containE("world"));

	}
}