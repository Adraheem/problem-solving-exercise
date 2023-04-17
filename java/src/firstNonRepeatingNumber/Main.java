package firstNonRepeatingNumber;

public class Main {

//    public static void main(String[] args) {
//        // x = [9,2,3,2,6,6]
//        int[] x = {9, 2, 3, 2, 6, 6};
//        int[] y = {4, 5, 1, 2, 0, 4};
//        int num = findFirstNonRepeatingNumber(y);
//        System.out.println(num);
//    }

    public static int findFirstNonRepeatingNumber(int[] arr) {
        int i = 0;
        boolean again = true;

        int num = arr[0];

        while (i < arr.length + 1 && again) {
            if (i == arr.length) {
                throw new IllegalArgumentException("No unique number");
            }

            num = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == num && i != j) {
                    again = true;
                    break;
                } else {
                    again = false;
                }
            }
            i++;
        }
        return num;
    }
}
