package Lab07Abstract;


public class ControleBonificacao {
    private double totalBonificacoes =0;
    
    public void registrar(Funcionario f){
        this.totalBonificacoes+= f.getBonificacao();
    }
    public double getBonificacoes(){
          return this.totalBonificacoes;
    }
}
