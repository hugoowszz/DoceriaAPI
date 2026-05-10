# DoceriaAPI

🍰 Doceria API <br>
API RESTful desenvolvida com Java e Spring Boot para gerenciamento de produtos de uma doceria. Projeto construído como parte do meu portfólio durante a graduação em Análise e Desenvolvimento de Sistemas.

📋 Sobre o Projeto <br>
A Doceria API permite realizar operações completas de CRUD (Create, Read, Update, Delete) sobre o cadastro de produtos. A aplicação segue a arquitetura em camadas do Spring Boot (Controller → Service → Repository), com integração a banco de dados relacional via Spring Data JPA.
O projeto também está preparado para integração com frontends modernos, com suporte a CORS configurado para desenvolvimento local.

📁 Estrutura do Projeto <br>
src/ <br>
└── main/ <br>
    └── java/ <br>
        └── br/com/doceriaapi/ <br>
            ├── Controller/ <br>
            │   └── ProdutoController.java   # Endpoints REST <br>
            ├── models/ <br>
            │   └── Produto.java             # Entidade JPA <br>
            ├── service/
                └── ProdutoService.java      # Regras de negócio <br>

🔗 Endpoints — Produto <br>
GET/produto - Lista todos os produtos. <br>
GET/produto/{id} - Busca produto por ID. <br>
POST/produto - Cadastra um novo produto. <br>
PUT/produto/{id} - Atualiza um produto existente. <br>
DELETE/produto/{id} - Remove um produto.

📌 Status do Projeto <br>
🚧 Em desenvolvimento — novas funcionalidades sendo adicionadas.

👨‍💻 Autor <br>
Victor Hugo Rodrigues dos Santos <br>
Estudante de Análise e Desenvolvimento de Sistemas — Instituto Infnet
