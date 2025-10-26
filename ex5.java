/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhocriscris;

/**
 *
 * @author CAROL
 */
public class ex5 {
    public static void main (String [] args) {
        //entrada
        double mediaUm = 2.7;
        double mediaDois = 5.4;
        double mediaTres = 9.0;
        //processamento
        double media = (mediaUm + mediaDois + mediaTres) / 3;
        
        if (media >= 7) {
            System.out.println("Aprovado");
        } else{
            System.out.println("Reprovado");
        }
    } 
}
