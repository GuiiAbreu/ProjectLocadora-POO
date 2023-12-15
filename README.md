# Locadora de Filmes em Java com Interface Gráfica (Swing), Banco de Dados (PostgreSQL) e Arquitetura MVC 
Este é um projeto de Sistema para uma Locadora de Filmes desenvolvido em Java, utilizando a abordagem de Orientação a Objetos e seguindo a arquitetura MVC (Model-View-Controller).

A interface gráfica é construída com o framework Swing, e a persistência de dados é gerenciada pelo banco de dados relacional PostgreSQL, utilizando os metodos CRUD (Create-Read-Update-Delete).

O sistema consiste em três principais classes: Filme, Cliente e Item, que são gerenciadas de acordo com os princípios do MVC para proporcionar uma estrutura organizada e modular.

O projeto permitiu aplicar os conceitos de POO, estudados na disciplina ministrada pelo Prof. Me. Paulo Freitas no curso de Análise e Desenvolvimento de Sistemas do IFPB Campus Cajazeiras. Além disso, a modularidade do projeto permite que você separe as diferentes funcionalidades em classes distintas, facilitando a manutenção e a escalabilidade do sistema.

## Funcionalidades
O sistema da Locadora de Filmes possui as seguintes funcionalidades principais:

1. Cadastro de Filmes, Clientes e Itens: Permite adicionar novos filmes, clientes e itens ao sistema;
2. Consulta de Filmes, Clientes e Itens: Oferece a capacidade de buscar informações sobre filmes, clientes e itens cadastrados;
3. Utualização de Filmes, Cliente e Itens: Possibilita atualizar os dados de filmes, clientes e itens cadastrados;
4. Exclusão de Filmes, Clientes e Itens: Permite apagar filmes, clientes e itens cadastros no sistema.

## Estrutura e Conteúdo do Projeto

### Model (Modelo):

- **Filme.java:** Representa a entidade Filme com atributos como título, gênero, sinopse, duração, codigo do filme e seus respectivos métodos.

- **Cliente.java:** Modela a entidade Cliente, contendo informações como nome, CPF, e-mail, endereço, data de nascimento, código do cliente e seus respectivos métodos.

- **Item.java:** Representa um item específico na locadora, associando um filme a um cliente e mantendo informações como titulo do filme, tipo, preço, código do item e seus respectivos métodos.


### View (Visão):
- **TelaPrincipal.java:** Apresenta o Menu de Cadastro e a logo do sistema;

- **TelaCadastroFilme.java:** Contém o formulario de cadastro e os butões para execução dos métodos (SalvarFilme, ApagarFilme, LimparTela, CancelarInserção e consultarFilmes);

- **TelaCadastroCliente.java:** Contém o formulario de cadastro e os butões para execução dos métodos (SalvarCliente, ApagarCliente, LimparTela, CancelarInserção e ConsultarClientes);

- **TelaCadastroItem.java:** Contém o formulario de cadastro e os butões para execução dos métodos (SalvarItem, ApagarItem, LimparTela, CancelarInserção e consultarItens);

- **TelaConsultaFilme.java:** Exibe um campo de busca e uma tabela com os campos da classe Filme;

- **TelaConsultaCliente.java:** Exibe um  de busca e uma tabela com os campos da classe Cliente;

- **TelaConsultaItem.java:** Exibe um campo de busca e uma tabela com os campos da classe Item.


### Controller (Controlador): 

Gerencia a interação entre a interface gráfica e as classes do modelo.

- **ControllerFilme.java:** Processa e faz validação dos dados inseridos pelo usuário na TelaCadastroFilme (formulario e botões);
  
- **ControllerCliente.java:** Processa e faz a validação dos dados inseridos pelo usuário na TelaCadastroCliente (formulario e botões);
  
- **ControllerItem.java:** Processa e faz a validação dos dados inseridos pelo usuário na TelaCadastroItem (formulario e botões).


### Database (DAO e ConFactory);

- **FilmeDAO.java:** Realiza a interação da camada model.filme com a classe de conexão, além de efetuar as consultas e operações SQL;
  
- **ClienteDAO.java:** Realiza a interação da camada model.cliente com a classe de conexão, além de efetuar as consultas e operações SQL;
  
- **ItemDAO.java:** Realiza a interação da camada model.item com a classe de conexão, além de efetuar as consultas e operações SQL;

- **ExceptionDAO.java:** Extende Exception e passa no constructor a mensagem;
  
- **Confactoy.java:** Realiza conexão com o Banco de Dados;
  
- **NewCon.java:** Testa a conexão da aplicação.

## Como Usar

### Requisitos
- JDK 21 (Java Development Kit) instalado;
  
- Java (versão 21.0.1 LTS).

### Configuração do Ambiente de Desenvolvimento:
- IDE Java (recomendado: Apache NetBeans);
  
- Driver JDBC (org.postgresql.Driver). 

### Configuração do Banco de Dados
1. Crie um banco de dados no PostgreSQL para alocar os dados do sistema.

2. Configure as informações de conexão com o banco de dados no arquivo database/DatabaseConfig.java.
```
public class DatabaseConfig {
    public static final String URL = "jdbc:postgresql://localhost:5432/seu_banco_de_dados";
    public static final String USER = "seu_usuario";
    public static final String PASSWORD = "sua_senha";
}
```
### Executando o Projeto
1. Clone o repositório para sua máquina local.
```
git clone https://github.com/seu-usuario/ProjectLocadora-POO.git
```
3. Abra o projeto em sua IDE Java.

4. Configure a conexão com o banco de dados, conforme as instruções acima.

5. Execute a classe TelaPrincipal para iniciar a aplicação.
