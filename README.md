# Gestão de Custos Pessoais

Este projeto é uma API desenvolvida em Spring Boot para auxiliar na gestão de custos pessoais. O objetivo é fornecer uma base para controle financeiro, permitindo o cadastro, consulta e gerenciamento de despesas e receitas.

## Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- Spring Cache
- H2 Database (banco de dados em memória para desenvolvimento)
- Maven

## Como executar o projeto

1. **Pré-requisitos**:  
   - Java 17 instalado  
   - Maven instalado (ou utilize o wrapper `mvnw` incluso no projeto)

2. **Clone o repositório**:

   ```sh
   git clone <url-do-repositorio>
   cd gestao-de-custos
   ```

3. **Execute o projeto**:

   ```sh
   ./mvnw spring-boot:run
   ```

   Ou, se estiver no Windows:

   ```sh
   mvnw.cmd spring-boot:run
   ```

4. **Acesse a aplicação**:  
   Por padrão, a API estará disponível em `http://localhost:8080`.

## Endpoints de Performance

### Listar despesas sem paginação

- **GET** `/gestao/performance/sem-paginacao`
- Retorna todas as despesas cadastradas.

### Listar despesas com paginação

- **GET** `/gestao/performance/com-paginacao?page=0&size=10`
- Retorna despesas paginadas.

### Listar despesas por e-mail com paginação

- **GET** `/gestao/performance/com-paginacao/{email}?page=0&size=10`
- Retorna despesas filtradas por e-mail, paginadas.

### Listar despesas por e-mail com paginação e cache

- **GET** `/gestao/performance/cache{email}?page=0&size=10`
- Retorna despesas filtradas por e-mail, paginadas e com cache.

## Estrutura do Projeto

- `src/main/java/br/com/javatutor/gestao_de_custos`: Código fonte principal da aplicação.
- `src/main/resources`: Arquivos de configuração e recursos estáticos.
- `src/test/java/br/com/javatutor/gestao_de_custos`: Testes automatizados.

## Configuração

O nome da aplicação pode ser alterado no arquivo [`application.properties`](src/main/resources/application.properties):

```vi
spring.application.name=Gestao de Custos Pessoais
```

## Testes

Para rodar os testes automatizados:

```sh
./mvnw test
```

## Licença

Este projeto está sob licença Apache 2.0.

---

Desenvolvido por [JavaTutor](https://github.com/JMustang).
