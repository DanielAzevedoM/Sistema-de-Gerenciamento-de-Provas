# Sistema de Gerenciamento de Provas

Este é um simples sistema em Java para gerenciamento de gabaritos e provas. Ele permite cadastrar gabaritos, cadastrar respostas de provas, exibir gabaritos e provas, verificar notas e sair do sistema.

## Funcionalidades Principais

### 1. Cadastrar Gabarito
Permite cadastrar o gabarito de uma prova, respondendo cada questão com alternativas de A até D.

### 2. Cadastrar Prova
Permite cadastrar as respostas de uma prova, escolhendo alternativas de A até D.

### 3. Exibir Gabarito
Exibe o gabarito cadastrado.

### 4. Exibir Prova
Exibe as respostas cadastradas para a prova.

### 5. Ver Nota
Calcula e exibe a nota da prova com base no gabarito.

### 6. Sair
Encerra o programa.

## Como Usar

1. Execute o programa.
2. Escolha a opção desejada no menu.
3. Siga as instruções para cadastrar gabarito, cadastrar prova, exibir gabarito, exibir prova, ver nota ou sair.

## Estrutura do Código

O código está organizado em duas classes principais:

- **App:** Contém o método principal `main` que inicia a execução do programa. Chama métodos da classe `Metodos` para lidar com as operações.

- **Metodos:** Contém métodos que realizam as operações específicas do sistema, como cadastrar gabarito, cadastrar prova, exibir gabarito, exibir prova, ver nota, entre outros.

## Observações

- O programa usa um vetor para armazenar as respostas do gabarito e da prova.
- Se uma questão não tiver sido respondida no gabarito, o programa permite preenchê-la posteriormente.
- A verificação de nota compara as respostas da prova com o gabarito e calcula a pontuação.