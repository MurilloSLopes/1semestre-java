package br.com.fiap.transportadora.view;

import br.com.fiap.transportadora.model.Produto;

public class Terminal {

    public static void main(String[] args) {
        //criacao com o construtor
        Produto p = new Produto(1, "celular", true, 2, 350);

        Produto x = new Produto(10, true, "computador");
    }

}
