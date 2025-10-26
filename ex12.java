/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhocriscris;

/**
 *
 * @author CAROL
 */
public class ex12 {
    public static void main (String [] args) {
        int dia = 25, mes = 8;

        if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            System.out.println("Virgem");
        } else {
            System.out.println("Outro signo");
        }
    }
}
