package Basic_Java;

public class Java_for_loop {

    public static void main(String[] args) {
        // print until 6
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                break;
            }
            System.out.println("Current value of i is " + i);
        }
        System.out.println("\n-------------------------------------------------------\n");
        // print only even number 1 to  100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i+" ");
        }
         System.out.println("\n-------------------------------------------------------\n");
         //print the number divided by 2 and 5 (from 1 to 200)
          for (int i = 1; i <= 200; i++) {
            if (i % 2 == 0 && i%5==0) {
                System.out.print(i+" ");
            }
            
        }  
    }
}
