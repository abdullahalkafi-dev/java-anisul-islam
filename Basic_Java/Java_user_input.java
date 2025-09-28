package Basic_Java;

import java.util.Scanner;

public class Java_user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.println("Inter the value of X : ");
        x = sc.nextInt();
        System.out.println("x : " + x);
        sc.nextLine();
        String str;
        System.out.println("Inter text");

        str = sc.nextLine();
        System.out.println("You Entered : " + str);
        sc.close();
    }
}
