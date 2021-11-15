public class ConvertDataTypes {

    public static void main(String[] args) {

        String str = "0";

        int a = Integer.valueOf(str);
        int b = Integer.parseInt(str);

        //Difference between value.Of() and parseInt()

        str.equals("a");


        /*

        Integer.valueOf


        Returns an Integer object holding the value of the specified String. The argument is interpreted as representing a signed decimal integer, exactly as if the argument were given to the parseInt(String) method. The result is an Integer object that represents the integer value specified by the string.
        In other words, this method returns an Integer object equal to the value of: new Integer(Integer.parseInt(s))
        Params:
        s – the string to be parsed.
        Returns:
        an Integer object holding the value represented by the string argument.
        Throws:
        NumberFormatException – if the string cannot be parsed as an integer.


        public static Integer valueOf(String s) throws NumberFormatException {
        return Integer.valueOf(parseInt(s, 10));
        }

        -----------------------------------------------------------------------

        Integer.parseInt


        Parses the string argument as a signed decimal integer. The characters in the string must all be decimal digits, except that the first character may be an ASCII minus sign '-' ('\u002D') to indicate a negative value or an ASCII plus sign '+' ('\u002B') to indicate a positive value. The resulting integer value is returned, exactly as if the argument and the radix 10 were given as arguments to the parseInt(String, int) method.
        Params:
        s – a String containing the int representation to be parsed
        Returns:
        the integer value represented by the argument in decimal.
        Throws:
        NumberFormatException – if the string does not contain a parsable integer


        public static int parseInt(String s) throws NumberFormatException {
        return parseInt(s,10);
        }

         */


        System.out.println(a);
        System.out.println(b);

        // We can use '-', '+' signs while converting process of number type variables.

        boolean c = Boolean.parseBoolean(str);
        boolean d = Boolean.valueOf(str);

        System.out.println(c);
        System.out.println(d);

//        Parses the string argument as a boolean. The boolean returned represents the value true if the string argument is not null and is equal, ignoring case, to the string "true".
//        Otherwise, a false value is returned, including for a null argument.
//        Example: Boolean.parseBoolean("True") returns true.
//        Example: Boolean.parseBoolean("yes") returns false.


    }
}
