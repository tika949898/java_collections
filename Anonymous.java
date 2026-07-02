class Animal {
  public void makeSound() {
    System.out.println("Animal sound");
  }
}

public class Anonymous {
  public static void main(String[] args) {

        // Anonymous class that overrides makeSound()
    Animal obj = new Animal() {
      public void makeSound() {
        System.out.print("Bow wow!");
      }
    };
    obj.makeSound();

  }
}