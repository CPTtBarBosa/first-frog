import java.util.ArrayList;

public class rotatematrix {
    public static void main(String[] args) {
        int[][] mtx={{1,2,3},{4,5,6},{7,8,9}};
        //ArrayList<ArrayList<Integer>> n=new ArrayList<>();
        for(int i=0;i<=mtx.length-1;i++){
            for(int j=i;j<=mtx[0].length-1;j++){
                int temp=mtx[i][j];
                mtx[i][j]=mtx[j][i];
                mtx[j][i]=temp;
            }
        }
        for(int i=0;i<=mtx.length-1;i++){
            for(int j=0;j<=mtx[0].length-1;j++){
                System.out.print(mtx[i][j]+" ");

   
}
}
    }
}

