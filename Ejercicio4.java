/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;

/**
 *
 * @author Real Madrid
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        String[] nombres = new String[10];
        
        nombres[0] = "Ricardo";
        nombres[1] = "Marcos";
        nombres[2] = "Jesus";
        nombres[3] = "Joel";
        nombres[4] = "Natalie";
        nombres[5] = "Hector";
        nombres[6] = "Carlos";
        nombres[7] = "Lucas";
        nombres[8] = "Mateo";
        nombres[9] = "Sophya";
        
        System.out.println("Nombres de los Companeros de Clase: ");
        for (String nombre : nombres){
            System.out.println(nombre);
        }
    }
}
