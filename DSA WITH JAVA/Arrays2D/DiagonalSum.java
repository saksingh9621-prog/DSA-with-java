/*package Arrays2D;

public class DiagonalSum {
    public static void diagonal_sum(int matrix[][]){
        int sum=0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0;j<matrix[0].length; j++){
                if(i==j){
                  sum+=matrix[i][j];
                }
                else if(i+j==matrix.length-1){
                   sum+=matrix[i][j]; 
                }
            }
        }
        System.out.print(sum);
    }
    public static void main(String[] args) {
        int matrix[][]={
            {1,2,3,4},{5,6,7,8},{10,11,12,13},{14,15,16,17}
        };
        diagonal_sum(matrix);
    }
}*/


                                                                   // OPTIMAL SOLUTION
package Arrays2D;
public class DiagonalSum {
    public static void diagonal_sum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            //primarydiagonal
            sum+=matrix[i][i];
            //secondarydiagonal
            if(i != matrix.length-1-i){
                sum+=matrix[i][matrix.length-1-i];
            }
        }
        System.out.println("Sum=" + sum);
    }

    public static void main(String[] args) {
        int matrix[][]={
            {1,2,3,4},{5,6,7,8},{10,11,12,13},{14,15,16,17}
        };
        diagonal_sum(matrix);
    }
}                                                                   
