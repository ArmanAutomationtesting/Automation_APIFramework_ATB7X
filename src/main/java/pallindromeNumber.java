import com.github.javafaker.Bool;

public class pallindromeNumber {

    public static boolean isPallindrome(String arr) {
        int left = 0;
        int right = arr.length() - 1;
        int count = 0;
        for (int i = 0; i < right; i++) {
            while (left < right) {
                if (arr.charAt(left) == arr.charAt(right)) {
                    left++;
                    right--;
                } else {
                    count++;
                    left++;
                    right--;
                }
            }
        }
        if(count == 0){
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        String s = "aabbaa";
        if (isPallindrome(s)) {
            System.out.println("It is a Pallindrome String" + " =  " + s);
        }
        if (!isPallindrome(s)) {
            System.out.println("It is not a Pallindrome String" + s);
        }

//        int length = s.length();
//        int j = length-1;
//        int count = 0;
//
//        for(int i=0; i<length; i++){
//
//            if(s.charAt(i)==s.charAt(j)){
//                count++;
//                j--;
//            }
//
//        }
//        if(count==length){
//            System.out.println("The String is a palindrome");
//        }else{
//            System.out.println("The String is a NOT palindrome");
//        }


    }
}
