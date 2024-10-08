package Day10;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        missingNumber(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] arr){
        int i = 0;
        
        while(i < arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }

        // search for the missing index 
        for (int index = 0; index < arr.length; index++) {
            if(index != arr[index]){
                return index;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}

