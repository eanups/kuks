package com.analytics.basic.com.analystics.basic.impl;

import com.analytics.basic.Ops;

import java.util.ArrayList;
import java.util.List;

/**
 * Operations Implementer class
 * Created by Anup on 4/1/2017.
 */
public class OpsImpl implements Ops {

    public double summation(List<Double> xList) {
        double res = 0;
        for (Double val: xList) {
            res += val;
        }
        return res;

    }

    public List<Double> sumOfLists(List<Double> xList, List<Double> yList) {
        List<Double> resList = new ArrayList<Double>();
        int size = xList.size();
        for (int i=0; i<size ; i++) {
            resList.add(i, xList.get(i) + yList.get(i));

        }
        return resList;
    }

    public List<Double> prodOfLists(List<Double> xList, List<Double> yList) {
        List<Double> resList = new ArrayList<Double>();
        int size = xList.size();
        for (int i=0; i<size ; i++) {
            resList.add(i, xList.get(i) * yList.get(i));

        }
        return resList;
    }

    public List<Double> diffOfLists(List<Double> xList, List<Double> yList) {
        List<Double> resList = new ArrayList<Double>();
        int size = xList.size();
        for (int i=0; i<size ; i++) {
            resList.add(i, xList.get(i) - yList.get(i));

        }
        return resList;
    }
}
