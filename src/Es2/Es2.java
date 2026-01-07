package Es2;

import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        Es2 esercizio2 = new Es2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero da 0 a 3");
        int numerUtente = Integer.parseInt(scanner.next());
        esercizio2.scase(numerUtente);
    }

    public void scase(int numero){
        switch (numero){
            case 0: {
                System.out.println("zero");
                break;
            }
            case 1: {
                System.out.println("uno");
                break;
            }
            case 2: {
                System.out.println("due");
                break;
            }
            case 3: {
                System.out.println("tre");
                break;
            }
            default:
                System.out.println("Errore");
                break;
        }
    }
}
