package gerenciadortarefas.model;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Pedido {

    private int id;
    private Cliente cliente;
    private Map<Produto, Integer> itens;
    private StatusPedido statusPedido;
    private LocalDateTime data;

    public Pedido(int id, Produto produto, Cliente cliente, Map<Produto, Integer> itens,StatusPedido statusPedido, LocalDateTime data) {
        this.id = id;
        this.cliente = cliente;
        this.itens = new HashMap<>(itens);
        this.statusPedido = statusPedido;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Map<Produto, Integer> getItens(){
        return itens;
    }

    public void setItens(Map<Produto,Integer> itens){
        this.itens = itens;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "id: " + id + "\nitens: " + itens + "\ncliente: " + cliente + "\nStatus do pedido: " + statusPedido
                + "\ndata: "
                + data;
    }
}
