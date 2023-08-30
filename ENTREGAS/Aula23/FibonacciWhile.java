package aula23;

import javax.swing.JOptionPane;

public class FibonacciWhile {

    public static void main(String[] args) {
        int anterior = 0;
        int atual = 1;
        int proximo = 0;

        String input = JOptionPane.showInputDialog("Digite a quantidade de elementos da sequência a serem impressos:");
        int comprimentoSequencia = Integer.parseInt(input);

        int i = 0;
        StringBuilder sequence = new StringBuilder();

        while (i < comprimentoSequencia) {
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;

            sequence.append(anterior).append(" ");

            i++;
        }

        JOptionPane.showMessageDialog(null, "Sequência de Fibonacci: " + sequence.toString());
    }
}