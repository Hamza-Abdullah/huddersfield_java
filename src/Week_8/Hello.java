package Week_8;
public class Hello {
    private Hello() {
        sayHello();
    }

    private void sayHello() {
        System.out.println("Hello world");
    }

    public static void main (String args[]) {
        new Hello();
    }
}