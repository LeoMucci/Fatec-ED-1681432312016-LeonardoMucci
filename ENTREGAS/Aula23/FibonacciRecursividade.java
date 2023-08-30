package aula23;

import javax.swing.JOptionPane;

public class FibonacciRecursividade {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite a quantidade de elementos da sequência a serem impressos:");
        int comprimentoSequencia = Integer.parseInt(input);

        StringBuilder sequence = new StringBuilder("Sequência de Fibonacci:");

        for (int i = 1; i <= comprimentoSequencia; i++) {
            sequence.append(" ").append(fibonacci(i));
        }

        JOptionPane.showMessageDialog(null, sequence.toString());
    }

    public static int fibonacci(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
