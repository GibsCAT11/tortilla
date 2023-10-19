// Clase PruebasBolsaGen.java
package pruebas;

import implementaciones.BolsaGen;

import java.util.Random;

public class PruebasBolsaGenNum {
    public static void main(String[] args) {
        // Crear una instancia de la clase BolsaGen para almacenar objetos de tipo Double, con un tamaño de 5
        BolsaGen<Double> bolsaDouble = new BolsaGen<>();

        // Agregar números Double a la bolsa.
        bolsaDouble.agregar(1.5);
        bolsaDouble.agregar(5.2);
        bolsaDouble.agregar(8.3);
        bolsaDouble.agregar(7.9);
        bolsaDouble.agregar(9.2);

        // Mostrar el número de elementos en la bolsa
        int numeroDeElementosEnLaBolsa = bolsaDouble.elementosEnLaBolsa().size();
        System.out.println("Número de elementos en la bolsa: " + numeroDeElementosEnLaBolsa);

        // Determinar la suma de los elementos de la bolsa
        double suma = 0.0;
        for (Double elemento : bolsaDouble.elementosEnLaBolsa()) {
            suma += elemento;
        }
        System.out.println("Suma de los elementos en la bolsa: " + suma);

        // Determinar el promedio de los elementos de la bolsa
        double promedio = suma / numeroDeElementosEnLaBolsa;
        System.out.println("Promedio de los elementos en la bolsa: " + promedio);

        // Determinar el número de elementos mayores al promedio de la bolsa
        int elementosMayoresAlPromedio = 0;
        for (Double elemento : bolsaDouble.elementosEnLaBolsa()) {
            if (elemento > promedio) {
                elementosMayoresAlPromedio++;
            }
        }
        System.out.println("Número de elementos mayores al promedio en la bolsa: " + elementosMayoresAlPromedio);
    }
}