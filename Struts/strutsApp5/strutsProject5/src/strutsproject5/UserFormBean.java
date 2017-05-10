package strutsproject5;

import org.apache.struts.action.*;

public class UserFormBean extends ActionForm 
{
  private String course = "Missing course";
  private String section = "Missing section";

  public String getCourse() 
  {
    return course;
  }

  public void setCourse(String course) 
  {
    if (! course.equals(""))
        this.course = course;
  }

  public String getSection() 
  {
    return section;
  }

  public void setSection(String section) 
  {
    if (! section.equals(""))
        this.section = section;
  }
  
}
