/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cine;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int[][] asientos = new int[3][4];
            
            System.out.println("Ingrese fila (0 a 2): ");
            int f = sc.nextInt();
            
            System.out.println("Ingrese columna (0 a 3): ");
            int c = sc.nextInt();
            
            asientos[f][c] = 1;
            
            System.out.println("Estado de la sala:");
            
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(asientos[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
