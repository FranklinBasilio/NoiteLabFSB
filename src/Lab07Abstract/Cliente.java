/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab07Abstract;

/**
 *
 * @author Danilo Abreu
 */
public class Cliente implements Autentificavel {
    
    private int senha;

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
     
    @Override
    public boolean autentificarUsuario(int senha) {
        if (this.getSenha() == senha) {
            
            return true;
        } else {
            
            return false;
        }
    }

}
