/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class MailReader {
    private final String pathname;
    public MailReader(String pathName){
    
        this.pathname=pathName;
    }
    
    /**
     *
     * @return
     */
    public ArrayList<String> getDominiosArray(){
        
        ArrayList<String> dominiosArray = new ArrayList<>();
        
        try {
            BufferedReader fileIn = new BufferedReader (new FileReader(pathname));
            
            String mail;
            
            while((mail=fileIn.readLine()) != null){
                if(!mail.contains("@"))
                    continue;                
                dominiosArray.add(mail.split("@")[1]);
            }
        } catch (Exception e) {
            System.out.println("El fichero no existe" + e);            
        }
    return dominiosArray;
    }
}
