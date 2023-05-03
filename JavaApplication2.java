
package javaapplication2;
import java.util.Scanner;

/**
 *
 * @author BONBON
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        
    
       Scanner input=new Scanner(System.in);
       String nm1="a";
       String nm2="e";
        String nm3="i";
         String nm4="o";
          String nm5="u";
         int j=3;
      int i=1;
      do{
      System.out.print("\nEnter a letter:"); 
      String name=input.nextLine();i++;    
     
      if(name.equals(nm1)){
          System.out.println("\nyour letter is a vowel"); 
      }
      else if (name.equals(nm2)){ System.out.println("\nyour letter is a vowel"); 
      }
            if(name.equals(nm1)){

          System.out.println("\nyour letter is a vowel"); 
      }
      else if (name.equals(nm2)){ System.out.println("\nyour letter is a vowel"); 
      }
      else if (name.equals(nm3)){ System.out.println("\nyour letter is a vowel"); 
      }
      else if (name.equals(nm4)){ System.out.println("\nyour letter is a vowel"); 
      }
      else if (name.equals(nm5)){ System.out.println("\nyour letter is a vowel"); 
      } 
      else{
          System.out.println("\nyour letter is consonant");}
      
      }while(i<=j);
    
   
    }   
}
        
  
