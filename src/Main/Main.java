package Main;

import Entities.Cliente;
import Utils.trataEntradaConsulta;
import Utils.trataEntradaCpf;
import Utils.trataEntradaNumero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        cliente.setNome(sc.nextLine());

        cliente.setCpf(trataEntradaCpf.cpfv());

        cliente.setNumero(trataEntradaNumero.numerov());

        trataEntradaConsulta.consulta(cliente);

        sc.close();
    }
}
