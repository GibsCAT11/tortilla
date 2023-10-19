package pruebas;

import implementaciones.BolsaGen;
import java.util.Random;

public class PruebasBolsaGen {
    public static void main(String[] args) {
        //Crear una instancia de la clase BolsaGen para almacenar objetos de tipo Integer, con un tamaño de 5
        BolsaGen<Integer> bolsaInteger = new BolsaGen<>();

        //Determine si la bolsa esta vacia
        System.out.println("La bolsa de enteros esta vacia? " + bolsaInteger.elementosEnLaBolsa().isEmpty());

        // Agregar enteros a la bolsa.
        bolsaInteger.agregar(8);
        bolsaInteger.agregar(9);
        bolsaInteger.agregar(7);

        //Mostrar el numero de enteros en la bolsa
        System.out.println("Numero de enteros en la bolsa: " + bolsaInteger.elementosEnLaBolsa().size());

        // Agregar más enteros a la bolsa.
        bolsaInteger.agregar(8);
        bolsaInteger.agregar(5);
        bolsaInteger.agregar(6);

        //Determine si el entero 8 existe en la bolsa
        System.out.println("El entero 8 existe en la bolsa? " + bolsaInteger.contiene(8));

        //Determine si el entero 3 existe en la bolsa
        System.out.println("El entero 3 existe en la bolsa? " + bolsaInteger.contiene(3));

        //Remover el entero 7 de la bolsa
        bolsaInteger.quitar(7);

        //Remover el entero 12 de la bolsa
        bolsaInteger.quitar(12);

        //Contar el número de 8s en la bolsa
        int numeroDeOcurrenciasDe8 = 0;
        for (Integer elemento : bolsaInteger.elementosEnLaBolsa()) {
            if (elemento == 8) {
                numeroDeOcurrenciasDe8++;
            }
        }
        System.out.println("Numero de ocurrencias del entero 8 en la bolsa: " + numeroDeOcurrenciasDe8);

        //Contar el numero de 1s en la bolsa
        int numeroDeOcurrenciasDe1 = 0;
        for (Integer elemento : bolsaInteger.elementosEnLaBolsa()) {
            if (elemento == 1) {
                numeroDeOcurrenciasDe1++;
            }
        }
        System.out.println("Numero de ocurrencias del entero 1 en la bolsa: " + numeroDeOcurrenciasDe1);

        //Remover un entero al azar de la bolsa
        if (!bolsaInteger.elementosEnLaBolsa().isEmpty()) {
            Random rand = new Random();
            int indiceAleatorio = rand.nextInt(bolsaInteger.elementosEnLaBolsa().size());
            Integer elementoRemovido = bolsaInteger.elementosEnLaBolsa().remove(indiceAleatorio);
            System.out.println("Se removio el entero al azar: " + elementoRemovido);
        }

        //Limpiar la bolsa
        bolsaInteger.elementosEnLaBolsa().clear();

        //Determine si la bolsa esta vacia
        System.out.println("La bolsa de enteros esta vacia despues de limpiarla? " + bolsaInteger.elementosEnLaBolsa().isEmpty());

        //Crear una instancia de la clase BolsaGen para almacenar objetos de tipo String, con un tamaño de 3
        BolsaGen<String> bolsaDeCadenas = new BolsaGen<>();

        // Agregar cadenas a la bolsa.
        bolsaDeCadenas.agregar("Sol");
        bolsaDeCadenas.agregar("Luna");
        bolsaDeCadenas.agregar("Sol");
        bolsaDeCadenas.agregar("Mar");

        //Determine si la bolsa de cadenas esta vacia
        System.out.println("La bolsa de cadenas esta vacia? " + bolsaDeCadenas.elementosEnLaBolsa().isEmpty());

        //Contar el número de veces que ocurre la cadena "Sol" en la bolsa
        int numeroDeOcurrenciasDeSol = 0;
        for (String cadena : bolsaDeCadenas.elementosEnLaBolsa()) {
            if (cadena.equals("Sol")) {
                numeroDeOcurrenciasDeSol++;
            }
        }
        System.out.println("Numero de ocurrencias de la cadena 'Sol' en la bolsa: " + numeroDeOcurrenciasDeSol);

        //Contar el numero de veces que ocurre la cadena "Lago" en la bolsa
        int numeroDeOcurrenciasDeLago = 0;
        for (String cadena : bolsaDeCadenas.elementosEnLaBolsa()) {
            if (cadena.equals("Lago")) {
                numeroDeOcurrenciasDeLago++;
            }
        }
        System.out.println("Numero de ocurrencias de la cadena 'Lago' en la bolsa: " + numeroDeOcurrenciasDeLago);

        //Remover la cadena "Sol" de la bolsa
        bolsaDeCadenas.quitar("Sol");

        //Remover una cadena al azar de la bolsa
        if (!bolsaDeCadenas.elementosEnLaBolsa().isEmpty()) {
            Random rand = new Random();
            int indiceAleatorio = rand.nextInt(bolsaDeCadenas.elementosEnLaBolsa().size());
            String cadenaRemovida = bolsaDeCadenas.elementosEnLaBolsa().remove(indiceAleatorio);
            System.out.println("Se removio la cadena al azar: " + cadenaRemovida);
        }

        //Determine si la bolsa de cadenas esta0 vacia.
        System.out.println("La bolsa de cadenas esta vacia? " + bolsaDeCadenas.elementosEnLaBolsa().isEmpty());
    }
}

