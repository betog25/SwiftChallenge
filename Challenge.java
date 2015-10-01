public class Challenge
{
	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	*/
	 
	public void fizzBuzz()
	{
		for(int i = 0; i<= 100; i++)
		{
			System.out.println( printResult( i ) );
		}
	}
	
	public String printResult( int num )
	{
		if( num %3 == 0 && num %5 == 0 && num != 0)
		{
			return "BuzzFizz";
		}
		else if( num %3 == 0 && num != 0)
		{
			return "Buzz";
		}
		else if( num %5 == 0 && num != 0)
		{
			return "Fizz";
		}
		else
		{
			return String.valueOf( num );
		}
	}
}
