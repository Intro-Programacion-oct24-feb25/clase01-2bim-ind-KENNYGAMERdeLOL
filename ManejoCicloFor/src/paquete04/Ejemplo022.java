/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author utpl
 */
public class Ejemplo022 {

    public static void main(String[] args) {

       double fahrenheit = 20.0;
       double celsius;
       int incremento = 4;
       for(int i = 0; i<=20; i++){
           celsius = 5.0 / 9*(fahrenheit - 32);
           System.out.printf("Operacion(%d)Fahrenheit %2f ===> Celsius: %2f\n",
                   + i,fahrenheit, celsius);
           fahrenheit = fahrenheit + incremento;
       
          
        }
    }
}
