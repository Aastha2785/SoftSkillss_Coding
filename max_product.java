public class max_product {
    public static void main(String args[]){
        int ar[]={1,3,4,-4,7,8};
        int ps=1,ss=1,ans=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            if(ps==0)
                ps=1;
            if(ss==0)
                ss=1;
            ps=ps*ar[i];
            ss=ss*ar[ar.length-1-i];
            ans=Math.max(ans,Math.max(ps,ss));
        }
        System.out.println(ans);
    }

}
