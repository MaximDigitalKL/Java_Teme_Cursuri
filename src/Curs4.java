import java.util.ArrayList;
import java.util.List;

public class Curs4 {
    public static void main(String[] args) {
        String[] var10000 = new String[]{"Audi", "Volvo", "BMW", "Mercedes", "Aston Martin", "Lastun", "Fiat", "Trabant", "Opel"};
        Integer[] numere = new Integer[]{5, 7, 3, 9, 3, 3, 1, 0, -4, 3};
        List<Integer> negative = new ArrayList();

        for(int i = 0; i < numere.length; ++i) {
            if (numere[i] > 0) {
                negative.add(numere[i] * -1);
            } else {
                negative.add(numere[i]);
            }
        }

        System.out.println(negative);
    }
}
