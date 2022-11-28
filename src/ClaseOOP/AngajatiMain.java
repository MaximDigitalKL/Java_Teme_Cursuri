package ClaseOOP;

public class AngajatiMain {
    public static void main(String[] args) {
        ClasaAngajati angajatul1 = new ClasaAngajati("Maxim", "Razvan", "inginer", 1.0, 3200.0);
        ClasaAngajati angajatul2 = new ClasaAngajati("Maxim", "Georgiana", "manager", 7.0, 4500.0);
        ClasaAngajati angajatul3 = new ClasaAngajati("Maxim", "Razvan", "CEO", 4.0, 20000.0);
        angajatul1.descriere();
        angajatul2.descriere();
        angajatul3.descriere();
        angajatul1.actualizareVechime(1.0);
        angajatul2.actualizareVechime(1.0);
        angajatul3.actualizareVechime(1.0);
        angajatul1.marireSalariu();
        angajatul2.marireSalariu();
        angajatul3.marireSalariu();
    }
}
