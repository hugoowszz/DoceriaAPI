package br.com.doceriaapi.config;

import br.com.doceriaapi.models.Produto;
import br.com.doceriaapi.models.Tipo;
import br.com.doceriaapi.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class initialConfig implements CommandLineRunner {
    @Autowired
    private ProdutoRepository repository;

    @Override
    public void run(String... args) throws Exception {

        Produto produto1 = new Produto(null, "Bolo de Chocolate", 14.90, Tipo.BOLO_DE_POTE, 9, null);
        Produto produto2 = new Produto(null, "Bolo de Laka", 14.90, Tipo.BOLO_DE_POTE, 3, null);
        Produto produto3 = new Produto(null, "Açaí com nutella", 14.90, Tipo.ACAI, 12, null);
        repository.save(produto1);
        repository.save(produto2);
        repository.save(produto3);
    }
}
