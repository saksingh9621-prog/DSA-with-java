package Arrays;
public class Binary{
    public static int binary_search(int num[], int key){
        int start=0;
        int end=num.length-1;
        while(start<=end){
        int mid=(start+end)/2;
        if(num[mid]==key){
            return mid;
        }
        if( num[mid]<key){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
        }
        return -1;
        }
    
    public static void main(String[]arg){
        int num[]={2,4,6,8,10,12,14,16};
        int key=10;
        int index=binary_search(num,key);
        System.out.println("Index of searched number = " + index);
    }
}