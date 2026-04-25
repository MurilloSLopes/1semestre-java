package br.com.fiap.apostila07.view;

import javax.swing.*;

public class TesteTamanho {
    public static void main(String[] args) {

        String nome1;
        String nome2;
        double altura1;
        double altura2;
        double peso1;
        double peso2;

        //pessoa01
        nome1 = JOptionPane.showInputDialog("Digite o nome da pessoa 1:");

        altura1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da pessoa 1:"));

        peso1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da pessoa 1:"));

        //Pessoa02
        nome2 = JOptionPane.showInputDialog("Digite o nome da pessoa 2:");

        altura2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da pessoa 2:"));

        peso2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da pessoa 2:"));

        // Comparação peso
        int opcaoPeso;

        if (peso1 > peso2) {
            opcaoPeso = 1;
        } else if (peso2 > peso1) {
            opcaoPeso = 2;
        } else {
            opcaoPeso = 0;
        }

        switch (opcaoPeso) {
            case 1:
                JOptionPane.showMessageDialog(null, "Mais pesado: " + nome1);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Mais pesado: " + nome2);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ambos têm o mesmo peso");
        }

        //comparacao altura
        int opcaoAltura;

        if (altura1 > altura2) {
            opcaoAltura = 1;
        } else if (altura2 > altura1) {
            opcaoAltura = 2;
        } else {
            opcaoAltura = 0;
        }

        switch (opcaoAltura) {
            case 1:
                JOptionPane.showMessageDialog(null, "Mais alto: " + nome1);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Mais alto: " + nome2);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ambos têm o mesmo tamanho");
        }
    }
}
