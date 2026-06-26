abstract class Abstract {
  public String fName = "Tikaram";
  public int age = 24;

  public abstract void study();
}

class Student extends Abstract {
  public int graduationYear = 2018;

  public void study() {
    System.out.println("Hi I am studying whole day!");
  }
}

public class Main {
  public static void main(String[] args) {

    Student obj = new Student();

    System.out.println("Name: " + obj.fName);
    System.out.println("Age: " + obj.age);
    System.out.println("Graduation Year: " + obj.graduationYear);

    obj.study();
  }
}