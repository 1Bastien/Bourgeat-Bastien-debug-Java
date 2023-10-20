package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * A simple implementation of ISymptomWriter for writing symptom data to a file.
 * 
 * This class writes symptom data to a text file where each symptom is listed
 * along with its occurrence count.
 */
public class WriteSymptomDataToFile implements ISymptomWriter {

    /**
     * Writes symptom data to a file.
     * 
     * @param symptoms A map where the keys represent symptom names and the values
     *                 represent the occurrences of each symptom.
     */
    @Override
    public void writeSymptoms(Map<String, Integer> symptoms) {

        try (FileWriter writer = new FileWriter("result.out")) {
            for (Map.Entry<String, Integer> entry : symptoms.entrySet()) {
                writer.write(entry.getKey() + ":" + entry.getValue() + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
