package utils;

import java.util.Scanner;

public class trataEntradaCpf {
    static Scanner sc = new Scanner(System.in);

    public static long cpfv() {
        String cpf;
        do {
            System.out.print("Digite seu CPF (11 dígitos numéricos): ");
            cpf = sc.nextLine();

            if (!cpf.matches("\\d{11}")) {
                System.out.println("CPF inválido! Deve conter exatamente 11 números.");
            }
        } while (!cpf.matches("\\d{11}"));

        return Long.parseLong(cpf);
    }
}
