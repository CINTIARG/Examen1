
package examen;

public class Cubilete {

    private static Integer cambio;
    realDado dado1= new realDado();
    realDado dado2= new realDado();
    realDado dado3= new realDado();
    realDado dado4= new realDado();
    realDado dado5= new realDado();
    
    public Integer getCambio(){
       return cambio;
    }
    public void setCambio(Integer cambio){
        Cubilete.cambio=cambio;
    }
    
    public String Suerte(){
        return String.format("%s\n%s\n%s\n%s\n%s",dado1.juego(),
                dado2.juego(),dado3.juego(),dado4.juego(),dado5.juego());
    }
    public String Mejorar(Integer cambio){
        this.cambio=cambio;
        switch(cambio){
            case 1: return (dado1.juego());
            case 2: return (dado2.juego());
            case 3: return (dado3.juego());
            case 4: return (dado4.juego());
            case 5: return (dado5.juego());
        }
        return this.Mejorar(cambio);
    }
    if(cambio>=0 && cambio<6) {
    switch(cambio){
        case 1: return (dado1.juego());
    } else {
            
            }
        
}
}
