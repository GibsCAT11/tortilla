// Clase BolsaGen.java
package implementaciones;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenNum<T> {

    List<T> elementos;

    public BolsaGenNum() {
        elementos = new ArrayList<>();
    }

    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    public void quitar(T elemento) {
        elementos.remove(elemento);
    }

    public boolean contiene(T elemento) {
        return elementos.contains(elemento);
    }

    public List<T> elementosEnLaBolsa() {
        return elementos;
    }
}