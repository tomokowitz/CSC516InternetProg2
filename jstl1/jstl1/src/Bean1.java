import java.util.ArrayList;

public class Bean1 
{
  private static int index = -1;
  private ArrayList fileNames;
  private String favorite="Unknown";
  
  // bean must have a no argument constructor
  // so a tool can create a bean just knowing 
  // the class name
  public Bean1()
  {
    initFileList();
  }
  
  // bean properties accessed via getter and setter methods
  // these methods are named starting with either get or set
  // followed by the property name with each word
  // capitalized
  // getter methods have no arguments and return a value
  // readable properties have get methods
  public String getFavorite()
  {
    if (favorite.equalsIgnoreCase("Cat"))
      return "The cat was worshipped by ancient " +
            "Egyptians";
    else if (favorite.equalsIgnoreCase("Dog"))
      return "The dog is a loyal companion";
    else
      return "Interesting choice"; 
  }
  
  public String getFileName()
  {
    index++;
    return (String) fileNames.get(index % fileNames.size());
  }
  
  public int getCount()
  {
    return index;
  }
  
  // setter methods return void and
  // take a single argument of the
  // property's type
  // writeable properties have get methods
  public void setFavorite(String favorite)
  {
    this.favorite = favorite;
  }
  
  private void initFileList()
  {
    fileNames = new ArrayList();
    fileNames.add("cat.jpg");
    fileNames.add("dog.jpg");
    fileNames.add("pig.jpg");
  }
}