package gerenciadortarefas.service;

import gerenciadortarefas.model.Produto;

public interface EstoqueService {
    void addItem(Produto produto, int quantidade);
    void removerItem(Produto produto, int quantidade);
    void atualzarItem(Produto produto, int quantidade);
    int consultarQuantidade(Produto produto);
}
