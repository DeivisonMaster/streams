/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrada;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author DeivisondeOliveira
 */
public class LendoTeclado {
    public static void main(String[] args) throws IOException {
        // Escreve um texto na tela
        PrintStream ps  = System.out;
        ps.println("digite um numero: ");
        
        // Guarda um valor digitado
        InputStream is  = System.in;
        Scanner entrada = new Scanner(is);
        int dado = entrada.nextInt();
        
        // imprime o resultado do que foi digitado
        ps.println("valor: " + dado);
    }
}
