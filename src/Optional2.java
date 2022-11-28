import java.util.Scanner;

public class Optional2 {
    public static void main(String[] args) {
        int x = 40;
        String str = String.valueOf(x);
        if (str.length() <= 4) {
            System.out.println("Numarul are minim 4 cifre");
        } else {
            System.out.println("Numarul are mai mult de 4 cifre");
        }

        if (str.length() == 6) {
            System.out.println("Numarul are exact 6 cifre");
        } else {
            System.out.println("Numarul nu are 6 cifre");
        }

        if (x % 2 == 0) {
            System.out.println("Numarul este par");
        } else {
            System.out.println("Numarul este impar");
        }

        int y = 60;
        int z = 90;
        if (x > y && x > z) {
            System.out.println("Cel mai mare numar este " + x);
        } else if (y > x && y > z) {
            System.out.println("Cel mai mare numar este " + y);
        } else {
            System.out.println("Cel mai mare numar este " + z);
        }

        if (x + y + z == 180) {
            System.out.println("Triunghi valid");
        } else {
            System.out.println("Triunghi invalid");
        }

        String cuv = "Coral is either the stupidest animal or the smartest rock";
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti un numar");
        int nr = input.nextInt();
        System.out.println(cuv.substring(0, cuv.length() - nr));
        String cuvnou = cuv.substring(0, 6) + cuv.substring(cuv.length() - 5, cuv.length());
        System.out.println(cuvnou);
        int ind = cuv.indexOf("rock");
        System.out.println(cuv.substring(0, ind));
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti stringul");
        String prop = sc.next();
        if (prop.substring(0, 1).toUpperCase().equals(prop.substring(prop.length() - 1, prop.length()).toUpperCase())) {
            System.out.println("Primul si ultimul caracter sunt la fel");
        } else {
            System.out.println("Caracterele nu sunt la fel");
        }

        String sir = "0123456789";
        String par = "";
        String impar = "";

        for(int i = 0; i < sir.length(); ++i) {
            if (Integer.valueOf(sir.substring(i, i + 1)) % 2 == 0) {
                par = par + i;
            } else {
                impar = impar + i;
            }
        }

        System.out.println(par);
        System.out.println(impar);
    }
}
