package org.academiadecodigo.bootcamp;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        String message = "I'll send an SOS to the garbage world, " +
                "I hope that someone garbage gets my message in a garbage bottle.";


        String[] words = message.split(" ");

        String sentence = Stream.of(words)
                .filter(word -> !(word.equals("garbage")))
                .map(String::toUpperCase)
                .reduce("", (acc, elem) -> acc + elem + " ");

        System.out.println(sentence);
    }
}
