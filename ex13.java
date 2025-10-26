/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhocriscris;

/**
 *
 * @author CAROL
 */
public class ex13 {
    public static void main (String [] args) {
        double valorCompra = 120;
        double desconto = (valorCompra > 100) ? 0.10 : 0.05;
        double total = valorCompra - (valorCompra * desconto);

        System.out.println("Valor final: " + total);
    }
}
