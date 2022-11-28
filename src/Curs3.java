import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Curs3 {
    public static void main(String[] args) {
        String[] muzicuta = new String[]{"do", "re", "mi", "fa", "sol", "la", "si", "do"};
        List<String> muzicuta1 = new ArrayList(Arrays.asList(muzicuta));
        System.out.println(muzicuta1);
        String schimb = "";

        for(int i = 0; i <= muzicuta.length / 2 - 1; ++i) {
            schimb = muzicuta[i];
            muzicuta[i] = muzicuta[muzicuta.length - 1 - i];
            muzicuta[muzicuta.length - 1 - i] = schimb;
        }

        List<String> muzicuta2 = new ArrayList(Arrays.asList(muzicuta));
        System.out.println(muzicuta2);
        Collections.reverse(muzicuta2);
        System.out.println(muzicuta2);
        System.out.println("Nota DO apare de: " + Collections.frequency(muzicuta1, "do") + " ori");
        Integer[] lung = new Integer[]{3, 1, 0, 2};
        List<Integer> l1 = new ArrayList(Arrays.asList(lung));
        Integer[] scurt = new Integer[]{6, 5, 4};
        List<Integer> l2 = new ArrayList(Arrays.asList(scurt));
        List<Integer> l3 = new ArrayList(l1);
        l3.addAll(l2);
        System.out.println(l3);
        List<Integer> l4 = (List) Stream.concat(l1.stream(), l2.stream()).collect(Collectors.toList());
        System.out.println(l4);
        Collections.sort(l3);
        System.out.println(l3);
        l3.remove(0);
        System.out.println(l3);
        if (l4.isEmpty()) {
            System.out.println("Lista Este Goala");
        } else {
            System.out.println("Lista NU Este Goala");
        }

        l4.removeAll(l4);
        if (l4.isEmpty()) {
            System.out.println("Lista Este Goala");
        } else {
            System.out.println("Lista NU Este Goala");
        }

        Map<String, Integer> Elevi_Note = new HashMap();
        Elevi_Note.put("Ana", 8);
        Elevi_Note.put("Gigel", 10);
        Elevi_Note.put("Dorel", 5);
        System.out.println(Elevi_Note.keySet());
        System.out.println("Ana are nota: " + Elevi_Note.get("Ana"));
        System.out.println("Gigel are nota: " + Elevi_Note.get("Gigel"));
        System.out.println("Dorel are nota: " + Elevi_Note.get("Dorel"));
        Elevi_Note.replace("Dorel", 6);
        System.out.println("Dorel dupa contestatie are nota: " + Elevi_Note.get("Dorel"));
        Elevi_Note.remove("Gigel", 10);
        Elevi_Note.put("Ionica", 9);
        System.out.println(Elevi_Note);
        Set<String> zile_sapt = new HashSet();
        zile_sapt.add("luni");
        zile_sapt.add("marti");
        zile_sapt.add("miercuri");
        zile_sapt.add("joi");
        zile_sapt.add("vineri");
        zile_sapt.add("sambata");
        zile_sapt.add("duminica");
        Set<String> weekend = new HashSet();
        weekend.add("sambata");
        weekend.add("duminica");
        zile_sapt.add("luni");
        System.out.println(zile_sapt);
        if (zile_sapt.containsAll(weekend)) {
            System.out.println("weekend este un subset al zile_sapt");
        } else {
            System.out.println("weekend nu este un subset al zile_sapt");
        }

        Set<String> diff = new HashSet();
        diff.addAll(zile_sapt);
        diff.removeAll(weekend);
        System.out.println(diff);
        zile_sapt.retainAll(weekend);
        System.out.println(zile_sapt);
    }
}
