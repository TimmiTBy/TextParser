package com.epam.textparser.main;

import com.epam.textparser.exception.TechnicalException;
import com.epam.textparser.initialisation.InitialisationText;
import com.epam.textparser.parser.TextParser;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Main {

    private static final Logger LOG = Logger.getLogger(Main.class);

    static {
        new DOMConfigurator().doConfigure("log4j.xml", LogManager.getLoggerRepository());
    }

    public static void main(String[] args) {

      String text = "";


        try {
            text = new InitialisationText().readFile();
        } catch (TechnicalException e) {
            e.printStackTrace();
        }


        TextParser.parseText(text);

    }


}
