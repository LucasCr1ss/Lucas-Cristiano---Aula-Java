/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhocriscris;

/**
 *
 * @author CAROL
 */
public class ex6 {
    public static void main (String [] args){
        int anoNascimento = 2007;
        int anoAtual = 2025;
        int idade = anoAtual - anoNascimento;
        
        if (idade>=18){
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}
