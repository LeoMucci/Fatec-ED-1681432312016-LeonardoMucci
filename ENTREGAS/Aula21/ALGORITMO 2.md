# **ALGORITMO 2** 
```sh
1 - Function BuscaLinerarEmOrdem(K){
2 -    i = 1 
3 -    enquanto i <= n e K >= A[i] {
4 -        se A[i] == k entao {
5 -            devolve i
6 -        }
7 -        i = i + 17 
8 -    }
9 -    devolve -1
10 - }
```
### Análise de Contagem de Instruções - Algoritmo BuscaLinear

**Linha 2 (fora do loop):**
- Instrução: Inserção de valor
- Total de Instruções: 1

**Linha 3 (dentro do loop):**
- Instrução: comparação de valores e acesso ao valor de um array
- Total de Instruções: 2

**Linha 4 (dentro do loop):**
- Instrução: acesso ao valor de um array e comparação de valores
- Total de Instruções: 2

**Linha 5 (dentro do loop):**
- Instrução: retorno de valor
- Total de Instruções: 1

**Linha 6 (dentro do loop):**
- Instrução: retorno de valor
- Total de Instruções: 1

**Total de instruções no melhor caso:**
- 7 instruções 

**Total de instruções no pior caso:**
- 6 * (n / 17)