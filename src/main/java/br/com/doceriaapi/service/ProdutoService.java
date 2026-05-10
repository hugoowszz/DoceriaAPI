package br.com.doceriaapi.service;

import br.com.doceriaapi.models.Produto;
import br.com.doceriaapi.repository.ProdutoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public List<Produto> listarProdutos() {
        return repository.findAll();
    }

    public Produto buscarProdutoPorId(Long id) {
        return repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Produto não encontrado"));
    }

    public Produto criarProduto(Produto produto) {
        Produto novoProduto = produto;
        return repository.save(novoProduto);
    }

    public Produto atualizarProduto(Long id, Produto produtoAtualizado) {
        if (repository.existsById(id)) {
            produtoAtualizado.setId(id);
            return repository.save(produtoAtualizado);
        }
        return null;
    }

    public Produto excluirProduto(Long id) {
        Produto produto = repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Produto não encontrado"));
        produto.setDeletedAt(LocalDateTime.now());
        return repository.save(produto);
    }
}
