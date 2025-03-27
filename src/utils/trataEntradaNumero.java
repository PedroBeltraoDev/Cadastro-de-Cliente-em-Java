package utils;

import java.util.Scanner;

public class trataEntradaNumero {
    static Scanner sc = new Scanner(System.in);

    public static long numerov() {
        String numero;
        do {
            System.out.print("Digite seu número (somente 9 números): ");
            numero = sc.nextLine();

            if (!numero.matches("\\d{9}")) {
                System.out.println("Número inválido! Digite apenas 9 números.");
            }
        } while (!numero.matches("\\d{9}"));

        return Long.parseLong(numero);
    }
}
