package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple implementation of ISymptomReader for reading symptom data from a
 * file.
 * 
 * This class reads symptom data from a text file where each symptom is listed
 * on a separate line.
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

    private String filepath;

    /**
     * Constructs a ReadSymptomDataFromFile object with the specified file path.
     * 
     * @param filepath A full or partial path to a file containing symptom strings.
     */
    public ReadSymptomDataFromFile(String filepath) {
        this.filepath = filepath;
    }

    /**
     * Reads symptom data from the specified file.
     * 
     * @return A list of symptom names obtained from the file.
     */
    @Override
    public List<String> getSymptoms() {
        ArrayList<String> result = new ArrayList<String>();

        if (filepath != null) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(filepath));
                String line = reader.readLine();

                while (line != null) {
                    result.add(line);
                    line = reader.readLine();
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return result;
    }
}
