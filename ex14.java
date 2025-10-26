/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhocriscris;

/**
 *
 * @author CAROL
 */
public class ex14 {
  public static void main (String [] args) {
      double peso = 70, altura = 1.75;
      double imc = peso / (altura * altura);

      if (imc < 18.5) {
         System.out.println("Abaixo do peso");
      } else if (imc < 25) {
          System.out.println("Peso normal");
      } else if (imc < 30) {
          System.out.println("Sobrepeso");
      } else {
          System.out.println("Obesidade");
      }
    } 
}
