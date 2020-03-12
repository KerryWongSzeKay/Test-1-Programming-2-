import java.util.Scanner;
public class TestQ3
{
   public static void main (String[]args)
   {
      Scanner scan=new Scanner(System.in);
      System.out.print("Enter string 1 :");
      String str1 = scan.nextLine();
      System.out.print("Enter string 2 :");
      String str2 = scan.nextLine();

        if(str1.equals(str2))
            System.out.println("They are Equal!");
        else
            System.out.println("They are Not Equal!");
    }
}