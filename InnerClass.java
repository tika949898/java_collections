class OuterClass {
  int x = 20;

  class Inner {
    int y = 30;
  }
}

public class InnerClass {
  public static void main(String[] args) {
    OuterClass outClass = new OuterClass();
    OuterClass.Inner myInner = outClass.new Inner();
    System.out.println(myInner.y + outClass.x);
  }
}