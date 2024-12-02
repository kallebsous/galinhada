// Classe base: Galinha
class Galinha {
    private String nome;
    private int ovosPorSemana;
    private Ninho ninho;

    // Construtor
    public Galinha(String nome, int ovosPorSemana) {
        this.nome = nome;
        this.ovosPorSemana = ovosPorSemana;
        this.ninho = new Ninho("Palha", 0);
        colocarOvos();
    }

    public Ninho getNinho() {
        return ninho;
    }
    public void setNinho(Ninho ninho) {
        this.ninho = ninho;
    }
    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getOvosPorSemana() {
        return ovosPorSemana;
    }

    public void setOvosPorSemana(int ovosPorSemana) {
        this.ovosPorSemana = ovosPorSemana;
    }

//     Método para emitir som (polimorfismo)
    public void emitirSom() {
        System.out.println(nome + " faz: Có-có!");
    }

    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Ovos por semana: " + ovosPorSemana);
        System.out.println("Ninho: " + ninho);
    }

    //método para incrementar os ovos por semana no ninho
    public void colocarOvos() {
        if (ninho == null) {
            System.out.println(nome + " não tem um ninho para colocar os ovos!");
        } else {
            int ovosNoNinhoAtual = ninho.getNumOvos();
            ninho.setNumOvos(ovosNoNinhoAtual + ovosPorSemana);
            System.out.println(nome + " colocou " + ovosPorSemana + " ovos no ninho.");
        }
    }
}
