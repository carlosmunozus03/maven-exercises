import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;


public class exercisemain {

    public static Scanner sc = new Scanner(System.in);
    public static String userInput;


    public static void main(String[] args) {
        System.out.println("Enter a statement: ");
        userInput = sc.next();
        if (StringUtils.containsAny("1234567890", userInput)) {
            System.out.println("There are numbers.");
        } else {
            System.out.println("No numbers");
            System.out.println("Swap case: ");
            System.out.println(StringUtils.swapCase(userInput));
            System.out.println("Reversed: ");
            System.out.println(StringUtils.reverse(userInput));
        }
    }

}
