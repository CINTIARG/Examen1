
package examen;
import java.util.Random;

public class realDado {
    
    private String lado0=A;
    private String lado1=K;
    private String lado2=Q;
    private String lado3=J;
    private String lado4=10;
    private String lado5=9;
    
    public String juego(){
    
    Random aleatorio= new Random();
    int numero=aleatorio.nextInt(5);
        switch(numero){
            case 0:
                return lado0;
            case 1:
                return lado1;
            case 2: 
                return lado2;
            case 3: 
                return lado3;
            case 4: 
                return lado4;
            case 5 : 
                return lado5;   
        }
        return this.juego();
    }
    
}

