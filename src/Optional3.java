import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Optional3 {
    public static void main(String[] args) {
        String[] echipa = new String[]{"L.Mesi", "T.Henry", "C.Ronaldo", "M.Salah", "A.Iniesta"};
        List<String> l_echipa = new ArrayList(Arrays.asList(echipa));
        String[] rezerve = new String[]{"G.Hagi", "C.Chivu", "A.Mutu"};
        List<String> l_rezerve = new ArrayList(Arrays.asList(rezerve));
        String schimb = "";
        String eliminati = "";
        int schimbari_efect = 3;
        System.out.println(l_echipa);

        while(schimbari_efect <= 3 && schimbari_efect > 0) {
            Scanner input = new Scanner(System.in);
            System.out.println("Introduceti un jucator");
            String jucator = input.next();
            if (l_echipa.contains(jucator) && l_rezerve.size() > 0) {
                l_echipa.remove(jucator);
                l_echipa.add((String)l_rezerve.get(0));
                schimb = (String)l_rezerve.get(0);
                l_rezerve.remove(0);
                --schimbari_efect;
                System.out.println("A intrat " + schimb + " si a iesit " + jucator + " mai aveti " + l_rezerve.size() + " schimbari");
            } else {
                System.out.println("Jucatorul " + jucator + " nu este in teren ");
                System.out.println("Mai aveti " + l_rezerve.size() + " schimbari");
            }
        }

        System.out.println("Echipa dupa toate schimbarile este: " + l_echipa);
    }
}
