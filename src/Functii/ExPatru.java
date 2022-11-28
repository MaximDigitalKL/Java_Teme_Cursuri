package Functii;

public class ExPatru {
    public static int Caractere(String nume, String prenume) {
        int NrC = nume.length() + prenume.length();
        return NrC;
    }

    public static void main(String[] args) {
        System.out.println("Nr caratere: " + Caractere("Razvan", "Maxim"));
        System.out.println("Nr caratere: " + Caractere("Georgiana", "Maxim"));
        System.out.println("Nr caratere: " + Caractere("Edy", "Maxim"));
    }
}
