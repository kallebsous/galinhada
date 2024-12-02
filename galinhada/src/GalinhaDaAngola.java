// Subclasse: GalinhaDaAngola
class GalinhaDaAngola extends Galinha {
        private boolean éDoméstica;

    // Construtor
    public GalinhaDaAngola(String nome, int ovosPorSemana, boolean éDoméstica) {
        super(nome, ovosPorSemana);
        this.éDoméstica = éDoméstica;
    }

    // Getter e Setter para éDoméstica
    public boolean isDomestica() {
        return éDoméstica;
    }

    public void setDomestica(boolean éDoméstica) {
        this.éDoméstica = éDoméstica;
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz: Tô fraco, tô fraco!");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("É doméstica: " + (éDoméstica ? "Sim" : "Não"));
    }
}
