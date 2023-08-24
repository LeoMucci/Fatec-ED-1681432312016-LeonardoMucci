# **ALGORITMO 2** 
```java
Function BuscaLinearEmOrdem(A, n, x) {
1.    i = 1
2.    Enquanto i <= n e x >= A[i] faça
3.        Se A[i] == x então
4.            Devolva i
5.        i = i + 1
6.    Devolva -1
}
```


### Tempo total
```java
Tble(n) = T + 4Tpx + 2Tpx + 2T(Px - 1) + T
         = 2T + 6Tpx + 2Tpx - 2T
         = 8Tpx
```
### 1ª Posição 
```java
Tble(1) = T + 4T1 + 2T1 + 2T(1 - 1) + T
         = 5T + 2T + 2T - 2T + T
         = 8T
```

### Ultima Posição 
```java
Tble(n) = 8T * n
         = 8Tn
```
