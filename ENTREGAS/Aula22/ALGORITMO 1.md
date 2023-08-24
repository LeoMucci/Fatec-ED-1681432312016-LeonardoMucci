# **ALGORITMO 1** 
```java
Function BuscaLinear(A, n, x) {
    i = 1                       // Linha 1: executa 1x
    Enquanto i <= n faça         // Linha 2: executa Px vezes
        Se A[i] == x então       // Linha 3: executa Px vezes
            Devolva i            // Linha 4: executa 1 vez
        i = i + 1                // Linha 5: Px - 1x
    Devolva -1                   // Retorna 1x
}
```


### Tempo total
```java
Tble(n) = T + Tpx + 2Tpx + 2T(Px - 1) + T
        = 2T + 3Tpx + 2Tpx - 2T + T
        = 5Tpx
```
### 1ª Posição 
```java
Tble(1) = T + T*1 + 2T*1 + 2T(1 - 1) + T
        = 2T + 2T + 2T - 2T + T
        = 5T
```

### Ultima Posição 
```java
Tble(n) = 5T * n
         = 5Tn
```
