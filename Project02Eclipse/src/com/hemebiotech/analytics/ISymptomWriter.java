package com.hemebiotech.analytics;

import java.util.Map;

/**
 * An interface for writing symptom data to a destination.
 * 
 * Implementations of this interface should provide a way to write symptom data
 * to a specific destination, such as a file, a database, or any other data
 * store. The data is provided as a map where the keys represent symptom names
 * and the values represent the occurrences of each symptom.
 */

public interface ISymptomWriter {

    void writeSymptoms(Map<String, Integer> symptoms) throws Exception;
}