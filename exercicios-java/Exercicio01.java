import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para gerar a tabuada: ");
        int num = sc.nextInt();

        String nomeArquivo = "tabuada_" + num + ".txt";

        try (PrintWriter out = new PrintWriter(new FileWriter(nomeArquivo))) {
            for (int i = 0; i <= 10; i++) {
                out.println(num + " x " + i + " = " + (num * i));
            }
            System.out.println("Tabuada salva em: " + nomeArquivo);
        } catch (IOException e) {
            System.out.println("Erro ao criar o arquivo.");
        }

        sc.close();
    }
}