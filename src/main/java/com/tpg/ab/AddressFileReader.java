package com.tpg.ab;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tgolding on 24/03/15.
 */
public class AddressFileReader {
    private BufferedReader reader;

    public AddressFileReader(String filename) throws FileNotFoundException {
        reader = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("/AddressBook.txt")));
    }

    public List<String> readLines() {
        List<String> lines = new ArrayList<String>();

        try {
            readLines(lines);
        }
        catch (Exception e) {
            // ignore
        }

        return lines;
    }

    private void readLines(List<String> lines) throws IOException {
        String line = null;

        while((line = reader.readLine()) != null) {
            lines.add(line);
        }
    }
}
