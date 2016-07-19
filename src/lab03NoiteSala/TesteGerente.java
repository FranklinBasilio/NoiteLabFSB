/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03NoiteSala;

/**
 *
 * @author usuario
 */
public class TesteGerente {
    
    public static void main(String args[]){
        Gerente g1 = new Gerente();
        g1.setNome("pedro ivo");
        g1.setCpf("11111111111");
        g1.setSalario(1200);
        g1.autenticarSenha(12345);
        System.out.println("Nome:"+ g1.getNome());
        System.out.println("Salario:"+g1.getSalario());
        System.out.println("Bonificação"+g1.getBonificacao());
    }
    
}
