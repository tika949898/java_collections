public class Car {
  // Create a fullThrottle() method
  public void fullThorttle() {
    System.out.println("Car is going very fast!");
  }
  // Create a speed() method and add a parameter
  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }

  public static void main(String[] args) {
    Car myCar = new Car();
    myCar.fullThorttle();
    myCar.speed(400);
}
}