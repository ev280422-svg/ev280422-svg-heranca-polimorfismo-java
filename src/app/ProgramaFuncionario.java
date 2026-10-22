/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;
import java.util.Scanner;
import model.*;
import service.ControleDeBonificacoes;
/**
 *
 * @author Evellyn Victoria
 */
public class ProgramaFuncionario {
    public static void main(String[] args) {
        Scanner pf=new Scanner(System.in);
        System.out.println("Nome do programador:");
        String nome =pf.nextLine();
        System.out.println("CPF:");
        String cpf= pf.nextLine();
        System.out.println("Salário:");
        double salario=pf.nextDouble();
        pf.nextLine();
        System.out.println("Linguagem:");
        String linguagem =pf.nextLine();
        
        Funcionario p =new Programador(nome, cpf, salario, linguagem);
        System.out.println("Nome do estagiário:");
        nome=pf.nextLine();
        System.out.println("CPF:");
        cpf=pf.nextLine();
        System.out.println("Salário:");
        salario=pf.nextDouble();
        pf.nextLine();
        System.out.println("Instituição:");
        String instituicao = pf.nextLine();
        
        Funcionario e=new Estagiario(nome, cpf, salario, instituicao);
        System.out.println("Nome do gerente:");
        nome = pf.nextLine();
        System.out.println("CPF:");
        cpf = pf.nextLine();
        System.out.println("Salário:");
        salario = pf.nextDouble();
        System.out.println("Senha:");
        int senha = pf.nextInt();
        pf.nextLine();

        Gerente g= new Gerente(nome, cpf, salario, senha);
        System.out.println("Nome do diretor:");
        nome = pf.nextLine();
        System.out.println("CPF:");
        cpf = pf.nextLine();
        System.out.println("Salário:");
        salario = pf.nextDouble();
        System.out.println("Senha:");
        senha = pf.nextInt();

        Funcionario d =new Diretor(nome, cpf, salario, senha);
        System.out.println("Digite a senha do gerente:");
        int digitada =pf.nextInt();
        if (g.autentica(digitada))
            System.out.println("Acesso permitido");
        else
            System.out.println("Acesso negado");
        ControleDeBonificacoes c=new ControleDeBonificacoes();
        c.registra(p);
        c.registra(e);
        c.registra(g);
        c.registra(d);
        System.out.println("\n" + p.exibirDados());
        System.out.println("\n" + e.exibirDados());
        System.out.println("\n" + g.exibirDados());
        System.out.println("\n" + d.exibirDados());
        System.out.println("\nTotal de bonificações: R$ "+ c.getTotalDeBonificacoes());
         String relatorio = p.exibirDados() + "\n"
          + e.exibirDados() + "\n"
          + g.exibirDados() + "\n"
           + d.exibirDados()
           + "\n------------------------------"+ "\nTotal de bonificações: R$ "
                 + String.format("%.2f", c.getTotalDeBonificacoes());
           System.out.println(relatorio);

            
    }
}   

