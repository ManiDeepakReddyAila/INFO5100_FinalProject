/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdvancedFeatures;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author anvithalakshmisha
 */
public class Analytics {

    private String name;
    public Analytics(String name) {
        this.name = name;
    }
    
    

    public void drawChart(int acceptedRequest, int rejectedRequest, int pendingRequest, int totalRequest) {
        DefaultPieDataset pieDataSet = new DefaultPieDataset();
        pieDataSet.setValue("Approved", Integer.valueOf(acceptedRequest));
        pieDataSet.setValue("Rejected", Integer.valueOf(rejectedRequest));
        pieDataSet.setValue("Pending", Integer.valueOf(pendingRequest));
        

        JFreeChart chart = ChartFactory.createPieChart(this.name, pieDataSet, true, true, true);
//        PiePlot3D p = (PiePlot3D) chart.getPlot();
        ChartFrame frame = new ChartFrame("Pie chart", chart);
        frame.setVisible(true);
        frame.setSize(450, 500);

    }
}
