package Main;

import Entites.Cliente;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Scanner sc = new Scanner(System.in);
        int n = -1;

        System.out.print("Digite seu nome: ");
        cliente.setNome(sc.nextLine());


        String cpf;
        do {
            System.out.print("Digite seu CPF (11 dígitos numéricos): ");
            cpf = sc.nextLine();

            if (!cpf.matches("\\d{11}")) {
                System.out.println("CPF inválido! Deve conter exatamente 11 números.");
            }
        } while (!cpf.matches("\\d{11}"));
        cliente.setCpf(Long.parseLong(cpf));


        String numero;
        do {
            System.out.print("Digite seu número (somente 9 números): ");
            numero = sc.nextLine();

            if (!numero.matches("\\d{9}")) {
                System.out.println("Número inválido! Digite apenas 9 números.");
            }
        } while (!numero.matches("\\d{9}"));
        cliente.setNumero(Integer.parseInt(numero));


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
            }
        } while (n != 1 && n != 2);

        sc.close();
    }
}
