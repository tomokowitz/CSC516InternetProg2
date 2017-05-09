package dwrproject2;

import java.util.ArrayList;

public class ex2 
{

    ArrayList names = new ArrayList();
    boolean loaded = false;

    private void loadNames() 
    {
        names.add("Anna");
        names.add("Brittany");
        names.add("Cinderella");
        names.add("Diana");
        names.add("Eva");
        names.add("Fiona");
        names.add("Genya");
        names.add("Helen");
        names.add("Irene");
        names.add("Johanna");
        names.add("Kitty");
        names.add("Linda");
        names.add("Nina");
        names.add("Ophelia");
        names.add("Petunia");
        names.add("Amanda");
        names.add("Raquel");
        names.add("Cindy");
        names.add("Doris");
        names.add("Eve");
        names.add("Evita");
        names.add("Susan");
        names.add("Toni");
        names.add("Uma");
        names.add("Violet");
        names.add("Liza");
        names.add("Elizabeth");
        names.add("Ellen");
        names.add("Wendy");
        names.add("Vicky");       
    }
    
    public String getPossibleNames(String name) 
    {
        if (! loaded)
        {
            loadNames();
            loaded = true;
        }
        String hint = "";
        // lookup all hints from names if q.length() >0
        int qlength = name.length();
        if (qlength > 0)
        {
            for (int i = 0; i < names.size(); i++)
            {
                String temp = (String)names.get(i);
                if (qlength <= temp.length() && 
                    name.equalsIgnoreCase(temp.substring(0,qlength)))
                {
                    if (hint.equals("")) 
                        hint=temp;
                    else
                        hint=hint + " , " + temp;
                }
            }
         }
        // Output "no suggestion" if no hint were found
                // or output the correct values
        if (hint.equals("")) 
            return ("no suggestion");
        else
            return (hint); 
    }
}
