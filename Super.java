class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound!");
  }
}

class Dog extends Animal {
  public void animalSound() {
    super.animalSound();  // call the parent method
    System.out.println("The dog barks: bow wow!");
  }
}

public class Super {
  public static void main(String[] args) {
    Dog myDog = new Dog();
    myDog.animalSound();
  }
}