package javaapplication1;

import java.util.ArrayList;



public class JavaApplication1 {


    public static void main(String[] args) {
       
        
       String pathName = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\JavaApplication1\\Data\\emails.txt";
       MailReader dominios = new MailReader(pathName);
       ArrayList <String> domis =dominios.getDominiosArray();
       
       Histogram <String> histograma = DominiosHistogramBuilder.execute(domis);
 
        

       

       HistogramaDisplay histo;
        histo = new HistogramaDisplay(histograma);
        histo.execute();
    }
}
