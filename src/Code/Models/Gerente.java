package Code.Models;

import java.util.UUID;


public class Gerente {
    private int id;
    private String nome;
    private String email;
    private String senha;

    public Gerente(String nome, String email, String senha) {
        this.id = 1; 
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public Gerente(int id, String nome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
    

    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getSenha() {
        return senha;
    }
    
    
}
