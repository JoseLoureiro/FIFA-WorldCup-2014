package backend;

import java.util.Date;

public class Individuo {
    private int numIdentificador;
    private String nome;
    private Date dataNascimento;
    private String grupoSangue;
    private String sexo;
        
    public Individuo(){
        this.numIdentificador = 0;
        this.nome = "default";
        this.dataNascimento = null;
        this.grupoSangue = "default";
        this.sexo = "default";
    }
    
    public Individuo(int var1, String var2, Date var3, String var4, String var5){
        this.numIdentificador = var1;
        this.nome = var2;
        this.dataNascimento = var3;
        this.grupoSangue = var4;
        this.sexo = var5; 
    }

    /**
     * @return the numIdentificador
     */
    public int getNumIdentificador() {
        return numIdentificador;
    }

    /**
     * @param numIdentificador the numIdentificador to set
     */
    public void setNumIdentificador(int numIdentificador) {
        this.numIdentificador = numIdentificador;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the dataNascimento
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the grupoSangue
     */
    public String getGrupoSangue() {
        return grupoSangue;
    }

    /**
     * @param grupoSangue the grupoSangue to set
     */
    public void setGrupoSangue(String grupoSangue) {
        this.grupoSangue = grupoSangue;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
