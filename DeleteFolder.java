import java.io.File;

public class DeleteFolder {
  public static void main(String[] args) {
    File myObj = new File("test.txt");
    if (myObj.delete()) {
      System.out.println("File deleted " + myObj.getName());
    }else{
      System.out.println("File can not be deleted.");
    }
  }
}