# **ALGORITMO 3** 
```java
Assumir que x está em A[1..n]
Esq = 1
Dir = n
Enquanto Esq <= Dir faça
    Meio = (Esq + Dir) / 2
    Se A[Meio] == x então
        Devolve Meio
    Senao se x > A[meio] então
        Esq = meio + 1
    Senao
        Dir = meio - 1
Devolva -1
}
```


### Tempo total
```java
Tble(n) = 2T + Tpx + 4Tpx + 2Tpx + 2T(Px - 1) + 2T(Px - 1) + T
        = 2T + 7Tpx + 2Tpx - 2T + 2Tpx - 2T + T
        = 11Tpx - T
```
### Execução por linha
```java
Linha 1: executa 1x
Linha 2: executa 1x
Linha 3: executa Px vezes
Linha 4: executa Px vezes
Linha 5: executa Px vezes
Linha 6: executa 1x
Linha 7: Px - 1
Linha 8: Px - 1
Linha 9: Px - 1
```

