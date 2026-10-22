/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Evellyn Victoria
 */
public abstract class Funcionario {


    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    public abstract double getBonificacao();

    public abstract String getCargo();

    public String exibirDados() {
        return "Cargo: " + getCargo()
        + "\nNome: " + getNome()
        + "\nCPF: " + getCpf()
         + "\nSalário: " + getSalario()
          + "\nBonificação: " + getBonificacao();
    }
}

