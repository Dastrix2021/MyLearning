public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] {459, 9, 54, 111, 222, 44, 555, 55, 97, 318 ,13, 45, 87, 19, 848, 557, 46};
        BubbleSort.showArray(arr);
        BubbleSort.bubbleSort(arr);
        BubbleSort.showArray(arr);
    }
}
//
//import java.util.Random;
//
//public class Main
//{
//    /*There are 3 teams that take part in the darts competition. Each team comprises 4 participants. Each participant has 3 attempts. The number of points that each participant gets for one throw is entered from a keyboard. The maximum number of points for 1 attempt is 60. Display the winner (i.e. the number of the participant with the biggest number of points and his/her result) from each team. The participant of which team showed the best result?*/
//    static void input(int[][] x, int n1,int m1)   // array input function
//    {
//        int i,j;
//        Random rand = new Random();
//        for (i=0;i<n1;i++)
//            for (j=0;j<m1;j++)
//                x[i][j]=rand.nextInt(59);         // Entering random numbers in the range from 0 to 60
//    }
//
//    static void output(int[][] x, int n1, int m1) //array output function
//    {
//        int i,j;
//        for (i=0;i<n1;i++)
//        {
//            for (j=0;j<m1;j++)
//                System.out.print(x[i][j] + " ");
//            System.out.println();
//        }
//    }
//
//    static int win(int[][] x, int n1, int m1)    //winner determination function
//    {
//        int i,j;
//        int sum;
//        int[] a = new int[4];
//        for (i=0;i<n1;i++)
//        {
//            sum=0;
//            for (j=0;j<m1;j++)
//            {
//                sum+=x[i][j];
//                a[i]=sum;
//            }
//            System.out.printf("Total score of %d player = %d\n", i+1, sum);
//        }
//
//        int imax_a=0;
//        int max_a=a[0];
//        for(i=0;i<n1;i++)
//        {
//            if(a[i]>max_a)
//            {
//                max_a=a[i];
//                imax_a=i;
//            }
//        }
//        System.out.printf("The winner is player %d with the score of ",imax_a+1);
//        return max_a;
//    }
//
//    public static void main(String[] args) {
//
//        int[][] x = new int[4][3];
//        int[][] y = new int[4][3];
//        int[][] z = new int[4][3];
//        int n=4;
//        int m=3;
//
//        System.out.println("First team results\n");
//        input(x, n, m);
//        output(x, n, m);
//        int first_win=win(x, n, m);
//        System.out.printf("%d.\n", first_win);
//
//        System.out.println("\nSecond team results\n");
//        input(y, n, m);
//        output(y, n, m);
//        int second_win =win(y, n, m);
//        System.out.printf("%d.\n", second_win);
//
//        System.out.println("\nThird team results\n");
//        input(z, n, m);
//        output(z, n, m);
//        int third_win=win(z, n, m);
//        System.out.printf("%d.\n", third_win);
//
//        int max,num;
//
//        if (first_win > second_win && first_win > third_win)
//            max=first_win;
//        else if (second_win > third_win)
//            max=second_win;
//        else max=third_win;
//
//        if(max==first_win)
//            num=1;
//        else if(max==second_win)
//            num=2;
//        else num=3;
//        System.out.printf("\nThe best result was shown by player of the team %d with a score of %d.\n",num, max);
//    }
//}
//


//Task 2
//
//A new film was released at the cinema. There is 1 hall in the cinema and it can fit 200 spectators. Every day, a different number of tickets were sold for a new film in the first and second weeks of its running. When did the cinema sell more tickets – during the first or the second week? What was the revenue of the cinema in the first two weeks of the movie's distribution, if the price of one ticket is $M?
//import java.util.Scanner;

//public class Main
//{
//    static void input(int[] array)   //array input function
//    {
//        for(int i = 0; i < array.length; i++)
//        {
//            System.out.print("Enter the number of tickets sold in day " + (i+1) + " - ");
//            Scanner in = new Scanner(System.in);
//            array[i] = in.nextInt();
//
//            if(array[i]>200)
//            {
//                while(array[i]>200)
//                {
//                    System.out.println("The hall is full. Enter again.");
//                    System.out.print("Enter the number of tickets sold in day " + (i+1) + " - ");
//                    array[i] = in.nextInt();
//                }
//            }
//        }
//    }
//
//    static void output(int[] array)  //array output function
//    {
//        for(int i = 0; i < array.length; i++)
//            System.out.print( array[i] + " ");
//    }
//
//    static int sum(int[] array)     //cinema revenue calculation function
//    {
//        int sum=0;
//        for(int i = 0; i < array.length; i++)
//            sum+=array[i];
//        return sum;
//    }
//
//    public static void main(String[] args) {
//
//        int[] a = new int [7];
//        int[] b = new int [7];
//        int sum_first = 0;
//        int sum_second = 0;
//
//        System.out.println("Enter the number of tickets sold during the first week");
//        input(a);
//        output(a);
//        System.out.println("\nEnter the number of tickets sold during the second week");
//        input(b);
//        output(b);
//        System.out.println("");
//        sum_first=sum(a);
//        System.out.println(sum_first + " tickets were sold during the first week.");
//        sum_second=sum(b);
//        System.out.println(sum_second + " tickets were sold during the second week.");
//
//        if(sum_first > sum_second)
//            System.out.printf("In the first week, the cinema sold %d more tickets than in the second one.\n",sum_first - sum_second);
//        else if(sum_first < sum_second)
//            System.out.printf("In the second week,  the cinema sold %d more tickets than in the first one.\n",sum_second - sum_first);
//        else System.out.println("The cinema sold the same number of tickets in the first week as in the second week.");
//
//        System.out.print("Enter ticket price: ");
//        Scanner in = new Scanner(System.in);
//        int price = in.nextInt();
//        int total = price*(sum_first+sum_second);
//
//        System.out.println("The total cinema's revenue for two weeks was $" + total + ".");
//    }
//}


