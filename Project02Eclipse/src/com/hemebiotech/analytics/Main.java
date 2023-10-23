package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * The main class for the symptom data analytics application.
 * 
 * This class contains the entry point of the application, which reads symptom
 * data from a source, performs analysis, and writes the results to a
 * destination.
 */

public class Main {

    public static void main(String[] args) throws Exception {

        ISymptomReader reader = new ReadSymptomDataFromFile("../symptoms.txt");
        ISymptomWriter writer = new WriteSymptomDataToFile();
        AnalyticsCounter analiticsCouter = new AnalyticsCounter(reader, writer);

        List<String> symptoms = analiticsCouter.getSymptoms();
        Map<String, Integer> countSymptoms = analiticsCouter.countSymptoms(symptoms);
        Map<String, Integer> sortSymptoms = analiticsCouter.sortSymptoms(countSymptoms);

        analiticsCouter.writeSymptoms(sortSymptoms);
    }

}
