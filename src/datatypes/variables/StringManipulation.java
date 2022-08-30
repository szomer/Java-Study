package datatypes.variables;

class StringManipulation {

    public static void main(String[] args){
        StringManipulation x = new StringManipulation();
        x.stringTransformation();
        x.specialCharacters();
        x.escapeSequences();
    }

    private void stringTransformation(){

        String txt = "some example of a string";

        // String length
        txt.length();

        // Transform string to upper case
        txt.toUpperCase();

        // Transform string to lower case
        txt.toLowerCase();

        // Return the index of the first occurrence of a specified string
        txt.indexOf("example");


        // Combine two strings into one
        String firstName = "John";
        String lastName = "Doe";
        firstName.concat(lastName);
    }

    private void specialCharacters() {
        String txt;

        // Single quotation -> '
        txt =  "It\'s alright.";

        // Double quotation  -> "
        txt =  "We are the so-called \"Vikings\" from the north.";

        // Backslash  -> "
        txt = "The character \\ is called backslash.";
    }

    private void escapeSequences() {
        String txt;

        // New Line
        txt = "Line one.\nLine two";

        // Carriage Return
        txt = "Line one.\rLine two";

        //  Tab
        txt = "Line one.\tLine two";

        // Backspace
        txt = "Line one.\bLine two";

        // Form Feed
        txt = "Line one.\fLine two";
    }
}
