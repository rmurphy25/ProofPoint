package main;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SentenceValidatorTest {

    private static final String VALID_SENTENCE_1 = "The quick brown fox said “hello Mr lazy dog”.";
    private static final String VALID_SENTENCE_2 = "The quick brown fox said hello Mr lazy dog.";
    private static final String VALID_SENTENCE_3 = "One 15 lazy dog is too few, 13 is too many.";
    private static final String VALID_SENTENCE_4 = "One lazy dog is too few, thirteen is too many.";
    private static final String VALID_SENTENCE_5 = "The 13 lazy dog is too few, 13 is too many.";

    private static final String INVALID_SENTENCE_1 = "The quick brown fox said \"hello Mr. lazy dog\".";
    private static final String INVALID_SENTENCE_2 = "the quick brown fox said “hello Mr lazy dog\".";
    private static final String INVALID_SENTENCE_3 = "\"The quick brown fox said “hello Mr lazy dog.\"";
    private static final String INVALID_SENTENCE_4 = "One lazy dog is too few, 12 is too many.";
    private static final String INVALID_SENTENCE_5 = "One lazy dog is too few, -13 is too many.";
    private static final String INVALID_SENTENCE_6 = "One lazy dog is too few, 12.9 is too many.";
    private static final String INVALID_SENTENCE_7 = "";
    private static final String INVALID_SENTENCE_8 = "The 13 lazy dog is too few, 12 is too many.";


    @Test
    public void validSentence() {
        assertTrue(SentenceValidator.validateSentence(VALID_SENTENCE_1));
    }

    @Test
    public void validSentence2() {
        assertTrue(SentenceValidator.validateSentence(VALID_SENTENCE_2));
    }

    @Test
    public void validSentence3() {
        assertTrue(SentenceValidator.validateSentence(VALID_SENTENCE_3));
    }

    @Test
    public void validSentence4() {
        assertTrue(SentenceValidator.validateSentence(VALID_SENTENCE_4));
    }

    @Test
    public void validSentence5() {
        assertTrue(SentenceValidator.validateSentence(VALID_SENTENCE_5));
    }

    @Test
    public void invalidSentence1() {
        assertFalse(SentenceValidator.validateSentence(INVALID_SENTENCE_1));
    }

    @Test
    public void invalidSentence2() {
        assertFalse(SentenceValidator.validateSentence(INVALID_SENTENCE_2));
    }

    @Test
    public void invalidSentence3() {
        assertFalse(SentenceValidator.validateSentence(INVALID_SENTENCE_3));
    }

    @Test
    public void invalidSentence4() {
        assertFalse(SentenceValidator.validateSentence(INVALID_SENTENCE_4));
    }

    @Test
    public void invalidSentence5() {
        assertFalse(SentenceValidator.validateSentence(INVALID_SENTENCE_5));
    }

    @Test
    public void invalidSentence6() {
        assertFalse(SentenceValidator.validateSentence(INVALID_SENTENCE_6));
    }

    @Test
    public void invalidSentence7() {
        assertFalse(SentenceValidator.validateSentence(INVALID_SENTENCE_7));
    }

    @Test
    public void invalidSentence8() {
        assertFalse(SentenceValidator.validateSentence(INVALID_SENTENCE_8));
    }
}