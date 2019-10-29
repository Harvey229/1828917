/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senasalud;

import java.util.Scanner;

/**
 *
 * @author sala
 */
public class SenaSalud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nom, ape, col;
        int ed;
       Scanner nombre = new Scanner(System.in);
       System.out.println("Digite su Nombre");
       nom=nombre.next();
       
       
       Scanner apellido = new Scanner(System.in);
       System.out.println("Digite su Apellido");
       ape=apellido.next();
       
       Scanner edad = new Scanner(System.in);
       System.out.println("Digite su Edad");
       ed=edad.nextInt();
       
      
       System.out.println("Su nombre es:"+nom);
       System.out.println("Su apellido es:"+ape);
       System.out.println("Su edad es:"+ed);
      
       
       
    }
    
}
