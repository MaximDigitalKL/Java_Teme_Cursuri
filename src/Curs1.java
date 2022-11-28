public class Curs1 {
    public static void main(String[] args) {
        String nume = "Maxim";
        Integer luni = 12;
        Double km = 39.66;
        Boolean sign_of_lie = true;
        System.out.println(Math.round(km));
        System.out.println("Numele meu este " + nume);
        System.out.println("Anul are " + luni + " luni");
        System.out.println("Viteza de croaziera este de: " + km + " km/h");
        System.out.println("Schrodinger's cat alive? " + sign_of_lie);
        String first_name = "Eduard";
        String last_name = "Maxim";
        System.out.println(first_name.length() + last_name.length());
        Double l = 6.0;
        Double L = 10.0;
        System.out.println("Aria dreptunghiului este: " + l * L + " cm");
        String prop = "Coral is either the stupidest animal or the smartest rock";
        int count = 0;

        for(int i = 0; i < prop.length() - 3; ++i) {
            if (prop.substring(i, i + 3).equals("the")) {
                ++count;
            }
        }

        System.out.println("Cuvantul 'the' apare de: " + count + " ori");
        String fraza = "Coral is either the stupidest animal or the smartest rock";
        String nou = fraza.replace("the", "THE");
        System.out.println(nou);
        String text = "Coral is either the 1 stupidest animal or the smartest rock";
        int contor = 0;

        for(int i = 0; i < text.length(); ++i) {
            for(int y = 0; y < 10; ++y) {
                if (text.substring(i, i + 1).equals(String.valueOf(y))) {
                    contor = 1;
                }
            }
        }

        if (contor > 0) {
            System.out.println("The string contains numbers");
        } else {
            System.out.println("The string does not contain numbers");
        }

    }
}
