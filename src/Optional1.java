public class Optional1 {
    public static void main(String[] args) {
        String demijloc = "maxim";
        System.out.println(demijloc.substring(demijloc.length() / 2, demijloc.length() / 2 + 1));
        String pali = "123454321";
        String rev = "";

        for(int i = 0; i < pali.length(); ++i) {
            char chr = pali.charAt(i);
            rev = "" + chr + rev;
        }

        if (pali.equals(rev)) {
            System.out.println("Este palindrom");
        } else {
            System.out.println("Nu este palindrom");
        }

        String cuv = "alabala portocala";
        String[] primul = cuv.split(" ", 0);
        String[] var7 = primul;
        int var8 = primul.length;

        String intermediar;
        for(int var9 = 0; var9 < var8; ++var9) {
            intermediar = var7[var9];
            System.out.println(intermediar);
        }

        String original = "alabala portocala";
        char litera = original.charAt(0);
        char litera2 = Character.toUpperCase(litera);
        intermediar = original.substring(1, original.length() - 1);
        String nou = intermediar.replace(litera, litera2);
        System.out.println("" + litera + nou + litera);
        String user = "maxim";
        String parola = "gf5876tgh";
        String steluta = "*";
        System.out.println("Parola pt user: " + user + " este " + steluta.repeat(parola.length()) + " si are " + parola.length() + " caractere");
    }
}
