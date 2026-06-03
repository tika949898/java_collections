/*
public class Student {
    String name; //instance variable
    int age; // instance variable

    public void show() {
        System.out.println(name + " is " + age + " years of age.");
    }
}
*/

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Tikaram";
        s1.age = 26;

        Student s2 = new Student();
        s2.name = "Geeta";
s2.age = 23;

        s1.show();
s2.show();
    }
}