/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhocriscris;

/**
 *
 * @author CAROL
 */
public class ex15 {
    public static void main (String [] args) {
        int a = 5, b = 5, c = 5;

        if (a == b && b == c) {
           System.out.println("Equilátero");
        } else if (a == b || b == c || a == c) {
           System.out.println("Isósceles");
        } else {
           System.out.println("Escaleno");
        }
    }
}
