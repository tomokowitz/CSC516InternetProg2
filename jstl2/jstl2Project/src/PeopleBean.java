
import java.util.ArrayList;

public class PeopleBean 
{
  ArrayList users = new ArrayList();
  public PeopleBean()
  {
  }
  
  public int getUserCount()
  {
    return users.size();
  }
  
  public ArrayList getAll()
  {
    return users;
  }
  
  public void setPerson(PersonInfo p)
  {
    users.add(p);
  }
}