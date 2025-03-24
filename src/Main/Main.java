package Main;

import Entities.Cliente;
import Utils.Consulta;
import Utils.CpfUtils;
import Utils.NumeroUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        cliente.setNome(sc.nextLine());

        cliente.setCpf(CpfUtils.cpfv());

        cliente.setNumero(NumeroUtils.numerov());

        Consulta.consulta(cliente);

        sc.close();
    }
}
