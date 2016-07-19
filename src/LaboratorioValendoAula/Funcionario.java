/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LaboratorioValendoAula;

/**
 *
 * @author usuario
 */
public class Funcionario {
      private int matricula;
    
    private String nome;
    private String cpf;
    private double salario;
    private String cargo;  // administrativo ou tecnico
    private String turno; // dia ou noite

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

   

    
 public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double getBonificacao(){
        return this.getSalario();
    }
    
    public double getAdcionalNoturno(){
        return this.getSalario();
    }

}
