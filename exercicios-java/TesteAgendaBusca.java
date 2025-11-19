import java.util.Scanner;

public class TesteAgendaBusca {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();

        System.out.print("Nome do contatinho que deseja buscar: ");
        String nome = sc.nextLine();

        Contatinho c = agenda.buscarContatinhoNoArquivo("contatinhos.txt", nome);

        if (c != null) {
            System.out.println("Encontrado:");
            System.out.println(c);
        } else {
            System.out.println("Não existe contato com esse nome.");
        }

        sc.close();
    }
}