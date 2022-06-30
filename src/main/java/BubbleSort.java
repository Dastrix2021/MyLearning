//Look at the program implementation of the bubble sort.
public class BubbleSort {
    public static void bubbleSort(int arr[])
    {
        int count = 0;
        boolean needIteration = true;
        while(needIteration) {
            needIteration = false;
            int n = arr.length;
            for(int i = 0; i < n-1; i++)
                for(int j = 0; j < n-i-1; j++)
                    if(arr[j] > arr[j+1])
                    {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        needIteration = true;
                        count++;
                    }
        }
        System.out.println("The number of permutations is " + count);
    }

    static void showArray(int[] arr)
    {
        for(int value : arr) System.out.print(value + " ");
        System.out.println();
    }

    public static void main(String []args) {
        int[] libraryNum = {3,4,5,2,1};
        System.out.println("Initial array");
        showArray(libraryNum);
        bubbleSort(libraryNum);
        System.out.println("Sorted array");
        showArray(libraryNum);
    }
}
//
//    The result:
//
//        Initial array
//        124 235 456 123 756 476 285 998 379 108
//        The number of permutations is 20
//        Sorted array
//        108 123 124 235 285 379 456 476 756 998

