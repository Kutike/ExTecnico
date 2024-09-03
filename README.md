# Desafio de Programação


## Índice

- [Questão 1: Soma de Números Sequenciais](#questão-1-soma-de-números-sequenciais)
- [Questão 2: Verificação de Número na Sequência de Fibonacci](#questão-2-verificação-de-número-na-sequência-de-fibonacci)
- [Questão 3: Análise de Faturamento Diário](#questão-3-análise-de-faturamento-diário)
- [Questão 4: Cálculo Percentual de Faturamento por Estado](#questão-4-cálculo-percentual-de-faturamento-por-estado)
- [Questão 5: Inversão de String](#questão-5-inversão-de-string)
- [Considerações Finais](#considerações-finais)

## Questão 1: Soma de Números Sequenciais

### Descrição

Neste desafio, calculei a soma de todos os números de 1 até o valor `INDICE`, que é 13.

### Abordagem

Usei um laço `for` para somar os números de 0 até `INDICE`. O resultado é exibido no final.

## Questão 2: Verificação de Número na Sequência de Fibonacci

### Descrição

Este programa verifica se um número faz parte da sequência de Fibonacci. A sequência começa com 0 e 1, e cada número seguinte é a soma dos dois anteriores.

### Abordagem

Calculei a sequência de Fibonacci até encontrar um número igual ou maior que o número informado. O programa então verifica se o número está na sequência.

## Questão 3: Análise de Faturamento Diário

### Descrição

Este programa analisa um vetor com os valores de faturamento diário de uma distribuidora e retorna:
- O menor faturamento do mês.
- O maior faturamento do mês.
- O número de dias em que o faturamento diário foi maior que a média mensal.

### Limitações

Não implementei a manipulação de dados JSON ou XML, como solicitado, porque não tenho muita familiaridade com essas tecnologias. O código assume que os valores de faturamento são fornecidos diretamente em um vetor.

### Abordagem

O programa percorre o vetor, calculando o menor, maior e a média do faturamento. Depois, conta quantos dias o faturamento foi superior à média mensal.

## Questão 4: Cálculo Percentual de Faturamento por Estado

### Descrição

Este programa calcula o percentual que cada estado contribuiu para o faturamento total mensal de uma distribuidora.

### Abordagem

Primeiro, calculei o faturamento total somando os valores de cada estado. Depois, o programa calcula o percentual de cada estado em relação ao total e exibe os resultados.

## Questão 5: Inversão de String

### Descrição

Este programa inverte os caracteres de uma string. Evitei usar funções prontas, como `reverse()`.

### Abordagem

O programa percorre a string de trás para frente e vai montando uma nova string com os caracteres invertidos, que é então exibida.

## Considerações Finais

Consegui resolver todos os desafios, exceto a parte de manipulação de JSON/XML na Questão 3, devido à minha falta de experiência com essas tecnologias. Sugiro uma revisão futura para melhorar essa parte.
