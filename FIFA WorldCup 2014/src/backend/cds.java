/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package backend;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 *
 * @author joseloureiro
 */
public class cds {
   private String nomeGrupo;
    private TreeMap<Selecao, Integer> grupo;
    
    public Grupo(String nomeGrupo, ArrayList<Selecao> Selec){
        this.nomeGrupo = nomeGrupo;
        this.grupo = new TreeMap<Selecao, Integer>();
        for(Selecao temp : Selec ){
            this.grupo.put(temp, 0);
        }
 
    }
    
}


