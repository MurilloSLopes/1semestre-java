package br.com.fiap.apostila07.view;

public class ExemploConversao2 {
    public static void main(String[] args) {
        int rm = 572724;
        //short x = rm; nao é permitido poque o int é maior que short
        long y = rm;
        //cast para forcar o int ser um short
        short x = (short) rm;

    }
}
