import java.util.HashMap;

public class HashMap1 {
  public static void main(String[] args) {
    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    // Add keys and values (Country, City)
    capitalCities.put("India", "New Delhi");
    capitalCities.put("Jharkhand", "Ranchi");
    capitalCities.put("Bihar", "Patna");
    capitalCities.put("New delhi", "New Delhi");
    System.out.println(capitalCities);
  }
}