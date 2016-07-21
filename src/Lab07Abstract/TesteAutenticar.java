package Lab07Abstract;


public class TesteAutenticar {

 
    public static void main(String[] args) {
        // TODO code application logic here
        Gerente f = new Gerente();
        f.setSenha(123);
        
        Cliente c = new Cliente();
        c.setSenha(567);
        
        Autentificavel u1=f;
        Autentificavel u2=c;
        
        
        SistemaInterno si = new SistemaInterno();
        si.loginUsuario(u1, 123);
        si.loginUsuario(u2, 567);
        
        
    }
    
}
