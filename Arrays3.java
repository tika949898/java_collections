// And in this example, we create a program that finds the lowest age among different ages:

public class Arrays3 {
  public static void main(String[] args) {
// An array storing in different ages
    int[] age = {20, 30, 10, 40, 50};
// length of array
    int length = age.length;
// Create a 'lowest age' variable and assign the first array element of age to it
    int lowestAge = age[0];
// Loop through the elements of the ages array to find the lowest age
    for (int ages : age) {
      if (lowestAge > ages) {
        lowestAge = ages;
      }
    }
    System.out.println("The lowest of age in array:" + lowestAge);
  }
}