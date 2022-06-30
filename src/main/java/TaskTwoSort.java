import java.util.Arrays;
import java.util.Scanner;

//Task 2
//
//To reverse a word, push the given word to stack (letter by letter) and then, pop letters from the stack.
public class TaskTwoSort {

        public static void main(String[] args) {

            System.out.print("Please enter the word or string: \n");
            Scanner in = new Scanner(System.in);
            String word = in.nextLine();

            System.out.print("Reversed string is: \n");
            if(word.length() > 0) {
                reverseString(word, word.length() - 1);
            }
        }

        public static void reverseString(String s, int index) {
            if(index == 0) {
                System.out.println(s.charAt(index));
                return;
            }

            System.out.print(s.charAt(index));
            reverseString(s, index - 1);
        }
}