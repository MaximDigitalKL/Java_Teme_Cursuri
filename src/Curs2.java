import java.util.Scanner;

public class Curs2 {
    public static void main(String[] args) {
        int x = 4;
        if (x >= 0) {
            System.out.println("" + x + " Este numar natural");
        } else {
            System.out.println("" + x + " Nu este numar natural");
        }

        if (x > 0) {
            System.out.println("" + x + " Este numar pozitiv");
        } else if (x < 0) {
            System.out.println("" + x + " Este numar negativ");
        } else {
            System.out.println("" + x + " Este numar neutru");
        }

        if (x > -2 && x < 13) {
            System.out.println("" + x + " Se afla in intervalul -2 <-> 13");
        } else {
            System.out.println("" + x + " Nu se afla in intervalul -2 <-> 13");
        }

        int y = 3;
        if (x - y < 5) {
            System.out.println("Diferenta dintre x si y este mai mica decat 5");
        } else {
            System.out.println("Diferenta dintre x si y nu este mai mica decat 5");
        }

        if (x > 5 && x < 27) {
            System.out.println("" + x + " Se afla in intervalul 5 <-> 27");
        } else {
            System.out.println("" + x + " Nu se afla in intervalul 5 <-> 27");
        }

        if (x == y) {
            System.out.println("Cele doua numere sunt egale");
        } else if (x > y) {
            System.out.println("" + x + " Este mai mare ca " + y);
        } else {
            System.out.println("" + y + " Este mai mare ca " + x);
        }

        int a = 50;
        int b = 60;
        int c = 40;
        if (a == b && b == c) {
            System.out.println("Este un triunghi echilateral");
        } else if (a != b && b != c) {
            System.out.println("Triunghi oarecare");
        } else {
            System.out.println("Este un triunghi isoscel");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti o litera");
        String lit = input.next();
        if (!lit.equals("a") && !lit.equals("e") && !lit.equals("i") && !lit.equals("o") && !lit.equals("u")) {
            System.out.println("Litera introdusa nu este vocala");
        } else {
            System.out.println("Litera introdusa este vocala");
        }

        int nota = 8;
        if (nota > 9) {
            System.out.println("Ati luat nota A");
        } else if (nota > 8) {
            System.out.println("Ati luat nota B");
        } else if (nota > 7) {
            System.out.println("Ati luat nota C");
        } else if (nota > 6) {
            System.out.println("Ati luat nota D");
        } else if (nota > 4) {
            System.out.println("Ati luat nota E");
        } else {
            System.out.println("Ati luat nota F");
        }

    }
}
