package Arrays;

public class Largest {
    public static void main(String[] args) {
        int marks[]= {1,2,6,3,5};
        int largest=Integer.MIN_VALUE;
        for(int i=0; i<marks.length; i++){
            if(marks[i]>largest){
                largest=marks[i];
            }
        }
        System.out.println(largest);
    }
}
