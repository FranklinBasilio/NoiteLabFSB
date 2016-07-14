/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03Funcionario;

/**
 *
 * @author usuario
 */
public class Gerente extends Funcionario{
   int senha = 12345;
    
    public boolean autenticarSenha(int senha){
        if(this.senha == senha){
            System.out.println("Acesso Permitido");
            return true;
        }else{
            System.out.println("Acesso Negado");
            return false;
        }
    }
    
    public double getBonificacao(){
        return super.getBonificacao()+1000;
    }
    //outros metodos
}
