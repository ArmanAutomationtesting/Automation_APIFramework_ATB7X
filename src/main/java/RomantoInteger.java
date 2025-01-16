import org.apache.commons.collections4.map.HashedMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RomantoInteger {
    public int romantoIntegerchange(String s) {
        HashedMap<Character, Integer> Map = new HashedMap<>();
//      "IXVM"
        Map.put('I', 1);
        Map.put('X', 10);
        Map.put('V', 5);
        Map.put('L', 50);
        Map.put('C', 100);
        Map.put('D', 500);
        Map.put('M', 1000);
        int number123 = 0;
        int result = 0;

        for (int i = 0; i <= s.length()-1; i++) {
            number123 = Map.get(s.charAt(i));
            if (i<s.length()-1 && Map.get(s.charAt(i)) < Map.get(s.charAt(i + 1))) {
                result -= number123;
            } else {
                result += number123;
            }
        }
        return result;
    }
    int isdivisible7(String num) {
        // code here
        Integer number = Integer.parseInt(num);
        if (number % 7 == 0){
            return 1;
        }else{
            return 0;
        }
    }

    public List<Integer> duplocate(int[] arr){
        List<Integer> List = new ArrayList<>();
        Arrays.sort(arr);
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                List.add(arr[i]);
            }
        }
         return List;
    }

    public static void main(String[] args) {
        RomantoInteger romanToInteger = new RomantoInteger();
        int[] arr = {2,4,5,3,2,4};
        System.out.println(romanToInteger.duplocate(arr));
    }




}


