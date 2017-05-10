package strutsproject5;

public class SuggestionBean 
{
  private String course;
  private String section;

  public SuggestionBean(String course, String section) 
  {
    this.course = course;
    this.section = section;
  }
  
  public String getCourse() 
  {
    return course;
  }

  public String getSection() 
  {
    return section;
  }
}
