package main;

public class SentenceValidator {

    private static final int MAX_NUMBER = 12;

    public static boolean validateSentence(String sentence) {
        return (validateFullStop(sentence) && Character.isUpperCase(sentence.charAt(0))
                && validateQuotationMarks(sentence) && validateNumbers(sentence));
    }

    private static boolean validateQuotationMarks(String sentence) {
        final long quoteCount = sentence.chars().filter(ch -> ch == '"').count();
        return quoteCount % 2 == 0;
    }


    private static boolean validateFullStop(String sentence) {
        final long count = sentence.chars().filter(ch -> ch == '.').count();
        return (count < 2 && sentence.endsWith("."));
    }

    private static boolean validateNumbers(String sentence) {
        final String number = sentence.replaceAll("[^\\d-]", "");

        if (number.contains("-")) {
            return false;
        }

        if (!number.isEmpty()) {
            StringBuilder numberStrSb = new StringBuilder();
            if (getNumbers(sentence, numberStrSb)) {
                return false;
            }
        }
        return true;
    }

    private static boolean getNumbers(String sentence, StringBuilder numberStrSb) {
        for (char ch : sentence.toCharArray()) {
            if (Character.isDigit(ch)) {
                numberStrSb.append(ch);
            } else {
                if (numberStrSb.length() > 0) {
                    if (!numValueValidator(numberStrSb.toString())) {
                        return true;
                    }
                    numberStrSb = new StringBuilder();
                }
            }
        }
        return false;
    }

    private static boolean numValueValidator(final String number) {
        return Integer.parseInt(number) > MAX_NUMBER;
    }
}

