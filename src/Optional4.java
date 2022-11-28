import java.io.PrintStream;

public class Optional4 {
    public static void main(String[] args) {
        Integer[] var10000 = new Integer[]{-5, 7, 2, 9, 12, 3, 1, -6, -4, 3};
        String[] tastatura_telefon = new String[]{"123", "456", "789", "0"};

        for(int i = 0; i < tastatura_telefon.length; ++i) {
            String tasta = tastatura_telefon[i];

            for(int j = 0; j < tasta.length(); ++j) {
                PrintStream var6 = System.out;
                char var10001 = tasta.charAt(j);
                var6.println("Cifra curenta este: " + var10001);
            }
        }

    }
}
