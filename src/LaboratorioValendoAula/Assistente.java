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
    
    @Override
    public double getBonificacao(){
        return this.getSalario()*0.10;
    }
   
    @Override//se for administrativo
    public double getAdcionalNoturno(){
        return this.getSalario()*0.25;
    }
}
