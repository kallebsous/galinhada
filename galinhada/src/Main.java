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

        //criando os ninhos
        Ninho ninho1 = new Ninho("Palha", 0);
        Ninho ninho2 = new Ninho("Aço Inox", 0);

        //colocando as 2 galinhas nos seus ninhos
        pintadinha.setNinho(ninho1);
        angola.setNinho(ninho2);
        //adicionando os ovos dela por semana no ninho
        pintadinha.colocarOvos();
        angola.colocarOvos();
        //exibe o ninho
        System.out.println(ninho1);
        System.out.println(ninho2);

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