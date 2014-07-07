package com.epam.textparser.initialisation;

import com.epam.textparser.exception.TechnicalException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InitialisationText {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String readFile() throws TechnicalException {
        try {
            BufferedReader br = new BufferedReader(new FileReader("resources/text.txt"));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            setText(sb.toString());
            return getText();

        }
        catch (FileNotFoundException e){
            throw new TechnicalException("File not found", e);
        }
        catch (IOException e){
            throw new TechnicalException("IOException", e);
        }

    }
}
