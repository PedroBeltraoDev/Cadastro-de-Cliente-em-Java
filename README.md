# Projeto: Cadastro e Consulta de Cliente

Este projeto em Java permite que um usuário cadastre seu nome, CPF e número de telefone, armazenando essas informações em um objeto da classe `Cliente`. Além disso, o sistema permite a consulta dos dados cadastrados antes de encerrar a execução.

## 📌 Funcionalidades

- Solicitação do nome do usuário.
- Validação e cadastro do CPF (deve conter exatamente 11 dígitos numéricos).
- Validação e cadastro do número de telefone (deve conter exatamente 9 dígitos numéricos).
- Consulta dos dados cadastrados antes da finalização do programa.

## 📂 Estrutura do Projeto

O projeto está organizado em pacotes para facilitar a manutenção e a legibilidade do código:

📦 Projeto ┣ 📂 src ┃ ┣ 📂 Entities ┃ ┃ ┗ 📜 Cliente.java ┃ ┣ 📂 Main ┃ ┃ ┗ 📜 Main.java ┃ ┣ 📂 Utils ┃ ┃ ┣ 📜 trataEntradaCpf.java ┃ ┃ ┣ 📜 trataEntradaNumero.java ┃ ┃ ┗ 📜 trataEntradaConsulta.java


## 🛠 Tecnologias Utilizadas

- **Java 8+**
- **Scanner** (para entrada de dados do usuário)
- **Regex** (para validação do CPF e número de telefone)

## 🚀 Como Executar

1. **Clone o repositório:**

   ```sh
   git clone https://github.com/seu-usuario/seu-repositorio.git

    Navegue até o diretório do projeto:

cd seu-repositorio

Compile os arquivos Java:

javac -d bin src/**/*.java

Execute o programa:

java -cp bin Main.Main
