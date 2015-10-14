
package javaapplication1;



public class JavaApplication1 {


    public static void main(String[] args) {
       Histogram<String> histogram = new Histogram<>();
       histograma.increment("gmail.com");
       histograma.increment("gmail.com");
       histograma.increment("gmail.com");
       histograma.increment("gmail.com");
       histograma.increment("gmail.com");
       
       histograma.increment("hotmail.com");
       histograma.increment("hotmail.com");
       histograma.increment("hotmail.com");
       histograma.increment("hotmail.com");
       histograma.increment("hotmail.com");
       
       histograma.increment("ulpgc.es");
       histograma.increment("ulpgc.es");
       histograma.increment("ulpgc.es");
       histograma.increment("ulpgc.es");
       histograma.increment("ulpgc.es");
       histograma.increment("ulpgc.es");
       histograma.increment("ulpgc.es");
       histograma.increment("ulpgc.es");
       histograma.increment("ulpgc.es");
       histograma.increment("ulpgc.es");
       histograma.increment("ulpgc.es");
       histograma.increment("ulpgc.es");
       histograma.increment("ulpgc.es");
       
       HistogramDisplay histo = new HistogramaDisplay(histograma);
        histo.execute();
    }
}
