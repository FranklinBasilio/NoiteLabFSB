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
public class TesteGerente {
     public static void main(String args[]){
        
        ControleBonificacao controle = new ControleBonificacao();
        
        Gerente f1 = new Gerente();
        f1.setNome("Joao de deus");
        f1.setCpf("0225588669");
        f1.setSalario(1000);
        f1.setSenha(1234);
        controle.registrar(f1);
        
        Funcionario f2 = new Funcionario();
        f2.setSalario(1000);
        controle.registrar(f2);
        
        System.out.println("Total de bonificacoes: "+controle.getBonificacoes());
    }
}
