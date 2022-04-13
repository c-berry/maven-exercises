import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter something:");
        String input = sc.nextLine();
        System.out.println("You entered: " + input);

        if (StringUtils.isNumeric(input)) {
            System.out.println(input + " is numeric.");
        } else {
            System.out.println(input + " is NOT numeric.");
        }

        System.out.println("Flipped case: " + StringUtils.swapCase(input));
        System.out.println("Reversed: " + StringUtils.reverse(input));

    }   // <= end of main
} // <= end of class
