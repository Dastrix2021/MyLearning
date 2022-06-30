import java.util.Arrays;
import java.util.Random;

public class TestAll {


    public static void main(String[] args) {
        Random random = new Random();

        int[] randomArr = new int[100000];
        for (int i = 0; i < randomArr.length; i++) {
            int r = random.nextInt(100000);
            randomArr[i] = r;
        }
        bubles(randomArr);
//        System.out.println(Arrays.toString(randomArr));
    }
    public static void bubles(int arr[]) {
        int count = 0;
        int temp;
//        int[] arr = new int[] {124, 235, 456, 123, 756, 476, 285, 998, 379, 108};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    count++;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Итераций: " + count);
    }
}
