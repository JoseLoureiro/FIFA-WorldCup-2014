package backend;

import java.util.Date;


public class Tecnico extends Individuo {
    private String funcao;
    
    public Tecnico(){
        super();
        this.funcao = "default";
    }
    
    public Tecnico(int var1, String var2, Date var3, String var4, String var5, String var13){
        super(var1, var2, var3, var4, var5);
        this.funcao = var13;
    }

    /**
     * @return the funcao
     */
    public String getFuncao() {
        return funcao;
    }

    /**
     * @param funcao the funcao to set
     */
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
