package gerenciadortarefas.model;

import java.time.LocalDateTime;

public class ClienteJuridico extends Cliente {

    private String razaoSocial;
    private String CNPJ;

    public ClienteJuridico(int idClienteJuridico, String contato, String email, String endereco, LocalDateTime dataCadastro,
            String razaoSocial,
            String CNPJ) {
        super(idClienteJuridico, contato, email, endereco, dataCadastro);
        this.razaoSocial = razaoSocial;
        this.CNPJ = CNPJ;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    @Override
    public String getIdentificacao() {
        return "CNPJ:" + this.CNPJ;
    }

}
