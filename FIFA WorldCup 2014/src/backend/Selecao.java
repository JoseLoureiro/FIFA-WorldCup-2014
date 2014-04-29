package backend;

import java.util.ArrayList;


public class Selecao {
    private String codigoPais;
    private String nomePais;
    private String nomeResponsavel;
    private ArrayList<Jogador> jogadores;
    private ArrayList<Tecnico> tecnicos;
    private ArrayList<ElementoStaff> staff;
    private int numSelGolo;
    
    public Selecao(){
        this.codigoPais = "default";
        this.nomePais = "default";
        this.nomeResponsavel = "default";
        this.jogadores = null;
        this.tecnicos = null;
        this.staff = null; 
        this.numSelGolo = 0;
    }
    
    public Selecao(String camp1, String camp2, String camp3, ArrayList camp4, ArrayList camp5, ArrayList camp6, int camp7){
        this.codigoPais = camp1;
        this.nomePais = camp2;
        this.nomeResponsavel = camp3;
        this.jogadores = camp4;
        this.tecnicos = camp5;
        this.staff = camp6;
        this.numSelGolo = camp7;
    }

    /**
     * @return the codigoPais
     */
    public String getCodigoPais() {
        return codigoPais;
    }

    /**
     * @param codigoPais the codigoPais to set
     */
    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    /**
     * @return the nomePais
     */
    public String getNomePais() {
        return nomePais;
    }

    /**
     * @param nomePais the nomePais to set
     */
    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }

    /**
     * @return the nomeResponsavel
     */
    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    /**
     * @param nomeResponsavel the nomeResponsavel to set
     */
    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    /**
     * @return the jogadores
     */
    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    /**
     * @param jogadores the jogadores to set
     */
    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    /**
     * @return the tecnicos
     */
    public ArrayList<Tecnico> getTecnicos() {
        return tecnicos;
    }

    /**
     * @param tecnicos the tecnicos to set
     */
    public void setTecnicos(ArrayList<Tecnico> tecnicos) {
        this.tecnicos = tecnicos;
    }

    /**
     * @return the staff
     */
    public ArrayList<ElementoStaff> getStaff() {
        return staff;
    }

    /**
     * @param staff the staff to set
     */
    public void setStaff(ArrayList<ElementoStaff> staff) {
        this.staff = staff;
    }

    /**
     * @return the numSelGolo
     */
    public int getNumSelGolo() {
        return numSelGolo;
    }

    /**
     * @param numSelGolo the numSelGolo to set
     */
    public void setNumSelGolo(int numSelGolo) {
        this.numSelGolo = numSelGolo;
    }
}