public class Logical {
public static void main(String[] args) {
        boolean isLoggedIn = true;
        boolean isAdmin = false;
        System.out.println("User:" + (isLoggedIn && !isAdmin));
        System.out.println("Has access:" + (isLoggedIn || isAdmin));
        System.out.println("Not loggedIn:" + (!isLoggedIn));
}
}