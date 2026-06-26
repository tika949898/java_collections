class Vehicle {
  protected String brand = "Ford";  //vehicle attribute

  //vehicle method
  public void honk() {
    System.out.println("Tuut, tuut!");
  }
}

class Car extends Vehicle{
  private String modelName = "Mustang"; // car attributes
  public static void main(String[] args) {
  // create car object
  Car myCar = new Car();
  
  // call the honk from the vehicle class on carr object
  myCar.honk();
  System.out.println(myCar.brand + " " + myCar.modelName);
  }
}