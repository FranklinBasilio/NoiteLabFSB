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
    int senha=12345;
    
    public boolean autenticarSenha(int senha){
        if(this.senha==senha){
            System.out.println("acesso permitido!");
            return true;
        }else{
            System.out.println("acesso negado!");
            return false;
        }
    }   
    @Override
        public double getBonificacao(){
            return this.getSalario()*0.15+1000;
        }
    
    
    //outros metodos
}
