package com.analytics.basic.client;

import com.analytics.basic.Ops;
import com.analytics.basic.com.analystics.basic.impl.DataReader;
import com.analytics.basic.com.analystics.basic.impl.OpsImpl;
import com.analytics.basic.com.analystics.basic.impl.Visualizer;

import java.util.List;

/**
 * Client class to invoke the Reader and its Operations
 * Created by Anup on 4/2/2017.
 */
public class Invoker {

    /**
     * Full path of the CSV input data file.
     * Assumption: The values in the data file are numeric
     */
    private static final String FILE_PATH =
            "C:\\ANSE\\DEV\\java\\kuks\\src\\main\\resources\\data.csv";


    private Invoker() {

    }


    public static void main(String[] args) {
        DataReader reader = new DataReader();

        // Loads the Comma separated list of values into a dataset
        reader.loadDataSet(FILE_PATH);

        // Obtain a list of numeric values of a column
        List<Double> d4List = reader.getDataColumn("D4");

        // Displays the list
        Visualizer.displayOpName("D4 Column");
        Visualizer.displayDataColumn(d4List);

        // Obtain specific column values of a data set into a list
        List<Double> list = reader.getDataColumn("D4");
        List<Double> list2 = reader.getDataColumn("B2");

        // Operations
        Ops ops = new OpsImpl();

        // Perform Summation and visualize in CLI
        Visualizer.displayOpName("SUMMATION of Column");
        double res = ops.summation(list);
        Visualizer.displayDataValue(res);

        // Perform differencing between two lists and visualize in CLI
        Visualizer.displayOpName("DIFFERENCE of LISTS");
        List<Double> diffList = ops.diffOfLists(list, list2);
        Visualizer.displayDataColumn(diffList);

        // Perform differencing between two lists and visualize in CLI
        Visualizer.displayOpName("SUM of LISTS");
        List<Double> sumList = ops.sumOfLists(list, list2);
        Visualizer.displayDataColumn(sumList);

        // Perform differencing between two lists and visualize in CLI
        Visualizer.displayOpName("PRODUCT of LISTS");
        List<Double> prodList = ops.prodOfLists(list, list2);
        Visualizer.displayDataColumn(prodList);

        // -- END OF INVOKER CLIENT --

    }
}
