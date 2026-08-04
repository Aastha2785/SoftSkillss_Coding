import java.util.Scanner;
class toggle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size and Q");
        int s=sc.nextInt();
        int x=sc.nextInt();
        int ar[]=new int[x];
        for(int i=0;i<x;i++){
            ar[i]=sc.nextInt();
        }
        int t[]=new int[s];
        for(int i=0;i<s;i++){
            t[i]=0;
        }

        
        for(int i=0;i<x;i++){
            int a=ar[i];
            int z=1;
            while(a*z<=s){
            int q=a*z;
            if(t[q-1]==0)
                t[q-1]=1;
            else
                t[q-1]=0;

            z++;
            }
            
        }
        for(int i=0;i<s;i++)
        System.out.println(t[i]);
    }
}