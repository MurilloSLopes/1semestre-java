package br.com.fiap.apostila07.view;

import javax.swing.*;

public class TesteEleitores {
    public static void main(String[] args) {

        //declaracao
        int idade;
        int totalObrigatorio = 0;

        //laco for ( int = declaracao - i = nome variavel - 1 valor
        for (int i = 1; i <= 3; i++) {

            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa " + i + ":"));

            if (idade < 16) {
                JOptionPane.showMessageDialog(null, "Pessoa " + i + ": Não eleitor");

            } else if (idade >= 18 && idade <= 65) {
                JOptionPane.showMessageDialog(null, "Pessoa " + i + ": Eleitor obrigatório");
                totalObrigatorio++;

            } else {
                JOptionPane.showMessageDialog(null, "Pessoa " + i + ": Eleitor facultativo");
            }
        }

        JOptionPane.showMessageDialog(null,"Total de eleitores obrigatórios: " + totalObrigatorio);



    }
}
