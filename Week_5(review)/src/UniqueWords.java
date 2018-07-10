import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Iterator;

public class UniqueWords
{
    private static final String FILE_NAME = "GettysburgAddress.txt";
    private static final int WORDS_PER_LINE = 8;
    
    public static void main(String args[])
    {
        Scanner in = null;
        TreeSet<String>bt = new TreeSet<String>();
        
        try {
            in = new Scanner(new File(FILE_NAME));
            while(in.hasNext())
            {
               String lowerCase = (in.next()).toLowerCase();
               String newLowerCase = "";
               String newLowerCase2 = "";
            
               if(lowerCase.contains("-"))//will split a string joined "--" into two strings
               {
                     newLowerCase = lowerCase.substring(0,lowerCase.indexOf("-"));
                     newLowerCase2 = lowerCase.substring(lowerCase.lastIndexOf("-") + 1,lowerCase.length());
                     bt.add(newLowerCase2);//add second part of the String to the tree
                  }
                  
                  else if(lowerCase.contains(","))//will remove , from the end of the String
                  {
                     newLowerCase = lowerCase.substring(0,lowerCase.indexOf(","));
                  }
                  
                  else if(lowerCase.contains("."))//will remove . from the end of the string
                  {
                      newLowerCase = lowerCase.substring(0,lowerCase.indexOf("."));
                  }
                  else
                  {
                     newLowerCase = lowerCase;
                  }
               
               
               bt.add(newLowerCase); // add new string to the tree
            }
            
            Iterator<String>it = bt.iterator();
            while(it.hasNext()) // print the elements of the tree inOrder
            {
               for(int i = 0 ; i < WORDS_PER_LINE;i++)
               {
                  if(it.hasNext())
                  {
                    System.out.print(it.next() + " ");
                  }
               }
               System.out.println();
            }
          
            
            
            
            
        }
        catch (FileNotFoundException ex) {
            System.out.println("*** File not found: " + FILE_NAME);
        }
        finally {
            if (in != null) in.close();
        }
    }
}