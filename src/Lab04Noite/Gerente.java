/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab04Noite;

/**
 *
 * @author usuario
 */
public class Gerente extends Funcionario{
    private int senha;
    
    public boolean autenticarSenha(int senha){
        if(this.getSenha()==senha){
            System.out.println("ACESSO PERMITIDO");
            return true;
        }else{
            System.out.println("ACESSO NEGADO");
            return false;
        }
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
     public double getBonificacao(){
        return this.getSalario()*0.15;
    }
}
