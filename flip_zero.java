public class flip_zero {
    public static void main(String args[]){
        int ar[]={1,0,0,0,1,1,0,0,1,1};
        int k=2;
        int z=0,s=0,mx=-1;
        for(int i=0;i<ar.length;i++){
            if(ar[i]==0)
                z++;
            while(k<z){
                if(ar[s]==0){
                    z--;
                }
                s++;
            }
            mx=Math.max(mx,i-s+1);
        }
        System.out.println(mx);
    }
}
