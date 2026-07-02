import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormat {
  public static void main(String[] args) {
    LocalDateTime dateObj = LocalDateTime.now();
    System.out.println(dateObj);
    DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");

    String myFormat = dateObj.format(formatObj);
    System.out.println(myFormat);
  }
}