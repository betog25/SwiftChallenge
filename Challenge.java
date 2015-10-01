public class Challenge
{
	/**
	 * fizzBuzz
	 * 
	 * This function counts from 0 to 100 and calls printResult() to 
	 * print each number in succession. 
	 * 
	*/
	public void fizzBuzz()
	{
		for(int i = 0; i<= 100; i++)
		{
			System.out.println( printResult( i ) );
		}
	}
	
	/**
 	* printResult
 	* 
 	* Function that accepts an integer and returns "Fizz" every 
 	* time the integer is a multiple of 3, returns "Buzz"
	* every time the integer is a multiple of 5, and returns 
	* the number otherwise.
 	*
 	* @param num The integer being evaluated
 	* @return string to print
 	*/
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
