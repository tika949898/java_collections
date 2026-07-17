class Box<T> {
  T value; // t can store any kind of data
  void set(T value) {
    this.value = value;
  }
  T get(){
    return value;
  }
}

public class GenericInteger {
  public static void main(String[] args) {
    Box<Integer> number = new Box<>();
    number.set(001);
    System.out.println("Value: " + number.get());
  }
}