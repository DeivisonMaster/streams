/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

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
public class Programa {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("C:\\Users\\DeivisondeOliveira\\Desktop\\file.txt");
            InputStreamReader   isr = new InputStreamReader(is);
            BufferedReader  br = new BufferedReader(isr);
            String dados = br.readLine();
            
            while(dados != null){
                System.out.println(dados);
                dados = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
