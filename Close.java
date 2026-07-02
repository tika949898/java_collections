import java.io.FileOutputStream;
import java.io.IOException;

public class Close {
  public static void main(String[] args) {
    try {
      FileOutputStream output = new FileOutputStream("filename.txt");
      output.write("Hello I am Tikaram!".getBytes());
      output.close();  // must close manually
      System.out.println("Successfuly wrote the file");
    }
    catch (IOException e) {
      System.out.println("Error writing file.");
    }
  }
}