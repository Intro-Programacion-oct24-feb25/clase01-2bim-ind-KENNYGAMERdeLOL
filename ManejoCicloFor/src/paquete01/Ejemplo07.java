/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Ejemplo07 {
    public static void main(String[] args) {
        int operacion;
        int operacion2;
        String mensajeFinal = "";
        String mensajeSuma = "";
        for (int i = 1; i <= 10; i++) { // for 01
            // System.out.printf("Tabla de multiplicar del número %d\n", i);
            mensajeFinal = String.format("%sTabla de multiplicar del número %d\n", 
                    mensajeFinal, i);
            mensajeSuma = String.format("%sTabla de sumar del número %d\n", 
                    mensajeSuma, i);
            for (int contador = 1; contador <= 12; contador++) {
                operacion = i * contador;
                operacion2 = i + contador;
                // System.out.printf("%d x %d = %d\n", i, contador, operacion);
                mensajeFinal = String.format("%s%d x %d = %d\n", 
                         mensajeFinal, i, contador, operacion);
                mensajeSuma = String.format("%s%d + %d = %d\n", 
                        mensajeSuma, i, contador, operacion);
            }
            // System.out.println("\n");
            mensajeFinal = String.format("%s\n", mensajeFinal);
        } // termina for 01
        
        System.out.printf("%s\n%s\n", mensajeFinal, mensajeSuma);
    }
}
