package Sorting;

public class Selection {
    public static void selection_sort(int arr[]){
        for(int i=0;i<arr.length-1; i++){
            int minpos=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[minpos]){
                    minpos=j;
                }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void print_arr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,3,8,1,2};
        selection_sort(arr);
        print_arr(arr);
    }
}
