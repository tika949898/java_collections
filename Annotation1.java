class Animal {
  void makeSound() {
    System.out.println("Animal Sound");
  }
}

class Dog extends Animal {
  @Override
  void makeSound() {
    System.out.println("Bow bow!");
  }
}

public class Annotation1 {
  public static void main(String[] args) {
    Animal myDog = new Dog();
    myDog.makeSound();
  }
}