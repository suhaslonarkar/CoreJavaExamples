package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class LikeFeatureTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testCaseWithNameOne() {
        String input[] = { "NameOne" };
        assertEquals("NameOne likes this", LikeFeature.viewLikes(input));
    }

    @Test
    void testCaseWithNameTwo() {
        String input[] = { "NameOne", "NameTwo" };
        assertEquals("NameOne and NameTwo like this", LikeFeature.viewLikes(input));
    }

    @Test
    void testCaseWithNameThree() {
        String input[] = { "NameOne", "NameTwo", "NameThree" };
        assertEquals("NameOne, NameTwo and NameThree like this", LikeFeature.viewLikes(input));
    }

    @Test
    void testCaseWith_N_Names() {
        String input[] = { "NameOne", "NameTwo", "NameThree", "xyz", "UVW", "Vikas", "Modi", "Tommy" };
        assertEquals("NameOne, NameTwo and 6 others like this", LikeFeature.viewLikes(input));
    }
}
