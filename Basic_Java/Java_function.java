package Basic_Java;

public class Java_function {
    static int getSum(int a, int b) {

        return a + b;
    }

    static void printName() {
        System.out.println("Abdullah Al Kafi");
    }

    static void isEvenOrOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }

    }

    static void printDivisors(int num) {
        for (int i = 1; i < Math.sqrt(num) + 1; i++) {
            if (num % i == 0) {
                System.out.println(i);
                if (i != num / i) {
                    System.out.println(num / i);
                }
            }
        }

    }

    public static void main(String[] args) {
        int sum = getSum(1, 2);
        System.out.println(sum);
        printName();
        System.out.println(Math.sqrt(20));
        isEvenOrOdd(21);
        printDivisors(36);

    }
}
