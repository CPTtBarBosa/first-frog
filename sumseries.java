import java.util.*;
public class sumseries {
    public static void main(String[] args) {
     int[] n={10,22,12,3,0,6};
     ArrayList<Integer> s=new ArrayList<Integer>();
     int leader=n[n.length-1];
     s.add(leader);
    for(int i=n.length-2;i>=0;i--){
          if(leader<n[i]){
            leader=n[i];
            s.add(n[i]);
        }
     }
     System.out.println(s);
     
}
}




   


