package Optional5;

import java.io.PrintStream;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Optional5T2 {
    public static Set comune(List<Integer> l1, List<Integer> l2) {
        Set<String> nr_comune = new HashSet();

        for(int i = 0; i < l1.size(); ++i) {
            for(int j = 0; j < l2.size(); ++j) {
                if (l1.get(i) == l2.get(j)) {
                    nr_comune.add(((Integer)l1.get(i)).toString());
                }
            }
        }

        return nr_comune;
    }

    public static void discount(double pret, double reducere) {
        double procentaj = pret * reducere / 100.0;
        double noulpret = 0.0;
        if (procentaj > pret) {
            System.out.println("Reducere Invalida");
        } else {
            noulpret = pret - procentaj;
        }

        System.out.println("Pretul dupa aplicarea reducerii este: " + noulpret);
    }

    public static void datasiora() {
        LocalDateTime ro = LocalDateTime.now();
        LocalDateTime cn = ro.plusHours(6L);
        System.out.println("Data si ora locala a Romaniei este: " + ro);
        System.out.println("Data si ora locala a Chinei este: " + cn);
    }

    public static void countdown() {
        LocalDateTime ziua_mea = LocalDateTime.of(2023, 3, 2, 0, 0);
        LocalDateTime ro = LocalDateTime.now();
        long diffInDays = ChronoUnit.DAYS.between(ziua_mea, ro);
        System.out.println("Pana la ziua mea mai sunt: " + diffInDays + " zile");
    }

    public static void main(String[] args) {
        Integer[] lista1 = new Integer[]{1, 1, 2, 3};
        List<Integer> l1 = new ArrayList(Arrays.asList(lista1));
        Integer[] lista2 = new Integer[]{2, 2, 3, 4};
        List<Integer> l2 = new ArrayList(Arrays.asList(lista2));
        PrintStream var10000 = System.out;
        Set var10001 = comune(l1, l2);
        var10000.println("Numerele comune celor doua liste sunt: " + var10001);
        discount(1200.0, 14.0);
        datasiora();
        countdown();
    }
}
