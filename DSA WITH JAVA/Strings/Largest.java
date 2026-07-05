package Strings;

public class Largest {
    public static String LargestString(String fruit[]){
        String largest=fruit[0];
        for(int i=1;i<fruit.length;i++){
            if(largest.compareTo(fruit[i])<0){
              largest=fruit[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        String fruit[]={"mango","apple", "banana"};
        System.out.println(LargestString(fruit));
    }
}
