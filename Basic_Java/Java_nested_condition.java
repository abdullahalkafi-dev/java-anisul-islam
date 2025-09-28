package Basic_Java;

public class Java_nested_condition {
    public static void main(String[] args) {
        // print the smallest number
        int a, b, c;
        a = 5;
        b = 5;
        c = 5;
        if (a < b && a < c) {
            System.out.println("Smallest number is " + a);
        } else if (b < a && b < c) {
            System.out.println("Smallest number is " + b);
        } else if (c < a && c < b) {
            System.out.println("Smallest number is " + c);
        } else {
            System.out.println("All numbers are same");

        }
    }
}
