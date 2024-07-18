# E-commerce Game Store
[![Static Badge](https://img.shields.io/badge/License-MIT-green.svg)](https://github.com/jacubavicius/game-store/new/main)


## Sobre o projeto
O projeto E-commerce Game Store é uma aplicação desenvolvida com <b>Spring Boot</b> e <b>Java 17</b>, criada como atividade no bloco 2 no <b>Bootcamp Generation</b>. O objetivo é demonstrar habilidades em desenvolvimento com Spring Boot. 
Esta aplicação de e-commerce para uma loja de jogos inclui funcionalidades básicas de <b>CRUD</b> utilizando os recursos das anotações do Spring Boot e <b>Data JPA</b>. Além disso, segue o padrão de arquitetura de software <b>MVC</b>.

## Funcionalidades
- Cadastros de jogos e categorias
- Exibição de lista de jogos disponíveis
- Pesquisa de jogos por nome ou categoria
- Edição de dados de jogos cadastrados
- Excluir jogos cadastrados

## Testes com Insonmia
![MetodosCategoria](https://github.com/jacubavicius/game-store/blob/main/assets/metodos-categoria.png)  ![getAllCategorias](https://github.com/jacubavicius/game-store/blob/main/assets/getAllCategorias.png)


![MetodosProduto](https://github.com/jacubavicius/game-store/blob/main/assets/metodos-produto.png)   ![getAllProdutos](https://github.com/jacubavicius/game-store/blob/main/assets/getAllProdutos.png)

## Tecnologia utilizada
### Back-End
- Java 17
- Spring Boot
- JPA/Hibernate
- Maven

### Banco de Dados
- MySQL

## Como executar o projeto
#### Pré-Requisito: Java 17 e MySQL
```bash
# clonar repositório
git clone https://github.com/jacubavicius/game-store.git

# entrar na pasta do projeto
cd  game-store

# configurar o banco de dados MySQL
## acesse o diretório
cd game-store\gamestore\src\main\resources

## atualize o arquivo 'application.properties' com username e password
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

# construa o projeto com Maven no terminal
mvn clean install

# ainda no terminal, execute
mvn spring-boot:run

```
## Autora

Este projeto foi desenvolvido por <b>Gabriella Jacubavicius</b>

[![linkedin](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/gabriella-jacubavicius/)
