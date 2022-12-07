/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author pranitha
 */
public class Analytics {

    public void drawChart(int acceptedRequest, int rejectedRequest, int pendingRequest, int totalRequest) {
        DefaultPieDataset pieDataSet = new DefaultPieDataset();
        pieDataSet.setValue("Accepted", Integer.valueOf(acceptedRequest));
        pieDataSet.setValue("Rejected", Integer.valueOf(rejectedRequest));
        pieDataSet.setValue("Pending request", Integer.valueOf(pendingRequest));
        pieDataSet.setValue("Total request", Integer.valueOf(totalRequest));

        JFreeChart chart = ChartFactory.createPieChart("Request analytics", pieDataSet, true, true, true);
//        PiePlot3D p = (PiePlot3D) chart.getPlot();
        ChartFrame frame = new ChartFrame("Pie chart", chart);
        frame.setVisible(true);
        frame.setSize(450, 500);

    }
}
