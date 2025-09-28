package Basic_Java;

public class Java_2d_array {
    public static void main(String[]args){
        int matrixA[][] = {{1,2,3},{4,5,6}};
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrixA[i][j]+" ");
            }
            System.out.println();
        }
    }
}
