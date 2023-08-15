# **ALGORITMO 3** 
```java
1 - Function BuscaBinaria(x){
2 -    esq = 1 
3 -    dir = n
4 -        enquanto esq <= dir faca{
5 -            meio = ((esq + dir) /2) 
6 -           se A[meio] == x entao 
7 -               devolve meio 
8 -           senao se x > A[meio] entao 
9 -                   esq = meio + 1 
10 -               senao 
11 -                   dir = meio - 1 
12 -           }
13 -           14 devolve -1
14 -        }
```
### Análise de Contagem de Instruções - Algoritmo Busca Binaria

### Análise de Contagem de Instruções - Algoritmo 3

**Fora do Loop:**

**Linha 2 e Linha 3:**
- Instrução: Inserção de valor
- Total de Instruções: 2

**Dentro do Loop:**

**Linha 4:**
- Instrução: Comparação de valores
- Total de Instruções: 1

**Linha 5:**
- Instrução: Inserção de valores e operação aritmética
- Total de Instruções: 2

**Linha 6:**
- Instrução: Acesso ao valor de um array e comparação de valores
- Total de Instruções: 2

**Linha 7:**
- Instrução: Retorno de valor
- Total de Instruções: 1

**Linha 8:**
- Instrução: Acesso ao valor de um array e comparação de valores
- Total de Instruções: 2

**Linha 9:**
- Instrução: Inserção de valores e operação aritmética
- Total de Instruções: 2

**Linha 11:**
- Instrução: Inserção de valores e operação aritmética
- Total de Instruções: 2

**Conclusão:**

- Total de instruções fora do loop: 2
- Total de instruções dentro do loop: 12


**Total de instruções no melhor caso:**
- 14 instruções 

**Total de instruções no pior caso:**
- 14 * interações
