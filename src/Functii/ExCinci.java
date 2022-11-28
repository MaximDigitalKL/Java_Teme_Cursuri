package Functii;

public class ExCinci {
    public static double CelMaiMare(double a, double b, double c) {
        double mare = 0.0;
        if (a > b && a > c) {
            mare = a;
        } else if (b > a && b > c) {
            mare = b;
        } else {
            mare = c;
        }

        return mare;
    }

    public static void main(String[] args) {
        System.out.println("Cel mai mare nr este: " + CelMaiMare(6.0, 5.0, 4.0));
        System.out.println("Cel mai mare nr este: " + CelMaiMare(5.0, 6.1, 4.0));
        System.out.println("Cel mai mare nr este: " + CelMaiMare(5.0, 4.0, 6.2));
        System.out.println("Cel mai mare nr este: " + CelMaiMare(1.0, 1.0, 2.1));
        System.out.println("Cel mai mare nr este: " + CelMaiMare(1.0, 2.2, 1.0));
        System.out.println("Cel mai mare nr este: " + CelMaiMare(2.3, 1.0, 1.0));
        System.out.println("Cel mai mare nr este: " + CelMaiMare(10.0, 10.0, 10.0));
    }
}
