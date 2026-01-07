package Es3;


import java.util.Scanner;

public class Es3 {
    public static void main(String[] args) {
        Es3 esercizio3 = new Es3();
        esercizio3.qWhile();
    }
    public void qWhile() {
        Scanner scanner = new Scanner(System.in);
        String parolaQ;

        do {
            System.out.println("Inserisci una stringa :q per uscire dal loop");
            parolaQ = scanner.nextLine();
        } while (!parolaQ.equals(":q"));

        System.out.println("Sei uscito.");
    }
}
