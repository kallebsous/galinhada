import java.util.ArrayList;

public class Galinheiro {
    private ArrayList<Galinha> galinhas;

    public Galinheiro() {
        galinhas = new ArrayList<>();
    }
    //método para adicionar galinhas no galinheiro
    public void adicionarGalinha(Galinha galinha) {
        galinhas.add(galinha);
        System.out.println("Galinha"+ galinha.getNome() + " adicionada com sucesso!");
    }

    //exibe as galinhas com a quantidade de ovos por semana
    public void exibirGalinha(){
        for (Galinha galinha : galinhas) {
            System.out.println("- " + galinha.getNome() + "(Ovos por semana " + galinha.getOvosPorSemana() + ")");
        }
    }
}
