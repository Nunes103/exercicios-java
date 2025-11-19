import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Agenda {

    private List<Contatinho> contatinhos = new ArrayList<>();

    public void addContatinho(Contatinho c) {
        contatinhos.add(c);
    }

    public void ordenarLista() {
        Collections.sort(contatinhos, Comparator.comparing(Contatinho::getNome, String.CASE_INSENSITIVE_ORDER));
    }

    public void salvarLista(String nomeArquivo) {
        ordenarLista();
        try (PrintWriter out = new PrintWriter(new FileWriter(nomeArquivo))) {
            for (Contatinho c : contatinhos) {
                out.println(c.toLinhaArquivo());
            }
        } catch (Exception e) {
            System.out.println("Erro ao salvar arquivo.");
        }
    }

    public Contatinho buscarContatinhoNoArquivo(String nomeArquivo, String nomeProcurado) {
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] p = linha.split("#");
                if (p[0].equalsIgnoreCase(nomeProcurado)) {
                    return new Contatinho(p[0], p[1], p[2], p[3]);
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo.");
        }
        return null;
    }
}