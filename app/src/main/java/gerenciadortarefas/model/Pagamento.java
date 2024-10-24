package gerenciadortarefas.model;

import java.time.LocalDateTime;

public class Pagamento {

    private Pedido pedido;
    private double valor;
    private int idPagamento;
    private LocalDateTime dataPagamento;
    private TipoStatusPedido statusPagamento;
    private FormaPagamento formaPagamento;

    public Pagamento(Pedido pedido, double valor, int idPagamento, LocalDateTime dataPagamento,
            TipoStatusPedido statusPagamento,
            FormaPagamento formaPagamento) {
        this.pedido = pedido;
        this.valor = valor;
        this.idPagamento = idPagamento;
        this.dataPagamento = dataPagamento;
        this.statusPagamento = statusPagamento;
        this.formaPagamento = formaPagamento;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(int idPagamento) {
        this.idPagamento = idPagamento;
    }

    public LocalDateTime getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDateTime dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public TipoStatusPedido getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(TipoStatusPedido statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
}
