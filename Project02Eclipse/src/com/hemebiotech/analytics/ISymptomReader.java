package com.hemebiotech.analytics;

import java.util.List;

/**
 * An interface for reading symptom data from a data source.
 * 
 * Implementations of this interface should provide a way to retrieve a list of
 * symptom names from a data source. The implementation may involve reading from
 * a file, a database, or any other source.
 */

public interface ISymptomReader {

    List<String> getSymptoms() throws Exception;
}