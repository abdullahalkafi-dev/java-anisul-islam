package Basic_Java;

public class Java_nested_loop {
    public static void main(String[] args) {
      
        for (int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
