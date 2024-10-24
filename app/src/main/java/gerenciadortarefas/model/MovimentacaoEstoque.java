package gerenciadortarefas.model;

import java.time.LocalDateTime;

public class MovimentacaoEstoque {

    private int idMovimentacao;
    private Produto produto;
    private Fornecedor fornecedor;
    private TipoMovimentacao tipo;
    private int quantidade;
    private LocalDateTime data;

    public MovimentacaoEstoque(int idMovimentacao, Produto produto, Fornecedor fornecedor, TipoMovimentacao tipo, int quantidade,
            LocalDateTime data) {
        this.idMovimentacao = idMovimentacao;
        this.produto = produto;
        this.fornecedor = fornecedor;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.data = data;
    }

    public int getIdMovimentacao() {
        return idMovimentacao;
    }

    public void setIdMovimentacao(int idMovimentacao) {
        this.idMovimentacao = idMovimentacao;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public TipoMovimentacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoMovimentacao tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

}
