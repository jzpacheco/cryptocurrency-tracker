# Currency Tracker

Este projeto é uma API para rastrear a cotação de mais de 150 moedas em relação ao dólar. Ele fornece endpoints para adicionar uma nova moeda e para listar todas as moedas que foram adicionadas pelo usuário.

## Funcionalidades Principais

- **Adicionar Moeda**: O endpoint `/api/v1/currency/addCurrency` permite adicionar uma nova moeda ao sistema, fornecendo a sigla da moeda como entrada. A API retorna a cotação atual da moeda em relação ao dólar.

- **Listar Moedas**: O endpoint `/api/v1/currency` lista todas as moedas que foram adicionadas pelo usuário, juntamente com suas cotações atuais em relação ao dólar.

- **Ajuda**: O endpoint `/ajuda` fornece informações sobre o desenvolvedor do projeto.

## Como Usar

1. **Adicionar Moeda**:
   - Faça uma solicitação POST para `/api/v1/currency/addCurrency?name={?}` com a sigla da moeda desejada informada substituindo `{?}` pela moeda desejada, por exemplo SOL,ETH, BTC,EUR,BRL.
   - A resposta incluirá a cotação atual da moeda em relação ao dólar.

2. **Listar Moedas**:
   - Faça uma solicitação GET para `/api/v1/currency` para listar todas as moedas adicionadas pelo usuário, juntamente com suas cotações atuais em relação ao dólar.

3. **Ajuda**:
   - Faça uma solicitação GET para `/ajuda` para obter informações sobre o desenvolvedor do projeto.

## Desenvolvedor

Este projeto foi desenvolvido por Jefferson Zeferino Pacheco como parte da disciplina de Back-end.

## Tecnologias Utilizadas

- Java
- Spring Boot
- Jackson (para análise de JSON)
- Maven (para gerenciamento de dependências)

## Como Executar o Projeto

1. Clone o repositório para o seu ambiente local.
2. Navegue até o diretório do projeto.
3. Execute `mvn spring-boot:run` para iniciar o servidor.
4. Acesse os endpoints da API conforme descrito acima.

