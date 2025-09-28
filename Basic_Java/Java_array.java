package Basic_Java;

public class Java_array {
    public static void main(String[] args) {
        int numArr[] = new int[4];
        numArr[0] = 1;
        numArr[1] = 2;
        numArr[2] = 3;
        numArr[3] = 4;
        int sum = numArr[2] + numArr[3];
        System.out.println("sum : " + sum);
        System.out.println("size of numArr is : " + numArr.length);
        int a[] = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println("size of a is : " + a.length);
        // print arr a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
