public class ElseIf {
    public static void main(String[] args) {
        int age = 5;
        if (age > 18) {
            System.out.println("The person is over age.");
        } else if (age == 18) {
            System.out.println("The person is under age.");
        }else if(age < 10) {
            System.out.println("He is a very young boy!");
        }else {
            System.out.println("He is a kid!");
        }
    }
}