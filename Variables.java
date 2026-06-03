public class Variables {
    public void variablesLocal() {
        String name = "Tikaram";
        int age = 26;
        System.out.println(name + " is "+ age + "years of age.");
    }

    public static void main(String[] args)  {
        Variables v = new Variables();
        v.variablesLocal();
    }
}
