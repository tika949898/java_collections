import java.util.Scanner;

class UserInput1 {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter your name, age and salary:");
    // string input
    String name = myObj.nextLine();
    // integer value
    int age = myObj.nextInt();
    // Double value
    double salary = myObj.nextDouble();

    System.out.println("name:" + name);
    System.out.println("age:" + age);
    System.out.println("salary: " + salary);
  }
}