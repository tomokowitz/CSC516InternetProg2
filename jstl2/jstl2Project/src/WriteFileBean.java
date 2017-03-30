
import java.util.ArrayList;
import java.io.*;

public class WriteFileBean 
{
  PrintWriter out;
  
  public WriteFileBean()
  {
  }
  
  public void setFile(String fileName)
  {
    try
    {
      out = new PrintWriter(new BufferedWriter (new FileWriter(fileName, true)));
    }
    catch (Exception e)
    {
    }
  }
  
  public void setLine(PersonInfo p)
  { 
    String line = p.getName() + ":" +
                  p.getEmail() + ":" +
                  p.getPhone() + ":" +
                  p.getBet() + ":" +
                  p.getNumber();
    out.println(line);
    out.close();
  }
}