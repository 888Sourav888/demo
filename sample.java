package demo;

import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the input");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
        }
    }

}