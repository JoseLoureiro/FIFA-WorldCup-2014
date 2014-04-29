package backend;

import java.util.Date;

public class Jogador extends Individuo {
    private int numCamisola;
    private double peso;
    private double altura;
    private int numInter;
    private int numGolos;
    private int numCartAmarelo;
    private int numCartVermelho;
    
    public Jogador(){
        super();
        this.numCamisola = 0;
        this.peso = 0;
        this.altura = 0;
        this.numInter = 0;
        this.numGolos = 0;
        this.numCartAmarelo = 0;
        this.numCartVermelho = 0;
    }
    
    public Jogador(int var1, String var2, Date var3, String var4, String var5, int var6, double var7,
                   double var8, int var9, int var10, int var11, int var12){
        super(var1, var2, var3, var4, var5);
        this.numCamisola = var6;
        this.peso = var7;
        this.altura = var8;
        this.numInter = var9;
        this.numGolos = var10;
        this.numCartAmarelo = var11;
        this.numCartVermelho = var12;   
    }

    /**
     * @return the numCamisola
     */
    public int getNumCamisola() {
        return numCamisola;
    }

    /**
     * @param numCamisola the numCamisola to set
     */
    public void setNumCamisola(int numCamisola) {
        this.numCamisola = numCamisola;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the numInter
     */
    public int getNumInter() {
        return numInter;
    }

    /**
     * @param numInter the numInter to set
     */
    public void setNumInter(int numInter) {
        this.numInter = numInter;
    }

    /**
     * @return the numGolos
     */
    public int getNumGolos() {
        return numGolos;
    }

    /**
     * @param numGolos the numGolos to set
     */
    public void setNumGolos(int numGolos) {
        this.numGolos = numGolos;
    }

    /**
     * @return the numCartAmarelo
     */
    public int getNumCartAmarelo() {
        return numCartAmarelo;
    }

    /**
     * @param numCartAmarelo the numCartAmarelo to set
     */
    public void setNumCartAmarelo(int numCartAmarelo) {
        this.numCartAmarelo = numCartAmarelo;
    }

    /**
     * @return the numCartVermelho
     */
    public int getNumCartVermelho() {
        return numCartVermelho;
    }

    /**
     * @param numCartVermelho the numCartVermelho to set
     */
    public void setNumCartVermelho(int numCartVermelho) {
        this.numCartVermelho = numCartVermelho;
    }
}
