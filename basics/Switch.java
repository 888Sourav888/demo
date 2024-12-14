package basics;

import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the choice");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("pls enter the radius");
                int r = sc.nextInt();
                System.out.println("radius is" + r * r * 3.14);
            case 2:
                System.out.println("pls enter the length");
                int l = sc.nextInt();
                System.out.println("pls enter the breadth");
                int b = sc.nextInt();

                System.out.println("Area of rectangle is" + l * b);

                break;

        }

    }

}
