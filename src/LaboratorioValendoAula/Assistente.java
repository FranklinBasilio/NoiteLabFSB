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
public class Assistente extends Funcionario{
    
    
    //se for tecnico
    
    
    public double getBonificacao(){
        return this.getSalario()*0.10;
    }
    //se for administrativo
    public double getBonificacao(){
        return this.getSalario()*0.10;
    }
}
