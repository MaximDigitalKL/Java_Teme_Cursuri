package Optional5;

import java.util.*;

public class Optional5T1 {
    public static void zileluna(String luna) {
        Set<String> cu31 = new HashSet(Arrays.asList("ianuarie", "martie", "mai", "iulie", "august", "octombrie", "decembrie"));
        Set<String> cu30 = new HashSet(Arrays.asList("aprilie", "iunie", "septembrie", "noiembrie"));
        if (cu31.contains(luna)) {
            System.out.println("Luna aleasa are 31 de zile");
        } else if (cu30.contains(luna)) {
            System.out.println("Luna aleasa are 30 de zile");
        } else {
            System.out.println("Luna aleasa are 28 de zile");
        }

    }

    public static void operatii(double a, double b) {
        double suma = a + b;
        double dif = a - b;
        double inm = a * b;
        double imp = a / b;
        System.out.println("Suma numerelor este: " + suma);
        System.out.println("Diferenta numerelor este: " + dif);
        System.out.println("Produsul numerelor este: " + inm);
        System.out.println("Impartirea numerelor este: " + imp);
    }

    public static void count() {
        Integer[] lista = new Integer[]{1, 3, 1, 5, 9, 7, 7, 5, 5};
        List<Integer> l1 = new ArrayList(Arrays.asList(lista));
        Map<Integer, Integer> numaratoare = new HashMap();

        for(int i = 0; i < lista.length; ++i) {
            int multe = Collections.frequency(l1, lista[i]);
            numaratoare.put(lista[i], multe);
        }

        System.out.println(numaratoare);
    }

    public static double comparatie(double a, double b, double c) {
        double cel_mai_mare = 0.0;
        if (a > b && a > c) {
            cel_mai_mare = a;
        } else if (b > a && b > c) {
            cel_mai_mare = b;
        } else {
            cel_mai_mare = c;
        }

        return cel_mai_mare;
    }

    public static Integer total(Integer a) {
        int suma = 0;

        for(int i = 0; i <= a; ++i) {
            suma += i;
        }

        return suma;
    }

    public static void main(String[] args) {
        zileluna("februarie");
        operatii(6.0, 3.0);
        count();
        System.out.println("Cel mai mare numar este: " + comparatie(6.0, 8.0, 2.0));
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti un numar: ");
        int a = input.nextInt();
        System.out.println("Suma numerelor de la 0 la " + a + " este: " + total(a));
    }
}
