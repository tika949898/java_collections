import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileByte {
  public static void main(String[] args) {
  // try-with resources
    try(FileInputStream inputObj = new FileInputStream("file.txt")) {
      int i;  //store each byte
      // Read one byte at a time until end of file (-1 means "no more data")
      while ((i = inputObj.read()) != -1) {
        // Convert the byte to a character and print it to the console
        System.out.print((char) i);
      }
    }
    catch (IOException e) {
      System.out.println("Error reading file.");
    }
  }
}