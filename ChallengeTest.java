import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ChallengeTest
{

  // sut:  system under test
  private Challenge sut = new Challenge();
  
  @Test
  public void testPrintResult()
  {
    assertEquals("Buzz", sut.printResult(3));
    
    assertEquals("Fizz", sut.printResult(5));
    
    assertEquals("BuzzFizz", sut.printResult(60));
    
    assertEquals("11", sut.printResult(11));
    
    assertEquals("Fizz"), sut.printResult(65));
    
    assertEquals("BuzzFizz", sut.printResult(15));
    
    assertEquals("0", sut.printResult(0));
    
    assertEquals("Fizz", sut.printResult(100));
    
    assertEquals("76", sut.printResult(76));
     
    assertEquals("Buzz", sut.printResult(12));
  
  }
}
