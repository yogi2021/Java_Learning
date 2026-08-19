package Strings;

public class StringMethods2 {

    public static void main(String[] args) {

        // String Creation
        String str = "Python";

        // length() -> Returns total number of characters
        int length = str.length();
        System.out.println("Length : " + length);

        // Concat() -> Joins two strings
        String s2 = str.concat(" Development");
        System.out.println("Original String : " + str);
        System.out.println("Concatenated String : " + s2);

        // isEmpty() -> Checks whether string is empty
        boolean empty = s2.isEmpty();
        System.out.println("Is Empty : " + empty);

        // indexOf() -> Returns first occurrence index
        int firstIndex = s2.indexOf('t');
        System.out.println("First Index : " + firstIndex);

        // lastIndexOf() -> Returns last occurrence index
        int lastIndex = s2.lastIndexOf('t');
        System.out.println("Last Index : " + lastIndex);

        // equals() -> Compares two strings
        boolean equal = s2.equals("Python Development");
        System.out.println("Equals : " + equal);

        // equalsIgnoreCase() -> Ignores uppercase/lowercase
        boolean ignoreCase = s2.equalsIgnoreCase("python development");
        System.out.println("Equals Ignore Case : " + ignoreCase);

        // charAt() -> Returns character at given index
        char ch = s2.charAt(3);
        System.out.println("Character : " + ch);

        // toCharArray() -> Converts String into character array
        char[] chArray = s2.toCharArray();

        for (int i = 0; i < chArray.length; i++) {
            System.out.println(chArray[i]);
        }
       
         // toUpperCase() -> Converts into uppercase
        String upper = s2.toUpperCase();
        System.out.println(upper);

        // toLowerCase() -> Converts into lowercase
        String lower = s2.toLowerCase();
        System.out.println(lower);

        // substring() -> Extracts part of string
        String sub = s2.substring(2, 8);
        System.out.println(sub);

        // trim() -> Removes leading and trailing spaces
        String s3 = "      Java Programming      ";
        String trim = s3.trim();
        System.out.println(trim);

        // replace() -> Replaces character or string
        String s4 = "java124";
        String replace = s4.replace("a", "b");
        System.out.println(replace);

        // replaceAll() -> Replaces using Regular Expression (Regex)
        String replaceAll = s4.replaceAll("[0-9]", "");
        System.out.println(replaceAll);

        // contains() -> Checks whether substring exists
        boolean contain = s2.contains("Python");
        System.out.println(contain);

        // startsWith() -> Checks starting word
        boolean start = s2.startsWith("Python");
        System.out.println(start);

        // endsWith() -> Checks ending word
        boolean end = s2.endsWith("Development");
        System.out.println(end);

        // split() -> Splits string into array
        String sentence = "Java Python C++ JavaScript";

        String[] arr = sentence.split(" ");

        for (String word : arr) {
            System.out.println(word);
        }

        // compareTo() -> Lexicographical comparison
        System.out.println("Java".compareTo("Python"));

        // compareToIgnoreCase() -> Ignores uppercase/lowercase
        System.out.println("JAVA".compareToIgnoreCase("java"));

        // valueOf() -> Converts primitive into String
        int number = 100;
        String value = String.valueOf(number);
        System.out.println(value);

        // repeat() -> Repeats string (Java 11+)
        System.out.println("Java ".repeat(3));

        // intern() -> Returns String from String Constant Pool
        String pool = new String("Java");
        System.out.println(pool.intern());

       
    }
}