class CheckRange
{
	public boolean inRange(int a,int b)
	{
		return ((a>= 10 && a<=20) || (b>=10 && b<=20));
	}
}

class TestRange
{
	public static void main(String args[])
	{
		CheckRange obj = new CheckRange();

		System.out.println(obj.inRange(20,19));
		System.out.println(obj.inRange(30,100));
	}
}