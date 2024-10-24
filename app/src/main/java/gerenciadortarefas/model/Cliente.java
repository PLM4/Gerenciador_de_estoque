package gerenciadortarefas.model;

import java.time.LocalDateTime;

public abstract class Cliente {

    int id;
    String contato;
    String email;
    String endereco;
    LocalDateTime dataCadastro;

    public Cliente(int id, String contato, String email, String endereco, LocalDateTime dataCadastro) {
        this.id = id;
        this.contato = contato;
        this.email = email;
        this.endereco = endereco;
        this.dataCadastro = dataCadastro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public abstract String getIdentificacao();
}
