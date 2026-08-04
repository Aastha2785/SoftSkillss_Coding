import java .util.Scanner;
public class seive {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range");
        int x=sc.nextInt();
        int y=sc.nextInt();
        boolean ar[]=new boolean[y+1];
        for(int i=0;i<=y;i++){
            ar[i]=true;
        }
        ar[0]=false;
        if(y>=1)
        ar[1]=false;
        for(int i=2;i<y;i++){
            if(ar[i]==true){
                for(int j=2;j*i<=y;j++){
                    ar[j*i]=false;
                }
            }
        }
        int z=0;
        for(int i=x;i<=y;i++){
            if(ar[i]==true){
                
                System.out.println(i);
                if(z!=0 && i-z==2)
                    System.out.println("twin prime found  "+i+","+z);
                z=i;

            }
        }
    }
}
