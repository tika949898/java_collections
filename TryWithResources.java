import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResources {
  public static void main(String[] args) {
    // resource is opened inside try()
    try (FileOutputStream output = new FileOutputStream("filename.txt")) {
      output.write("Hi I am Tika".getBytes());
      // no need to call close() here
      System.out.println("Finally I wrote the file");
    }
    catch (IOException e) {
      System.out.println("The file is error");
    }
  }
}