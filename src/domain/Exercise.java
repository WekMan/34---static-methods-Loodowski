package domain;

public class Exercise {
    /**
     * Method that checks if a string is a palindrome
     * @param text string that will be check
     * @return boolean true or false
     */
    public static boolean Calculate(String text){
        /**
         * Reverse the word and do it lowercase
         */
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);
            if (forwardChar != backwardChar)
                return false;
        }
        return true;
}
