
import java.util.Random;
import java.util.Scanner;

public class BonusOpt4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int upperbound = 6;
        int dice_roll = rand.nextInt(upperbound);
        int sanse = 3;
        boolean ghicit = false;

        int zar;
        for(zar = 0; sanse > 0; --sanse) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduceti zarul");
            zar = sc.nextInt();
            if (sanse != 1) {
                if (dice_roll == zar) {
                    System.out.println("Ai ghicit. Felicitari! Numarul ales de tine e corect)");
                    ghicit = true;
                    break;
                }

                if (zar < dice_roll) {
                    System.out.println("Ai pierdut. Ai ales un numar mai mic. Mai ai " + (sanse - 1) + " incercari");
                } else {
                    System.out.println("Ai pierdut. Ai ales un numar mai mare. Mai ai " + (sanse - 1) + " incercari");
                }
            } else {
                if (dice_roll == zar) {
                    System.out.println("Ai ghicit. Felicitari! Numarul ales de tine e corect)");
                    ghicit = true;
                    break;
                }

                if (zar < dice_roll) {
                    System.out.println("Ai pierdut. Ai ales un numar mai mic");
                } else {
                    System.out.println("Ai pierdut. Ai ales un numar mai mare");
                }
            }
        }

        if (ghicit) {
            System.out.println("Jocul s-a terminat esti premiant");
        } else {
            System.out.println("Ai pierdtu. Ai ales " + zar + " si a fost " + dice_roll);
        }

    }


}
