/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrada;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author DeivisondeOliveira
 */
public class EntradaDados {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // FileInputStream recupera bytes de um arquivo
        InputStream is = new FileInputStream("C:\\Users\\DeivisondeOliveira\\Desktop\\file.txt");
        
        // InputStreamReader manipula os caracteres do arquivo passado via parametro
        InputStreamReader isr = new InputStreamReader(is);
        
        // BufferedReader concatena os chars para formar uma string
        BufferedReader      br = new BufferedReader(isr);
        
        String dados  = br.readLine();
        while(dados != null){
            System.out.println("dados: " + dados);
            dados = br.readLine();
        }
        
    }
}
