/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primeraparte;

/**
 *
 * @author Nicoaimar
 */

/*Primera parte:

1- Crear una función con tres parámetros que sean números que se suman entre sí.
2- Llamar a la función en el main y darle valores. */

public class PrimeraParte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var suma = suma(10, 21, 30);
        System.out.println(suma);
        
        Coche miCoche = new Coche();
        miCoche.AgregarPuertas();
        System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}

/* Segunda parte:

1- Crear una clase coche.
2- Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
3- Una función que incremente el número de puertas que tiene el coche.
4- Crear un objeto miCoche en el main y añadirle una puerta.
5- Mostrar el número de puertas que tiene el objeto. */

class Coche {
    public int puertas = 3;
    
    public void AgregarPuertas() {
        this.puertas++;
    }
}