package Utils;

import Entities.Cliente;
import java.util.Scanner;

public class trataEntradaConsulta {
    static Scanner sc = new Scanner(System.in);

    public static void consulta(Cliente cliente) {
        int n;

        do {
            System.out.println("Digite 1 para ver seus dados ou 2 para sair: ");

            try {
                n = Integer.parseInt(sc.nextLine());

                if (n == 1) {
                    System.out.println("Nome: " + cliente.getNome());
                    System.out.println("CPF: " + cliente.getCpf());
                    System.out.println("Número: " + cliente.getNumero());
                } else if (n != 2) {
                    System.out.println("Número inválido, digite novamente!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite apenas os números 1 ou 2.");
                n = -1;
            }
        } while (n != 2);
    }
}
