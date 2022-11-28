package Functii;

public class ExDoi {
    public static double AriaCeruclui(double r) {
        double PI = 3.14;
        double Aria = 3.14 * r * r;
        return Aria;
    }

    public static void main(String[] args) {
        System.out.println("Aria cercului este: " + AriaCeruclui(6.0));
        System.out.println("Aria cercului este: " + AriaCeruclui(3.1));
        System.out.println("Aria cercului este: " + AriaCeruclui(32.72));
    }
}
