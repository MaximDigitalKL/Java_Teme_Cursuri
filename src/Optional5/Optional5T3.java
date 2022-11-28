package Optional5;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Optional5T3 {
    public static void main(String[] args) {
        int i = 0;

        int sum;
        for(sum = 0; i <= 100; ++i) {
            sum += i;
        }

        System.out.println(sum);
        Integer[] lista = new Integer[]{10, 99, 98, 85, 45, 59, 65, 66, 76, 12, 35, 13, 100, 80, 95};
        List<Integer> l1 = new ArrayList(Arrays.asList(lista));

        for(int j = 0; j < lista.length; ++j) {
            if (lista[j] == 100) {
                PrintStream var10000 = System.out;
                int var10001 = l1.indexOf(lista[j]);
                var10000.println("Numarul 100 se afla in lista la pozitia " + var10001);
            }
        }

        String[] sirnume = new String[]{"Joe", "Sarah", "Mike", "Jess", "", "Matt", "", "Greg"};
        List<String> sir1 = new ArrayList(Arrays.asList(sirnume));
        List noualista = new ArrayList();

        for(int x = 0; x < sir1.size(); ++x) {
            if (sirnume[x].length() != 0) {
                noualista.add(sirnume[x]);
            }
        }

        System.out.println(noualista);
        String[] sirnume2 = new String[]{"Sam", "", "Ben", "Olivia", "Alicia"};
        List<String> sir2 = new ArrayList(Arrays.asList(sirnume2));
        List noualista2 = new ArrayList();

        for(int y = 0; y < sir2.size(); ++y) {
            if (sirnume2[y].length() == 0) {
                System.out.println("There is an empty string");
                break;
            }

            noualista2.add(sirnume2[y]);
        }

        System.out.println("The new list is: " + noualista2);
    }
}
