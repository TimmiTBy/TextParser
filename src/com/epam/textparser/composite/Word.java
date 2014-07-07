package com.epam.textparser.composite;

public class Word implements Component{

    private String word;

    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = this.word;
    }

    @Override
    public String toString() {
        return getWord();
    }
}
