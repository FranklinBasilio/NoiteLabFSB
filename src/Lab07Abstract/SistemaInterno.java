
package Lab07Abstract;


public class SistemaInterno {
    
    public void loginUsuario(Autentificavel a, int senha){
        if(a.autentificarUsuario(senha)){
            System.out.println("Login Realizado");
        }else{
            System.out.println("Login não Realizado");
        }
    }
    
}
