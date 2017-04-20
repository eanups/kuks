package com.analytics.basic;

import java.util.List;

/**
 * Created by 310194621 on 4/1/2017.
 */
public interface Ops {

    /** Returns the summation of a list of numeric values
     *
     * @param xList List of numeric values
     * @return float value of summation
     */
    double summation(List<Double> xList);

    /**
     *
     * @param xList
     * @param yList
     * @return
     */
    List<Double> sumOfLists(List<Double> xList, List<Double> yList);

    /**
     *
     * @param xList
     * @param yList
     * @return
     */
    List<Double> prodOfLists(List<Double> xList, List<Double> yList);

    /**
     *
     * @param xList
     * @param yList
     * @return
     */
    List<Double> diffOfLists(List<Double> xList, List<Double> yList);

}
