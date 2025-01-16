package pojos;

public class EquilibriumPoint {
    public static int equilibriumPoint(int[] arr) {
        int prefix = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (prefix == sum - prefix - arr[i]) {
                return i + 1;
            } else {
                prefix += arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,2,2};
//        EquilibriumPoint equilibriumPoint1 = new EquilibriumPoint();
        System.out.println(equilibriumPoint(arr));
    }
}
