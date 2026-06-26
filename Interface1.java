interface FirstInterface {
  public void myMethod();  // interface method
}

interface SecondInterface {
  public void otherMethod(); // other interface method
}

class Tika implements FirstInterface, SecondInterface {
  public void myMethod() {
    System.out.println("This is my first interface method");
  }
  public void otherMethod() {
    System.out.println("This is my name and I am learning java");
  }
}

public class  Interface1 {
  public static void main(String[] args) {
    Tika myObj = new Tika();
    myObj.myMethod();
    myObj.otherMethod();

  }
}