/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author naufa
 */
public class DemoKonversiSuhu {
     public static void main(String[] args) {
         double Celcius = 60;

         double Fahrenheit = KonversiSuhu.CelciusToFahrenheit(Celcius);
         System.out.println("Celcius: " + Celcius + "°C");
         System.out.println("Fahrenheit: "+ Fahrenheit + "°F");
         
         double Reamur = KonversiSuhu.CelciusToReamur(Celcius);
         System.out.println("Celcius: " + Celcius + "°C");
         System.out.println("Reamur: "+ Reamur + "°R");
         
         Reamur = KonversiSuhu2.FahrenheitToReamur(Fahrenheit);
         System.out.println("Fahrenheit: " + Fahrenheit + "°F");
         System.out.println("Reamur: "+ Reamur + "°R");
     }
}