import java.util.*;
public class spiralmatrix {
    public static void main(String[] args) {
         int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12,}};
         int row=matrix.length;
         int col=matrix[0].length;
         int top=0;
         int left=0;
         List<Integer> reu=new ArrayList<Integer>();
         int bottom=row-1;
         int rigth=col-1;
         while(top<=bottom && left<=rigth){
            for(int i=left;i<=rigth;i++){
                reu.add(matrix[top][i]);
            }
            top++;
            for(int j=top;j<=bottom;j++){
               reu.add(matrix[j][rigth]);
            }
            rigth--;
            if()
            for(int k=rigth;k>=left;k--){
               reu.add(matrix[bottom][k]);
            }
            bottom--;
            for(int l=bottom;l>=top;l--){
                reu.add(matrix[l][left]);
            }
            left++;
        
            
        }
        System.err.println(reu);
    }
   }
    
