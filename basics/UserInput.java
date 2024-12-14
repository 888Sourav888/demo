package basics;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        // showing the difference between println and print
        System.out.println("hi");
        System.out.print("hello");
        System.out.println("bye");

        // getting input from the user using scanner class and store it in a variable

        Scanner sc = new Scanner(System.in);
        System.out.println("pls enter input of x");
        int x = sc.nextInt();
        System.out.println("pls enter input of y");
        int y = sc.nextInt();
        System.out.println(x);
        System.out.println(y);

    }

}
