public class GalinhaChickenLittle extends Galinha{
    private int numMentir;
    private String mentira;

    public GalinhaChickenLittle(String nome, int ovosPorSemana, String mentira) {
        super(nome, ovosPorSemana);
        this.mentira = mentira;
    }
    
    
    public void mentiradas(){
        this.numMentir ++;
    }
    
    
    
    @Override
    public void emitirSom() {
        super.emitirSom(); //To change body of generated methods, choose Tools | Templates.
        System.out.println(mentira);
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Numero de Mentiradas: "+numMentir);
    }
    
    
    /**
     * @return the numMentir
     */
    public int getNumMentir() {
        return numMentir;
    }

    /**
     * @param numMentir the numMentir to set
     */
    public void setNumMentir(int numMentir) {
        this.numMentir = numMentir;
    }

    /**
     * @return the mentira
     */
    public String getMentira() {
        return mentira;
    }

    /**
     * @param mentira the mentira to set
     */
    public void setMentira(String mentira) {
        this.mentira = mentira;
    }
        
    
}
