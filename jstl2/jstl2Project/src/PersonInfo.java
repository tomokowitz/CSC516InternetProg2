

public class PersonInfo 
{
  String name;
  String email;
  String phone;
  int bet;
  int number;
  
  public PersonInfo()
  {
  }
  
  public String getName()
  {
    return name;
  }
  
  public String getPhone()
  {
    return phone;
  }
  
  public String getEmail()
  {
    return email;
  }
  
  public int getBet()
  {
    return bet;
  }
  
  public int getNumber()
  {
    return number;
  }
  
  public void setName(String arg)
  {
    name = arg;
  }
  
  public void setPhone(String arg)
  {
    phone = arg;
  }
  
  public void setEmail(String arg)
  {
    email = arg;
  }
  
  public void setBet(int arg)
  {
    bet = arg;
  }
  
  public void setNumber(int arg)
  {
    number = arg;
  }
  
  public void setAll(String arg)
  {
    String[] temp = arg.split(":");
    name = temp[0];
    email = temp[1];
    phone = temp[2];
    bet = Integer.parseInt(temp[3]);
    number = Integer.parseInt(temp[4]);
  }
}