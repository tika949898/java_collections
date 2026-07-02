import java.io.FileWriter;
import java.io.IOException;

public class WriteTryWithResources {
  public static void main(String[] args) {
    // FileWriter will be closed automatically here
    try (FileWriter writeObj = new FileWriter("tika.txt")) {
      writeObj.write("I love you Krishna");
      System.out.println("The file created successfuly");
    }
    catch (IOException e) {
      System.out.println("An error occurred");
      e.printStackTrace();
    }
  }
}