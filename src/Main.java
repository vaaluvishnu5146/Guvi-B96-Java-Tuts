import DrawingTools.Circle;

public class Main extends Circle {
    String className = "MAIN";

    public void printA() {
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.className);
        main.printA();
    }
}