import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWrite {

public static void main(String[] args ) {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter("tika.txt"))) {
      bw.write("Hi this is first line.");
      bw.write("I am Tikaram writing second line.");
      System.out.println("Successfully writing the file.");
    }catch (IOException e) {
      System.out.println("File writing error.");
    }
  }
}