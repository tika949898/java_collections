public class ArraysAge {
  public static void main(String[] args) {
// An array storing different ages
    int[] ages = {20, 32, 54,45,24,100};
    float avg, sum = 0;
// Get the length of the array
    int length = ages.length;
// Loop through the elements of the array
    for (int age : ages) {
      sum += age;
    }
    // Calculate the average by dividing the sum by the length
    avg = sum / length;
// Print the average
    System.out.println("The average age is:" + avg);
  }
}