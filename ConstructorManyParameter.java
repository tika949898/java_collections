public class ConstructorManyParameter {
  String name;
  int age;

  public ConstructorManyParameter(String x, int y) {
    name = x;
    age = y;
  }
    public static void main(String[] args) {
  ConstructorManyParameter obj = new ConstructorManyParameter("Tikaram", 25);
  System.out.println(obj.name+ " " + obj.age);
  }

}