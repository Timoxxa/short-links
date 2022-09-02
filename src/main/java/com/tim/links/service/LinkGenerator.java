package com.tim.links.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class LinkGenerator {

    private static final int LENGTH = 5;
    private static final int FROM_SYMBOL = 'a';
    private static final int TO_SYMBOL = 'z';

    public String generate() {
        return new Random().ints(FROM_SYMBOL, TO_SYMBOL + 1)
                .limit(LENGTH)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
