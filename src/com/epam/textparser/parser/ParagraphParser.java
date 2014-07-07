package com.epam.textparser.parser;

import com.epam.textparser.manager.RegexManager;
import com.epam.textparser.composite.Composite;
import org.apache.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParagraphParser {

    private static final Logger LOG = Logger.getLogger(ParagraphParser.class);

    public static Composite parseParagraph(String paragraphText) {
        Composite paragraph = new Composite();
        Pattern pattern = Pattern.compile(RegexManager.REGEX_SENTANSE);
        Matcher matcher = pattern.matcher(paragraphText);
        while (matcher.find()) {
            String sentenceText = matcher.group();
            System.out.println(sentenceText);
            LOG.info("Sentanse found: " + sentenceText);
            Composite sentence = SentanseParser.parseSentanse(sentenceText);
            paragraph.add(sentence);
        }
        return  paragraph;

    }
}
