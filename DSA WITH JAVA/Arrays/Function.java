package Arrays;

public class Function {
    public static void Update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i]=marks[i]+1;
        }

    }
    public static void main(String[] args) {
        int marks[]={98,95,97};
        Update(marks);
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
