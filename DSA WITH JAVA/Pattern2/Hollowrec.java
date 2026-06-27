/*package Pattern2;
public class Hollowrec{
    public static void main(String[] args) {
        int totrow=7;
        int totcol=5;
        for(int i= 1; i<=totrow; i++){
            for(int j=1; j<=totcol; j++){
                if(i==1 || i==totrow || j==1 || j==totcol){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
                System.out.println();
        }
    }
}*/

package Pattern2;
public class Hollowrec{
    public static void hollow(int totrow, int totcol){
        for(int i= 1; i<=totrow; i++){
            for(int j=1; j<=totcol; j++){
                if(i==1 || i==totrow || j==1 || j==totcol){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
                System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow(4,5);
    }
}
