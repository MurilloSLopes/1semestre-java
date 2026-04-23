package br.com.fiap.apostila07.view;

import javax.swing.*;
import java.util.Scanner;

public class ExemploCondicional {
    public static void main(String[] args) {
        //ler a media final
        double media = Double.parseDouble(JOptionPane.showInputDialog("Digite a media"));

        //dizer se esta aprovado, retido ou exame.
        if (media >= 6){
            JOptionPane.showMessageDialog(null, "Aprovado");
        } else if (media >= 4) {
            JOptionPane.showMessageDialog(null, "Exame");
        } else {
                JOptionPane.showMessageDialog(null, "Retido");

            }

    }
}
