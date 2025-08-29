import java.util.*;

public class basic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int x2=sc.nextInt();
        int x3=sc.nextInt();
        int x4=sc.nextInt();
        int max=Math.max(Math.max(x1,x2),Math.max(x3,x4));
        if(x1 !=max){
            int a1=max-x1;
            System.out.print(a1+" ");
        }
        if(x2!=max){
            int b=max-x2;
            System.out.print(b+" ");
        }
         if(x3 !=max){
            int c=max-x3;
            System.out.print(c+" ");
        }
        if(x4!=max){
            int d=max-x4;
            System.out.print(d+" ");

        }
       
        }
        }
         
        
        
    
            


