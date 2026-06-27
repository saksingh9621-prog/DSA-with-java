package Sorting;

public class Bubble {
    public static void bubble_sort(int nums[]){
        int n= nums.length;
        for(int turn=0;turn<n-1;turn++){
            for(int j=0;j<n-1-turn; j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
    public static void print_array(int nums[]){
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[]={5,4,1,3,2};
        bubble_sort(nums);
        print_array(nums);
    }
}
