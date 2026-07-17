class Box<T> {
  T value; // T is a placeholder for any data type

  void set(T value) {
    this.value = value;
  }
  T get(){
    return value;
  }
}

public class GenericString {
  public static void main(String[] args) {
    Box<String> stringBox = new Box<>();
    stringBox.set("Hello Tika!");
    System.out.println("Value: " + stringBox.get());
  }
}