/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhocriscris;

/**
 *
 * @author CAROL
 */
public class ex22 {
    public static void main (String [] args) {
        int velocidade = 135;

        if (velocidade > 120) {
           int multa = (velocidade - 120) * 10;
           System.out.println("Velocidade acima do limite. Multa: R$ " + multa);
        } else {
           System.out.println("Dentro do limite de velocidade");
        }
    }
}
