package Arrays;
public class KadanesAlgo {
    public static void max_subarray(int num[]){
        int maxsum=Integer.MIN_VALUE;
        int currentsum=0;
        for(int i=0; i<num.length; i++){
            currentsum=currentsum+num[i];
            if(currentsum<0){
                currentsum=0;
            }
            maxsum=Math.max(maxsum, currentsum);
        }
        System.out.println("maxsum = " + maxsum );
    }
    public static void main(String[] args) {
        int num[]={-2,-3,4,-1,-2,1,5,-3};
        max_subarray(num);
    }
}
