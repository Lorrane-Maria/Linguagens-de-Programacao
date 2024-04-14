# Linguagens de Programacao
# Projeto LOTOFÁCIL sem Interface em Java 17

## Descrição

O projeto LOTOFÁCIL é um sistema de loteria desenvolvido em Java 17 usando IntelliJ. Ele permite que os jogadores façam apostas em diferentes modalidades e verifica os resultados, calculando os prêmios de acordo com as regras estabelecidas. O sistema funciona por meio do terminal, lendo e escrevendo dados para interagir com o usuário.  

## Funcionalidades

- **Menu Interativo:** O sistema apresenta um menu interativo que permite aos jogadores fazerem apostas em diferentes modalidades da loteria LOTOFÁCIL.

- **Apostar de 0 a 100:** Os jogadores podem fazer apostas em números de 0 a 100. O sistema gera aleatoriamente um número vencedor e compara com a aposta do jogador para determinar se ele ganhou ou perdeu.

- **Apostar de A à Z:** Os jogadores podem fazer apostas em letras de A a Z. O sistema escolhe uma letra premiada e compara com a aposta do jogador para determinar se ele ganhou ou perdeu.

- **Apostar em Par ou Ímpar:** Os jogadores podem fazer apostas em números inteiros e o sistema verifica se o número é par ou ímpar. Prêmios são concedidos apenas para números pares.

## Regras de Negócio/Requisitos

- O sistema utiliza estruturas de controle `switch case` e `do while` para apresentar o menu interativo até que o usuário decida sair.

- Regras para a aposta de 0 a 100:
  - Os jogadores devem fazer uma aposta válida de 0 a 100.
  - Um número vencedor é sorteado aleatoriamente pelo sistema.
  - Se o jogador acertar a aposta, ele ganha um prêmio de R$ 1.000,00.

- Regras para a aposta de A à Z:
  - Os jogadores devem fazer uma aposta válida de uma letra de A a Z.
  - Uma letra premiada é definida pelo sistema.
  - Se o jogador acertar a aposta, ele ganha um prêmio de R$ 500,00.

- Regras para a aposta de número par ou ímpar:
  - Os jogadores devem fazer uma aposta válida de um número inteiro.
  - O sistema verifica se o número é par ou ímpar.

- **Bibliotecas Utilizadas:**
  - `java.util.Scanner`: Utilizada para receber entrada do usuário via teclado.
  - `java.util.Random`: Utilizada para gerar números aleatórios para sorteio.
  - `java.io.IOException`: Utilizada para validar os dados digitados ao selecionar o sorteio de número 2.

## Como Rodar o Projeto

1. Certifique-se de ter o JDK 17 instalado em sua máquina.
2. Clone o repositório do projeto ou crie um novo projeto no IntelliJ IDEA.
3. Copie os arquivos Java fornecidos para o seu projeto.
4. Compile e execute o projeto no terminal ou diretamente no IntelliJ IDEA.
5. Siga as instruções no menu interativo para fazer suas apostas e verificar os resultados.

## Demo
https://github.com/Lorrane-Maria/Linguagens-de-Programacao/assets/142905981/c60dae6a-a6dd-4336-87aa-dd5da0e55dfd
---
# Projeto LOTOFÁCIL com Interface em Java 17

## Descrição

O projeto LOTOFÁCIL é um sistema de loteria desenvolvido em Java 17 usando IntelliJ com uma interface gráfica. O sistema permite que os jogadores façam apostas em diferentes modalidades, verifica os resultados e calcula os prêmios de acordo com as regras da loteria. O sistema possui uma tela inicial para iniciar o jogo e uma tela com opções de apostas.

## Funcionalidades

- **Tela Inicial:** Uma tela inicial com um botão para começar o jogo.

- **Menu Interativo:** Após iniciar o jogo, o sistema apresenta um menu interativo que permite aos jogadores fazerem apostas em diferentes modalidades da loteria LOTOFÁCIL.

- **Apostar de 0 a 100:** Os jogadores podem fazer apostas em números de 0 a 100. O sistema gera aleatoriamente um número vencedor e compara com a aposta do jogador para determinar se ele ganhou ou perdeu.

- **Apostar de A à Z:** Os jogadores podem fazer apostas em letras de A a Z. O sistema escolhe uma letra premiada e compara com a aposta do jogador para determinar se ele ganhou ou perdeu.

- **Apostar em Par ou Ímpar:** Os jogadores podem fazer apostas em números inteiros e o sistema verifica se o número é par ou ímpar. Prêmios são concedidos apenas para números pares.

## Regras de Negócio/Requisitos

- O sistema utiliza estruturas de controle `switch case` e `do while` para apresentar o menu interativo enquanto o usuário não decide sair.

- **Aposta de 0 a 100:**
  - Os jogadores fazem uma aposta de um número de 0 a 100.
  - O sistema sorteia aleatoriamente um número de 0 a 100 e compara com a aposta do jogador.
  - Se o jogador acertar, ganha um prêmio de R$ 1.000,00.

- **Aposta de A à Z:**
  - Os jogadores fazem uma aposta de uma letra de A a Z.
  - Uma letra premiada é definida pelo sistema.
  - Se o jogador acertar, ganha um prêmio de R$ 500,00.

- **Aposta em Par ou Ímpar:**
  - Os jogadores fazem uma aposta de um número inteiro.
  - O sistema verifica se o número é par ou ímpar.
  - Prêmios são concedidos apenas para números pares.

## Como Rodar o Projeto

1. Certifique-se de ter o JDK 17 instalado em sua máquina.
2. Clone o repositório do projeto ou crie um novo projeto no IntelliJ IDEA.
3. Copie o código fornecido para o seu projeto e organize-o adequadamente.
4. Compile e execute o projeto no IntelliJ IDEA ou em outra IDE.
5. A tela inicial será exibida; clique para iniciar o jogo.
6. Siga as instruções no menu interativo para fazer suas apostas e verificar os resultados.

## Bibliotecas Utilizadas

- `java.util.Scanner`: Para entrada de dados do usuário.
- `java.util.Random`: Para gerar números aleatórios para sorteio.
- `java.lang.Character`: Para manipulação de caracteres, como verificar se um caractere é uma letra.
- `javax.swing`: Para a criação da interface gráfica com a tela inicial e as opções de apostas.

## Demo
https://github.com/Lorrane-Maria/Linguagens-de-Programacao/blob/main/Projetos/projeto_lotofacil/LOTOF%C3%81CIL%20INTERFACE%20-%20DEMO.mp4

