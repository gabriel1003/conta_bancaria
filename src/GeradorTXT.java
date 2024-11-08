import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GeradorTXT {

    public void gerarEstrato(String nome, String cpf, int numeroDaConta, double saldo) throws IOException {
        // Define o caminho do arquivo TXT
        String caminhoArquivo = "C:\\Users\\gabri\\OneDrive\\Documentos\\extrato.txt";

        // Cria um BufferedWriter para escrever no arquivo
        BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo));

        // Escreve o conteúdo do extrato no arquivo
        writer.write("Extrato da Conta");
        writer.newLine();
        writer.write("Nome: " + nome);
        writer.newLine();
        writer.write("CPF: " + cpf);
        writer.newLine();
        writer.write("Número da Conta: " + numeroDaConta);
        writer.newLine();
        writer.write("Saldo: R$ " + saldo);

        // Fecha o BufferedWriter
        writer.close();

        System.out.println("Estrato gerado com sucesso em: " + caminhoArquivo);
    }
}