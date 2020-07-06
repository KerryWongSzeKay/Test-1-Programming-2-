public class Cat extends Animal{
   private String a;

   public Cat (String name)
   {
      a=name;
   }
   public void introduceYourself()
   {
      System.out.println("Meow. I am a cat. My name is " +a+".");
   }
}
