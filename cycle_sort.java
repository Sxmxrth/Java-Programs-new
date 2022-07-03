import java.util.Arrays;

public class cycle_sort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        cycleSort(arr);
    }

    static void cycleSort(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            int temp = 0;
            if((arr[0]-1) != 0){
                temp = arr[arr[0]-1];
                arr[arr[0]-1] = arr[0];
                arr[0] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
