package aula21;

public class BuscaElemento {
    public static void main(String[] args) {
        int N = 10;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int K = 2;

        long startTime = System.nanoTime();

        int index = buscaElemento(array, K);

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;

        if (index != -1) {
            System.out.println("O elemento " + K + " foi encontrado na posição " + index + " da array.");
        } else {
            System.out.println("O elemento " + K + " não foi encontrado na array.");
        }

        System.out.println("Tempo de execução: " + elapsedTime + " nanossegundos");
    }

    public static int buscaElemento(int[] array, int K) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == K) {
                return i;
            }
        }
        return -1;
    }
}
