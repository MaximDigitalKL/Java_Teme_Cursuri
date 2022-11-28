import java.util.*;

public class Curs5 {
    public static void suma(double a, double b) {
        double s = a + b;
        System.out.println("Suma celor doua numere este: " + s);
    }

    public static void par(int a) {
        boolean este = false;
        if (a % 2 == 0) {
            este = true;
        }

        System.out.println(este);
    }

    public static void numarcaractere(String nume, String prenume) {
        System.out.println("Numarul total de caractere al numelui tau este " + (nume.length() + prenume.length()));
    }

    public static double arieDreptunghi() {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti lungimea dreptunghiului");
        double lungime = (double)input.nextInt();
        System.out.println("Introduceti latimea dreptunghiului");
        double latime = (double)input.nextInt();
        double aria = lungime * latime;
        return aria;
    }

    public static void airaCercului(double raza) {
        double pi = 3.14;
        double aria = pi * raza * raza;
        System.out.println("Aria Cercurului este: " + aria);
    }

    public static boolean exista() {
        boolean exista = false;
        String propozitia = "Cel mai tare din parcare";
        Scanner input = new Scanner(System.in);
        System.out.println("Ghiceste litera: ");
        String x = input.next();

        for(int i = 0; i < propozitia.length(); ++i) {
            if (x.equals(propozitia.substring(i, i + 1))) {
                exista = true;
                break;
            }
        }

        return exista;
    }

    public static void micisimari(String prop) {
        int mici = 0;
        int mari = 0;

        for(int i = 0; i < prop.length(); ++i) {
            if (prop.substring(i, i + 1).equals(prop.substring(i, i + 1).toUpperCase())) {
                ++mari;
            } else {
                ++mici;
            }
        }

        System.out.println("Numarul de caractere lower case este: " + mici);
        System.out.println("Numarul de caractere upper case este: " + mici);
    }

    public static void pozitive() {
        Integer[] l1 = new Integer[]{1, 2, 5, -4, -6, -7, 4, 6, 7};
        Integer[] pozitive = new Integer[0];
        List<Integer> poz = new ArrayList(Arrays.asList(pozitive));

        for(int i = 0; i < l1.length; ++i) {
            if (l1[i] >= 0) {
                poz.add(l1[i]);
            }
        }

        System.out.println(poz);
    }

    public static void xsauy(int x, int y) {
        if (x > y) {
            System.out.println("Primul număr " + x + " este mai mare decat al doilea nr " + y);
        } else {
            System.out.println("Al doilea nr " + y + " este mai mare decat primul număr " + x);
        }

    }

    public static void inset(int nr) {
        Scanner input = new Scanner(System.in);
        System.out.println("Alege un numar ");
        nr = input.nextInt();
        boolean poate = true;
        Set<Integer> setnr = new HashSet();
        setnr.add(7);
        setnr.add(3);
        setnr.add(8);
        setnr.add(2);
        if (setnr.contains(nr)) {
            poate = false;
            System.out.println("Nu am adaugar numarul in set. Acesta exista deja.  " + poate);
        } else {
            setnr.add(nr);
            System.out.println("Am adaugat numărul nou în set. " + poate);
        }

    }

    public static void main(String[] args) {
        suma(12.0, 4.0);
        par(4);
        numarcaractere("Maxim", "Razvan");
        System.out.println("Aria dreptunghiului este: " + arieDreptunghi() + " cm");
        airaCercului(6.0);
        System.out.println("Ai ghicit ? " + exista());
        micisimari("aasdQWER");
        pozitive();
        xsauy(5, 8);
        inset(2);
    }
}
