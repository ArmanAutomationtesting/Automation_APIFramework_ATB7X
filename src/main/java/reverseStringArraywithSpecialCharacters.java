public class reverseStringArraywithSpecialCharacters {
    public static void main(String[] args) {
        String input = "I lo#ve My In@dia";
        String output = reverseStringPreservingSpecialCharacters(input);

        System.out.println("Input" + " = " + input);
        System.out.println("Output" + " = " + output);

    }

    public static String reverseStringPreservingSpecialCharacters(String str) {
        // Convert the input string to a character array
        char[] Char = str.toCharArray();
        int left = 0, right = Char.length - 1;
        while (left < right) {
            if (!Character.isLetterOrDigit(Char[left]) || Character.isSpaceChar(Char[left])){
                left++;
            }if (!Character.isLetterOrDigit(Char[right]) || Character.isSpaceChar(Char[right])){
                right--;
            } else {
                char temp = Char[left];
                Char[left] = Char[right];
                Char[right] = temp;
                left++;
                right--;
            }
        }
        return new String(Char);
    }

}

