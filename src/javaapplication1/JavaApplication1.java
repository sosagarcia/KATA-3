package javaapplication1;

import java.io.BufferedReader;
import java.io.FileReader;

public class JavaApplication1 {


    public static void main(String[] args) {
       
        
       Histogram<String> histogram = new Histogram<>();
       
       String pathName = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\JavaApplication1\\Data\\emails.txt";
        
        try {
            BufferedReader fileIn = new BufferedReader (new FileReader(pathName));
            
            String mail;
            
            while((mail=fileIn.readLine()) != null){
                if(!mail.contains("@"))
                    continue;                
                histogram.increment(mail.split("@")[1]);
            }
        } catch (Exception e) {
        }
       
       
       
       
      
       
       HistogramaDisplay histo;
        histo = new HistogramaDisplay(histogram);
        histo.execute();
    }
}
