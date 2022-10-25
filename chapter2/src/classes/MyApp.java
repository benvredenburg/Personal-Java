package classes;

public class MyApp {
    public static void main(String[] args) {
        AnotherClass an = new AnotherClass();
        for(String s: args) {
            an.display(s);
        }
    }
}
