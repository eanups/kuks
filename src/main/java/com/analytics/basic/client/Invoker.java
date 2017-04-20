package com.analytics.basic.client;

import com.analytics.basic.com.analystics.basic.impl.DataReader;

/**
 * Created by 310194621 on 4/2/2017.
 */
public class Invoker {

    public static void main(String[] args) {
        DataReader reader = new DataReader();

        reader.loadDataSet("C:\\ANSE\\DEV\\java\\kuks\\src\\main\\resources\\data.csv");

        reader.displayDataset();
    }
}
