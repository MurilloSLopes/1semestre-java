package br.com.fiap.apostila07.view;

import javax.swing.*;

public class ExemploSwitch {
    public static void main(String[] args) {
        //Calculadora (soma. subitração, divisao e multiplicação)
        //Ler dois numeros e a operacão

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digita o numero 1"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digita o numero 2"));

        String op = JOptionPane.showInputDialog("Operação? (+ , - , * , / ");

        switch (op){
            case "+":
                JOptionPane.showMessageDialog(null, numero1 + numero2);
                break;
            case "-":
                JOptionPane.showMessageDialog(null, numero1 - numero2);
                break;
            case "*":
                JOptionPane.showMessageDialog(null, numero1 * numero2);
                break;
            case "/":
                if (numero2 == 0){
                    JOptionPane.showInputDialog(null, "nao e possivel dividir por zero");
                } else {
                    JOptionPane.showMessageDialog(null, numero1 / numero2);
                }
                break;
                default:
                    JOptionPane.showMessageDialog(null, "operacao invalida");
        }
    }
}
