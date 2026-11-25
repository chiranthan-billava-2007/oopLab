import java.util.Scanner;

public class StringHandling{

   private static void print(Object obj){
      System.out.print(obj);
      
   }
   
   private static void println(Object obj){
      System.out.println(obj);
   
   }
   
   
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

        print("Enter your email address: ");
        String email = sc.nextLine();

        
        println("\nLength: " + email.length());

        
        int at = email.indexOf('@');
        
        String username = email.substring(0, at);
        println("Username: " + username);

       
        String domain = email.substring(at + 1);
        println("Domain: " + domain);

        if (domain.equalsIgnoreCase("bmsce.ac.in"))
            println("Valid domain!");
        else
            println("Invalid domain!");

        
        String lower = email.toLowerCase();
        println("Lowercase: " + lower);

        
        print("\nEnter prefix: ");
        String prefix = sc.nextLine();

        if (email.startsWith(prefix))
            println("Starts with the valid prefix");
        else
            println("Does not start with the valid prefix");

        // 6. Check suffix
        if (email.toLowerCase().endsWith("bmsce.ac.in"))
            println("Ends with valid domain");
        else
            println("Does not ends with valid domain");

        
        String updated = email.replace(
            "bmsce.ac.in", "cse.bmsce.ac.in"
        );
        println("Replaced email: " + updated);

        
        print("\nEnter sequence to search: ");
        String search = sc.nextLine();

        if (email.contains(search))
            println("Contains valid sequence");
        else
            println("Does not contain valid sequence");

               String trimmed = email.trim();
        println("Trimmed Email: " + trimmed);

        
        print("\nEnter another email: ");
        String email2 = sc.nextLine();

        if (trimmed.equalsIgnoreCase(email2.trim()))
            println("Both email IDs are equal");
        else
            println("Both email IDs are not equal");

        sc.close();   
   }



}