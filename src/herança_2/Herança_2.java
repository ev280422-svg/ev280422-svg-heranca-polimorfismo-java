/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herança_2;

import java.util.Scanner;
import model.Diretor;
import model.Estagiario;
import model.Funcionario;
import model.Gerente;
import model.Programador;
import service.ControleDeBonificacoes;

/**
 *
 * @author Evellyn Victoria
 */
public class Herança_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Programador");
    System.out.print("Nome: ");
    String nome = sc.nextLine();
    System.out.print("CPF: ");
    String cpf = sc.nextLine();
    System.out.print("Salario: ");
    double salario = sc.nextDouble();
    sc.nextLine();
    System.out.print("Linguagem: ");
    String linguagem = sc.nextLine();

    Funcionario p = new Programador(nome, cpf, salario, linguagem);
    System.out.println("\nEstagiario");
    System.out.print("Nome: ");
    nome = sc.nextLine();
    System.out.print("CPF: ");
    cpf = sc.nextLine();
    System.out.print("Salario: ");
    salario = sc.nextDouble();
    sc.nextLine();
    System.out.print("Instituicao: ");
    String instituicao = sc.nextLine();

    Funcionario e = new Estagiario(nome, cpf, salario, instituicao);
    System.out.println("\nGerente");
    System.out.print("Nome: ");
    nome = sc.nextLine();
    System.out.print("CPF: ");
    cpf = sc.nextLine();
    System.out.print("Salario: ");
    salario = sc.nextDouble();
    System.out.print("Senha: ");
    int senha = sc.nextInt();
    sc.nextLine();
    
    Gerente g = new Gerente(nome, cpf, salario, senha);
    System.out.println("\nDiretor");
    System.out.print("Nome: ");
    nome = sc.nextLine();
    System.out.print("CPF: ");
    cpf = sc.nextLine();
    System.out.print("Salario: ");
    salario = sc.nextDouble();
    System.out.print("Senha: ");
    senha = sc.nextInt();
    
    Funcionario d = new Diretor(nome, cpf, salario, senha);
    System.out.print("\nDigite a senha do gerente: ");
    int senhaDigitada = sc.nextInt();
    if (g.autentica(senhaDigitada))
        System.out.println("Acesso permitido");
    else
        System.out.println("Acesso negado");
    ControleDeBonificacoes c = new ControleDeBonificacoes();
    c.registra(p);
    c.registra(e);
    c.registra(g);
    c.registra(d);
    System.out.println("\n" + p.exibirDados());
    System.out.println(e.exibirDados());
    System.out.println(g.exibirDados());
    System.out.println(d.exibirDados());
    System.out.println("\nTotal de bonificacoes: R$ "
            + String.format("%.2f", c.getTotalDeBonificacoes()));

}  
    }
    
