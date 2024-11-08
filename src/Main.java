import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaPoupanca c1 = new ContaPoupanca();
        GeradorTXT gerador = new GeradorTXT();
        int opt;
        do {
            System.out.println("\tOlá seja bem-vindo ao nosso banco.");
            System.out.println("\tDigite (1) para ver os dados da conta;");
            System.out.println("\tDigite (2) para sacar;");
            System.out.println("\tE digite (3) para depositar.");
            System.out.println("\tQual é a sua opção?");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("\tOlá!\nDigite o seu nome: ");
                    c1.setNome(sc.next());
                    sc.nextLine();
                    System.out.println("\tDigite o seu CPF: ");
                    c1.setCpf(sc.nextLine());
                    System.out.println("\tDigite o número da sua conta: ");
                    c1.setNumeroDaConta(sc.nextInt());
                    System.out.println("\tEstes são os dados da sua conta: " +c1.toString());
                    break;
                case 2:
 System.out.println("\tOlá " +c1.getNome() + " quanto deseja sacar? ");
 double valor = sc.nextDouble();
 c1.sacar(valor);
                    break;
                case 3:
                    System.out.println("\tOlá " +c1.getNome() + " quanto você deseja depositar? ");
                    double value = sc.nextDouble();
                    c1.depositar(value);
                    break;
                case 4:
                    try {
                        gerador.gerarEstrato(c1.getNome(), c1.getCpf(), c1.getNumeroDaConta(), c1.getSaldo());
                    } catch (IOException e) {
                        System.err.println("Erro ao gerar extrato: " + e.getMessage());
                    }

                    break;
                case 0:
                    System.out.println("\tMuito obrigado por usar os nossos cerviços! ");
                    break;
                default:
                    System.out.println("Opção inválida! ");
            }
        } while (opt != 0);
        sc.close();
    }
}