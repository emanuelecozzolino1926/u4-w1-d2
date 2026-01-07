package Es4;

import java.util.Scanner;

public class Es4 {
    public static void main(String[] args) {
        Es4 esercizio4 = new Es4();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero intero:");
        int numero = scanner.nextInt();

        esercizio4.contoAllarovescia(numero);

    }

    public void contoAllarovescia(int numero){
        for(int i = numero; i >= 0; i--) {
            System.out.println(i);
        }
    }
}

