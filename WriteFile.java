import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
  public static void main(String[] args) {
    try {
      FileWriter myWrite = new FileWriter("file.txt");
      myWrite.write("Hi everyOne! I am learning java now.");
      myWrite.close();
      System.out.println("The file has been created.");
    }
    catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}