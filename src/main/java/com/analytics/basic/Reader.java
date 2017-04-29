package com.analytics.basic;


import java.util.List;

/**
 * Data Set Reader Interface
 * Created by Anup on 4/1/2017.
 */
public interface Reader {

    /**
     * Loads a data set into a HashMap of column name and List of values associated to it.
     *
     * @param filePath data file path
     */
    void loadDataSet(String filePath);

    /**
     * Fetches a list of values corresponding to the column
     *
     * @param colName header field
     * @return list of values
     */
    List<Double> getDataColumn(String colName);


}