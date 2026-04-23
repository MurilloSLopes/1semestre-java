package br.com.fiap.apostila07.view;

import javax.swing.*;

public class ExemploConversao {
    public static void main(String[] args) {
        //Calcular a area do retangulo
        String baseStr = JOptionPane.showInputDialog("Digite a base do retangulo");
        //Converter para double
        double base = Double.parseDouble(baseStr);

        String alturaStr = JOptionPane.showInputDialog("Digite a altura do retangulo");
        double altura = Double.parseDouble(alturaStr);

        double area = base * altura;

        //mostrando o resultado
        //System.out.println("a area do retangulo é " + area);
        JOptionPane.showMessageDialog(null, area);
    }
}
