package mergeSortedLists;

public class Main {

    public static int[] mergeSortedLists(int[] arr1, int[] arr2){
        int len = arr1.length + arr2.length;
        int[] mergedArray = new int[len];

        int minLen = Math.min(arr1.length, arr2.length);

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length){
            if (arr1[i] < arr2[j]){
                mergedArray[k] = arr1[i];
                i++;
            } else {
                mergedArray[k] = arr2[j];
                j++;
            }
            k++;
        }
        for (int l = i; l < arr1.length; l++) {
            mergedArray[k] = arr1[l];
            k++;
        }
        for (int l = j; l < arr2.length; l++) {
            mergedArray[k] = arr2[l];
            k++;
        }
        return mergedArray;
    }
}
