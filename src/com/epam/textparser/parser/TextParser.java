package com.epam.textparser.parser;

import com.epam.textparser.manager.RegexManager;
import com.epam.textparser.composite.Code;
import com.epam.textparser.composite.Composite;
import org.apache.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextParser {

    private static final Logger LOG = Logger.getLogger(TextParser.class);

    public static Composite parseText(String text) {
        Composite textElement = new Composite();
        Pattern pattern = Pattern.compile(RegexManager.REGEX_PARAGRAPH + "|" + RegexManager.REGEX_CODE);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String paragraphOrCodeCandidate = matcher.group();
            if (Pattern.matches(RegexManager.REGEX_PARAGRAPH, paragraphOrCodeCandidate)) {
                LOG.info("Paragraph found: " + paragraphOrCodeCandidate);
                Composite paragraph = ParagraphParser.parseParagraph(paragraphOrCodeCandidate);
                textElement.add(paragraph);
            } else {
                LOG.info("code found: \n" + paragraphOrCodeCandidate);
                Code code =
                        new Code(paragraphOrCodeCandidate);
                textElement.add(code);
            }
        }

        return textElement;
    }



}

