class CalculateLeapYears
{
	public int countLeapYear(int start,int end)
	{
		int count=0;
		for(int i=start;i<=end;i++)
			if((i%4 == 0 && i%100 != 0) || i%400 == 0)
				count++;
		return count;
	}
}

class LeapYears
{
	public static void main(String args[])
	{
		CalculateLeapYears obj = new CalculateLeapYears();

		System.out.println(obj.countLeapYear(2000,2016));
	}
}