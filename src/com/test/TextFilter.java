package com.test;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TextFilter {

    public String filter(String text, String stopStr) {
        String[] textWords = text.split(" ");
        String[] stopWords = stopStr.split(",");

        Stream<String> textStream = Arrays.stream(textWords);
        for (String words : stopWords) {
            textStream = textStream.filter(str -> !str.equalsIgnoreCase(words));
        }

        return textStream.collect(Collectors.joining(" "));
    }
}
