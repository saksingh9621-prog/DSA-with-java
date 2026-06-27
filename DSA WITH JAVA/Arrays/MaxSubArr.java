/*package Arrays;

public class MaxSubArr {
    public static void max_subarrays(int num[]){
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            for(int j=i;j<num.length;j++){
                currentsum=0;
                for(int k=i; k<=j;k++){
                    currentsum +=num[k];
                }
                System.out.println(currentsum);
                if(maxsum<currentsum){
                    maxsum=currentsum;
                }
            }
        }
        System.out.println("maxsum=" + maxsum);
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        max_subarrays(num);
    }
}*/



package Arrays;

public class MaxSubArr {
    public static void max_subarrays(int num[]){
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            for(int j=i;j<num.length;j++){
                currentsum=0;
                for(int k=i; k<=j;k++){
                    currentsum +=num[k];
                }
                System.out.println(currentsum);
                if(maxsum<currentsum){
                    maxsum=currentsum;
                }
            }
        }
        System.out.println("maxsum=" + maxsum);
    }
    public static void main(String[] args) {
        int num[]={-1,-2,6,-1,3};
        max_subarrays(num);
    }
}

