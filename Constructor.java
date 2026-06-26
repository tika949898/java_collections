public class Constructor {
  String name; // varible attribute
  public Constructor() {
    name = "Tikaram";
  }
  public static void main(String[] args) {
    Constructor myName = new Constructor();
    System.out.println(myName.name);
  }
}