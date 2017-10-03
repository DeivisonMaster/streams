/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saida;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 *
 * @author DeivisondeOliveira
 */
public class EscreveArquivo {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        OutputStream    os  = new FileOutputStream("C:\\Users\\DeivisondeOliveira\\Desktop\\file.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter  bw = new BufferedWriter(osw);
        
        bw.write("Hoje é terca");
        bw.close();
    }
}
