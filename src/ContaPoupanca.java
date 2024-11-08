public class ContaPoupanca {
    private String nome;
    private String cpf;
    private int numeroDaConta;
    private double saldo;

    public ContaPoupanca() {
    }

    public ContaPoupanca(String nome, String cpf, int numeroDaConta, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Seu depósito foi recebido! ");
    }

    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque realisado com suceço.\n");
            System.out.printf("O seu saldo atual é de: R$ %.2f", saldo);
        } else {
            System.out.println("\tO seu saque não pode ser feito pois o limite é insuficiente.");
            System.out.printf("\tO seu saldo atual é de: R$ %.2f" ,saldo);
        }
    }

    @Override
    public String toString() {
        return "Conta poupança {" +
                "Nome = '" + nome + '\n' +
        ", CPF = '" + cpf +
                "\n, Número Da Conta = " + numeroDaConta +
                        ", Saldo = R$" + String.format("%.2f" ,saldo) +
                        "}";
    }
}
