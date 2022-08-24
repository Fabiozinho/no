/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
            int valor =0;
    int fixo = 100;
            int v_final =0;
    System.out.println("Informe o numero de carros vendidos");
        int n_carros = entrada.nextInt();
        if(n_carros<=5){  
        valor = n_carros*500;
        v_final = valor+fixo;
        System.out.println("O Salario é de: "+v_final);
        }else{
            valor = n_carros*1000;
        v_final = valor+fixo;
        System.out.println("O Salario é de: "+v_final);
}
}
}