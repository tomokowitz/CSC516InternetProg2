
import java.util.ArrayList;
import java.io.*;

public class ReadFileBean 
{
  BufferedReader in;
  
  public ReadFileBean()
  {
  }
  
  public void setFile(String fileName)
  {
    try
    {
      in = new BufferedReader(new FileReader(fileName));
    }
    catch (Exception e)
    {
    }
  }
  
  public ArrayList getData()
  { 
    ArrayList temp = new ArrayList();
    try
    {
      while (true)
      {
        String s = in.readLine();
        if (s == null) break;
        temp.add(s);
      }
      in.close();
    }
    catch (Exception e)
    {
    }
    return temp;
  }
}