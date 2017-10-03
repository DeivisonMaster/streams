/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saida;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author DeivisondeOliveira
 */
public class LeTecladoEscreveArquivo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite algo");
        entrada.nextLine();
        try {
            PrintStream ps  = new PrintStream("C:\\Users\\xx\\xx\\file.txt");
            for(int i = 0; i < 5; i++){
                if(entrada.hasNextLine()){
                    ps.println(entrada.nextLine());
                }
            }
//            while(entrada.hasNextLine()){
//                ps.println(entrada.nextLine());
//            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
