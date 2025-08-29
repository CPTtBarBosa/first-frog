import java.util.*;
public class lantern {
    public static void main(String[] args) {
        
    
    int n=2;
    int len=555;
    Scanner sc=new Scanner(System.in);
    int[] lantern=new int[n];
    for(int i=0;i<n;i++){
        lantern[i]=sc.nextInt();
    }
    Arrays.sort(lantern);
    int maxgap=0;
    for(int i=0;i<lantern.length-1;i++){
        int gap=lantern[i+1]-lantern[i];
        maxgap=Math.max(gap,maxgap);

    }
    double radius=maxgap/2.0;// we did it because radius =diameter/2;therfore we did 
    double radiusfirst=lantern[0]-0.0;
    double lastradius=Math.abs(lantern[n-1]-len);
    double minradius=Math.max(radius,Math.max(radiusfirst,lastradius));
    System.out.println(minradius);



}
}
