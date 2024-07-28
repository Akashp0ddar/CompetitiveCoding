import java.util.*;

public class ValidateMathExpression {

    public static boolean isValidMathExpression(String expression) {
        String[] words = expression.split(" ");

        // Ensure the number of words is odd (to allow alternating numbers and operators)
        if (words.length % 2 == 0) {
            return false;
        }

        boolean expectNumber = true; // Start expecting a number
        for (String word : words) {
            if (expectNumber) {
                // Expecting a number, validate if it's a valid integer
                try {
                    Integer.parseInt(word);
                } catch (NumberFormatException e) {
                    return false;
                }
                expectNumber = false; // Next, expect an operator
            } else {
                // Expecting an operator, validate if it's a valid operator
                if (!isValidOperator(word)) {
                    return false;
                }
                expectNumber = true; // Next, expect a number
            }
        }
        return true; // Expression is valid
    }

    public static boolean isValidOperator(String operator) {
        return operator.equals("plus") || operator.equals("minus") || operator.equals("multiply") || operator.equals("division");
    }

    public static void main(String[] args) {
        // Test cases
        String[] testCases = {"1 plus 2 minus 3", "3 minus 4", "5 multiply 6", "8 division 2", "1 plus 2 minus"};

        for (String testCase : testCases) {
            System.out.println(testCase + ": " + isValidMathExpression(testCase));
        }
    }
}
