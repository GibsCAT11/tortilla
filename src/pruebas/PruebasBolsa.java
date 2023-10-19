package pruebas;

import excepciones.BolsaExcepcion;
import implementaciones.Bolsa;

public class PruebasBolsa {

    public static void main(String[] args) {
        // Crear una instancia de la clase Bolsa con un tamaño de 5
        Bolsa bolsa = new Bolsa(8);

        // Determinar si la bolsa está vacía
        System.out.println("La bolsa esta vacia? " + bolsa.vacia());

        // Agregar enteros a la bolsa: 8, 9, 7
        bolsa.agrega(8);
        bolsa.agrega(9);
        bolsa.agrega(7);

        // Mostrar el número de enteros en la bolsa
        System.out.println("Numero de enteros en la bolsa: " + bolsa.obtenNumObjetos());

        // Agregar más enteros a la bolsa: 8, 5, 6
        bolsa.agrega(8);
        bolsa.agrega(5);
        bolsa.agrega(6);

        //Determinar si el entero 8 existe en la bolsa
        System.out.println("El entero 8 existe en la bolsa? " + bolsa.contiene(8));

        //Determinar si el entero 3 existe en la bolsa
        System.out.println("El entero 3 existe en la bolsa? " + bolsa.contiene(3));

        //Remover el entero 7 de la bolsa
        try {
            bolsa.remueve(7);
        } catch (BolsaExcepcion s) {
            System.out.println("Error al remover el entero 7: " + s.getMessage());
        }

        //Intentar remover el entero 12 de la bolsa
        try {
            bolsa.remueve(12);
        } catch (BolsaExcepcion s) {
            System.out.println("Error al remover el entero 12: " + s.getMessage());
        }

        //Contar el número de 8s en la bolsa
        System.out.println("Numero de 8s en la bolsa: " + bolsa.cuenta(8));

        //Contar el número de 1s en la bolsa
        System.out.println("Numero de 1s en la bolsa: " + bolsa.cuenta(1));

        //Remover un entero al azar de la bolsa
        Integer enteroRemovido1 = bolsa.remueve();
        System.out.println("Entero removido al azar: " + enteroRemovido1);

        //Remover otro entero al azar de la bolsa
        Integer enteroRemovido2 = bolsa.remueve();
        System.out.println("Entero removido al azar: " + enteroRemovido2);

        //Limpiar la bolsa
        bolsa.limpia();

        //Determinar si la bolsa está vacía
        System.out.println("La bolsa esta vacia despues de limpiarla? " + bolsa.vacia());

        //Intentar remover un entero al azar de la bolsa después de limpiarla
        try {
            Integer enteroRemovido3 = bolsa.remueve();
            System.out.println("Entero removido al azar despues de limpiar la bolsa: " + enteroRemovido3);
        } catch (BolsaExcepcion s) {
            System.out.println("Error al remover un entero despues de limpiar la bolsa: " + s.getMessage());
        }
    }
}
