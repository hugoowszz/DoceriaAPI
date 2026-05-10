package br.com.doceriaapi.Controller;

import br.com.doceriaapi.models.Produto;
import br.com.doceriaapi.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
@CrossOrigin(origins = "http://localhost:5173")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @GetMapping()
    public ResponseEntity<List<Produto>> listarProdutos() {
        List<Produto> produtos = service.listarProdutos();
        return ResponseEntity.ok(produtos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscarProdutoPorId(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarProdutoPorId(id));
    }

    @PostMapping()
    public ResponseEntity<Produto> criarProduto(@RequestBody Produto produto) {
        Produto novoProduto = service.criarProduto(produto);
        return ResponseEntity.ok(novoProduto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produto> atualizarProduto(@PathVariable Long id, @RequestBody Produto produto) {
        Produto produtoAtualizado = produto;
        return ResponseEntity.ok(service.atualizarProduto(id, produtoAtualizado));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Produto> excluirProduto(@PathVariable Long id) {
        return ResponseEntity.ok(service.excluirProduto(id));
    }
}
