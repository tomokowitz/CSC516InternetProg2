package strutsproject4;

public class SuggestionUtils 
{
  
  static String sectionStart = "E01";
  
  public static SuggestionBean getSuggestionBean() 
  {
    String course = "CIS" + randomDigits(3);
    String section = randomSectionStart() + randomDigits(1);
    return (new SuggestionBean(course, section));
  }

  public static String randomDigits(int count) 
  {
    String temp = "";
    for (int i = 0; i < count; i++) 
    {
        int digit = (int)(Math.random() * 10); 
        temp = temp + Integer.toString(digit);
    }
    return (temp); 
  }
  
  public static String randomSectionStart() 
  {
    int randomPosition = (int)(Math.random() * 3);
    return sectionStart.substring(randomPosition, randomPosition+1);
  }

}
