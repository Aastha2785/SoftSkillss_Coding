
public class rem_theorm {
    static int mod_inv(int a,int m){
        int y=1;
        boolean c=true;
        while(c){
            if((a*y)%m==1){
                c=false;
                return y;
            }
            y++;
        }
        return y;
    }
    public static void main(String args[]){
        int ar[]={3,8};
        int rem[]={2,1};
        int re=0;
        int pr=1;
        for(int i=0;i<ar.length;i++){
            pr=pr*ar[i];
        }
        for(int i=0;i<ar.length;i++){
            int x=pr/ar[i];
            int y=mod_inv(x,ar[i]);
            re=re+x*y*rem[i];
        }
        System.out.println(re%pr);
    }
}
