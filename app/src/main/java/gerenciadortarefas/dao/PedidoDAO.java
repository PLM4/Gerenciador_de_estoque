package gerenciadortarefas.dao;

import java.util.List;

import gerenciadortarefas.model.Pedido;

public interface PedidoDAO {
    void addPedido(Pedido pedido);

    boolean cancelarPedido(int idPedido);

    boolean atualizarPedido(Pedido pedido);

    Pedido buscarPedidoId(int idPedido);

    List<Pedido> listarPedidos();
}
