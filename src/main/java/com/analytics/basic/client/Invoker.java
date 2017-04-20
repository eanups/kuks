package com.analytics.basic.client;

import com.analytics.basic.Ops;
import com.analytics.basic.com.analystics.basic.impl.DataReader;
import com.analytics.basic.com.analystics.basic.impl.OpsImpl;

import java.util.List;

/**
 * Created by Anup on 4/2/2017.
 */
public class Invoker {

    public static void main(String[] args) {
        DataReader reader = new DataReader();
        Ops ops = new OpsImpl();

        reader.loadDataSet("C:\\ANSE\\DEV\\java\\kuks\\src\\main\\resources\\data.csv");
        reader.displayDataColumn("D4");
        List list = reader.getDataColumn("D4");

        System.out.println("====TOTAL=== ");
        double res = ops.summation(list);
        System.out.println(res);
        System.out.println("============ ");


    }
}
