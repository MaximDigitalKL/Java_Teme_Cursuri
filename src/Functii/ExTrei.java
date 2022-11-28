package Functii;

public class ExTrei {
    public static double sumaNR(double a, double b) {
        double suma = a + b;
        return suma;
    }

    public static void main(String[] args) {
        System.out.println("Suma numerelor este: " + sumaNR(15.0, 16.0));
        System.out.println("Suma numerelor este: " + sumaNR(1052.76, 1.0));
        System.out.println("Suma numerelor este: " + sumaNR(10265.98, 0.02));
    }
}
