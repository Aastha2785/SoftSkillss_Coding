public class max_equi_sum {
    public static void main(String args[]){
        int ar[]={-2,4,1,-3,5};
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            int ps=0;
            for(int j=0;j<=i;j++){
                ps=ps+ar[j];
            }
            int ss=0;
            for(int j=i;j<ar.length;j++){
                ss=ss+ar[j];
            }
            if(ss==ps){
                mx=ps;
                break;
            }
        }
        if(mx!=-Integer.MIN_VALUE)
            System.out.println(mx);
        else
            System.out.println("Nothing is found");
    }
}
