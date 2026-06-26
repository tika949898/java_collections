class Animal {
  public void animalSound() {
    System.out.println("The animal makes sound!");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee!");
}
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class Main {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();  // create animal object
    Animal myPig = new Pig(); //pig object
    Animal myDog = new Dog(); // dog object
  myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}