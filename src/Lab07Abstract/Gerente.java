
package Lab07Abstract;


public class Gerente extends Funcionario implements Autentificavel {

    private int senha;

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double getBonificacao() {
        return this.getSalario() * 0.15;
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
