import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
  public static void main(String[] args) {
    Pattern pattern = Pattern.compile("TikaramMahto", Pattern.CASE_INSENSITIVE);
    Matcher matcher = Pattern.matcher("Hi Tikaram!");
    boolean matchFound = matcher.find();
    if (matchFound) {
      System.out.println("Match found");
    }else {
      System.out.println("Match not found");
    }
  }
}