package Basic_Java;
public class Java_while_loop {
    public static void main(String[] args) {
        int i=1;
        while(i<=5){
            System.out.print(i+" ");
            i++;
        }


        //sum of 1 - 100 
        int j =1;
        int sum =0;
        while(j<=100){
            sum=sum+j;
            j++;
        }
        System.out.print("\nsum is "+ sum);
    }
}
