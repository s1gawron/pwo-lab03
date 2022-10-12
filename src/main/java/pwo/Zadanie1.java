package pwo;

public class Zadanie1 {

    public static final int FROM = 0;

    public static final int TO = 100;

    public static final String FILE_NAME = "lucasseq100.txt";

    public static void main(String[] args) {
        System.out.println("Lucas wersja 1");

        boolean ok = SequenceTools.writeToFile(new LucasGenerator(), FROM, TO, FILE_NAME);

        if (ok) {
            System.out.println("Wynik zapisany do pliku: " + FILE_NAME);
        } else {
            System.out.println("Błąd");
        }
    }
}
