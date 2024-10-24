package gerenciadortarefas.model;

import java.time.LocalDateTime;

public class ClienteFisico extends Cliente {

    private String nomeCompleto;
    private String CPF;

    public ClienteFisico(int idClienteFisico, String contato, String email, String endereco, LocalDateTime dataCadastro,
            String nomeCompleto, String CPF) {
        super(idClienteFisico, contato, email, endereco, dataCadastro);
        this.nomeCompleto = nomeCompleto;
        this.CPF = CPF;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    @Override
    public String getIdentificacao() {
        return "CPF:" + this.CPF;
    }

    public String toString() {
        return "id: " + id + ", contato: " + contato + ", email: " + email + ", endereco: " + endereco
                + ", data de cadastro: "
                + dataCadastro + ", nome completo: " + nomeCompleto + ", CPF: " + CPF;
    }
}

// Separar dados simplificados como nome, contato e email de informações gerais.
