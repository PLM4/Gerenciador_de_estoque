package gerenciadortarefas.model;

import java.util.Date;

public abstract class Cliente {

    private int id;
    String contato;
    String email;
    String endereco;
    Date dataCadastro;

    public Cliente(int id, String contato, String email, String endereco, Date dataCadastro) {
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

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public abstract String getIdentificacao();
}
