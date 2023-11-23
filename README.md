# Palavreado
Este projeto foi desenvolvido utilizando a metodologia TDD (Test-Driven Development). Através desta metodologia, os testes são escritos antes do código de implementação, garantindo assim que todo o código desenvolvido esteja coberto por testes.

## Organização do Projeto
O projeto está organizado em pacotes, onde cada pacote tem uma responsabilidade específica no sistema.

[`br.unipar.si04.tdd.palavreado`](src/main/java/br/unipar/si04/tdd/palavreado/Main.java): Este é o pacote principal que contém a classe Main.java. Esta classe é responsável por iniciar a aplicação.

[`br.unipar.si04.tdd.palavreado.application`](src/main/java/br/unipar/si04/tdd/palavreado/application/Palavreado.java): Este pacote contém a classe Palavreado.java que é responsável por realizar as operações de contagem de palavras, caracteres, entre outras.

[`br.unipar.si04.tdd.palavreado.tests`](src/test/java/PalavreadoTest.java): Este pacote contém os testes unitários do projeto.

## Como usar
Para usar este projeto, você precisa inserir uma URL quando solicitado. O programa irá então buscar o conteúdo da URL e realizar uma série de operações, como contagem de palavras, caracteres, etc.

## Testes
Os testes foram escritos usando a metodologia TDD. Cada método tem seu próprio teste, garantindo que todas as funcionalidades estejam funcionando corretamente.

Para executar os testes, você pode usar o comando: `mvn test` (assumindo que você possua o Maven instalado).

## Contribuição
Contribuições são bem-vindas. Por favor, faça um fork do projeto e crie um Pull Request.

## Licença
Este projeto está licenciado sob a licença MIT.