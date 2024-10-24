package gerenciadortarefas.model;

public class Produto {

    private int idProduto;
    private String nome;
    private String categoria;
    private double preco;
    private int quantidade;

    public Produto(int idProduto, String nome, String categoria, double preco, int quantidade) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }



    public int getIdProduto() {
        return idProduto;
    }



    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
}
