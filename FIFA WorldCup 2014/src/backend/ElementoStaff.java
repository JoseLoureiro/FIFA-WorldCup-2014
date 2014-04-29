package backend;

import java.util.Date;


public class ElementoStaff extends Individuo{
    private String funcao;
    
    public ElementoStaff(){
        super();
        this.funcao = "default";
    }
    
    public ElementoStaff(int var1, String var2, Date var3, String var4, String var5, String var14){
        super(var1, var2, var3, var4, var5);
        this.funcao = var14;
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
