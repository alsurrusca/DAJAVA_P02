package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Anything that will save symptom data from a list of Symptoms, count and order.
 *
 *
 */

    public interface ISymptomWriter {

    /**
     * If no data is available, return nothing (void)
     *
     * @return  a HashMap of all symptoms from listOrderSymptoms and duplicate it.
     */

         void saveSymptoms(Map<String, Integer> listOrderSympoms);



    }
