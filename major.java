import java.util.*;
public class major {
    public static void main(String args[]){
        int ar[]={1,2,6,4,4,1,4,4,7,4,4};
        int l=ar.length/2;
        int mx=-1, me=-1;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int x:ar){
            h.put(x,h.getOrDefault(x,0)+1);
            if(h.get(x)>mx){
                mx=h.get(x);
                me=x;
            }
        }
        if(mx>l)
            System.out.println(me);

    }
}
