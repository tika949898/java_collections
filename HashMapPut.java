import java.util.HashMap;

public class HashMapPut {
  public static void main(String[] args) {
    HashMap<String, String> capitalStates = new HashMap<>();
    capitalStates.put("Jharkhand", "Ranchi");
    capitalStates.put("Bihar", "Patna");
    capitalStates.put("West Bengal", "Kolkata");
    capitalStates.put("odisha", "Bhubaneswar");
    capitalStates.put("Uttar Pardesh", "Lucknow");
    System.out.println(capitalStates);
  }
}