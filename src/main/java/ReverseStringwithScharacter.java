public class ReverseStringwithScharacter {

    public static String reverse(String str){
        char[] charArray = str.toCharArray();
        int left = 0 ;
        int right = charArray.length-1;
        while(left < right) {
            if (!Character.isLetterOrDigit(charArray[left]) || Character.isSpaceChar(charArray[left])){
                left++;
            }if (!Character.isLetterOrDigit(charArray[right]) || Character.isSpaceChar(charArray[right])){
                right--;
            } else {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }
        }
        return new String(charArray);
    }
    public static void main(String[] args){
        String input = "I #Love @arm@an";
        String reversed = reverse(input);
        System.out.println(reversed);
    }
}
