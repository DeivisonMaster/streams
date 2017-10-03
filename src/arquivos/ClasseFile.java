/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos;

import java.io.File;

/**
 *
 * @author DeivisondeOliveira fernm88@outlook.com
 */
public class ClasseFile {
    public static void main(String[] args) {
        File    apontador   = new File("C:\\Users\\xx\\Desktop");
        if(apontador.exists()){
            System.out.println("arquivo existe");
        }else{
            System.out.println("arquivo nao existe");
        }
        
        System.out.println("Absolut path " + apontador.getAbsolutePath());
    }
}
