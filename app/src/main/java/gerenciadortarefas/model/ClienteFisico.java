package gerenciadortarefas.model;

import java.util.Date;

public class ClienteFisico extends Cliente{
    
    private String nomeCompleto;
    private String CPF;

    public ClienteFisico(int id, String contato, String email, String endereco, Date dataCadastro, String nomeCompleto, String CPF){
        super(id, contato, email, endereco, dataCadastro);
        this.nomeCompleto = nomeCompleto;
        this.CPF = CPF;
    }

    public String getNomeCompleto(){
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto){
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
}
