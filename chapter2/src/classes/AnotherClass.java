package classes;

public class AnotherClass {
    private int result;
    public void display(String s) {
        System.out.println(s);
    }
    public int process(int i) {
        result = i *2;
        return result;
    }
    public int getResult() {
        return result;
    }
}
