public class Dog extends Animal{
   private String a;

   public Dog (String name)
   {
      a=name;
   }

   public void introduceYourself()
   {
      System.out.println("Woof. I am a dog. My name is "+a+".");
   }
}
