package com.hemebiotech.analytics;

import java.util.Map;

/**
 * An interface for writing symptom data to a destination.
 * 
 * Implementations of this interface should provide a way to write symptom data
 * to a file. The data is provided as a map where the keys represent symptom
 * names and the values represent the occurrences of each symptom.
 */
public interface ISymptomWriter {

    /**
     * Write symptom data to a destination.
     * 
     * @param symptoms A map containing symptom data where the keys represent
     *                 symptom names and the values represent the occurrences of
     *                 each symptom.
     * 
     * @throws Exception If an error occurs while writing the data to the
     *                   destination, an exception is thrown to indicate the
     *                   failure.
     */
    void writeSymptoms(Map<String, Integer> symptoms) throws Exception;
}
