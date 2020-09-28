import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Studerende st1 = new Studerende();
        st1.navn = "Malte";
        st1.alder = 28;
        st1.by = "Nykøbing";

        Studerende st2 = new Studerende();
        st2.navn = "Jenna";
        st2.alder = 36;
        st2.by = "Nørre Alslev";

        Studerende st3 = new Studerende();
        st3.navn = "Louise";
        st3.alder = 28;
        st3.by = "Glumsø";

        Studerende st4 = new Studerende();
        st4.navn = "Sara";
        st4.alder = 27;
        st4.by = "Næstved";

        Studerende st5 = new Studerende();
        st5.navn = "Laila";
        st5.alder = 49;
        st5.by = "Næstved";

        System.out.println("Alle studerende oprettet!");

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hvem søger du? ");
            String nameToFind = scanner.next();
            switch (nameToFind) {
                case "Malte":
                    System.out.println(st1.alder);
                    break;
                case "Jenna":
                    System.out.println(st2.alder);
                    break;
                case "Louise":
                    System.out.println(st3.alder);
                    break;
                case "Sara":
                    System.out.println(st4.alder);
                    break;
                case "Laila":
                    System.out.println(st5.alder);
                    break;
                default:
                    System.out.println(nameToFind + " er ikke i min studiegruppe!");

                    // switch (studerende) {
                    //    "Lasse" sout studerende.alder
                    // }

            }
        }
    }
}