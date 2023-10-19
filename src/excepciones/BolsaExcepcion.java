package excepciones;

public class BolsaExcepcion extends RuntimeException {
    
    //Constructor vacío.
    public BolsaExcepcion (){
        super();
    }
    //Constructor con el parámetro s tipo String.
    public BolsaExcepcion(String s){
        super(s);
    }
}
