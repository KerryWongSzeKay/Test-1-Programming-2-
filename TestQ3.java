public class TestQ3
{
   public static void main (String[]args)
   {
      String str1 = new String("Hello");
      System.out.println(str1);
      String str2 = new String("Hello");
      System.out.println(str2);
      

        if(str1.equals(str2))
            System.out.println("They are Equal!");
        else
            System.out.println("They are Not Equal!");
    }
}