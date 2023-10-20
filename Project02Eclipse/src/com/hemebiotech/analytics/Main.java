package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        ISymptomReader reader = new ReadSymptomDataFromFile("../symptoms.txt");
        ISymptomWriter writer = new WriteSymptomDataToFile();
        AnalyticsCounter analiticsCouter = new AnalyticsCounter(reader, writer);

        List<String> symptoms = analiticsCouter.getSymptoms();
        Map<String, Integer> countSymptoms = analiticsCouter.countSymptoms(symptoms);
        Map<String, Integer> sortSymptoms = analiticsCouter.sortSymptoms(countSymptoms);

        analiticsCouter.writeSymptoms(sortSymptoms);
    }

}
