/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Evellyn Victoria
 */
public class Diretor extends Gerente {
  private int senha;
    public Diretor(String nome, String cpf, double salario, int senha) {
    super(nome, cpf, salario, senha);
    }
    @Override
    public double getBonificacao() {
      return super.getBonificacao() + 1000.00;
    }
    @Override
    public String getCargo() {
     return "Diretor";
    }
}  

