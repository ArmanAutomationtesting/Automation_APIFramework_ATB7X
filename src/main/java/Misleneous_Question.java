import java.util.ArrayList;
import java.util.List;

public class Misleneous_Question {

    //[16, 17, 4, 3, 5, 2]

    public static ArrayList<Integer> leader(int[] a){
        ArrayList<Integer> list = new ArrayList<>();
        int size = a.length;
        int top = a[size-1];
        int max = top;
        list.add(top);
        for(int i = a.length-2; i>=0; i--){
            if(a[i] > max) {
                    list.add(a[i]);
                    max = a[i];
            }


        }
        return list;
    }
    public static void main(String[] args) {
        int[] List_leader = {16, 17, 4, 3, 5, 2};
        System.out.println("Leader are ==== " + leader(List_leader));
    }

}

