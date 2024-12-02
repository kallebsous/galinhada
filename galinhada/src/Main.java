public class Main {
    public static void main(String[] args) {
        Galinha galinhaComum = new Galinha("Galinha Comum", 5);
        GalinhaPintadinha pintadinha = new GalinhaPintadinha("Galinha Pintadinha", 6, "Azul com bolinhas brancas");
        GalinhaDaAngola angola = new GalinhaDaAngola("Galinha da Angola", 7, true);
        GalinhaChickenLittle galinho = new GalinhaChickenLittle("Chicken Little", 0, "Palmeiras tem mundial");
        
        // polimorfismo
        galinhaComum.emitirSom();
        pintadinha.emitirSom();
        angola.emitirSom();
        galinho.emitirSom();
        galinho.mentiradas();


        // Exibe informações
        System.out.println("\nInformações:");
        galinhaComum.exibirInformacoes();
        System.out.println();
        pintadinha.exibirInformacoes();
        System.out.println();
        angola.exibirInformacoes();
        System.out.println();
        galinho.exibirInformacoes();
        System.out.println();
        //criando um galinheiro
        Galinheiro galinheiro = new Galinheiro();

        //adicionando as galinhas no galinheiro
        galinheiro.adicionarGalinha(pintadinha);
        galinheiro.adicionarGalinha(angola);
        galinheiro.adicionarGalinha(galinho);

        //e exibindo-as
        galinheiro.exibirGalinha();

    }
}