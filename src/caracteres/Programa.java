/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caracteres;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author DeivisondeOliveira
 */
public class Programa {
    public static void main(String[] args) {
        try {
            InputStream  is  =  new FileInputStream("C:\\Users\\xx\\xx\\file.txt");
            InputStreamReader isr = new InputStreamReader(is);
            int dado = isr.read();
            
            System.out.println("dados: " + dado);
            char caracter = (char) dado;
            System.out.println(caracter);
            
            // lendo mais de um arquivo
            while(dado != -1){
                System.out.println("caracteres: " + (char) dado);
                dado = isr.read();
            }
            
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e) {
            e.printStackTrace();
        } 
    }
}
