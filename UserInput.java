import java.util.Scanner;

class UserInput {
  public static void main(String[] args) {
    Scanner userObj = new Scanner(System.in);  // create scanner object
    System.out.println("Enter your name:");
    String userName = userObj.nextLine(); // read the user name
    System.out.println("User name is:" + userName);
  }
}


