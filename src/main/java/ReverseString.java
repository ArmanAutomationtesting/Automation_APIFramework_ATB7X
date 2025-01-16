public class ReverseString {
        public static String reverse(String s){
            String[] reverse = s.split(" ");
            String final_String = "";
            for(int i = reverse.length-1; i>=0; i-- ){
                final_String += reverse[i] + " ";
            }
            final_String.trim();
            return  final_String;
        }


    public static void main(String[] args) {
        String arman = "i love Arman";
        System.out.println( " reverse String === " + reverse(arman) );
    }

}
