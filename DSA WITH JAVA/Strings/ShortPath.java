package Strings;

public class ShortPath {
    public static float getShortestPath(String path){
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            char dir= path.charAt(i);
            if (dir=='W'){
             x--;
            }
            else if(dir=='N'){
                y++;
            }
            else if(dir=='S'){
                y--;
            }
            else{
                x++;
            }
        }
        float X2=x*x;
        float Y2=y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
        //String path="WNEENESENNN";
        String path="NS";
        System.out.println(getShortestPath(path));
    }
}
