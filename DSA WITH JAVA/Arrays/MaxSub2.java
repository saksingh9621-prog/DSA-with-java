package Arrays;

public class MaxSub2 {
    public static void Max_subarrays(int num[]){
    int currentsum=0;
    int maxsum=Integer.MIN_VALUE;
    int prefix[]=new int[num.length];
    prefix[0]=num[0];
    for(int i=1; i<prefix.length;i++){
        prefix[i]=prefix[i-1]+num[i];
    }
    for(int i=0;i<num.length;i++){
        int start=i;
        for(int j=i; j<num.length;j++){
            int end=j;
            if(start==0){
                currentsum=prefix[j];
            }else{
         currentsum=prefix[end]-prefix[start-1];
            }
         if(maxsum<currentsum){
            maxsum=currentsum;
         }
        }
    }
    System.out.println("max sum=" + maxsum);
    }
    public static void main(String[] args) {
        int num[]={1,-2,6,-1,3};
        Max_subarrays(num);
    }
}
