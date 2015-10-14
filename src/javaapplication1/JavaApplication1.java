package javaapplication1;

public class JavaApplication1 {


    public static void main(String[] args) {
       
        
       Histogram<String> histogram = new Histogram<>();
       histogram.increment("gmail.com");
       histogram.increment("gmail.com");
       histogram.increment("gmail.com");
       histogram.increment("gmail.com");
       histogram.increment("gmail.com");
       
       histogram.increment("hotmail.com");
       histogram.increment("hotmail.com");
       histogram.increment("hotmail.com");
       histogram.increment("hotmail.com");
       histogram.increment("hotmail.com");
       
       histogram.increment("ulpgc.es");
       histogram.increment("ulpgc.es");
       histogram.increment("ulpgc.es");
       histogram.increment("ulpgc.es");
       histogram.increment("ulpgc.es");
       histogram.increment("ulpgc.es");
       histogram.increment("ulpgc.es");
       histogram.increment("ulpgc.es");
       histogram.increment("ulpgc.es");
       histogram.increment("ulpgc.es");
       histogram.increment("ulpgc.es");
       histogram.increment("ulpgc.es");
       histogram.increment("ulpgc.es");
       
       HistogramaDisplay histo;
        histo = new HistogramaDisplay(histogram);
        histo.execute();
    }
}
