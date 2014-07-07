package com.epam.textparser.manager;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class RegexManager {

    public static final String REGEX_CODE;
    public static final String REGEX_PARAGRAPH;
    public static final String REGEX_WORD;
    public static final String REGEX_SENTANSE;
    public static final String REGEX_PUNCTUATION_MARKS;

    static {
        Properties properties = new Properties();
        try {
            InputStream input = new FileInputStream("resources/regex.properties");
            properties.load(input);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        REGEX_CODE = properties.getProperty("regex.code");
        REGEX_PARAGRAPH = properties.getProperty("regex.paragraph");
        REGEX_WORD = properties.getProperty("regex.word");
        REGEX_SENTANSE = properties.getProperty("regex.sentanse");
        REGEX_PUNCTUATION_MARKS = properties.getProperty("regex.punctuationmarks");

    }


}

