# **ALGORITMO 1** 
```sh
1 - Function BuscaLinerar(K){
2 - i= 1
3 - for (i < n; i++){
4 -    se A[i] == k{
5 -        devolve i
6 -    }
7 - }
8 - Devolve i
9 - }
```
### Análise de Contagem de Instruções - Algoritmo BuscaLinear

**Linha 1:**
- Instrução: Inserção de valor
- Total de Instruções: 1

**Linha 5 e 8:**
- Instrução: Retorno de valor
- Total de Instruções: 2

**Dentro do loop (Linha 2 e Linha 3):**
- Instrução: Comparação de valores, incremento e acesso ao valor de um array
- Total de Instruções: 4 (2 instruções em cada linha)

**Total de instruções no melhor caso:**
- 7 instruções 

**Total de instruções no pior caso:**
- 3 (fora do loop) + 4n (dentro do loop) = 7n instruções.
