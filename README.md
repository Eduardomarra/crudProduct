<h1 align="center">
  API REST
</h1>

API para gerenciar produtos (CRUD).

## Tecnologias
 
- Spring Boot
- Spring MVC
- Spring Data JPA
- SpringDoc OpenAPI 3
- H2 Database
- Bean Validation

## Práticas adotadas

- SOLID, DRY, YAGNI, KISS
- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Tratamento de respostas de erro
- Geração automática do Swagger com a OpenAPI 3

## Como Executar

- Clonar repositório git
- Executar projeto:
- intellij Idea
```
Shift+F10
```

- Eclipse Idea
```
Alt+Shift+X
```

A API poderá ser acessada em [localhost:8080](http://localhost:8080).
O Swagger poderá ser visualizado em [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## API Endpoints

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta [Postman](https://postman.com):

- Criar Produto 
```
http://localhost:8080/product

[
  {
  "name": "string",
  "description": "stringstri",
  "price_in_cents": 0,
  "imgUrl": "string"
}
]
```

- Listar Produtos
```
http://localhost:8080/product

[
  {
  "id": 1,
  "name": "string",
  "description": "stringstri",
  "price_in_cents": 0,
  "imgUrl": "string"
}
]
```

- Listar Produtos por ID
```
http://localhost:8080/product/{id}

[
  {
  "id": 1,
  "name": "string",
  "description": "stringstri",
  "price_in_cents": 0,
  "imgUrl": "string"
}
]
```

- Atualizar Produtos
```
http://localhost:8080/product/{id}

[
 {
  "name": "string",
  "description": "stringstri",
  "price_in_cents": 0,
  "imgUrl": "string"
}
]
```

- Remover Produto
```
http://localhost:8080/product/{id}

[ ]
```
