/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

/**
 *
 * @author Matheus
 */
public class Servidor {
    
    boolean admin;
    String nome;
    int siape;
    int tel;
    int cel;
    String email;
    String senha;
    String senhaAdmin;
    int rg;
    int cpf;
    Usuario teste;
    
    public void testein (boolean test) {
        if (test) {
            teste = new Usuario();
        }
    }
    
    public boolean getAdmin () {
        // retornar do BD para o campo 
        return admin; 
    }
    
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public String getNome () {
        return nome; // retornar do BD para o campo 
    }
    
    public void setNome (String nome) {
        this.nome = nome;
    }
    
    public int getSIAPE () {
        return siape; // retornar do BD para o campo 
    }
    
    public void setSIAPE (int siape) {
        this.siape = siape;
    }
    
    public int getTel () {
        return tel; // retornar do BD para o campo 
    }
    
    public void setTel (int tel) {
        this.tel = tel;
    }
    
    public int getCel () {
        return cel; // retornar do BD para o campo 
    }
    
    public void setCel (int cel) {
        this.cel = cel;
    }
    
    public String getEmail () {
        return email; // retornar do BD para o campo 
    }
    
    public void setEmail (String email) {
        this.email = email;
    }
    
    public int rg () {
        return rg; // retornar do BD para o campo 
    }
    
    public void setRG (int rg) {
        this.rg = rg;
    }
    
    public int getCpf () {
        return cpf; // retornar do BD para o campo 
    }
    
    public void setCPF (int cpf) {
        this.cpf = cpf;
    }
    
    public void transformaSenha (String senha) {
        
        for (char c: senha.toCharArray()) { 
            this.senha.concat(Integer.toBinaryString(c).toString());
        } 
    }
    
    public boolean comparaSenha (String senha) {
        transformaSenha(senha);
        if (senha == "metodo do banco de dados retornando a senha"){
            
        }
        return true;
    }
    // acho q somente um metodo de senha já cobre tudo ou seja metodo de baixo pode ser apagado 
    public void transformaSenhaAdmin (String senha) {
        
        for (char c: senha.toCharArray()) { 
            this.senha.concat(Integer.toBinaryString(c).toString());
        } 
    }
    
    private String getSenha () {
        // não vai ser necessário este método;
        return senha; 
    }
    
    public void setSenha (String senha) {
        transformaSenha(senha);
        // metodo de BD com parametro this.senha;
    }
    
    // jonatas
    public void consultarRessarcimentos () {
        
    }
    
    
    // jonatas
    public void cadastrar (String nome, String email, int tel, int cel, int siape, String senha, int rg, int cpf) {
        // metodo de BD
    }
    
}
