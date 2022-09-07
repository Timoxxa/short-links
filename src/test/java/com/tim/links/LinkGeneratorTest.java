package com.tim.links;

import com.tim.links.service.LinkGenerator;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertTrue;

public class LinkGeneratorTest {

    private final LinkGenerator linkGenerator = new LinkGenerator();
    private final Pattern pattern = Pattern.compile("^[a-z]{5}$");

    @Test
    public void testLinkGenerator() {
        for (int i = 0; i < 10; i++) {
            String generated = linkGenerator.generate();
            Matcher matcher = pattern.matcher(generated);
            assertTrue(matcher.matches());
        }
    }
}
