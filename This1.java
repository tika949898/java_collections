public class This1 {
  String name;
    int age;
// constructor of one parameter
public This1(int age){
    this("Tikaram", age);
  }

// constructor with two parameter
  public This1(String name, int age) {
    this.name = name;
    this.age = age;
  }

// information method
  public void info() {
    System.out.println(name + " " + age);
  }

  public static void main(String[] args) {
    This1 obj1 = new This1(20);
    This1 obj2 = new This1("Anju", 25);

  obj1.info();
    obj2.info();
  }
}