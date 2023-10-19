package implementaciones;

import excepciones.BolsaExcepcion;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bolsa {

    private int tamBolsa;
    private int numObjetos;
    private ArrayList<Integer> objetos;

    //Cnstructor de clase que inicializa atributo tamBolsa.
    public Bolsa(int tamBolsa) {
        if (tamBolsa < 0) {
            throw new BolsaExcepcion("El tamaño de la bolsa no puede ser negativo");
        }
        this.tamBolsa = tamBolsa;
        this.numObjetos = 0;
        this.objetos = new ArrayList<>();
    }

    //Método obtenNumObjetos()
    public int obtenNumObjetos() {
        return numObjetos;
    }

    //Método vacia()
    public boolean vacia() {
        return numObjetos == 0;
    }

    //Método agrega(objeto)
    public void agrega(Integer objeto) {
        if (numObjetos >= tamBolsa) {
            throw new BolsaExcepcion("La bolsa esta llena, no se puede agregar mas");
        }
        objetos.add(objeto);
        numObjetos++;
    }

    //Método llamado remueve()
    public Integer remueve() {
        if (vacia()) {
            throw new BolsaExcepcion("La bolsa esta vacia, no se puede remover");
        }
        Random rand = new Random();
        int indice = rand.nextInt(numObjetos);
        Integer objetoEliminado = objetos.remove(indice);
        numObjetos--;
        return objetoEliminado;
    }

    //Método remueve(objeto)
    public Integer remueve(Integer objeto) {
        if (vacia()) {
            throw new BolsaExcepcion("La bolsa esta vacia, no se puede remover.");
        }
        boolean removido = objetos.remove(objeto);
        if (removido) {
            numObjetos--;
            return objeto;
        } else {
            return null; // El objeto no se encontró en la bolsa.
        }
    }

    //Método llamado limpia()
    public void limpia() {
        objetos.clear();
        numObjetos = 0;
    }

    //Método cuenta(objeto)
    public int cuenta(Integer objeto) {
        int contador = 0;
        for (Integer item : objetos) {
            if (item.equals(objeto)) {
                contador++;
            }
        }
        return contador;
    }

    //Método contiene(objeto)
    public boolean contiene(Integer objeto) {
        return objetos.contains(objeto);
    }

    //Método obtenObjetos()
    public Integer[] obtenObjetos() {
        Integer[] resultado = new Integer[numObjetos];
        objetos.toArray(resultado);
        return resultado;
    }

    //Método toString()
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bolsa de objetos Integer: [");
        for (int i = 0; i < numObjetos; i++) {
            sb.append(objetos.get(i));
            if (i < numObjetos - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
