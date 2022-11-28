package ClaseOOP;

public class ClasaAngajati {
    String nume;
    String prenume;
    String functie;
    Double vechime;
    Double salariu;

    public ClasaAngajati(String nume, String prenume, String functie, Double vechime, Double salariu) {
        this.nume = nume;
        this.prenume = prenume;
        this.functie = functie;
        this.vechime = vechime;
        this.salariu = salariu;
    }

    public void descriere() {
        System.out.println("Nume angajat: " + this.nume);
        System.out.println("Prenume angajat: " + this.prenume);
        System.out.println("Avand functia de " + this.functie);
        System.out.println("O vechime in companie de " + this.vechime + " ani");
        System.out.println("Salariu brut de " + this.salariu + " RON");
        System.out.println("------------------------------");
    }

    public void actualizareVechime(double ani) {
        this.vechime = this.vechime + ani;
        System.out.println("Vechimea angajatului a fost updatata cu success");
        System.out.println("Vechimea actuala a angajatului " + this.nume + " " + this.prenume + " este: " + this.vechime + " ani");
    }

    public void marireSalariu() {
        if (this.vechime <= 5.0) {
            this.salariu = this.salariu + 300.0;
            System.out.println("Pentru angajatul: " + this.nume + " " + this.prenume);
            System.out.println("Salariul marit cu 300 RON, la valoarea actuala de: " + this.salariu);
        } else {
            this.salariu = this.salariu + 500.0;
            System.out.println("Pentru angajatul: " + this.nume + " " + this.prenume);
            System.out.println("Salariul marit cu 500 RON, la valoarea actuala de: " + this.salariu);
        }

    }

}
