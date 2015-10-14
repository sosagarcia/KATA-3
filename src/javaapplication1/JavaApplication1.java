package javaapplication1;

import java.util.ArrayList;



public class JavaApplication1 {


    public static void main(String[] args) {
       
        
       Histogram<String> histogram = new Histogram<>();
       String pathName = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\JavaApplication1\\Data\\emails.txt";
       MailReader dominios = new MailReader(pathName);
       ArrayList <String> domis =dominios.getDominiosArray();
        for (int i = 0; i < domis.size(); i++) {
            histogram.increment(domis.get(i));
            
        }
 
        

       

       HistogramaDisplay histo;
        histo = new HistogramaDisplay(histogram);
        histo.execute();
    }
}
