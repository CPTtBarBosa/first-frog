
import java.util.*;


public class threesum {
    public static void main(String[] args){
        int[] n={-1,0,1,2,-1,-4};
        List<List<Integer>> s=new ArrayList<>();
        
        int sum=0;
        Arrays.sort(n);
        for(int i=0;i<n.length;i++){
            if(i>0 && n[i]==n[i-1]){
                continue;
            }
        
            int left=i+1;
            int rig=n.length-1;
            while(left<rig){
                sum=n[i]+n[left]+n[rig];
                if(sum==0){
                 List<Integer> n1=Arrays.asList(n[i],n[left],n[rig]);
                s.add(n1);
                left++;
                rig--;
                while(left<rig && n[left]==n[left+1]){left++;}
                while(left<rig && n[rig]==n[rig+1]){rig--;}
                 
                }
                if(sum>0){
                    rig--;
                }
                else{
                    left++;
                }
                
            }
            //System.out.println(s);
        }
         System.out.println(s);
       
    }
}

