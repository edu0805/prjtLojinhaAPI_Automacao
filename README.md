## Lojinha API Automação
Esse é um repositório que contém automação de alguns testes de API Rest de um software denominado lojinha. Os sub-tópicos abaixo descrevem algumas decisões tomadas na estruturação do projeto.

### Tecnologias Utilizadas

- JAVA
  https://www.oracle.com/br/java/technologies/javase/jdk11-archive-downloads.html
- JUnit
  https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-engine/5.8.2
- RestAssured
  https://mvnrepository.com/artifact/io.rest-assured/rest-assured/4.4.0
- Maven
  https://maven.apache.org/

### Testes Automatizados
**Classe Produto**
Testes para validar as partições de equivalência relacionadas ao valor do Produto na Lojinha, que estão vinculadas diretamente a regra de negócio que diz que o valor do produto deve estar entre R$ 0,01 e R$ 7.000,00

### Notas Gerais

- Sempre utilizado a anotação Before Each para capturar o token que será utilizado posteriormente nos métodos de teste.
- Dados são enviados para API através do uso de classe POJO
- Criamos dados iniciais através do uso de classe Data Factory, para facilitar a criação e controle dos mesmo.
- Nesse projeto foi feito o uso do JUnit 5, o que nos dá a possibilidade de usar a anotação DisplayName para maior descrição de cada teste unitário.
