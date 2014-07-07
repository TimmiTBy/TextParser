package com.epam.textparser.parser;

import com.epam.textparser.manager.RegexManager;
import com.epam.textparser.composite.Composite;
import com.epam.textparser.composite.PunctuationMark;
import com.epam.textparser.composite.Word;
import org.apache.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentanseParser {

    private static final Logger LOG = Logger.getLogger(SentanseParser.class);

    public static Composite parseSentanse(String sentanseText) {
        Composite sentanse = new Composite();
        Pattern pattern = Pattern.compile(RegexManager.REGEX_WORD + "|" + RegexManager.REGEX_PUNCTUATION_MARKS);
        Matcher matcher = pattern.matcher(sentanseText);
        while (matcher.find()) {
            String wordOfMarkCandidate;
            wordOfMarkCandidate = matcher.group();
            if (Pattern.matches(RegexManager.REGEX_PUNCTUATION_MARKS, wordOfMarkCandidate)) {
                LOG.info("Punctuation mark found: " + wordOfMarkCandidate);
                PunctuationMark punctuationMark = new PunctuationMark(wordOfMarkCandidate);
                sentanse.add(punctuationMark);
            } else {
                LOG.info("Word found: " + wordOfMarkCandidate);
                Word word = new Word(wordOfMarkCandidate);
                sentanse.add(word);
            }
        }
        return sentanse;
    }


}
