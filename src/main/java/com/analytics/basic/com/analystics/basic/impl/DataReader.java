package com.analytics.basic.com.analystics.basic.impl;

import com.analytics.basic.Reader;
import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Data Reader Class for CSV files
 * Created by Anup on 4/2/2017.
 */
public class DataReader implements Reader {

    private Map<String, ArrayList<Double>> dataSet ;

    public DataReader() {

        dataSet = new HashMap<String, ArrayList<Double>>();

    }

    public void loadDataSet(String filePath) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(filePath);

            CSVReader reader = new CSVReader(fileReader, ',');
            String[] line ;
            String[] header;

            // Read header
            header = reader.readNext();
            for (String aHeader : header) {
                dataSet.put(aHeader, new ArrayList<Double>(1000));
            }
            while( (line = reader.readNext()) != null) {
                for (int col = 0; col < line.length; col++) {
                    List<Double> tempList = dataSet.get(header[col]);
                    String colStr = (line[col] == null || line[col].trim().length() == 0) ? "0" : line[col].trim();
                    tempList.add(Double.valueOf(colStr));
                }
            }
        } catch (java.io.IOException e) {
            // TODO Use Logger and Throw Exception
            e.printStackTrace();
        }finally {
            if (fileReader != null ) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public List<Double> getDataColumn(String colName) {
        return dataSet.get(colName);
    }


}
