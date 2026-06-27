/*package Arrays2D;
public class SearchSortMatrix {
    public static boolean searched_in_sorted_matrix(int matrix[][],int key){
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("found at" + row + col);
                return true;
            }
            else if(key<matrix[row][col]){                                  //topmostapproach
             col--;
            }
            else{
             row++;
            }
        }
        System.out.println("not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][]={
            {10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
            int key=33;
            searched_in_sorted_matrix(matrix,key);
    }
}*/





package Arrays2D;
public class SearchSortMatrix {
    public static boolean searched_by_bottom(int matrix[][],int key){
        int row=matrix.length-1;
        int col=0;
        while(row>=0 && col<matrix[0].length){
            if(key==matrix[row][col]){
                System.out.println("Found at" + row  + "," + col);
                return true;
            }
            else if(key>matrix[row][col]){
                col++;
            }
            else{
                row--;
            }
        }
        System.out.println("not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key=33;
        searched_by_bottom(matrix,key);
    }
}