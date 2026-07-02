import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {
  public static void main(String[] args) {
    try (FileWriter appendObj = new FileWriter("tika.txt", true)) {
      appendObj.write("\nKrishna, I love you");
      System.out.println("Append file has been created");
    }
    catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }  
}