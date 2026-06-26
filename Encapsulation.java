public class Encapsulation {
  private String name; // restricted access

  //getter
  public String getName() {
    return name;
  }

  // setter
  public void setName(String newName) {
    this.name = newName;
  }

  public static void main(String[] args) {
    Encapsulation obj = new Encapsulation();
    obj.setName("Tikaram");
    System.out.println(obj.getName());
  }
}