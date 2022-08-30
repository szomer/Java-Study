package javaAPI.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegularExpressions {

    public static void main(String[] args) {
        // Initialize the pattern
        Pattern pattern = Pattern.compile("hi", Pattern.CASE_INSENSITIVE);
        // Initialize the matcher
        Matcher matcher = pattern.matcher("She said hi to me");

        // Matcher searches for a match in the pattern
        boolean matchFound = matcher.find();

        // Print result
        System.out.println((matchFound) ? "Match Found" : "No Match Found");


        // Pattern.compile( [1], [2] ) options:

        // [1] Pattern:
        // Expressions
            // "[abc]"                      Find one character from the options between the brackets.
            // "[^abc]"                     Find one character NOT between the brackets
            // "[0-9]"                      Find one character from the range 0 to 9
        // Metacharacters
            // "cat|dog|fish"               Find a match for any one of the patterns separated by |
            // "."                          Find just one instance of any character
            // "^Hello" 	                Finds a match as the beginning of a string
            // "World$"                     Finds a match at the end of the string
            // "\d"                         Find a digit
            // "\s"                         Find a whitespace character
            // "\bWORD" or "WORD\b"         Find a match at the beginning of a word or at the end of a word
            // "\ uxxxx"                    Find the Unicode character specified by the hexadecimal number xxxx
        // Quantifiers
            // n+                           Matches any string that contains at least one n
            // n*                           Matches any string that contains zero or more occurrences of n
            // n?                           Matches any string that contains zero or one occurrences of n
            // n{x}                         Matches any string that contains a sequence of X n's
            // n{x,y}                       Matches any string that contains a sequence of X to Y n's
            // n{x,}                        Matches any string that contains a sequence of at least X n's


        // [2] Flags:
            // Pattern.LITERAL              Special characters in the pattern will not have any special meaning and
            //                              will be treated as ordinary characters when performing a search.
            //
            // Pattern.UNICODE_CASE         Use it together with the CASE_INSENSITIVE flag to also ignore the case of
            //                              letters outside the English alphabet
            //
            // Pattern.CASE_INSENSITIVE     The case of letters will be ignored when performing a search.
    }
}
