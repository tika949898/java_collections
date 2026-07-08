import java.util.HashSet;

public class HashSetLoop1 {
  public static void main(String[] args) {
    // Create a HashSet object called numbers
    HashSet<Integer> myNum = new HashSet<Integer>();

    // Add values to the set
    myNum.add(5);
    myNum.add(10);
    myNum.add(15);

    // Show which numbers between 1 and 10 are in the set
    for (int i = 1; i <= 20; i++) {
      if (myNum.contains(i)) {
        System.out.println(i + "The number has been found.");
      }else {
        System.out.println(i + "has been not found");
      }
    }
  }
}