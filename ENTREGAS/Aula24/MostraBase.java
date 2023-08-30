package binariointerativo;

import javax.swing.JOptionPane;

public class MostraBase {

    private String base;
    private String num;
    private int[] resposta;

    public static void main(String[] args) {
        MostraBase mostraBase = new MostraBase();
        mostraBase.inputBase();
    }

    public void inputBase() {
        String input = JOptionPane.showInputDialog("Digite a base numérica (10, 2, 8 ou 16):");

        int base = Integer.parseInt(input);

        if (base == 2 || base == 10 || base == 8 || base == 16) {
            num = JOptionPane.showInputDialog("Digite o valor inicial:");
            
            int numeroInicial = Integer.parseInt(num);
            int numero = numeroInicial;
            resposta = new int[100];
            
            int index = 0;
            while (numero > 0) {
                resposta[index] = numero % base;
                numero /= base;
                index++;
            }
            

            
            StringBuilder resultMessage = new StringBuilder("");
            for (int i = index - 1; i >= 0; i--) {
                resultMessage.append(resposta[i]);
            }
            
            JOptionPane.showMessageDialog(null,"Resultado da conversão em base : " + base + "\n" + "é: " + resultMessage.toString());
        } else {
            JOptionPane.showMessageDialog(null, "Valor de base incorreto");
            System.exit(base);
        }
    }
}
 	