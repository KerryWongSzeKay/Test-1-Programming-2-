public class Dog extends Animal {
   
    private String name;
    
    public Dog(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public Dog (int age){
        this.age = age;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void introduceYourself(){
        System.out.println("Woof. I am a Dog. My name is " + this.getName());
        System.out.println("and I am " + this.age + " years old.");
    }
}
