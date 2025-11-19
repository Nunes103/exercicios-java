import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da tabuada que deseja ler: ");
        int num = sc.nextInt();

        String nomeArquivo = "tabuada_" + num + ".txt";
        File arquivo = new File(nomeArquivo);

        if (!arquivo.exists()) {
            System.out.println("O arquivo " + nomeArquivo + " não existe.");
        } else {
            try (Scanner leitor = new Scanner(arquivo)) {
                while (leitor.hasNextLine()) {
                    System.out.println(leitor.nextLine());
                }
            } catch (FileNotFoundException e) {
                System.out.println("Erro ao abrir o arquivo.");
            }
        }

        sc.close();
    }
}