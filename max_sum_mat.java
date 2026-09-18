public class max_sum_mat {
    public static void main(String args[]){
        int[][] mat = {
            {1, 2, 3, 0, 0},
            {0, 0, 0, 0, 0},
            {2, 1, 4, 0, 0},
            {0, 0, 0, 0, 0},
            {1, 1, 0, 1, 0}
        };
        int row=mat.length;
        int col=mat[0].length;
        if(row<3 || col<3){
            System.out.println("Not possible to construct");
        }
        else{
            int mx=0,sum=0;
            for(int i=0;i<row-2;i++){
                for(int j=0;j<col-2;j++){
                    sum=mat[i][j]+mat[i][j+1]+mat[i][j+2]+mat[i+1][j+1]+mat[i+2][j]+mat[i+2][j+1]+mat[i+2][j+2];
                    mx=Math.max(sum,mx);
                }
                
            }
            System.out.println("sum= "+mx);
        }
        
    }
}
