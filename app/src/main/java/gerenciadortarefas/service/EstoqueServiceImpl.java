package gerenciadortarefas.service;

import java.util.HashMap;
import java.util.Map;

import gerenciadortarefas.model.Produto;

public class EstoqueServiceImpl implements EstoqueService {
    
    private Map<Produto, Integer> estoque = new HashMap<>();

@Override
public void addItem(Produto produto, int quantidade) {
    estoque.merge(produto, quantidade, Integer::sum);
}

@Override
public void removerItem(Produto produto, int quantidade) {
    estoque.computeIfPresent(produto, (p,q) -> (q - quantidade <= 0)? null :q - quantidade);
}

@Override
public void atualzarItem(Produto produto, int quantidade) {
    if(quantidade <= 0){
        estoque.remove(produto);
    } else {
        estoque.put(produto, quantidade);
    }
}

@Override
public int consultarQuantidade(Produto produto) {
    return estoque.getOrDefault(produto,0);
}
}
