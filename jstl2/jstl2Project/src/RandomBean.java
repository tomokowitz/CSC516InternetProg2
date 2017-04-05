

public class RandomBean 
{
  int minRange = 0;
  int maxRange = 0;
  
  public RandomBean()
  {
  }
  
  public void setMinRange(int x)
  {
    minRange = x;
  }
  
  public void setMaxRange(int x)
  {
    maxRange = x;
  }
  
  public int getRandom()
  {
    return (int)Math.floor(Math.random() * maxRange) + minRange ;
  }
}