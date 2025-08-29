import java.util.*;
public class panagram {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        s.toLowerCase();
        TreeSet<Character> q=new TreeSet<Character>();

        if(n<26){
            System.out.println("NO");
            
        
        }
        else{
        for(char c:s.toCharArray()){
            q.add(c);
        }
        int count =0;
        for(int i=0;i<q.size();i++){
            if(i>=95 || i<=122){
              count++;
            }
            
        }
        if(count>=26){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    
    }
}
}