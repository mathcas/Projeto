/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.io.File;
import java.util.Date;

/**
 *
 * @author Matheus
 */
public class Usuario {
    
    boolean conjuge;
    String nome_conjuge;
    boolean conjuge_servidor;
    String lotacao;
    boolean ativo; 
    
    public void removerDependente (int cpf) {
        // metodo de BD
    }
    public void incluir_dependentes(String nome_dep, int cpf_dep, String parentesco, Date data_nasc, File cert_nasc) {
        // metodo BD
    }
    
    public void consultaSolicitacoes () {
        
    }
    
}
