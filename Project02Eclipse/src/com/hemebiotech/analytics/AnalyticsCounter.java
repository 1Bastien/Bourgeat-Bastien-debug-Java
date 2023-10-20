package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * An analytics counter for analyzing symptom data.
 * 
 * This class provides methods for reading, counting, sorting, and writing
 * symptom data.
 */
public class AnalyticsCounter {

    private ISymptomReader reader;
    private ISymptomWriter writer;

    /**
     * Constructs an AnalyticsCounter with a specified ISymptomReader and
     * ISymptomWriter.
     * 
     * @param reader An implementation of ISymptomReader for reading symptom data.
     * @param writer An implementation of ISymptomWriter for writing symptom data.
     */
    public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    /**
     * Retrieves a list of symptoms from the data source.
     * 
     * @return A list of symptom names obtained from a data source.
     * 
     * @throws Exception If an error occurs while reading the data from the source,
     *                   an exception is thrown to indicate the failure.
     */
    public List<String> getSymptoms() throws Exception {
        return reader.getSymptoms();
    }

    /**
     * Counts the occurrences of each symptom in a given list.
     * 
     * @param symptoms A list of symptom names.
     * @return A map where the keys represent symptom names and the values represent
     *         the occurrences of each symptom.
     */
    public Map<String, Integer> countSymptoms(List<String> symptoms) {
        Map<String, Integer> countSymptoms = new HashMap<>();

        for (String symptom : symptoms) {
            countSymptoms.put(symptom, countSymptoms.getOrDefault(symptom, 0) + 1);
        }

        return countSymptoms;
    }

    /**
     * Sorts a map of symptoms in alphabetical order based on symptom names.
     * 
     * @param symptoms A map where the keys represent symptom names and the values
     *                 represent the occurrences of each symptom.
     * @return A sorted map where symptoms are sorted in alphabetical order based on
     *         their names.
     */
    public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) {
        Map<String, Integer> sortSymptoms = new TreeMap<>();
        sortSymptoms.putAll(symptoms);
        return sortSymptoms;
    }

    /**
     * Writes symptom data to a destination using the specified ISymptomWriter.
     * 
     * @param symptoms A map where the keys represent symptom names and the values
     *                 represent the occurrences of each symptom.
     * 
     * @throws Exception If an error occurs while writing the data to the
     *                   destination, an exception is thrown to indicate the
     *                   failure.
     */
    public void writeSymptoms(Map<String, Integer> symptoms) throws Exception {
        writer.writeSymptoms(symptoms);
    }
}
