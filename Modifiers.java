class Person {
  public String name = "Tikaram";
  private String add = "Chalkari";
}

public class Modifiers {
  public static void main(String[] args) {
    Person obj = new Person();
    System.out.println(obj.name);
    System.out.println(obj.add);  //private 
  }
}