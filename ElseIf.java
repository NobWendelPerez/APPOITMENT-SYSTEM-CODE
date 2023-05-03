import java.util.Scanner
public class user pass {

      public static void main(String[]args){
         Scanner input = new Scanner (System.in);

         String user pass;

         System.out.println("Enter your name");
         user = input.nextLine();

         System.out.print("Enter your password");
         pass = input.nextLine();
 
         if (user.equals("nob") && (pass
      equals("perez"))){
                 System.out.println("Welcome nob have a nice day");
                }else{
                  System.out.println("im sorry you have incorrect username and password");

  
          }

       }
    }