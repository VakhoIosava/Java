package btu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello Java");
        int x = 12;
        double y = 12.0;
        System.out.println(x+y);
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        System.out.println(x-5);
    }
}
