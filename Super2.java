class Animal {
  // create constructer
  Animal() {
    System.out.println("Animal is created");
  }
}

class Dog extends Animal {
  Dog() {
    super(); // call parent constructer
    System.out.println("Dog is created");
  }
}

public class Super2 {
  public static void main(String[] args) {
    Dog myDog = new Dog();
  }
}