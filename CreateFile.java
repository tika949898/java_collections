import java.io.File;
import java.io.IOException;

public class CreateFile {
  public static void main(String[] args) {
    try {
      File myObj = new File("fileTika.txt");
      if (myObj.createNewFile()) {
        System.out.println("File Created: " + myObj.getName());
      }
      else {
        System.out.println("File is already exist");
      }
    }
    catch (IOException e) {
      System.out.println("an  error occurred.");
      e.printStackTrace(); // Print error details
    }
  }
}