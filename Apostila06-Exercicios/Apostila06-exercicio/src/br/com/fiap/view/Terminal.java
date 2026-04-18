package br.com.fiap.view;

import br.com.fiap.model.Profissao;
import br.com.fiap.model.Funcionario;

import java.util.Scanner;

public class Terminal {
    static void main(String[] args) {

        //ler os dados dos funcionarios
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("Digite seu numero de matricula: ");
        long matricula = leitor.nextLong();

        System.out.println("Digite sua profissao: ");
        String nomeProfissao = leitor.next() + leitor.nextLine();

        System.out.println("Digite seu salario: ");
        double salario = leitor.nextDouble();

        //criar objetos funcionario com os dados
        Profissao p = new Profissao(nomeProfissao);
        Funcionario f = new Funcionario(matricula, nome, p);
        f.setSalario(salario);

        System.out.println(f.exibirDados());

    }
}
