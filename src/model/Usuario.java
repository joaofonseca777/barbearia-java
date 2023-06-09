package model;

import java.util.Date;

/**
 *
 * @author Paula e Weden
 */
public class Usuario extends Pessoa {

    protected String senha;
    protected String nivelAcesso;

    public Usuario( int id, String nome, String senha) {
        super(id, nome);
        this.senha = senha;
    }

    public Usuario(String senha, String nivelAcesso, int id, String nome, char sexo, String dataNascimento, String telefone, String email, String rg) {
        super(id, nome, sexo, dataNascimento, telefone, email, rg);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
  
  
}
/**
 * Gerando construtor Teclas (Alt+inset) this e get e set
 * 
 */