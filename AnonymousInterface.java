interface Greet {
  public void sayHello();
}

public class AnonymousInterface {
  public static void main(String[] args) {

    // 
    Greet obj = new Greet() {
      public void sayHello() {
        System.out.println("Hi EveryOne, I am Learning java!");
      }
    };

    obj.sayHello();
  }
}