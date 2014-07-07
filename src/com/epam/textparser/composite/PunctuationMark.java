package com.epam.textparser.composite;

public class PunctuationMark implements Component{

    private String punctuationMark;

    public PunctuationMark(String punctuationMark) {
        this.punctuationMark = punctuationMark;
    }

    public String getPunctuationMark() {
        return punctuationMark;
    }

    public void setPunctuationMark(String punctuationMark) {
        this.punctuationMark = punctuationMark;
    }

    @Override
    public String toString() {
        return getPunctuationMark();
    }
}
