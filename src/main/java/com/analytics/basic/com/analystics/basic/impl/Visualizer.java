package com.analytics.basic.com.analystics.basic.impl;

import java.util.List;

/**
 * Provides data visualization methods for scalars, vectors and other strings.
 * Created by Anup on 4/29/2017.
 */
public class Visualizer {

    private static final String LINE = "=======================================================";
    private static final String S_LINE = "-------------------------------------------------------";

    private Visualizer() {
    }

    /**
     * Displays a vector/column
     *
     * @param displayList display list values
     */
    public static void displayDataColumn(List<Double> displayList) {
        for (Double val : displayList) {
            System.out.println(val);
        }
    }

    /**
     * Displays scalar value
     *
     * @param val display value
     */
    public static void displayDataValue(double val) {
        System.out.println(S_LINE);
        System.out.println("Result: [" + val + "]");
        System.out.println(S_LINE);

    }

    /**
     * Displays operation name
     *
     * @param opName operation name
     */
    public static void displayOpName(String opName) {
        System.out.println("\n" + LINE);
        System.out.println("***** " + opName + " *****");
        System.out.println(LINE);

    }

}
