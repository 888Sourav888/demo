package basics;

import java.util.Scanner;

public class DataTypes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pls enter the value of n");
        int n = sc.nextInt();
        System.out.println("pls enter the value of m");
        int m = sc.nextInt();
        if (n < m) {
            System.out.println("n is lesser than m");
        } else if (n == m) {
            System.out.println("n is equal to m");

        } else {
            System.out.println("n is bigger than m");
        }
    }
}