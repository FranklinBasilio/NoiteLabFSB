

import java.util.InputMismatchException;


public class Calculadora {
    
    public float dividir(int numerador, int denominador){
        try{
            return numerador/denominador;
        }catch (Exception e){
            System.out.println("Erro "+e.getMessage());
        }
        return 0;
    }
}
