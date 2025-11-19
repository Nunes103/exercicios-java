public class TesteAgendaSalva {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.addContatinho(new Contatinho("Fernanda", "fernanda@gmail.com", "81993188311", "Professora"));
        agenda.addContatinho(new Contatinho("Ana", "ana@gmail.com", "81993135677", "Amiga"));
        agenda.addContatinho(new Contatinho("Clara", "clara@gmail.com", "81915788311", "Trabalho"));

        agenda.salvarLista("contatinhos.txt");
        System.out.println("Arquivo salvo.");
    }
}