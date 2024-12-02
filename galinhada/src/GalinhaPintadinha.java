class GalinhaPintadinha extends Galinha {
    private String corDasPenas;

    // Construtor
    public GalinhaPintadinha(String nome, int ovosPorSemana, String corDasPenas) {
        super(nome, ovosPorSemana);
        this.corDasPenas = corDasPenas;
    }

    // Getter e Setter para corDasPenas
    public String getCorDasPenas() {
        return corDasPenas;
    }

    public void setCorDasPenas(String corDasPenas) {
        this.corDasPenas = corDasPenas;
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " canta: Pintadinha, Pintadinha!");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Cor das penas: " + corDasPenas);
    }
}
