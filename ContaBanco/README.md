# 💻 Projeto Conta Bancária em Java

Este projeto simula a criação de uma conta bancária por meio de um terminal. O usuário insere seus dados, e o sistema retorna uma mensagem com os detalhes da conta. A aplicação foi desenvolvida com foco em prática de entrada de dados, validação e manipulação de classes em Java.

## 📚 Sobre o projeto

O programa solicita ao usuário:
- Número da conta (validação para garantir número inteiro)
- Número da agência
- Nome do cliente
- Saldo inicial (validação para garantir número decimal)

Após a entrada correta de todos os dados, uma mensagem de boas-vindas é exibida com os dados da conta.

### 📌 Funcionalidades

- Validação de entrada para números inteiros e decimais
- Tratamento de exceções com `try/catch`
- Uso de `Scanner` para entrada de dados via terminal
- Encapsulamento de dados na classe `ContaBancaria`
- Exibição formatada de informações usando `printf`

## Tecnologias Utilizadas

- Java 8 ou superior
- Scanner para entrada de dados no terminal
- Git para controle de versão

## Como Rodar o Projeto

1. Clone o repositório para sua máquina local.
   ```bash
   git clone https://github.com/ArianeTrias/conta-bancaria-java.git
   ```
2. Compile os arquivos `.java` usando o compilador Java.
   ```bash
   javac ContaBancaria.java ContaTerminal.java
   ```
3. Execute o projeto.
   ```bash
   java ContaTerminal
   ```

## Observações

- Caso o saldo informado seja inválido, o sistema pedirá para inserir um valor válido.
- O sistema imprime a mensagem de boas-vindas com os dados da conta bancária criada.















