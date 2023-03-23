package com.example.csv;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class CsvUtils {
    public static void parsrCsv(String filePath) throws IOException {
        Reader in = new FileReader(filePath);
        Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(in);
        for (CSVRecord record : records) {
            List<String> FirstColumn = record.toList();
            for (String value : FirstColumn) {
                System.out.println(value);
            }
            System.out.println();
        }
    }
}
