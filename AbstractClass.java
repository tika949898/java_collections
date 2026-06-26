// Abstract class

abstract class Animal {

  // Abstract method (does not have a body)
  public abstract void animalSound();


  // regular method
  public void sleep() {
    System.out.println("TikaTikaTika");
  }
}

// sub class (inherit from Animal)
class Dog extends Animal {
  public void animalSound() {
    // The body of animalSound() is provided here 
    System.out.println("The dog says: bow wow");
  }
}

public class AbstractClass {
  public static void main() {
    Dog myDog = new Dog();  // create dog object
    myDog.animalSound();
  myDog.sleep();
  }
}