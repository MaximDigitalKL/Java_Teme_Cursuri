package Functii;

public class ExUnu {
    public static double AriaDreptunghi(double l, double L) {
        double Aria = l * L;
        return Aria;
    }

    public static void main(String[] args) {
        System.out.println("Aria dreptunghiului este: " + AriaDreptunghi(3.21, 14.2));
        System.out.println("Aria dreptunghiului este: " + AriaDreptunghi(15.0, 39.0));
        System.out.println("Aria dreptunghiului este: " + AriaDreptunghi(1.0, 2.0));
    }
}
