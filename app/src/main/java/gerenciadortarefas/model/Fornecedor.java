package gerenciadortarefas.model;

public class Fornecedor {

    private String nome;
    private String CNPJ;
    private String contato;

    public Fornecedor(String nome, String CNPJ, String contato) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String cNPJ) {
        CNPJ = cNPJ;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}
