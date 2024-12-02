public class Ninho {
    
    private String material;
    private int numOvos;
    
    public Ninho(String material, int numOvos) {
        this.material = material;
        this.numOvos = numOvos;
    }
    /**
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * @return the numOvos
     */
    public int getNumOvos() {
        return numOvos;
    }

    /**
     * @param numOvos the numOvos to set
     */
    public void setNumOvos(int numOvos) {
        this.numOvos = numOvos;
    }

    @Override
    public String toString() {
        return "Ninho [material=" + material + ", numero de Ovos=" + numOvos + "]";
    }
}
