package Es1;

import java.util.Scanner;

public class Es1 {
    public static void main(String[] args) {
        Es1 esercizio1 = new Es1();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserici la parola, \nse esce true è pari se esce false è dispari");
        String parolaPari = scanner.next();
        System.out.println(esercizio1.stringaPari(parolaPari));
        System.out.println("Inserici l'anno per verificare se è bisestile \nse bisestile esce true se non bisestile esce false");
        int anno = Integer.parseInt(scanner.next());
        System.out.println(esercizio1.annoBisestile(anno));

    }
    public boolean stringaPari(String parolaPari) {

        if (parolaPari.length() % 2 == 0) {
            return true;
        } else return false;
    }

    public boolean annoBisestile(int anno) {
        if (anno % 400 == 0 || anno % 4 == 0 && anno % 100 != 0) {
            return true;
        } else {
            return false;
        }
    }
}
