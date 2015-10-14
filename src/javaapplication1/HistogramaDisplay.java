package javaapplication1;

import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author usuario
 */
public class HistogramaDisplay extends ApplicationFrame{   
    
    private final Histogram<String> histogram;


    HistogramaDisplay(Histogram<String> histogram) {
        super("HISTOGRAMA");
        this.histogram = histogram;
        setContentPane(createPanel());
        pack();
    }


    
    private ChartPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension (500, 400));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataset){
        JFreeChart chart;
        chart = ChartFactory.createBarChart(null, "Dominios", "Nº Emails", dataset, PlotOrientation.VERTICAL, true , true, false);
        return chart;  
    }
    
    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for(String key : histogram.keySet()){
            dataset.addValue(histogram.get(key),"",key);
        }
        return dataset;
 
    }
    
    public void execute(){
        setVisible(true);
    }
 
}