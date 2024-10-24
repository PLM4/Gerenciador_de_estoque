package gerenciadortarefas.model;

public class Fornece {

    private Fornecedor fornecedor;
    private Produto produto;

    public Fornece(Fornecedor fornecedor, Produto produto) {
        this.fornecedor = fornecedor;
        this.produto = produto;
    }

    public Fornecedor getFornecedor() {
        return this.fornecedor;
    }

    public Produto getProduto() {
        return this.produto;
    }
}
