public class TestMe 
{
  //adds two integers and returns the result
  public static int add(int a, int b) 
  {
    return a + b;
  } //end add
  
  //subtracts two integers and returns the result
  public static int subtract(int a, int b) 
  {
    return a - b;
  } //end subtract

  //multiplies two integers and returns the result
  public static int multiply(int a, int b) 
  {
    return a * b;
  } //end multiply

  //divides two doubles and returns the result
  public static double divide(double a, double b) 
  {
    return a / b;
  } //end divide

  //determines whether the input is even and returns true or false
  public static boolean isEven(int a) 
  {
    if ( (a % 2) == 0)
    {
      return true;
    }
    else 
    {
      return false;
    }
  } //end isEven
}
